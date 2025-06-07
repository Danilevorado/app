package com.onesignal;

/* loaded from: classes.dex */
class OSPermissionChangedInternalObserver {
    OSPermissionChangedInternalObserver() {
    }

    static void a(g2 g2Var) {
        if (e3.m0().c(new h2(e3.f21881d0, (g2) g2Var.clone()))) {
            g2 g2Var2 = (g2) g2Var.clone();
            e3.f21881d0 = g2Var2;
            g2Var2.c();
        }
    }

    static void b(g2 g2Var) {
        if (!g2Var.a()) {
            k.d(0, e3.f21882e);
        }
        s3.t(e3.C());
    }

    void changed(g2 g2Var) {
        b(g2Var);
        a(g2Var);
    }
}
