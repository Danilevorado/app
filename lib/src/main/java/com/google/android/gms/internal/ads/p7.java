package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p7 implements k7 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f13604l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final a9 f13605a;

    /* renamed from: f, reason: collision with root package name */
    private o7 f13610f;

    /* renamed from: g, reason: collision with root package name */
    private long f13611g;

    /* renamed from: h, reason: collision with root package name */
    private String f13612h;

    /* renamed from: i, reason: collision with root package name */
    private s0 f13613i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13614j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f13607c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final n7 f13608d = new n7(128);

    /* renamed from: k, reason: collision with root package name */
    private long f13615k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private final z7 f13609e = new z7(178, 128);

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f13606b = new jm2();

    p7(a9 a9Var) {
        this.f13605a = a9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    @Override // com.google.android.gms.internal.ads.k7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.jm2 r18) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p7.a(com.google.android.gms.internal.ads.jm2):void");
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f13612h = x8Var.b();
        s0 s0VarS = nVar.S(x8Var.a(), 2);
        this.f13613i = s0VarS;
        this.f13610f = new o7(s0VarS);
        this.f13605a.b(nVar, x8Var);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        i0.e(this.f13607c);
        this.f13608d.b();
        o7 o7Var = this.f13610f;
        if (o7Var != null) {
            o7Var.d();
        }
        this.f13609e.b();
        this.f13611g = 0L;
        this.f13615k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f13615k = j10;
        }
    }
}
