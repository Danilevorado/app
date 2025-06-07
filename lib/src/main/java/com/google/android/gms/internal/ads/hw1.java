package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class hw1 implements f61, k3.a, f21, p11 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f9429m;

    /* renamed from: n, reason: collision with root package name */
    private final uo2 f9430n;

    /* renamed from: o, reason: collision with root package name */
    private final un2 f9431o;

    /* renamed from: p, reason: collision with root package name */
    private final hn2 f9432p;

    /* renamed from: q, reason: collision with root package name */
    private final jy1 f9433q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f9434r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f9435s = ((Boolean) k3.w.c().b(ir.f10149y6)).booleanValue();

    /* renamed from: t, reason: collision with root package name */
    private final ws2 f9436t;

    /* renamed from: u, reason: collision with root package name */
    private final String f9437u;

    public hw1(Context context, uo2 uo2Var, un2 un2Var, hn2 hn2Var, jy1 jy1Var, ws2 ws2Var, String str) {
        this.f9429m = context;
        this.f9430n = uo2Var;
        this.f9431o = un2Var;
        this.f9432p = hn2Var;
        this.f9433q = jy1Var;
        this.f9436t = ws2Var;
        this.f9437u = str;
    }

    private final vs2 a(String str) {
        vs2 vs2VarB = vs2.b(str);
        vs2VarB.h(this.f9431o, null);
        vs2VarB.f(this.f9432p);
        vs2VarB.a("request_id", this.f9437u);
        if (!this.f9432p.f9273u.isEmpty()) {
            vs2VarB.a("ancn", (String) this.f9432p.f9273u.get(0));
        }
        if (this.f9432p.f9255j0) {
            vs2VarB.a("device_connectivity", true != j3.t.q().x(this.f9429m) ? "offline" : "online");
            vs2VarB.a("event_timestamp", String.valueOf(j3.t.b().a()));
            vs2VarB.a("offline_ad", "1");
        }
        return vs2VarB;
    }

    private final void d(vs2 vs2Var) {
        if (!this.f9432p.f9255j0) {
            this.f9436t.a(vs2Var);
            return;
        }
        this.f9433q.f(new ly1(j3.t.b().a(), this.f9431o.f16413b.f15924b.f11674b, this.f9436t.b(vs2Var), 2));
    }

    private final boolean e() {
        if (this.f9434r == null) {
            synchronized (this) {
                if (this.f9434r == null) {
                    String str = (String) k3.w.c().b(ir.f10034o1);
                    j3.t.r();
                    String strJ = m3.b2.J(this.f9429m);
                    boolean zMatches = false;
                    if (str != null && strJ != null) {
                        try {
                            zMatches = Pattern.matches(str, strJ);
                        } catch (RuntimeException e5) {
                            j3.t.q().u(e5, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f9434r = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f9434r.booleanValue();
    }

    @Override // k3.a
    public final void O() {
        if (this.f9432p.f9255j0) {
            d(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void b() {
        if (this.f9435s) {
            ws2 ws2Var = this.f9436t;
            vs2 vs2VarA = a("ifts");
            vs2VarA.a("reason", "blocked");
            ws2Var.a(vs2VarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.f61
    public final void c() {
        if (e()) {
            this.f9436t.a(a("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.f61
    public final void f() {
        if (e()) {
            this.f9436t.a(a("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void h0(ib1 ib1Var) {
        if (this.f9435s) {
            vs2 vs2VarA = a("ifts");
            vs2VarA.a("reason", "exception");
            if (!TextUtils.isEmpty(ib1Var.getMessage())) {
                vs2VarA.a("msg", ib1Var.getMessage());
            }
            this.f9436t.a(vs2VarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() {
        if (e() || this.f9432p.f9255j0) {
            d(a(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void u(k3.w2 w2Var) {
        k3.w2 w2Var2;
        if (this.f9435s) {
            int i10 = w2Var.f24788m;
            String str = w2Var.f24789n;
            if (w2Var.f24790o.equals("com.google.android.gms.ads") && (w2Var2 = w2Var.f24791p) != null && !w2Var2.f24790o.equals("com.google.android.gms.ads")) {
                k3.w2 w2Var3 = w2Var.f24791p;
                i10 = w2Var3.f24788m;
                str = w2Var3.f24789n;
            }
            String strA = this.f9430n.a(str);
            vs2 vs2VarA = a("ifts");
            vs2VarA.a("reason", "adapter");
            if (i10 >= 0) {
                vs2VarA.a("arec", String.valueOf(i10));
            }
            if (strA != null) {
                vs2VarA.a("areec", strA);
            }
            this.f9436t.a(vs2VarA);
        }
    }
}
