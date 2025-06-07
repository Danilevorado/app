package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class x8 extends x3 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f20571c;

    /* renamed from: d, reason: collision with root package name */
    protected final w8 f20572d;

    /* renamed from: e, reason: collision with root package name */
    protected final v8 f20573e;

    /* renamed from: f, reason: collision with root package name */
    protected final t8 f20574f;

    x8(w4 w4Var) {
        super(w4Var);
        this.f20572d = new w8(this);
        this.f20573e = new v8(this);
        this.f20574f = new t8(this);
    }

    static /* bridge */ /* synthetic */ void o(x8 x8Var, long j10) {
        x8Var.f();
        x8Var.q();
        x8Var.f20269a.b().t().b("Activity paused, time", Long.valueOf(j10));
        x8Var.f20574f.a(j10);
        if (x8Var.f20269a.y().D()) {
            x8Var.f20573e.b(j10);
        }
    }

    static /* bridge */ /* synthetic */ void p(x8 x8Var, long j10) {
        x8Var.f();
        x8Var.q();
        x8Var.f20269a.b().t().b("Activity resumed, time", Long.valueOf(j10));
        if (x8Var.f20269a.y().D() || x8Var.f20269a.F().f19934q.b()) {
            x8Var.f20573e.c(j10);
        }
        x8Var.f20574f.b();
        w8 w8Var = x8Var.f20572d;
        w8Var.f20549a.f();
        if (w8Var.f20549a.f20269a.m()) {
            w8Var.b(w8Var.f20549a.f20269a.d().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        f();
        if (this.f20571c == null) {
            this.f20571c = new com.google.android.gms.internal.measurement.a1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.x3
    protected final boolean l() {
        return false;
    }
}
