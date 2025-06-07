package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gq1 implements l3.t, am0 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f8854m;

    /* renamed from: n, reason: collision with root package name */
    private final ff0 f8855n;

    /* renamed from: o, reason: collision with root package name */
    private xp1 f8856o;

    /* renamed from: p, reason: collision with root package name */
    private nk0 f8857p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8858q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8859r;

    /* renamed from: s, reason: collision with root package name */
    private long f8860s;

    /* renamed from: t, reason: collision with root package name */
    private k3.w1 f8861t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f8862u;

    gq1(Context context, ff0 ff0Var) {
        this.f8854m = context;
        this.f8855n = ff0Var;
    }

    private final synchronized boolean i(k3.w1 w1Var) {
        if (!((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue()) {
            ze0.g("Ad inspector had an internal error.");
            try {
                w1Var.P3(fp2.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f8856o == null) {
            ze0.g("Ad inspector had an internal error.");
            try {
                w1Var.P3(fp2.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f8858q && !this.f8859r) {
            if (j3.t.b().a() >= this.f8860s + ((Integer) k3.w.c().b(ir.f10041o8)).intValue()) {
                return true;
            }
        }
        ze0.g("Ad inspector cannot be opened because it is already open.");
        try {
            w1Var.P3(fp2.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // l3.t
    public final synchronized void C(int i10) {
        this.f8857p.destroy();
        if (!this.f8862u) {
            m3.n1.k("Inspector closed.");
            k3.w1 w1Var = this.f8861t;
            if (w1Var != null) {
                try {
                    w1Var.P3(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f8859r = false;
        this.f8858q = false;
        this.f8860s = 0L;
        this.f8862u = false;
        this.f8861t = null;
    }

    @Override // l3.t
    public final void L0() {
    }

    @Override // com.google.android.gms.internal.ads.am0
    public final synchronized void a(boolean z10) {
        if (z10) {
            m3.n1.k("Ad inspector loaded.");
            this.f8858q = true;
            h("");
        } else {
            ze0.g("Ad inspector failed to load.");
            try {
                k3.w1 w1Var = this.f8861t;
                if (w1Var != null) {
                    w1Var.P3(fp2.d(17, null, null));
                }
            } catch (RemoteException unused) {
            }
            this.f8862u = true;
            this.f8857p.destroy();
        }
    }

    @Override // l3.t
    public final synchronized void b() {
        this.f8859r = true;
        h("");
    }

    @Override // l3.t
    public final void c() {
    }

    public final Activity d() {
        nk0 nk0Var = this.f8857p;
        if (nk0Var == null || nk0Var.B()) {
            return null;
        }
        return this.f8857p.i();
    }

    public final void e(xp1 xp1Var) {
        this.f8856o = xp1Var;
    }

    final /* synthetic */ void f(String str) throws JSONException {
        JSONObject jSONObjectE = this.f8856o.e();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectE.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f8857p.v("window.inspectorInfo", jSONObjectE.toString());
    }

    public final synchronized void g(k3.w1 w1Var, yy yyVar, ry ryVar) {
        if (i(w1Var)) {
            try {
                j3.t.B();
                nk0 nk0VarA = al0.a(this.f8854m, em0.a(), "", false, false, null, null, this.f8855n, null, null, null, pm.a(), null, null);
                this.f8857p = nk0VarA;
                cm0 cm0VarG = nk0VarA.G();
                if (cm0VarG == null) {
                    ze0.g("Failed to obtain a web view for the ad inspector");
                    try {
                        w1Var.P3(fp2.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.f8861t = w1Var;
                cm0VarG.R(null, null, null, null, null, false, null, null, null, null, null, null, null, null, yyVar, null, new xy(this.f8854m), ryVar);
                cm0VarG.c0(this);
                this.f8857p.loadUrl((String) k3.w.c().b(ir.f10020m8));
                j3.t.k();
                l3.s.a(this.f8854m, new AdOverlayInfoParcel(this, this.f8857p, 1, this.f8855n), true);
                this.f8860s = j3.t.b().a();
            } catch (zk0 e5) {
                ze0.h("Failed to obtain a web view for the ad inspector", e5);
                try {
                    w1Var.P3(fp2.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    public final synchronized void h(final String str) {
        if (this.f8858q && this.f8859r) {
            of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fq1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f8374m.f(str);
                }
            });
        }
    }

    @Override // l3.t
    public final void w0() {
    }

    @Override // l3.t
    public final void x4() {
    }
}
