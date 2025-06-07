package com.google.ads.mediation;

import d3.k;
import o3.p;

/* loaded from: classes.dex */
final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f5498a;

    /* renamed from: b, reason: collision with root package name */
    final p f5499b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f5498a = abstractAdViewAdapter;
        this.f5499b = pVar;
    }

    @Override // d3.k
    public final void b() {
        this.f5499b.m(this.f5498a);
    }

    @Override // d3.k
    public final void e() {
        this.f5499b.s(this.f5498a);
    }
}
