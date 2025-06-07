package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class o6 {

    /* renamed from: a, reason: collision with root package name */
    public int f13019a;

    /* renamed from: b, reason: collision with root package name */
    public long f13020b;

    /* renamed from: c, reason: collision with root package name */
    public int f13021c;

    /* renamed from: d, reason: collision with root package name */
    public int f13022d;

    /* renamed from: e, reason: collision with root package name */
    public int f13023e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f13024f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    private final jm2 f13025g = new jm2(255);

    o6() {
    }

    public final void a() {
        this.f13019a = 0;
        this.f13020b = 0L;
        this.f13021c = 0;
        this.f13022d = 0;
        this.f13023e = 0;
    }

    public final boolean b(l lVar, boolean z10) throws oh0 {
        a();
        this.f13025g.c(27);
        if (o.c(lVar, this.f13025g.h(), 0, 27, z10) && this.f13025g.A() == 1332176723) {
            if (this.f13025g.s() != 0) {
                if (z10) {
                    return false;
                }
                throw oh0.c("unsupported bit stream revision");
            }
            this.f13019a = this.f13025g.s();
            this.f13020b = this.f13025g.x();
            this.f13025g.y();
            this.f13025g.y();
            this.f13025g.y();
            int iS = this.f13025g.s();
            this.f13021c = iS;
            this.f13022d = iS + 27;
            this.f13025g.c(iS);
            if (o.c(lVar, this.f13025g.h(), 0, this.f13021c, z10)) {
                for (int i10 = 0; i10 < this.f13021c; i10++) {
                    this.f13024f[i10] = this.f13025g.s();
                    this.f13023e += this.f13024f[i10];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9.e() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9.y(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.l r9, long r10) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r8 = this;
            long r0 = r9.e()
            long r2 = r9.c()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            com.google.android.gms.internal.ads.gt1.d(r0)
            com.google.android.gms.internal.ads.jm2 r0 = r8.f13025g
            r3 = 4
            r0.c(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r4 = r9.e()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L2c
            goto L55
        L2c:
            com.google.android.gms.internal.ads.jm2 r4 = r8.f13025g
            byte[] r4 = r4.h()
            boolean r4 = com.google.android.gms.internal.ads.o.c(r9, r4, r2, r3, r1)
            if (r4 == 0) goto L55
            com.google.android.gms.internal.ads.jm2 r0 = r8.f13025g
            r0.f(r2)
            com.google.android.gms.internal.ads.jm2 r0 = r8.f13025g
            long r4 = r0.A()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L51
            r0 = r9
            com.google.android.gms.internal.ads.bo4 r0 = (com.google.android.gms.internal.ads.bo4) r0
            r0.h(r1, r2)
            goto L1a
        L51:
            r9.j()
            return r1
        L55:
            if (r0 == 0) goto L5f
            long r3 = r9.e()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L66
        L5f:
            int r3 = r9.y(r1)
            r4 = -1
            if (r3 != r4) goto L55
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o6.c(com.google.android.gms.internal.ads.l, long):boolean");
    }
}
