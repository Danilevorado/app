package com.google.ads.mediation;

import d3.l;
import o3.k;

/* loaded from: classes.dex */
final class b extends d3.c implements e3.c, k3.a {

    /* renamed from: m, reason: collision with root package name */
    final AbstractAdViewAdapter f5494m;

    /* renamed from: n, reason: collision with root package name */
    final k f5495n;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
        this.f5494m = abstractAdViewAdapter;
        this.f5495n = kVar;
    }

    @Override // e3.c
    public final void A(String str, String str2) {
        this.f5495n.q(this.f5494m, str, str2);
    }

    @Override // d3.c, k3.a
    public final void O() {
        this.f5495n.e(this.f5494m);
    }

    @Override // d3.c
    public final void d() {
        this.f5495n.a(this.f5494m);
    }

    @Override // d3.c
    public final void e(l lVar) {
        this.f5495n.o(this.f5494m, lVar);
    }

    @Override // d3.c
    public final void h() {
        this.f5495n.g(this.f5494m);
    }

    @Override // d3.c
    public final void o() {
        this.f5495n.l(this.f5494m);
    }
}
