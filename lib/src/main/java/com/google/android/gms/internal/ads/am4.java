package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class am4 {

    /* renamed from: a, reason: collision with root package name */
    private long f6153a;

    /* renamed from: b, reason: collision with root package name */
    private long f6154b;

    /* renamed from: c, reason: collision with root package name */
    private long f6155c;

    /* renamed from: d, reason: collision with root package name */
    private long f6156d;

    /* renamed from: e, reason: collision with root package name */
    private long f6157e;

    /* renamed from: f, reason: collision with root package name */
    private long f6158f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f6159g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    private int f6160h;

    public final long a() {
        long j10 = this.f6157e;
        if (j10 == 0) {
            return 0L;
        }
        return this.f6158f / j10;
    }

    public final long b() {
        return this.f6158f;
    }

    public final void c(long j10) {
        int i10;
        long j11 = this.f6156d;
        if (j11 == 0) {
            this.f6153a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f6153a;
            this.f6154b = j12;
            this.f6158f = j12;
            this.f6157e = 1L;
        } else {
            long j13 = j10 - this.f6155c;
            int i11 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f6154b) <= 1000000) {
                this.f6157e++;
                this.f6158f += j13;
                boolean[] zArr = this.f6159g;
                if (zArr[i11]) {
                    zArr[i11] = false;
                    i10 = this.f6160h - 1;
                    this.f6160h = i10;
                }
            } else {
                boolean[] zArr2 = this.f6159g;
                if (!zArr2[i11]) {
                    zArr2[i11] = true;
                    i10 = this.f6160h + 1;
                    this.f6160h = i10;
                }
            }
        }
        this.f6156d++;
        this.f6155c = j10;
    }

    public final void d() {
        this.f6156d = 0L;
        this.f6157e = 0L;
        this.f6158f = 0L;
        this.f6160h = 0;
        Arrays.fill(this.f6159g, false);
    }

    public final boolean e() {
        long j10 = this.f6156d;
        if (j10 == 0) {
            return false;
        }
        return this.f6159g[(int) ((j10 - 1) % 15)];
    }

    public final boolean f() {
        return this.f6156d > 15 && this.f6160h == 0;
    }
}
