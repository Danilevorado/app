package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.mc;

/* loaded from: classes.dex */
final class v8 {

    /* renamed from: a, reason: collision with root package name */
    protected long f20494a;

    /* renamed from: b, reason: collision with root package name */
    protected long f20495b;

    /* renamed from: c, reason: collision with root package name */
    private final o f20496c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ x8 f20497d;

    public v8(x8 x8Var) {
        this.f20497d = x8Var;
        this.f20496c = new u8(this, x8Var.f20269a);
        long jB = x8Var.f20269a.d().b();
        this.f20494a = jB;
        this.f20495b = jB;
    }

    final void a() {
        this.f20496c.b();
        this.f20494a = 0L;
        this.f20495b = 0L;
    }

    final void b(long j10) {
        this.f20496c.b();
    }

    final void c(long j10) {
        this.f20497d.f();
        this.f20496c.b();
        this.f20494a = j10;
        this.f20495b = j10;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f20497d.f();
        this.f20497d.g();
        mc.c();
        if (!this.f20497d.f20269a.y().A(null, i3.f20014f0) || this.f20497d.f20269a.m()) {
            this.f20497d.f20269a.F().f19932o.b(this.f20497d.f20269a.d().a());
        }
        long j11 = j10 - this.f20494a;
        if (!z10 && j11 < 1000) {
            this.f20497d.f20269a.b().t().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f20495b;
            this.f20495b = j10;
        }
        this.f20497d.f20269a.b().t().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        u9.w(this.f20497d.f20269a.K().r(!this.f20497d.f20269a.y().D()), bundle, true);
        if (!z11) {
            this.f20497d.f20269a.I().s("auto", "_e", bundle);
        }
        this.f20494a = j10;
        this.f20496c.b();
        this.f20496c.d(3600000L);
        return true;
    }
}
