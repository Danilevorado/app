package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lp1 implements o11, i41, e31 {

    /* renamed from: m, reason: collision with root package name */
    private final xp1 f11703m;

    /* renamed from: n, reason: collision with root package name */
    private final String f11704n;

    /* renamed from: o, reason: collision with root package name */
    private final String f11705o;

    /* renamed from: p, reason: collision with root package name */
    private int f11706p = 0;

    /* renamed from: q, reason: collision with root package name */
    private kp1 f11707q = kp1.AD_REQUESTED;

    /* renamed from: r, reason: collision with root package name */
    private d11 f11708r;

    /* renamed from: s, reason: collision with root package name */
    private k3.w2 f11709s;

    /* renamed from: t, reason: collision with root package name */
    private String f11710t;

    /* renamed from: u, reason: collision with root package name */
    private String f11711u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11712v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11713w;

    lp1(xp1 xp1Var, do2 do2Var, String str) {
        this.f11703m = xp1Var;
        this.f11705o = str;
        this.f11704n = do2Var.f7447f;
    }

    private static JSONObject f(k3.w2 w2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", w2Var.f24790o);
        jSONObject.put("errorCode", w2Var.f24788m);
        jSONObject.put("errorDescription", w2Var.f24789n);
        k3.w2 w2Var2 = w2Var.f24791p;
        jSONObject.put("underlyingError", w2Var2 == null ? null : f(w2Var2));
        return jSONObject;
    }

    private final JSONObject h(d11 d11Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", d11Var.h());
        jSONObject.put("responseSecsSinceEpoch", d11Var.d());
        jSONObject.put("responseId", d11Var.i());
        if (((Boolean) k3.w.c().b(ir.C8)).booleanValue()) {
            String strF = d11Var.f();
            if (!TextUtils.isEmpty(strF)) {
                ze0.b("Bidding data: ".concat(String.valueOf(strF)));
                jSONObject.put("biddingData", new JSONObject(strF));
            }
        }
        if (!TextUtils.isEmpty(this.f11710t)) {
            jSONObject.put("adRequestUrl", this.f11710t);
        }
        if (!TextUtils.isEmpty(this.f11711u)) {
            jSONObject.put("postBody", this.f11711u);
        }
        JSONArray jSONArray = new JSONArray();
        for (k3.l4 l4Var : d11Var.j()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", l4Var.f24691m);
            jSONObject2.put("latencyMillis", l4Var.f24692n);
            if (((Boolean) k3.w.c().b(ir.D8)).booleanValue()) {
                jSONObject2.put("credentials", k3.t.b().j(l4Var.f24694p));
            }
            k3.w2 w2Var = l4Var.f24693o;
            jSONObject2.put("error", w2Var == null ? null : f(w2Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.e31
    public final void J(ex0 ex0Var) {
        this.f11708r = ex0Var.c();
        this.f11707q = kp1.AD_LOADED;
        if (((Boolean) k3.w.c().b(ir.H8)).booleanValue()) {
            this.f11703m.f(this.f11704n, this);
        }
    }

    public final String a() {
        return this.f11705o;
    }

    public final JSONObject b() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f11707q);
        jSONObject.put("format", hn2.a(this.f11706p));
        if (((Boolean) k3.w.c().b(ir.H8)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f11712v);
            if (this.f11712v) {
                jSONObject.put("shown", this.f11713w);
            }
        }
        d11 d11Var = this.f11708r;
        JSONObject jSONObjectH = null;
        if (d11Var != null) {
            jSONObjectH = h(d11Var);
        } else {
            k3.w2 w2Var = this.f11709s;
            if (w2Var != null && (iBinder = w2Var.f24792q) != null) {
                d11 d11Var2 = (d11) iBinder;
                jSONObjectH = h(d11Var2);
                if (d11Var2.j().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(f(this.f11709s));
                    jSONObjectH.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObjectH);
        return jSONObject;
    }

    public final void c() {
        this.f11712v = true;
    }

    public final void d() {
        this.f11713w = true;
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(un2 un2Var) {
        if (!un2Var.f16413b.f15923a.isEmpty()) {
            this.f11706p = ((hn2) un2Var.f16413b.f15923a.get(0)).f9238b;
        }
        if (!TextUtils.isEmpty(un2Var.f16413b.f15924b.f11683k)) {
            this.f11710t = un2Var.f16413b.f15924b.f11683k;
        }
        if (TextUtils.isEmpty(un2Var.f16413b.f15924b.f11684l)) {
            return;
        }
        this.f11711u = un2Var.f16413b.f15924b.f11684l;
    }

    public final boolean e() {
        return this.f11707q != kp1.AD_REQUESTED;
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) {
        if (((Boolean) k3.w.c().b(ir.H8)).booleanValue()) {
            return;
        }
        this.f11703m.f(this.f11704n, this);
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(k3.w2 w2Var) {
        this.f11707q = kp1.AD_LOAD_FAILED;
        this.f11709s = w2Var;
        if (((Boolean) k3.w.c().b(ir.H8)).booleanValue()) {
            this.f11703m.f(this.f11704n, this);
        }
    }
}
