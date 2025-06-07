package androidx.work.impl;

import b1.m;

/* loaded from: classes.dex */
public class n implements b1.m {

    /* renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.s f4216c = new androidx.lifecycle.s();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.d f4217d = androidx.work.impl.utils.futures.d.u();

    public n() {
        a(b1.m.f4364b);
    }

    public void a(m.b bVar) {
        this.f4216c.i(bVar);
        if (bVar instanceof m.b.c) {
            this.f4217d.q((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f4217d.r(((m.b.a) bVar).a());
        }
    }
}
