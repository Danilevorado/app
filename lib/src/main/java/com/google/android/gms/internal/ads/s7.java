package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class s7 {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f15123a;

    /* renamed from: d, reason: collision with root package name */
    private final k0 f15126d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f15127e;

    /* renamed from: f, reason: collision with root package name */
    private int f15128f;

    /* renamed from: g, reason: collision with root package name */
    private long f15129g;

    /* renamed from: h, reason: collision with root package name */
    private long f15130h;

    /* renamed from: l, reason: collision with root package name */
    private long f15134l;

    /* renamed from: m, reason: collision with root package name */
    private long f15135m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15136n;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f15124b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f15125c = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    private final r7 f15131i = new r7(null);

    /* renamed from: j, reason: collision with root package name */
    private final r7 f15132j = new r7(null);

    /* renamed from: k, reason: collision with root package name */
    private boolean f15133k = false;

    public s7(s0 s0Var, boolean z10, boolean z11) {
        this.f15123a = s0Var;
        byte[] bArr = new byte[128];
        this.f15127e = bArr;
        this.f15126d = new k0(bArr, 0, 0);
    }

    public final void a(g0 g0Var) {
        this.f15125c.append(g0Var.f8517a, g0Var);
    }

    public final void b(h0 h0Var) {
        this.f15124b.append(h0Var.f8923d, h0Var);
    }

    public final void c() {
        this.f15133k = false;
    }

    public final void d(long j10, int i10, long j11) {
        this.f15128f = i10;
        this.f15130h = j11;
        this.f15129g = j10;
    }

    public final boolean e(long j10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.f15128f == 9) {
            if (z10 && this.f15133k) {
                long j11 = this.f15129g;
                int i11 = i10 + ((int) (j10 - j11));
                long j12 = this.f15135m;
                if (j12 != -9223372036854775807L) {
                    this.f15123a.e(j12, this.f15136n ? 1 : 0, (int) (j11 - this.f15134l), i11, null);
                }
            }
            this.f15134l = this.f15129g;
            this.f15135m = this.f15130h;
            this.f15136n = false;
            this.f15133k = true;
        }
        boolean z13 = this.f15136n;
        int i12 = this.f15128f;
        if (i12 == 5 || (z11 && i12 == 1)) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        this.f15136n = z14;
        return z14;
    }
}
