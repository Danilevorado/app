package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class w4 implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final r f16950q = new r() { // from class: com.google.android.gms.internal.ads.u4
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = w4.f16950q;
            return new k[]{new w4(0)};
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private static final g3 f16951r = new g3() { // from class: com.google.android.gms.internal.ads.v4
    };

    /* renamed from: e, reason: collision with root package name */
    private final s0 f16956e;

    /* renamed from: f, reason: collision with root package name */
    private n f16957f;

    /* renamed from: g, reason: collision with root package name */
    private s0 f16958g;

    /* renamed from: h, reason: collision with root package name */
    private s0 f16959h;

    /* renamed from: i, reason: collision with root package name */
    private int f16960i;

    /* renamed from: j, reason: collision with root package name */
    private ld0 f16961j;

    /* renamed from: l, reason: collision with root package name */
    private long f16963l;

    /* renamed from: m, reason: collision with root package name */
    private long f16964m;

    /* renamed from: n, reason: collision with root package name */
    private int f16965n;

    /* renamed from: o, reason: collision with root package name */
    private y4 f16966o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16967p;

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f16952a = new jm2(10);

    /* renamed from: b, reason: collision with root package name */
    private final e0 f16953b = new e0();

    /* renamed from: c, reason: collision with root package name */
    private final z f16954c = new z();

    /* renamed from: k, reason: collision with root package name */
    private long f16962k = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private final b0 f16955d = new b0();

    public w4(int i10) {
        j jVar = new j();
        this.f16956e = jVar;
        this.f16959h = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(com.google.android.gms.internal.ads.l r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w4.c(com.google.android.gms.internal.ads.l):int");
    }

    private final long g(long j10) {
        return this.f16962k + ((j10 * 1000000) / this.f16953b.f7574d);
    }

    private final y4 h(l lVar, boolean z10) {
        ((bo4) lVar).E(this.f16952a.h(), 0, 4, false);
        this.f16952a.f(0);
        this.f16953b.a(this.f16952a.m());
        return new s4(lVar.f(), lVar.e(), this.f16953b, false);
    }

    private static boolean i(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private final boolean j(l lVar) {
        y4 y4Var = this.f16966o;
        if (y4Var != null) {
            long jB = y4Var.b();
            if (jB != -1 && lVar.c() > jB - 4) {
                return true;
            }
        }
        try {
            return !lVar.E(this.f16952a.h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean k(l lVar, boolean z10) throws Throwable {
        int iC;
        int i10;
        int iB;
        lVar.j();
        if (lVar.e() == 0) {
            ld0 ld0VarA = this.f16955d.a(lVar, null);
            this.f16961j = ld0VarA;
            if (ld0VarA != null) {
                this.f16954c.b(ld0VarA);
            }
            iC = (int) lVar.c();
            if (!z10) {
                ((bo4) lVar).h(iC, false);
            }
            i10 = 0;
        } else {
            iC = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (!j(lVar)) {
                this.f16952a.f(0);
                int iM = this.f16952a.m();
                if ((i10 == 0 || i(iM, i10)) && (iB = f0.b(iM)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.f16953b.a(iM);
                        i10 = iM;
                    }
                    ((bo4) lVar).g(iB - 4, false);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == (true != z10 ? 131072 : 32768)) {
                        if (z10) {
                            return false;
                        }
                        throw oh0.a("Searched too many bytes.", null);
                    }
                    if (z10) {
                        lVar.j();
                        ((bo4) lVar).g(iC + i13, false);
                    } else {
                        ((bo4) lVar).h(1, false);
                    }
                    i10 = 0;
                    i12 = i13;
                    i11 = 0;
                }
            } else if (i11 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            ((bo4) lVar).h(iC + i12, false);
        } else {
            lVar.j();
        }
        this.f16960i = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        return k(lVar, true);
    }

    public final void b() {
        this.f16967p = true;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f16957f = nVar;
        s0 s0VarS = nVar.S(0, 1);
        this.f16958g = s0VarS;
        this.f16959h = s0VarS;
        this.f16957f.Q();
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) {
        gt1.b(this.f16958g);
        int i10 = sv2.f15560a;
        return c(lVar);
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.f16960i = 0;
        this.f16962k = -9223372036854775807L;
        this.f16963l = 0L;
        this.f16965n = 0;
    }
}
