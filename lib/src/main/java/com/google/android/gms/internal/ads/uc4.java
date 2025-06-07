package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class uc4 {

    /* renamed from: a, reason: collision with root package name */
    private final tc4 f16287a;

    /* renamed from: b, reason: collision with root package name */
    private int f16288b;

    /* renamed from: c, reason: collision with root package name */
    private long f16289c;

    /* renamed from: d, reason: collision with root package name */
    private long f16290d;

    /* renamed from: e, reason: collision with root package name */
    private long f16291e;

    /* renamed from: f, reason: collision with root package name */
    private long f16292f;

    public uc4(AudioTrack audioTrack) {
        int i10 = sv2.f15560a;
        this.f16287a = new tc4(audioTrack);
        h(0);
    }

    private final void h(int i10) {
        this.f16288b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f16291e = 0L;
            this.f16292f = -1L;
            this.f16289c = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.f16290d = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f16290d = j10;
    }

    public final long a() {
        return this.f16287a.a();
    }

    public final long b() {
        return this.f16287a.b();
    }

    public final void c() {
        if (this.f16288b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.f16288b == 2;
    }

    public final boolean g(long j10) {
        tc4 tc4Var = this.f16287a;
        if (j10 - this.f16291e < this.f16290d) {
            return false;
        }
        this.f16291e = j10;
        boolean zC = tc4Var.c();
        int i10 = this.f16288b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (zC) {
                        return true;
                    }
                    h(0);
                    return false;
                }
                if (i10 == 3) {
                    if (!zC) {
                        return false;
                    }
                    h(0);
                    return true;
                }
            } else if (!zC) {
                h(0);
            } else if (this.f16287a.a() > this.f16292f) {
                h(2);
                return true;
            }
        } else {
            if (zC) {
                if (this.f16287a.b() < this.f16289c) {
                    return false;
                }
                this.f16292f = this.f16287a.a();
                h(1);
                return true;
            }
            if (j10 - this.f16289c > 500000) {
                h(3);
                return false;
            }
        }
        return zC;
    }
}
