package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class kg4 implements xi4 {

    /* renamed from: a, reason: collision with root package name */
    public final xi4 f11039a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11040b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lg4 f11041c;

    public kg4(lg4 lg4Var, xi4 xi4Var) {
        this.f11041c = lg4Var;
        this.f11039a = xi4Var;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final int a(long j10) {
        if (this.f11041c.p()) {
            return -3;
        }
        return this.f11039a.a(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    @Override // com.google.android.gms.internal.ads.xi4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.ads.t74 r11, com.google.android.gms.internal.ads.w44 r12, int r13) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.lg4 r0 = r10.f11041c
            boolean r0 = r0.p()
            r1 = -3
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r10.f11040b
            r2 = 4
            r3 = -4
            if (r0 == 0) goto L14
            r12.c(r2)
            return r3
        L14:
            com.google.android.gms.internal.ads.xi4 r0 = r10.f11039a
            int r13 = r0.b(r11, r12, r13)
            r0 = -5
            r4 = -9223372036854775808
            if (r13 != r0) goto L4a
            com.google.android.gms.internal.ads.k9 r12 = r11.f15720a
            java.util.Objects.requireNonNull(r12)
            int r13 = r12.B
            r1 = 0
            if (r13 != 0) goto L2e
            int r13 = r12.C
            if (r13 == 0) goto L49
            r13 = r1
        L2e:
            com.google.android.gms.internal.ads.lg4 r2 = r10.f11041c
            long r2 = r2.f11580q
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L37
            goto L39
        L37:
            int r1 = r12.C
        L39:
            com.google.android.gms.internal.ads.i7 r12 = r12.b()
            r12.c(r13)
            r12.d(r1)
            com.google.android.gms.internal.ads.k9 r12 = r12.y()
            r11.f15720a = r12
        L49:
            return r0
        L4a:
            com.google.android.gms.internal.ads.lg4 r11 = r10.f11041c
            long r6 = r11.f11580q
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L72
            if (r13 != r3) goto L5a
            long r8 = r12.f16977e
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L68
        L5a:
            if (r13 != r1) goto L72
            long r0 = r11.b()
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 != 0) goto L72
            boolean r11 = r12.f16976d
            if (r11 != 0) goto L72
        L68:
            r12.b()
            r12.c(r2)
            r11 = 1
            r10.f11040b = r11
            return r3
        L72:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kg4.b(com.google.android.gms.internal.ads.t74, com.google.android.gms.internal.ads.w44, int):int");
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final boolean c() {
        return !this.f11041c.p() && this.f11039a.c();
    }

    public final void d() {
        this.f11040b = false;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final void f() {
        this.f11039a.f();
    }
}
