package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gm1 implements f61, k3.a, f21, p11 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f8798m;

    /* renamed from: n, reason: collision with root package name */
    private final uo2 f8799n;

    /* renamed from: o, reason: collision with root package name */
    private final xm1 f8800o;

    /* renamed from: p, reason: collision with root package name */
    private final un2 f8801p;

    /* renamed from: q, reason: collision with root package name */
    private final hn2 f8802q;

    /* renamed from: r, reason: collision with root package name */
    private final jy1 f8803r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f8804s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f8805t = ((Boolean) k3.w.c().b(ir.f10149y6)).booleanValue();

    public gm1(Context context, uo2 uo2Var, xm1 xm1Var, un2 un2Var, hn2 hn2Var, jy1 jy1Var) {
        this.f8798m = context;
        this.f8799n = uo2Var;
        this.f8800o = xm1Var;
        this.f8801p = un2Var;
        this.f8802q = hn2Var;
        this.f8803r = jy1Var;
    }

    private final wm1 a(String str) {
        wm1 wm1VarA = this.f8800o.a();
        wm1VarA.e(this.f8801p.f16413b.f15924b);
        wm1VarA.d(this.f8802q);
        wm1VarA.b("action", str);
        if (!this.f8802q.f9273u.isEmpty()) {
            wm1VarA.b("ancn", (String) this.f8802q.f9273u.get(0));
        }
        if (this.f8802q.f9255j0) {
            wm1VarA.b("device_connectivity", true != j3.t.q().x(this.f8798m) ? "offline" : "online");
            wm1VarA.b("event_timestamp", String.valueOf(j3.t.b().a()));
            wm1VarA.b("offline_ad", "1");
        }
        if (((Boolean) k3.w.c().b(ir.H6)).booleanValue()) {
            boolean z10 = s3.y.e(this.f8801p.f16412a.f14851a) != 1;
            wm1VarA.b("scar", String.valueOf(z10));
            if (z10) {
                k3.c4 c4Var = this.f8801p.f16412a.f14851a.f7445d;
                wm1VarA.c("ragent", c4Var.B);
                wm1VarA.c("rtype", s3.y.a(s3.y.b(c4Var)));
            }
        }
        return wm1VarA;
    }

    private final void d(wm1 wm1Var) {
        if (!this.f8802q.f9255j0) {
            wm1Var.g();
            return;
        }
        this.f8803r.f(new ly1(j3.t.b().a(), this.f8801p.f16413b.f15924b.f11674b, wm1Var.f(), 2));
    }

    private final boolean e() {
        if (this.f8804s == null) {
            synchronized (this) {
                if (this.f8804s == null) {
                    String str = (String) k3.w.c().b(ir.f10034o1);
                    j3.t.r();
                    String strJ = m3.b2.J(this.f8798m);
                    boolean zMatches = false;
                    if (str != null && strJ != null) {
                        try {
                            zMatches = Pattern.matches(str, strJ);
                        } catch (RuntimeException e5) {
                            j3.t.q().u(e5, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f8804s = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f8804s.booleanValue();
    }

    @Override // k3.a
    public final void O() {
        if (this.f8802q.f9255j0) {
            d(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void b() {
        if (this.f8805t) {
            wm1 wm1VarA = a("ifts");
            wm1VarA.b("reason", "blocked");
            wm1VarA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.f61
    public final void c() {
        if (e()) {
            a("adapter_impression").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.f61
    public final void f() {
        if (e()) {
            a("adapter_shown").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void h0(ib1 ib1Var) {
        if (this.f8805t) {
            wm1 wm1VarA = a("ifts");
            wm1VarA.b("reason", "exception");
            if (!TextUtils.isEmpty(ib1Var.getMessage())) {
                wm1VarA.b("msg", ib1Var.getMessage());
            }
            wm1VarA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() {
        if (e() || this.f8802q.f9255j0) {
            d(a(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void u(k3.w2 w2Var) {
        k3.w2 w2Var2;
        if (this.f8805t) {
            wm1 wm1VarA = a("ifts");
            wm1VarA.b("reason", "adapter");
            int i10 = w2Var.f24788m;
            String str = w2Var.f24789n;
            if (w2Var.f24790o.equals("com.google.android.gms.ads") && (w2Var2 = w2Var.f24791p) != null && !w2Var2.f24790o.equals("com.google.android.gms.ads")) {
                k3.w2 w2Var3 = w2Var.f24791p;
                i10 = w2Var3.f24788m;
                str = w2Var3.f24789n;
            }
            if (i10 >= 0) {
                wm1VarA.b("arec", String.valueOf(i10));
            }
            String strA = this.f8799n.a(str);
            if (strA != null) {
                wm1VarA.b("areec", strA);
            }
            wm1VarA.g();
        }
    }
}
