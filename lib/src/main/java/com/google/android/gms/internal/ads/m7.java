package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class m7 implements k7 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f11960q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f11961a;

    /* renamed from: b, reason: collision with root package name */
    private s0 f11962b;

    /* renamed from: c, reason: collision with root package name */
    private final a9 f11963c;

    /* renamed from: d, reason: collision with root package name */
    private final jm2 f11964d;

    /* renamed from: e, reason: collision with root package name */
    private final z7 f11965e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f11966f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final l7 f11967g = new l7(128);

    /* renamed from: h, reason: collision with root package name */
    private long f11968h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11969i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11970j;

    /* renamed from: k, reason: collision with root package name */
    private long f11971k;

    /* renamed from: l, reason: collision with root package name */
    private long f11972l;

    /* renamed from: m, reason: collision with root package name */
    private long f11973m;

    /* renamed from: n, reason: collision with root package name */
    private long f11974n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f11975o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11976p;

    m7(a9 a9Var) {
        jm2 jm2Var;
        this.f11963c = a9Var;
        if (a9Var != null) {
            this.f11965e = new z7(178, 128);
            jm2Var = new jm2();
        } else {
            jm2Var = null;
            this.f11965e = null;
        }
        this.f11964d = jm2Var;
        this.f11972l = -9223372036854775807L;
        this.f11974n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    @Override // com.google.android.gms.internal.ads.k7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.jm2 r21) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m7.a(com.google.android.gms.internal.ads.jm2):void");
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f11961a = x8Var.b();
        this.f11962b = nVar.S(x8Var.a(), 2);
        a9 a9Var = this.f11963c;
        if (a9Var != null) {
            a9Var.b(nVar, x8Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        i0.e(this.f11966f);
        this.f11967g.b();
        z7 z7Var = this.f11965e;
        if (z7Var != null) {
            z7Var.b();
        }
        this.f11968h = 0L;
        this.f11969i = false;
        this.f11972l = -9223372036854775807L;
        this.f11974n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        this.f11972l = j10;
    }
}
