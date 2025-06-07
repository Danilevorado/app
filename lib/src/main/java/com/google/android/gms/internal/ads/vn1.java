package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vn1 implements e3.c, i41, k3.a, l11, f21, g21, a31, o11, ms2 {

    /* renamed from: m, reason: collision with root package name */
    private final List f16814m;

    /* renamed from: n, reason: collision with root package name */
    private final jn1 f16815n;

    /* renamed from: o, reason: collision with root package name */
    private long f16816o;

    public vn1(jn1 jn1Var, km0 km0Var) {
        this.f16815n = jn1Var;
        this.f16814m = Collections.singletonList(km0Var);
    }

    private final void r(Class cls, String str, Object... objArr) throws IOException {
        this.f16815n.a(this.f16814m, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // e3.c
    public final void A(String str, String str2) throws IOException {
        r(e3.c.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void D() throws IOException {
        r(l11.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // k3.a
    public final void O() throws IOException {
        r(k3.a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void a(fs2 fs2Var, String str) throws IOException {
        r(es2.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void b(fs2 fs2Var, String str, Throwable th) throws IOException {
        r(es2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void c(fs2 fs2Var, String str) throws IOException {
        r(es2.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void d(Context context) throws IOException {
        r(g21.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(un2 un2Var) {
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void e(Context context) throws IOException {
        r(g21.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) throws IOException {
        this.f16816o = j3.t.b().b();
        r(i41.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void h(fs2 fs2Var, String str) throws IOException {
        r(es2.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void j() throws IOException {
        r(l11.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() throws IOException {
        r(f21.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final void m() throws IOException {
        m3.n1.k("Ad Request Latency : " + (j3.t.b().b() - this.f16816o));
        r(a31.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void n() throws IOException {
        r(l11.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void o(Context context) throws IOException {
        r(g21.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void p() throws IOException {
        r(l11.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void q() throws IOException {
        r(l11.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(k3.w2 w2Var) throws IOException {
        r(o11.class, "onAdFailedToLoad", Integer.valueOf(w2Var.f24788m), w2Var.f24789n, w2Var.f24790o);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void v(aa0 aa0Var, String str, String str2) throws IOException {
        r(l11.class, "onRewarded", aa0Var, str, str2);
    }
}
