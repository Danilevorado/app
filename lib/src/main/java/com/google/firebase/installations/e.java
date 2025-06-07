package com.google.firebase.installations;

import b5.j;

/* loaded from: classes.dex */
class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final i f21381a;

    /* renamed from: b, reason: collision with root package name */
    private final j f21382b;

    public e(i iVar, j jVar) {
        this.f21381a = iVar;
        this.f21382b = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(k6.d dVar) {
        if (!dVar.k() || this.f21381a.f(dVar)) {
            return false;
        }
        this.f21382b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f21382b.d(exc);
        return true;
    }
}
