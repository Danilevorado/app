package com.google.ads.mediation;

import d3.l;
import o3.p;

/* loaded from: classes.dex */
final class c extends n3.b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f5496a;

    /* renamed from: b, reason: collision with root package name */
    final p f5497b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f5496a = abstractAdViewAdapter;
        this.f5497b = pVar;
    }

    @Override // d3.d
    public final void a(l lVar) {
        this.f5497b.d(this.f5496a, lVar);
    }

    @Override // d3.d
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        n3.a aVar = (n3.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f5496a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.c(new d(abstractAdViewAdapter, this.f5497b));
        this.f5497b.j(this.f5496a);
    }
}
