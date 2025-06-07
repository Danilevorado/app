package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class rt2 {

    /* renamed from: a, reason: collision with root package name */
    private long f14961a;

    /* renamed from: b, reason: collision with root package name */
    private long f14962b;

    /* renamed from: c, reason: collision with root package name */
    private long f14963c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f14964d = new ThreadLocal();

    public rt2(long j10) {
        f(0L);
    }

    public final synchronized long a(long j10) {
        if (this.f14962b == -9223372036854775807L) {
            long jLongValue = this.f14961a;
            if (jLongValue == 9223372036854775806L) {
                Long l10 = (Long) this.f14964d.get();
                Objects.requireNonNull(l10);
                jLongValue = l10.longValue();
            }
            this.f14962b = jLongValue - j10;
            notifyAll();
        }
        this.f14963c = j10;
        return j10 + this.f14962b;
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f14963c;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = (((-1) + j13) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j10 = this.f14961a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long d() {
        long j10;
        j10 = this.f14963c;
        return j10 != -9223372036854775807L ? j10 + this.f14962b : c();
    }

    public final synchronized long e() {
        return this.f14962b;
    }

    public final synchronized void f(long j10) {
        this.f14961a = j10;
        this.f14962b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f14963c = -9223372036854775807L;
    }
}
