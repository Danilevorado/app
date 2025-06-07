package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final m8 f16606a;

    /* renamed from: b, reason: collision with root package name */
    private String f16607b;

    /* renamed from: c, reason: collision with root package name */
    private s0 f16608c;

    /* renamed from: d, reason: collision with root package name */
    private u7 f16609d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16610e;

    /* renamed from: l, reason: collision with root package name */
    private long f16617l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f16611f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final z7 f16612g = new z7(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final z7 f16613h = new z7(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final z7 f16614i = new z7(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final z7 f16615j = new z7(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final z7 f16616k = new z7(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f16618m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final jm2 f16619n = new jm2();

    public v7(m8 m8Var) {
        this.f16606a = m8Var;
    }

    private final void f(byte[] bArr, int i10, int i11) {
        this.f16609d.b(bArr, i10, i11);
        if (!this.f16610e) {
            this.f16612g.a(bArr, i10, i11);
            this.f16613h.a(bArr, i10, i11);
            this.f16614i.a(bArr, i10, i11);
        }
        this.f16615j.a(bArr, i10, i11);
        this.f16616k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x032b  */
    @Override // com.google.android.gms.internal.ads.k7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.jm2 r38) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v7.a(com.google.android.gms.internal.ads.jm2):void");
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f16607b = x8Var.b();
        s0 s0VarS = nVar.S(x8Var.a(), 2);
        this.f16608c = s0VarS;
        this.f16609d = new u7(s0VarS);
        this.f16606a.b(nVar, x8Var);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f16617l = 0L;
        this.f16618m = -9223372036854775807L;
        i0.e(this.f16611f);
        this.f16612g.b();
        this.f16613h.b();
        this.f16614i.b();
        this.f16615j.b();
        this.f16616k.b();
        u7 u7Var = this.f16609d;
        if (u7Var != null) {
            u7Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f16618m = j10;
        }
    }
}
