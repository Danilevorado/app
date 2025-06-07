package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f7 implements k7 {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f8142v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8143a;

    /* renamed from: b, reason: collision with root package name */
    private final il2 f8144b = new il2(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f8145c = new jm2(Arrays.copyOf(f8142v, 10));

    /* renamed from: d, reason: collision with root package name */
    private final String f8146d;

    /* renamed from: e, reason: collision with root package name */
    private String f8147e;

    /* renamed from: f, reason: collision with root package name */
    private s0 f8148f;

    /* renamed from: g, reason: collision with root package name */
    private s0 f8149g;

    /* renamed from: h, reason: collision with root package name */
    private int f8150h;

    /* renamed from: i, reason: collision with root package name */
    private int f8151i;

    /* renamed from: j, reason: collision with root package name */
    private int f8152j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8153k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8154l;

    /* renamed from: m, reason: collision with root package name */
    private int f8155m;

    /* renamed from: n, reason: collision with root package name */
    private int f8156n;

    /* renamed from: o, reason: collision with root package name */
    private int f8157o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8158p;

    /* renamed from: q, reason: collision with root package name */
    private long f8159q;

    /* renamed from: r, reason: collision with root package name */
    private int f8160r;

    /* renamed from: s, reason: collision with root package name */
    private long f8161s;

    /* renamed from: t, reason: collision with root package name */
    private s0 f8162t;

    /* renamed from: u, reason: collision with root package name */
    private long f8163u;

    public f7(boolean z10, String str) {
        h();
        this.f8155m = -1;
        this.f8156n = -1;
        this.f8159q = -9223372036854775807L;
        this.f8161s = -9223372036854775807L;
        this.f8143a = z10;
        this.f8146d = str;
    }

    public static boolean f(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void g() {
        this.f8154l = false;
        h();
    }

    private final void h() {
        this.f8150h = 0;
        this.f8151i = 0;
        this.f8152j = 256;
    }

    private final void i() {
        this.f8150h = 3;
        this.f8151i = 0;
    }

    private final void j(s0 s0Var, long j10, int i10, int i11) {
        this.f8150h = 4;
        this.f8151i = i10;
        this.f8162t = s0Var;
        this.f8163u = j10;
        this.f8160r = i11;
    }

    private final boolean k(jm2 jm2Var, byte[] bArr, int i10) {
        int iMin = Math.min(jm2Var.i(), i10 - this.f8151i);
        jm2Var.b(bArr, this.f8151i, iMin);
        int i11 = this.f8151i + iMin;
        this.f8151i = i11;
        return i11 == i10;
    }

    private static final boolean l(byte b10, byte b11) {
        return f((b11 & 255) | 65280);
    }

    private static final boolean m(jm2 jm2Var, byte[] bArr, int i10) {
        if (jm2Var.i() < i10) {
            return false;
        }
        jm2Var.b(bArr, 0, i10);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    @Override // com.google.android.gms.internal.ads.k7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.jm2 r17) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f7.a(com.google.android.gms.internal.ads.jm2):void");
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f8147e = x8Var.b();
        s0 s0VarS = nVar.S(x8Var.a(), 1);
        this.f8148f = s0VarS;
        this.f8162t = s0VarS;
        if (!this.f8143a) {
            this.f8149g = new j();
            return;
        }
        x8Var.c();
        s0 s0VarS2 = nVar.S(x8Var.a(), 5);
        this.f8149g = s0VarS2;
        i7 i7Var = new i7();
        i7Var.h(x8Var.b());
        i7Var.s("application/id3");
        s0VarS2.b(i7Var.y());
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f8161s = -9223372036854775807L;
        g();
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f8161s = j10;
        }
    }
}
