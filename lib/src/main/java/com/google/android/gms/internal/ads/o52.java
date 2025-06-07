package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o52 extends n50 {

    /* renamed from: m, reason: collision with root package name */
    private final String f13006m;

    /* renamed from: n, reason: collision with root package name */
    private final l50 f13007n;

    /* renamed from: o, reason: collision with root package name */
    private final tf0 f13008o;

    /* renamed from: p, reason: collision with root package name */
    private final JSONObject f13009p;

    /* renamed from: q, reason: collision with root package name */
    private final long f13010q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13011r;

    public o52(String str, l50 l50Var, tf0 tf0Var, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f13009p = jSONObject;
        this.f13011r = false;
        this.f13008o = tf0Var;
        this.f13006m = str;
        this.f13007n = l50Var;
        this.f13010q = j10;
        try {
            jSONObject.put("adapter_version", l50Var.e().toString());
            jSONObject.put("sdk_version", l50Var.h().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void L5(String str, tf0 tf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            if (((Boolean) k3.w.c().b(ir.f10111v1)).booleanValue()) {
                jSONObject.put("signal_error_code", 1);
            }
            tf0Var.e(jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final synchronized void M5(String str, int i10) {
        if (this.f13011r) {
            return;
        }
        try {
            this.f13009p.put("signal_error", str);
            if (((Boolean) k3.w.c().b(ir.f10122w1)).booleanValue()) {
                this.f13009p.put("latency", j3.t.b().b() - this.f13010q);
            }
            if (((Boolean) k3.w.c().b(ir.f10111v1)).booleanValue()) {
                this.f13009p.put("signal_error_code", i10);
            }
        } catch (JSONException unused) {
        }
        this.f13008o.e(this.f13009p);
        this.f13011r = true;
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final synchronized void J(String str) {
        M5(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final synchronized void a3(k3.w2 w2Var) {
        M5(w2Var.f24789n, 2);
    }

    public final synchronized void d() {
        M5("Signal collection timeout.", 3);
    }

    public final synchronized void f() {
        if (this.f13011r) {
            return;
        }
        try {
            if (((Boolean) k3.w.c().b(ir.f10111v1)).booleanValue()) {
                this.f13009p.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f13008o.e(this.f13009p);
        this.f13011r = true;
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final synchronized void s(String str) {
        if (this.f13011r) {
            return;
        }
        if (str == null) {
            J("Adapter returned null signals");
            return;
        }
        try {
            this.f13009p.put("signals", str);
            if (((Boolean) k3.w.c().b(ir.f10122w1)).booleanValue()) {
                this.f13009p.put("latency", j3.t.b().b() - this.f13010q);
            }
            if (((Boolean) k3.w.c().b(ir.f10111v1)).booleanValue()) {
                this.f13009p.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f13008o.e(this.f13009p);
        this.f13011r = true;
    }
}
