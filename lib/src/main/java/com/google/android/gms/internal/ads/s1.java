package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s1 implements k {

    /* renamed from: n, reason: collision with root package name */
    public static final r f15039n = new r() { // from class: com.google.android.gms.internal.ads.r1
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = s1.f15039n;
            return new k[]{new s1(0)};
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private n f15043d;

    /* renamed from: e, reason: collision with root package name */
    private s0 f15044e;

    /* renamed from: g, reason: collision with root package name */
    private ld0 f15046g;

    /* renamed from: h, reason: collision with root package name */
    private x f15047h;

    /* renamed from: i, reason: collision with root package name */
    private int f15048i;

    /* renamed from: j, reason: collision with root package name */
    private int f15049j;

    /* renamed from: k, reason: collision with root package name */
    private q1 f15050k;

    /* renamed from: l, reason: collision with root package name */
    private int f15051l;

    /* renamed from: m, reason: collision with root package name */
    private long f15052m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f15040a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f15041b = new jm2(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    private final s f15042c = new s();

    /* renamed from: f, reason: collision with root package name */
    private int f15045f = 0;

    public s1(int i10) {
    }

    private final long b(jm2 jm2Var, boolean z10) {
        boolean zC;
        Objects.requireNonNull(this.f15047h);
        int iK = jm2Var.k();
        while (true) {
            if (iK > jm2Var.l() - 16) {
                if (!z10) {
                    jm2Var.f(iK);
                    return -1L;
                }
                while (iK <= jm2Var.l() - this.f15048i) {
                    jm2Var.f(iK);
                    try {
                        zC = t.c(jm2Var, this.f15047h, this.f15049j, this.f15042c);
                    } catch (IndexOutOfBoundsException unused) {
                        zC = false;
                    }
                    if (jm2Var.k() > jm2Var.l() || !zC) {
                        iK++;
                    }
                }
                jm2Var.f(jm2Var.l());
                return -1L;
            }
            jm2Var.f(iK);
            if (t.c(jm2Var, this.f15047h, this.f15049j, this.f15042c)) {
                break;
            }
            iK++;
        }
        jm2Var.f(iK);
        return this.f15042c.f15024a;
    }

    private final void c() {
        long j10 = this.f15052m * 1000000;
        x xVar = this.f15047h;
        int i10 = sv2.f15560a;
        this.f15044e.e(j10 / xVar.f17313e, 1, this.f15051l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) throws Throwable {
        u.a(lVar, false);
        jm2 jm2Var = new jm2(4);
        ((bo4) lVar).E(jm2Var.h(), 0, 4, false);
        return jm2Var.A() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f15043d = nVar;
        this.f15044e = nVar.S(0, 1);
        nVar.Q();
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) throws Throwable {
        boolean zN;
        o0 n0Var;
        boolean z10;
        int i10 = this.f15045f;
        if (i10 == 0) {
            lVar.j();
            long jC = lVar.c();
            ld0 ld0VarA = u.a(lVar, true);
            ((bo4) lVar).h((int) (lVar.c() - jC), false);
            this.f15046g = ld0VarA;
            this.f15045f = 1;
            return 0;
        }
        if (i10 == 1) {
            ((bo4) lVar).E(this.f15040a, 0, 42, false);
            lVar.j();
            this.f15045f = 2;
            return 0;
        }
        if (i10 == 2) {
            jm2 jm2Var = new jm2(4);
            ((bo4) lVar).C(jm2Var.h(), 0, 4, false);
            if (jm2Var.A() != 1716281667) {
                throw oh0.a("Failed to read FLAC stream marker.", null);
            }
            this.f15045f = 3;
            return 0;
        }
        if (i10 == 3) {
            x xVarE = this.f15047h;
            do {
                lVar.j();
                il2 il2Var = new il2(new byte[4], 4);
                bo4 bo4Var = (bo4) lVar;
                bo4Var.E(il2Var.f9786a, 0, 4, false);
                zN = il2Var.n();
                int iD = il2Var.d(7);
                int iD2 = il2Var.d(24) + 4;
                if (iD == 0) {
                    byte[] bArr = new byte[38];
                    bo4Var.C(bArr, 0, 38, false);
                    xVarE = new x(bArr, 4);
                } else {
                    if (xVarE == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iD == 3) {
                        jm2 jm2Var2 = new jm2(iD2);
                        bo4Var.C(jm2Var2.h(), 0, iD2, false);
                        xVarE = xVarE.f(u.b(jm2Var2));
                    } else if (iD == 4) {
                        jm2 jm2Var3 = new jm2(iD2);
                        bo4Var.C(jm2Var3.h(), 0, iD2, false);
                        jm2Var3.g(4);
                        xVarE = xVarE.g(Arrays.asList(y0.c(jm2Var3, false, false).f16510b));
                    } else if (iD == 6) {
                        jm2 jm2Var4 = new jm2(iD2);
                        bo4Var.C(jm2Var4.h(), 0, iD2, false);
                        jm2Var4.g(4);
                        xVarE = xVarE.e(c63.v(n2.a(jm2Var4)));
                    } else {
                        bo4Var.h(iD2, false);
                    }
                }
                int i11 = sv2.f15560a;
                this.f15047h = xVarE;
            } while (!zN);
            Objects.requireNonNull(xVarE);
            this.f15048i = Math.max(xVarE.f17311c, 6);
            this.f15044e.b(this.f15047h.c(this.f15040a, this.f15046g));
            this.f15045f = 4;
            return 0;
        }
        if (i10 == 4) {
            lVar.j();
            jm2 jm2Var5 = new jm2(2);
            ((bo4) lVar).E(jm2Var5.h(), 0, 2, false);
            int iW = jm2Var5.w();
            int i12 = iW >> 2;
            lVar.j();
            if (i12 != 16382) {
                throw oh0.a("First frame does not start with sync code.", null);
            }
            this.f15049j = iW;
            n nVar = this.f15043d;
            int i13 = sv2.f15560a;
            long jE = lVar.e();
            long jF = lVar.f();
            x xVar = this.f15047h;
            Objects.requireNonNull(xVar);
            if (xVar.f17319k != null) {
                n0Var = new v(xVar, jE);
            } else if (jF == -1 || xVar.f17318j <= 0) {
                n0Var = new n0(xVar.a(), 0L);
            } else {
                q1 q1Var = new q1(xVar, this.f15049j, jE, jF);
                this.f15050k = q1Var;
                n0Var = q1Var.b();
            }
            nVar.R(n0Var);
            this.f15045f = 5;
            return 0;
        }
        Objects.requireNonNull(this.f15044e);
        x xVar2 = this.f15047h;
        Objects.requireNonNull(xVar2);
        q1 q1Var2 = this.f15050k;
        if (q1Var2 != null && q1Var2.e()) {
            return q1Var2.a(lVar, l0Var);
        }
        if (this.f15052m == -1) {
            this.f15052m = t.b(lVar, xVar2);
            return 0;
        }
        jm2 jm2Var6 = this.f15041b;
        int iL = jm2Var6.l();
        if (iL < 32768) {
            int iZ = lVar.z(jm2Var6.h(), iL, 32768 - iL);
            z10 = iZ == -1;
            if (!z10) {
                this.f15041b.e(iL + iZ);
            } else if (this.f15041b.i() == 0) {
                c();
                return -1;
            }
        } else {
            z10 = false;
        }
        jm2 jm2Var7 = this.f15041b;
        int iK = jm2Var7.k();
        int i14 = this.f15051l;
        int i15 = this.f15048i;
        if (i14 < i15) {
            jm2Var7.g(Math.min(i15 - i14, jm2Var7.i()));
        }
        long jB = b(this.f15041b, z10);
        jm2 jm2Var8 = this.f15041b;
        int iK2 = jm2Var8.k() - iK;
        jm2Var8.f(iK);
        q0.b(this.f15044e, this.f15041b, iK2);
        this.f15051l += iK2;
        if (jB != -1) {
            c();
            this.f15051l = 0;
            this.f15052m = jB;
        }
        jm2 jm2Var9 = this.f15041b;
        if (jm2Var9.i() >= 16) {
            return 0;
        }
        int i16 = jm2Var9.i();
        System.arraycopy(jm2Var9.h(), jm2Var9.k(), jm2Var9.h(), 0, i16);
        this.f15041b.f(0);
        this.f15041b.e(i16);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f15045f = 0;
        } else {
            q1 q1Var = this.f15050k;
            if (q1Var != null) {
                q1Var.d(j11);
            }
        }
        this.f15052m = j11 != 0 ? -1L : 0L;
        this.f15051l = 0;
        this.f15041b.c(0);
    }
}
