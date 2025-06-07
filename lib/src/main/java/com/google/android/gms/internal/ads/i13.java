package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class i13 {

    /* renamed from: c, reason: collision with root package name */
    private static final w13 f9485c = new w13("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    private static final Intent f9486d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    final h23 f9487a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9488b;

    i13(Context context) {
        this.f9487a = k23.a(context) ? new h23(context.getApplicationContext(), f9485c, "OverlayDisplayService", f9486d, d13.f7163a, null) : null;
        this.f9488b = context.getPackageName();
    }

    final void c() {
        if (this.f9487a == null) {
            return;
        }
        f9485c.c("unbind LMD display overlay service", new Object[0]);
        this.f9487a.u();
    }

    final void d(z03 z03Var, n13 n13Var) {
        if (this.f9487a == null) {
            f9485c.a("error: %s", "Play Store not found.");
        } else {
            b5.j jVar = new b5.j();
            this.f9487a.s(new f13(this, jVar, z03Var, n13Var, jVar), jVar);
        }
    }

    final void e(k13 k13Var, n13 n13Var) {
        if (this.f9487a == null) {
            f9485c.a("error: %s", "Play Store not found.");
            return;
        }
        if (k13Var.g() != null) {
            b5.j jVar = new b5.j();
            this.f9487a.s(new e13(this, jVar, k13Var, n13Var, jVar), jVar);
        } else {
            f9485c.a("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            l13 l13VarC = m13.c();
            l13VarC.b(8160);
            n13Var.a(l13VarC.c());
        }
    }

    final void f(p13 p13Var, n13 n13Var, int i10) {
        if (this.f9487a == null) {
            f9485c.a("error: %s", "Play Store not found.");
        } else {
            b5.j jVar = new b5.j();
            this.f9487a.s(new g13(this, jVar, p13Var, i10, n13Var, jVar), jVar);
        }
    }
}
