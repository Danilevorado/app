package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class c9 implements d9 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f6832m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f6833n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    private final n f6834a;

    /* renamed from: b, reason: collision with root package name */
    private final s0 f6835b;

    /* renamed from: c, reason: collision with root package name */
    private final g9 f6836c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6837d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f6838e;

    /* renamed from: f, reason: collision with root package name */
    private final jm2 f6839f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6840g;

    /* renamed from: h, reason: collision with root package name */
    private final k9 f6841h;

    /* renamed from: i, reason: collision with root package name */
    private int f6842i;

    /* renamed from: j, reason: collision with root package name */
    private long f6843j;

    /* renamed from: k, reason: collision with root package name */
    private int f6844k;

    /* renamed from: l, reason: collision with root package name */
    private long f6845l;

    public c9(n nVar, s0 s0Var, g9 g9Var) throws oh0 {
        this.f6834a = nVar;
        this.f6835b = s0Var;
        this.f6836c = g9Var;
        int iMax = Math.max(1, g9Var.f8646c / 10);
        this.f6840g = iMax;
        jm2 jm2Var = new jm2(g9Var.f8649f);
        jm2Var.q();
        int iQ = jm2Var.q();
        this.f6837d = iQ;
        int i10 = g9Var.f8645b;
        int i11 = g9Var.f8647d;
        int i12 = (((i11 - (i10 * 4)) * 8) / (g9Var.f8648e * i10)) + 1;
        if (iQ != i12) {
            throw oh0.a("Expected frames per block: " + i12 + "; got: " + iQ, null);
        }
        int i13 = sv2.f15560a;
        int i14 = ((iMax + iQ) - 1) / iQ;
        this.f6838e = new byte[i11 * i14];
        this.f6839f = new jm2(i14 * (iQ + iQ) * i10);
        int i15 = ((g9Var.f8646c * g9Var.f8647d) * 8) / iQ;
        i7 i7Var = new i7();
        i7Var.s("audio/raw");
        i7Var.d0(i15);
        i7Var.o(i15);
        i7Var.l((iMax + iMax) * i10);
        i7Var.e0(g9Var.f8645b);
        i7Var.t(g9Var.f8646c);
        i7Var.n(2);
        this.f6841h = i7Var.y();
    }

    private final int d(int i10) {
        int i11 = this.f6836c.f8645b;
        return i10 / (i11 + i11);
    }

    private final int e(int i10) {
        return (i10 + i10) * this.f6836c.f8645b;
    }

    private final void f(int i10) {
        long jX = this.f6843j + sv2.x(this.f6845l, 1000000L, this.f6836c.f8646c);
        int iE = e(i10);
        this.f6835b.e(jX, 1, iE, this.f6844k - iE, null);
        this.f6845l += i10;
        this.f6844k -= iE;
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final void a(long j10) {
        this.f6842i = 0;
        this.f6843j = j10;
        this.f6844k = 0;
        this.f6845l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final void b(int i10, long j10) {
        this.f6834a.R(new j9(this.f6836c, this.f6837d, i10, j10));
        this.f6835b.b(this.f6841h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.l r21, long r22) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c9.c(com.google.android.gms.internal.ads.l, long):boolean");
    }
}
