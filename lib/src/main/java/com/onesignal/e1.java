package com.onesignal;

/* loaded from: classes.dex */
class e1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f21867b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private d1 f21868a;

    e1() {
    }

    public d1 a(l3 l3Var, t2 t2Var, r1 r1Var, n2 n2Var, i7.a aVar) {
        if (this.f21868a == null) {
            synchronized (f21867b) {
                if (this.f21868a == null) {
                    this.f21868a = new d1(l3Var, t2Var, r1Var, n2Var, aVar);
                }
            }
        }
        return this.f21868a;
    }
}
