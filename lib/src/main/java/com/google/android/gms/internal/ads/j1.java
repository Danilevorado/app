package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class j1 {

    /* renamed from: a, reason: collision with root package name */
    protected final s0 f10240a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10241b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10242c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10243d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10244e;

    /* renamed from: f, reason: collision with root package name */
    private int f10245f;

    /* renamed from: g, reason: collision with root package name */
    private int f10246g;

    /* renamed from: h, reason: collision with root package name */
    private int f10247h;

    /* renamed from: i, reason: collision with root package name */
    private int f10248i;

    /* renamed from: j, reason: collision with root package name */
    private int f10249j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f10250k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f10251l;

    public j1(int i10, int i11, long j10, int i12, s0 s0Var) {
        i11 = i11 != 1 ? 2 : i11;
        this.f10243d = j10;
        this.f10244e = i12;
        this.f10240a = s0Var;
        this.f10241b = i(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f10242c = i11 == 2 ? i(i10, 1650720768) : -1;
        this.f10250k = new long[512];
        this.f10251l = new int[512];
    }

    private static int i(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long j(int i10) {
        return (this.f10243d * i10) / this.f10244e;
    }

    private final p0 k(int i10) {
        return new p0(this.f10251l[i10] * j(1), this.f10250k[i10]);
    }

    public final m0 a(long j10) {
        int iJ = (int) (j10 / j(1));
        int iJ2 = sv2.j(this.f10251l, iJ, true, true);
        if (this.f10251l[iJ2] == iJ) {
            p0 p0VarK = k(iJ2);
            return new m0(p0VarK, p0VarK);
        }
        p0 p0VarK2 = k(iJ2);
        int i10 = iJ2 + 1;
        return i10 < this.f10250k.length ? new m0(p0VarK2, k(i10)) : new m0(p0VarK2, p0VarK2);
    }

    public final void b(long j10) {
        if (this.f10249j == this.f10251l.length) {
            long[] jArr = this.f10250k;
            this.f10250k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f10251l;
            this.f10251l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f10250k;
        int i10 = this.f10249j;
        jArr2[i10] = j10;
        this.f10251l[i10] = this.f10248i;
        this.f10249j = i10 + 1;
    }

    public final void c() {
        this.f10250k = Arrays.copyOf(this.f10250k, this.f10249j);
        this.f10251l = Arrays.copyOf(this.f10251l, this.f10249j);
    }

    public final void d() {
        this.f10248i++;
    }

    public final void e(int i10) {
        this.f10245f = i10;
        this.f10246g = i10;
    }

    public final void f(long j10) {
        int i10;
        if (this.f10249j == 0) {
            i10 = 0;
        } else {
            i10 = this.f10251l[sv2.k(this.f10250k, j10, true, true)];
        }
        this.f10247h = i10;
    }

    public final boolean g(int i10) {
        return this.f10241b == i10 || this.f10242c == i10;
    }

    public final boolean h(l lVar) {
        int i10 = this.f10246g;
        int iF = i10 - this.f10240a.f(lVar, i10, false);
        this.f10246g = iF;
        boolean z10 = iF == 0;
        if (z10) {
            if (this.f10245f > 0) {
                this.f10240a.e(j(this.f10247h), Arrays.binarySearch(this.f10251l, this.f10247h) >= 0 ? 1 : 0, this.f10245f, 0, null);
            }
            this.f10247h++;
        }
        return z10;
    }
}
