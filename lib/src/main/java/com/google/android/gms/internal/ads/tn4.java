package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tn4 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15927a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15928b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15929c;

    /* renamed from: d, reason: collision with root package name */
    private long f15930d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f15931e;

    /* renamed from: f, reason: collision with root package name */
    private long f15932f;

    /* renamed from: g, reason: collision with root package name */
    private long f15933g;

    /* renamed from: h, reason: collision with root package name */
    private long f15934h;

    protected tn4(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f15927a = j10;
        this.f15928b = j11;
        this.f15931e = j13;
        this.f15932f = j14;
        this.f15933g = j15;
        this.f15929c = j16;
        this.f15934h = f(j11, 0L, j13, j14, j15, j16);
    }

    protected static long f(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    static /* bridge */ /* synthetic */ void g(tn4 tn4Var, long j10, long j11) {
        tn4Var.f15931e = j10;
        tn4Var.f15933g = j11;
        tn4Var.i();
    }

    static /* bridge */ /* synthetic */ void h(tn4 tn4Var, long j10, long j11) {
        tn4Var.f15930d = j10;
        tn4Var.f15932f = j11;
        tn4Var.i();
    }

    private final void i() {
        this.f15934h = f(this.f15928b, this.f15930d, this.f15931e, this.f15932f, this.f15933g, this.f15929c);
    }
}
