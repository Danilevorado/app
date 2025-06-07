package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class i6 implements p6 {

    /* renamed from: a, reason: collision with root package name */
    private final o6 f9553a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9554b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9555c;

    /* renamed from: d, reason: collision with root package name */
    private final u6 f9556d;

    /* renamed from: e, reason: collision with root package name */
    private int f9557e;

    /* renamed from: f, reason: collision with root package name */
    private long f9558f;

    /* renamed from: g, reason: collision with root package name */
    private long f9559g;

    /* renamed from: h, reason: collision with root package name */
    private long f9560h;

    /* renamed from: i, reason: collision with root package name */
    private long f9561i;

    /* renamed from: j, reason: collision with root package name */
    private long f9562j;

    /* renamed from: k, reason: collision with root package name */
    private long f9563k;

    /* renamed from: l, reason: collision with root package name */
    private long f9564l;

    public i6(u6 u6Var, long j10, long j11, long j12, long j13, boolean z10) {
        gt1.d(j10 >= 0 && j11 > j10);
        this.f9556d = u6Var;
        this.f9554b = j10;
        this.f9555c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f9558f = j13;
            this.f9557e = 4;
        } else {
            this.f9557e = 0;
        }
        this.f9553a = new o6();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    @Override // com.google.android.gms.internal.ads.p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.l r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i6.a(com.google.android.gms.internal.ads.l):long");
    }

    @Override // com.google.android.gms.internal.ads.p6
    public final /* bridge */ /* synthetic */ o0 c() {
        f6 f6Var = null;
        if (this.f9558f != 0) {
            return new g6(this, f6Var);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p6
    public final void h(long j10) {
        this.f9560h = Math.max(0L, Math.min(j10, this.f9558f - 1));
        this.f9557e = 2;
        this.f9561i = this.f9554b;
        this.f9562j = this.f9555c;
        this.f9563k = 0L;
        this.f9564l = this.f9558f;
    }
}
