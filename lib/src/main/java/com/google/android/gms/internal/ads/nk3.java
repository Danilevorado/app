package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nk3 {

    /* renamed from: b, reason: collision with root package name */
    private static final nk3 f12689b = new nk3();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f12690a = new AtomicReference(new hl3(new dl3(), null));

    nk3() {
    }

    public static nk3 a() {
        return f12689b;
    }

    public final Class b(Class cls) {
        return ((hl3) this.f12690a.get()).a(cls);
    }

    public final Object c(gc3 gc3Var, Class cls) {
        return ((hl3) this.f12690a.get()).b(gc3Var, cls);
    }

    public final Object d(md3 md3Var, Class cls) {
        return ((hl3) this.f12690a.get()).c(md3Var, cls);
    }

    public final synchronized void e(bl3 bl3Var) {
        dl3 dl3Var = new dl3((hl3) this.f12690a.get());
        dl3Var.a(bl3Var);
        this.f12690a.set(new hl3(dl3Var, null));
    }

    public final synchronized void f(nd3 nd3Var) {
        dl3 dl3Var = new dl3((hl3) this.f12690a.get());
        dl3Var.b(nd3Var);
        this.f12690a.set(new hl3(dl3Var, null));
    }
}
