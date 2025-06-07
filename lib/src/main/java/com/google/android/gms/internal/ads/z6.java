package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z6 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final il2 f18434a;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f18435b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18436c;

    /* renamed from: d, reason: collision with root package name */
    private String f18437d;

    /* renamed from: e, reason: collision with root package name */
    private s0 f18438e;

    /* renamed from: f, reason: collision with root package name */
    private int f18439f;

    /* renamed from: g, reason: collision with root package name */
    private int f18440g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18441h;

    /* renamed from: i, reason: collision with root package name */
    private long f18442i;

    /* renamed from: j, reason: collision with root package name */
    private k9 f18443j;

    /* renamed from: k, reason: collision with root package name */
    private int f18444k;

    /* renamed from: l, reason: collision with root package name */
    private long f18445l;

    public z6(String str) {
        il2 il2Var = new il2(new byte[128], 128);
        this.f18434a = il2Var;
        this.f18435b = new jm2(il2Var.f9786a);
        this.f18439f = 0;
        this.f18445l = -9223372036854775807L;
        this.f18436c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    @Override // com.google.android.gms.internal.ads.k7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.jm2 r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z6.a(com.google.android.gms.internal.ads.jm2):void");
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f18437d = x8Var.b();
        this.f18438e = nVar.S(x8Var.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f18439f = 0;
        this.f18440g = 0;
        this.f18441h = false;
        this.f18445l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f18445l = j10;
        }
    }
}
