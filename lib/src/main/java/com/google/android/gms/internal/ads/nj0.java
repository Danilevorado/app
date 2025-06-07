package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class nj0 implements t53 {

    /* renamed from: a, reason: collision with root package name */
    private final t53 f12660a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12661b;

    /* renamed from: c, reason: collision with root package name */
    private final t53 f12662c;

    /* renamed from: d, reason: collision with root package name */
    private long f12663d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f12664e;

    nj0(t53 t53Var, int i10, t53 t53Var2) {
        this.f12660a = t53Var;
        this.f12661b = i10;
        this.f12662c = t53Var2;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) {
        ib3 ib3Var2;
        this.f12664e = ib3Var.f9669a;
        long j10 = ib3Var.f9674f;
        long j11 = this.f12661b;
        ib3 ib3Var3 = null;
        if (j10 >= j11) {
            ib3Var2 = null;
        } else {
            long j12 = ib3Var.f9675g;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            ib3Var2 = new ib3(ib3Var.f9669a, null, j10, j10, jMin, null, 0);
        }
        long j13 = ib3Var.f9675g;
        if (j13 == -1 || ib3Var.f9674f + j13 > this.f12661b) {
            long jMax = Math.max(this.f12661b, ib3Var.f9674f);
            long j14 = ib3Var.f9675g;
            ib3Var3 = new ib3(ib3Var.f9669a, null, jMax, jMax, j14 != -1 ? Math.min(j14, (ib3Var.f9674f + j14) - this.f12661b) : -1L, null, 0);
        }
        long jA = ib3Var2 != null ? this.f12660a.a(ib3Var2) : 0L;
        long jA2 = ib3Var3 != null ? this.f12662c.a(ib3Var3) : 0L;
        this.f12663d = ib3Var.f9674f;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void b(wy3 wy3Var) {
    }

    @Override // com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public final Map c() {
        return f63.d();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f12664e;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        this.f12660a.f();
        this.f12662c.f();
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) {
        int i12;
        long j10 = this.f12663d;
        long j11 = this.f12661b;
        if (j10 < j11) {
            int iZ = this.f12660a.z(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.f12663d + iZ;
            this.f12663d = j12;
            i12 = iZ;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < this.f12661b) {
            return i12;
        }
        int iZ2 = this.f12662c.z(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZ2;
        this.f12663d += iZ2;
        return i13;
    }
}
