package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class do1 {

    /* renamed from: a, reason: collision with root package name */
    private final cz f7441a;

    do1(cz czVar) {
        this.f7441a = czVar;
    }

    private final void s(co1 co1Var) throws JSONException {
        String strA = co1.a(co1Var);
        ze0.f("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.f7441a.x(strA);
    }

    public final void a() {
        s(new co1("initialize", null));
    }

    public final void b(long j10) {
        co1 co1Var = new co1("interstitial", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onAdClicked";
        this.f7441a.x(co1.a(co1Var));
    }

    public final void c(long j10) throws JSONException {
        co1 co1Var = new co1("interstitial", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onAdClosed";
        s(co1Var);
    }

    public final void d(long j10, int i10) throws JSONException {
        co1 co1Var = new co1("interstitial", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onAdFailedToLoad";
        co1Var.f7003d = Integer.valueOf(i10);
        s(co1Var);
    }

    public final void e(long j10) throws JSONException {
        co1 co1Var = new co1("interstitial", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onAdLoaded";
        s(co1Var);
    }

    public final void f(long j10) {
        co1 co1Var = new co1("interstitial", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onNativeAdObjectNotAvailable";
        s(co1Var);
    }

    public final void g(long j10) throws JSONException {
        co1 co1Var = new co1("interstitial", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onAdOpened";
        s(co1Var);
    }

    public final void h(long j10) {
        co1 co1Var = new co1("creation", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "nativeObjectCreated";
        s(co1Var);
    }

    public final void i(long j10) {
        co1 co1Var = new co1("creation", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "nativeObjectNotCreated";
        s(co1Var);
    }

    public final void j(long j10) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onAdClicked";
        s(co1Var);
    }

    public final void k(long j10) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onRewardedAdClosed";
        s(co1Var);
    }

    public final void l(long j10, ra0 ra0Var) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onUserEarnedReward";
        co1Var.f7004e = ra0Var.e();
        co1Var.f7005f = Integer.valueOf(ra0Var.c());
        s(co1Var);
    }

    public final void m(long j10, int i10) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onRewardedAdFailedToLoad";
        co1Var.f7003d = Integer.valueOf(i10);
        s(co1Var);
    }

    public final void n(long j10, int i10) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onRewardedAdFailedToShow";
        co1Var.f7003d = Integer.valueOf(i10);
        s(co1Var);
    }

    public final void o(long j10) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onAdImpression";
        s(co1Var);
    }

    public final void p(long j10) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onRewardedAdLoaded";
        s(co1Var);
    }

    public final void q(long j10) {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onNativeAdObjectNotAvailable";
        s(co1Var);
    }

    public final void r(long j10) throws JSONException {
        co1 co1Var = new co1("rewarded", null);
        co1Var.f7000a = Long.valueOf(j10);
        co1Var.f7002c = "onRewardedAdOpened";
        s(co1Var);
    }
}
