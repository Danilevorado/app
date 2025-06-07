package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a94 implements w74 {

    /* renamed from: a, reason: collision with root package name */
    private final hu1 f6016a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6017b;

    /* renamed from: c, reason: collision with root package name */
    private long f6018c;

    /* renamed from: d, reason: collision with root package name */
    private long f6019d;

    /* renamed from: e, reason: collision with root package name */
    private sl0 f6020e = sl0.f15309d;

    public a94(hu1 hu1Var) {
        this.f6016a = hu1Var;
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final long a() {
        long j10 = this.f6018c;
        if (!this.f6017b) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6019d;
        sl0 sl0Var = this.f6020e;
        return j10 + (sl0Var.f15313a == 1.0f ? sv2.w(jElapsedRealtime) : sl0Var.a(jElapsedRealtime));
    }

    public final void b(long j10) {
        this.f6018c = j10;
        if (this.f6017b) {
            this.f6019d = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (this.f6017b) {
            return;
        }
        this.f6019d = SystemClock.elapsedRealtime();
        this.f6017b = true;
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final sl0 d() {
        return this.f6020e;
    }

    public final void e() {
        if (this.f6017b) {
            b(a());
            this.f6017b = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final void h(sl0 sl0Var) {
        if (this.f6017b) {
            b(a());
        }
        this.f6020e = sl0Var;
    }
}
