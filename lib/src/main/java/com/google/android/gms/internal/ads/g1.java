package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g1 implements k {

    /* renamed from: c, reason: collision with root package name */
    private int f8550c;

    /* renamed from: e, reason: collision with root package name */
    private h1 f8552e;

    /* renamed from: h, reason: collision with root package name */
    private long f8555h;

    /* renamed from: i, reason: collision with root package name */
    private j1 f8556i;

    /* renamed from: m, reason: collision with root package name */
    private int f8560m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f8561n;

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f8548a = new jm2(12);

    /* renamed from: b, reason: collision with root package name */
    private final f1 f8549b = new f1(null);

    /* renamed from: d, reason: collision with root package name */
    private n f8551d = new i();

    /* renamed from: g, reason: collision with root package name */
    private j1[] f8554g = new j1[0];

    /* renamed from: k, reason: collision with root package name */
    private long f8558k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f8559l = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f8557j = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f8553f = -9223372036854775807L;

    private final j1 c(int i10) {
        for (j1 j1Var : this.f8554g) {
            if (j1Var.g(i10)) {
                return j1Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        ((bo4) lVar).E(this.f8548a.h(), 0, 12, false);
        this.f8548a.f(0);
        if (this.f8548a.o() != 1179011410) {
            return false;
        }
        this.f8548a.g(4);
        return this.f8548a.o() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f8550c = 0;
        this.f8551d = nVar;
        this.f8555h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0308  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r23, com.google.android.gms.internal.ads.l0 r24) throws com.google.android.gms.internal.ads.oh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g1.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        int i10;
        this.f8555h = -1L;
        this.f8556i = null;
        for (j1 j1Var : this.f8554g) {
            j1Var.f(j10);
        }
        if (j10 != 0) {
            i10 = 6;
        } else {
            if (this.f8554g.length == 0) {
                this.f8550c = 0;
                return;
            }
            i10 = 3;
        }
        this.f8550c = i10;
    }
}
