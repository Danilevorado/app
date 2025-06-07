package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lh1 {

    /* renamed from: a, reason: collision with root package name */
    private final do2 f11594a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f11595b;

    /* renamed from: c, reason: collision with root package name */
    private final dk1 f11596c;

    /* renamed from: d, reason: collision with root package name */
    private final xi1 f11597d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f11598e;

    /* renamed from: f, reason: collision with root package name */
    private final xm1 f11599f;

    /* renamed from: g, reason: collision with root package name */
    private final ws2 f11600g;

    /* renamed from: h, reason: collision with root package name */
    private final tu2 f11601h;

    /* renamed from: i, reason: collision with root package name */
    private final jy1 f11602i;

    public lh1(do2 do2Var, Executor executor, dk1 dk1Var, Context context, xm1 xm1Var, ws2 ws2Var, tu2 tu2Var, jy1 jy1Var, xi1 xi1Var) {
        this.f11594a = do2Var;
        this.f11595b = executor;
        this.f11596c = dk1Var;
        this.f11598e = context;
        this.f11599f = xm1Var;
        this.f11600g = ws2Var;
        this.f11601h = tu2Var;
        this.f11602i = jy1Var;
        this.f11597d = xi1Var;
    }

    private final void h(nk0 nk0Var) {
        i(nk0Var);
        nk0Var.O0("/video", fy.f8487l);
        nk0Var.O0("/videoMeta", fy.f8488m);
        nk0Var.O0("/precache", new zi0());
        nk0Var.O0("/delayPageLoaded", fy.f8491p);
        nk0Var.O0("/instrument", fy.f8489n);
        nk0Var.O0("/log", fy.f8482g);
        nk0Var.O0("/click", new gx(null));
        if (this.f11594a.f7443b != null) {
            nk0Var.G().j0(true);
            nk0Var.O0("/open", new qy(null, null, null, null, null));
        } else {
            nk0Var.G().j0(false);
        }
        if (j3.t.p().z(nk0Var.getContext())) {
            nk0Var.O0("/logScionEvent", new ly(nk0Var.getContext()));
        }
    }

    private static final void i(nk0 nk0Var) {
        nk0Var.O0("/videoClicked", fy.f8483h);
        nk0Var.G().Q(true);
        if (((Boolean) k3.w.c().b(ir.f10080s3)).booleanValue()) {
            nk0Var.O0("/getNativeAdViewSignals", fy.f8494s);
        }
        nk0Var.O0("/getNativeClickMeta", fy.f8495t);
    }

    public final ab3 a(final JSONObject jSONObject) {
        return qa3.m(qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.bh1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f6488a.e(obj);
            }
        }, this.f11595b), new w93() { // from class: com.google.android.gms.internal.ads.ch1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f6919a.c(jSONObject, (nk0) obj);
            }
        }, this.f11595b);
    }

    public final ab3 b(final String str, final String str2, final hn2 hn2Var, final ln2 ln2Var, final k3.h4 h4Var) {
        return qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.eh1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f7777a.d(h4Var, hn2Var, ln2Var, str, str2, obj);
            }
        }, this.f11595b);
    }

    final /* synthetic */ ab3 c(JSONObject jSONObject, final nk0 nk0Var) {
        final sf0 sf0VarG = sf0.g(nk0Var);
        nk0Var.c1(this.f11594a.f7443b != null ? em0.d() : em0.e());
        nk0Var.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.ah1
            @Override // com.google.android.gms.internal.ads.am0
            public final void a(boolean z10) {
                this.f6086m.f(nk0Var, sf0VarG, z10);
            }
        });
        nk0Var.s0("google.afma.nativeAds.renderVideo", jSONObject);
        return sf0VarG;
    }

    final /* synthetic */ ab3 d(k3.h4 h4Var, hn2 hn2Var, ln2 ln2Var, String str, String str2, Object obj) {
        final nk0 nk0VarA = this.f11596c.a(h4Var, hn2Var, ln2Var);
        final sf0 sf0VarG = sf0.g(nk0VarA);
        if (this.f11594a.f7443b != null) {
            h(nk0VarA);
            nk0VarA.c1(em0.d());
        } else {
            ti1 ti1VarB = this.f11597d.b();
            nk0VarA.G().R(ti1VarB, ti1VarB, ti1VarB, ti1VarB, ti1VarB, false, null, new j3.b(this.f11598e, null, null), null, null, this.f11602i, this.f11601h, this.f11599f, this.f11600g, null, ti1VarB, null, null);
            i(nk0VarA);
        }
        nk0VarA.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.fh1
            @Override // com.google.android.gms.internal.ads.am0
            public final void a(boolean z10) {
                this.f8285m.g(nk0VarA, sf0VarG, z10);
            }
        });
        nk0VarA.Y0(str, str2, null);
        return sf0VarG;
    }

    final /* synthetic */ ab3 e(Object obj) {
        nk0 nk0VarA = this.f11596c.a(k3.h4.v(), null, null);
        final sf0 sf0VarG = sf0.g(nk0VarA);
        h(nk0VarA);
        nk0VarA.G().i0(new bm0() { // from class: com.google.android.gms.internal.ads.dh1
            @Override // com.google.android.gms.internal.ads.bm0
            public final void a() {
                sf0VarG.h();
            }
        });
        nk0VarA.loadUrl((String) k3.w.c().b(ir.f10069r3));
        return sf0VarG;
    }

    final /* synthetic */ void f(nk0 nk0Var, sf0 sf0Var, boolean z10) {
        if (this.f11594a.f7442a != null && nk0Var.q() != null) {
            nk0Var.q().P5(this.f11594a.f7442a);
        }
        sf0Var.h();
    }

    final /* synthetic */ void g(nk0 nk0Var, sf0 sf0Var, boolean z10) {
        if (!z10) {
            sf0Var.f(new w22(1, "Html video Web View failed to load."));
            return;
        }
        if (this.f11594a.f7442a != null && nk0Var.q() != null) {
            nk0Var.q().P5(this.f11594a.f7442a);
        }
        sf0Var.h();
    }
}
