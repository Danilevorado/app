package com.google.firebase.installations;

import b5.j;

/* loaded from: classes.dex */
class f implements h {

    /* renamed from: a, reason: collision with root package name */
    final j f21383a;

    public f(j jVar) {
        this.f21383a = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(k6.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f21383a.e(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
