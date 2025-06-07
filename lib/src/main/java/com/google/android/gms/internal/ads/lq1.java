package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdView;

/* loaded from: classes.dex */
final class lq1 extends d3.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f11825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AdView f11826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f11827c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ sq1 f11828d;

    lq1(sq1 sq1Var, String str, AdView adView, String str2) {
        this.f11828d = sq1Var;
        this.f11825a = str;
        this.f11826b = adView;
        this.f11827c = str2;
    }

    @Override // d3.c
    public final void e(d3.l lVar) {
        this.f11828d.U5(sq1.T5(lVar), this.f11827c);
    }

    @Override // d3.c
    public final void h() {
        this.f11828d.P5(this.f11825a, this.f11826b, this.f11827c);
    }
}
