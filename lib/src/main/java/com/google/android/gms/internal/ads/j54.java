package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class j54 {

    /* renamed from: a, reason: collision with root package name */
    private final long f10303a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10304b;

    /* renamed from: c, reason: collision with root package name */
    private long f10305c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private long f10306d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f10308f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f10309g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f10312j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    private float f10311i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    private float f10313k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private long f10314l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f10307e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f10310h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f10315m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f10316n = -9223372036854775807L;

    /* synthetic */ j54(float f5, float f10, long j10, float f11, long j11, long j12, float f12, i54 i54Var) {
        this.f10303a = j11;
        this.f10304b = j12;
    }

    private static long f(long j10, long j11, float f5) {
        return (long) ((j10 * 0.999f) + (j11 * 9.999871E-4f));
    }

    private final void g() {
        long j10 = this.f10305c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f10306d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f10308f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f10309g;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f10307e == j10) {
            return;
        }
        this.f10307e = j10;
        this.f10310h = j10;
        this.f10315m = -9223372036854775807L;
        this.f10316n = -9223372036854775807L;
        this.f10314l = -9223372036854775807L;
    }

    public final float a(long j10, long j11) {
        long jF;
        long j12;
        if (this.f10305c != -9223372036854775807L) {
            long j13 = j10 - j11;
            long j14 = this.f10315m;
            if (j14 == -9223372036854775807L) {
                this.f10315m = j13;
                jF = 0;
            } else {
                long jMax = Math.max(j13, f(j14, j13, 0.999f));
                this.f10315m = jMax;
                jF = f(this.f10316n, Math.abs(j13 - jMax), 0.999f);
            }
            this.f10316n = jF;
            if (this.f10314l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f10314l < 1000) {
                return this.f10313k;
            }
            this.f10314l = SystemClock.elapsedRealtime();
            long j15 = this.f10315m + (this.f10316n * 3);
            if (this.f10310h > j15) {
                float fW = sv2.w(1000L);
                long[] jArr = {j15, this.f10307e, this.f10310h - (((long) ((this.f10313k - 1.0f) * fW)) + ((long) ((this.f10311i - 1.0f) * fW)))};
                j12 = jArr[0];
                for (int i10 = 1; i10 < 3; i10++) {
                    long j16 = jArr[i10];
                    if (j16 > j12) {
                        j12 = j16;
                    }
                }
                this.f10310h = j12;
            } else {
                long jMax2 = Math.max(this.f10310h, Math.min(j10 - ((long) (Math.max(0.0f, this.f10313k - 1.0f) / 1.0E-7f)), j15));
                this.f10310h = jMax2;
                long j17 = this.f10309g;
                if (j17 == -9223372036854775807L || jMax2 <= j17) {
                    j12 = jMax2;
                } else {
                    this.f10310h = j17;
                    j12 = j17;
                }
            }
            long j18 = j10 - j12;
            fMax = Math.abs(j18) >= this.f10303a ? Math.max(this.f10312j, Math.min((j18 * 1.0E-7f) + 1.0f, this.f10311i)) : 1.0f;
            this.f10313k = fMax;
        }
        return fMax;
    }

    public final long b() {
        return this.f10310h;
    }

    public final void c() {
        long j10 = this.f10310h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f10304b;
        this.f10310h = j11;
        long j12 = this.f10309g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f10310h = j12;
        }
        this.f10314l = -9223372036854775807L;
    }

    public final void d(fu fuVar) {
        long j10 = fuVar.f8425a;
        this.f10305c = sv2.w(-9223372036854775807L);
        this.f10308f = sv2.w(-9223372036854775807L);
        this.f10309g = sv2.w(-9223372036854775807L);
        this.f10312j = 0.97f;
        this.f10311i = 1.03f;
        g();
    }

    public final void e(long j10) {
        this.f10306d = j10;
        g();
    }
}
