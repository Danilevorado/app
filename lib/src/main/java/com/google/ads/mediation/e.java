package com.google.ads.mediation;

import d3.l;
import g3.f;
import g3.h;
import o3.r;

/* loaded from: classes.dex */
final class e extends d3.c implements h.a, f.b, f.a {

    /* renamed from: m, reason: collision with root package name */
    final AbstractAdViewAdapter f5500m;

    /* renamed from: n, reason: collision with root package name */
    final r f5501n;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, r rVar) {
        this.f5500m = abstractAdViewAdapter;
        this.f5501n = rVar;
    }

    @Override // d3.c, k3.a
    public final void O() {
        this.f5501n.i(this.f5500m);
    }

    @Override // g3.h.a
    public final void a(h hVar) {
        this.f5501n.k(this.f5500m, new a(hVar));
    }

    @Override // g3.f.a
    public final void b(f fVar, String str) {
        this.f5501n.h(this.f5500m, fVar, str);
    }

    @Override // g3.f.b
    public final void c(f fVar) {
        this.f5501n.p(this.f5500m, fVar);
    }

    @Override // d3.c
    public final void d() {
        this.f5501n.f(this.f5500m);
    }

    @Override // d3.c
    public final void e(l lVar) {
        this.f5501n.n(this.f5500m, lVar);
    }

    @Override // d3.c
    public final void g() {
        this.f5501n.r(this.f5500m);
    }

    @Override // d3.c
    public final void h() {
    }

    @Override // d3.c
    public final void o() {
        this.f5501n.b(this.f5500m);
    }
}
