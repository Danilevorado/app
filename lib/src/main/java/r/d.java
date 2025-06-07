package r;

import java.util.Arrays;
import java.util.HashMap;
import r.i;
import u.d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f26355r = false;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f26356s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f26357t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f26358u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f26359v = false;

    /* renamed from: w, reason: collision with root package name */
    private static int f26360w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public static long f26361x;

    /* renamed from: y, reason: collision with root package name */
    public static long f26362y;

    /* renamed from: d, reason: collision with root package name */
    private a f26366d;

    /* renamed from: g, reason: collision with root package name */
    r.b[] f26369g;

    /* renamed from: n, reason: collision with root package name */
    final c f26376n;

    /* renamed from: q, reason: collision with root package name */
    private a f26379q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f26363a = false;

    /* renamed from: b, reason: collision with root package name */
    int f26364b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f26365c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f26367e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f26368f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26370h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26371i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f26372j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f26373k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f26374l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f26375m = 32;

    /* renamed from: o, reason: collision with root package name */
    private i[] f26377o = new i[f26360w];

    /* renamed from: p, reason: collision with root package name */
    private int f26378p = 0;

    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends r.b {
        public b(c cVar) {
            this.f26349e = new j(this, cVar);
        }
    }

    public d() {
        this.f26369g = null;
        this.f26369g = new r.b[32];
        C();
        c cVar = new c();
        this.f26376n = cVar;
        this.f26366d = new h(cVar);
        this.f26379q = f26359v ? new b(cVar) : new r.b(cVar);
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f26373k; i10++) {
            this.f26372j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f26373k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f26372j[aVar.getKey().f26395o] = true;
            }
            i iVarC = aVar.c(this, this.f26372j);
            if (iVarC != null) {
                boolean[] zArr = this.f26372j;
                int i12 = iVarC.f26395o;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (iVarC != null) {
                float f5 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f26374l; i14++) {
                    r.b bVar = this.f26369g[i14];
                    if (bVar.f26345a.f26402v != i.a.UNRESTRICTED && !bVar.f26350f && bVar.t(iVarC)) {
                        float fC = bVar.f26349e.c(iVarC);
                        if (fC < 0.0f) {
                            float f10 = (-bVar.f26346b) / fC;
                            if (f10 < f5) {
                                i13 = i14;
                                f5 = f10;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    r.b bVar2 = this.f26369g[i13];
                    bVar2.f26345a.f26396p = -1;
                    bVar2.x(iVarC);
                    i iVar = bVar2.f26345a;
                    iVar.f26396p = i13;
                    iVar.n(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f26359v) {
            while (i10 < this.f26374l) {
                r.b bVar = this.f26369g[i10];
                if (bVar != null) {
                    this.f26376n.f26351a.a(bVar);
                }
                this.f26369g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f26374l) {
            r.b bVar2 = this.f26369g[i10];
            if (bVar2 != null) {
                this.f26376n.f26352b.a(bVar2);
            }
            this.f26369g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f26376n.f26353c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
        } else {
            iVar.k();
        }
        iVar.m(aVar, str);
        int i10 = this.f26378p;
        int i11 = f26360w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f26360w = i12;
            this.f26377o = (i[]) Arrays.copyOf(this.f26377o, i12);
        }
        i[] iVarArr = this.f26377o;
        int i13 = this.f26378p;
        this.f26378p = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private final void l(r.b bVar) {
        int i10;
        if (f26357t && bVar.f26350f) {
            bVar.f26345a.l(this, bVar.f26346b);
        } else {
            r.b[] bVarArr = this.f26369g;
            int i11 = this.f26374l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f26345a;
            iVar.f26396p = i11;
            this.f26374l = i11 + 1;
            iVar.n(this, bVar);
        }
        if (f26357t && this.f26363a) {
            int i12 = 0;
            while (i12 < this.f26374l) {
                if (this.f26369g[i12] == null) {
                    System.out.println("WTF");
                }
                r.b[] bVarArr2 = this.f26369g;
                if (bVarArr2[i12] != null && bVarArr2[i12].f26350f) {
                    r.b bVar2 = bVarArr2[i12];
                    bVar2.f26345a.l(this, bVar2.f26346b);
                    (f26359v ? this.f26376n.f26351a : this.f26376n.f26352b).a(bVar2);
                    this.f26369g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f26374l;
                        if (i13 >= i10) {
                            break;
                        }
                        r.b[] bVarArr3 = this.f26369g;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f26345a.f26396p == i13) {
                            bVarArr3[i15].f26345a.f26396p = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f26369g[i14] = null;
                    }
                    this.f26374l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f26363a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f26374l; i10++) {
            r.b bVar = this.f26369g[i10];
            bVar.f26345a.f26398r = bVar.f26346b;
        }
    }

    public static r.b s(d dVar, i iVar, i iVar2, float f5) {
        return dVar.r().j(iVar, iVar2, f5);
    }

    private int u(a aVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f26374l) {
                z10 = false;
                break;
            }
            r.b[] bVarArr = this.f26369g;
            if (bVarArr[i10].f26345a.f26402v != i.a.UNRESTRICTED && bVarArr[i10].f26346b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            float f5 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f26374l; i15++) {
                r.b bVar = this.f26369g[i15];
                if (bVar.f26345a.f26402v != i.a.UNRESTRICTED && !bVar.f26350f && bVar.f26346b < 0.0f) {
                    int i16 = 9;
                    if (f26358u) {
                        int iF = bVar.f26349e.f();
                        int i17 = 0;
                        while (i17 < iF) {
                            i iVarH = bVar.f26349e.h(i17);
                            float fC = bVar.f26349e.c(iVarH);
                            if (fC > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f10 = iVarH.f26400t[i18] / fC;
                                    if ((f10 < f5 && i18 == i14) || i18 > i14) {
                                        i13 = iVarH.f26395o;
                                        i14 = i18;
                                        i12 = i15;
                                        f5 = f10;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f26373k; i19++) {
                            i iVar = this.f26376n.f26354d[i19];
                            float fC2 = bVar.f26349e.c(iVar);
                            if (fC2 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f11 = iVar.f26400t[i20] / fC2;
                                    if ((f11 < f5 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i12 = i15;
                                        i14 = i20;
                                        f5 = f11;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                r.b bVar2 = this.f26369g[i12];
                bVar2.f26345a.f26396p = -1;
                bVar2.x(this.f26376n.f26354d[i13]);
                i iVar2 = bVar2.f26345a;
                iVar2.f26396p = i12;
                iVar2.n(this, bVar2);
            } else {
                z11 = true;
            }
            if (i11 > this.f26373k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f26367e * 2;
        this.f26367e = i10;
        this.f26369g = (r.b[]) Arrays.copyOf(this.f26369g, i10);
        c cVar = this.f26376n;
        cVar.f26354d = (i[]) Arrays.copyOf(cVar.f26354d, this.f26367e);
        int i11 = this.f26367e;
        this.f26372j = new boolean[i11];
        this.f26368f = i11;
        this.f26375m = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f26376n;
            i[] iVarArr = cVar.f26354d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.k();
            }
            i10++;
        }
        cVar.f26353c.c(this.f26377o, this.f26378p);
        this.f26378p = 0;
        Arrays.fill(this.f26376n.f26354d, (Object) null);
        HashMap map = this.f26365c;
        if (map != null) {
            map.clear();
        }
        this.f26364b = 0;
        this.f26366d.clear();
        this.f26373k = 1;
        for (int i11 = 0; i11 < this.f26374l; i11++) {
            r.b[] bVarArr = this.f26369g;
            if (bVarArr[i11] != null) {
                bVarArr[i11].f26347c = false;
            }
        }
        C();
        this.f26374l = 0;
        this.f26379q = f26359v ? new b(this.f26376n) : new r.b(this.f26376n);
    }

    public void b(u.e eVar, u.e eVar2, float f5, int i10) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.m(bVar4));
        i iVarQ5 = q(eVar2.m(bVar));
        i iVarQ6 = q(eVar2.m(bVar2));
        i iVarQ7 = q(eVar2.m(bVar3));
        i iVarQ8 = q(eVar2.m(bVar4));
        r.b bVarR = r();
        double d10 = f5;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        r.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f5, i iVar3, i iVar4, int i11, int i12) {
        r.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f5, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(r.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f26374l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f26375m
            if (r0 >= r2) goto L12
            int r0 = r5.f26373k
            int r0 = r0 + r1
            int r2 = r5.f26368f
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            r0 = 0
            boolean r2 = r6.f26350f
            if (r2 != 0) goto L81
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L78
            r.i r2 = r5.p()
            r6.f26345a = r2
            int r3 = r5.f26374l
            r5.l(r6)
            int r4 = r5.f26374l
            int r3 = r3 + r1
            if (r4 != r3) goto L78
            r.d$a r0 = r5.f26379q
            r0.a(r6)
            r.d$a r0 = r5.f26379q
            r5.B(r0, r1)
            int r0 = r2.f26396p
            r3 = -1
            if (r0 != r3) goto L79
            r.i r0 = r6.f26345a
            if (r0 != r2) goto L59
            r.i r0 = r6.v(r2)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f26350f
            if (r0 != 0) goto L62
            r.i r0 = r6.f26345a
            r0.n(r5, r6)
        L62:
            boolean r0 = r.d.f26359v
            if (r0 == 0) goto L6b
            r.c r0 = r5.f26376n
            r.f r0 = r0.f26351a
            goto L6f
        L6b:
            r.c r0 = r5.f26376n
            r.f r0 = r0.f26352b
        L6f:
            r0.a(r6)
            int r0 = r5.f26374l
            int r0 = r0 - r1
            r5.f26374l = r0
            goto L79
        L78:
            r1 = r0
        L79:
            boolean r0 = r6.s()
            if (r0 != 0) goto L80
            return
        L80:
            r0 = r1
        L81:
            if (r0 != 0) goto L86
            r5.l(r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.d(r.b):void");
    }

    public r.b e(i iVar, i iVar2, int i10, int i11) {
        if (f26356s && i11 == 8 && iVar2.f26399s && iVar.f26396p == -1) {
            iVar.l(this, iVar2.f26398r + i10);
            return null;
        }
        r.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        r.b bVarR;
        if (f26356s && iVar.f26396p == -1) {
            float f5 = i10;
            iVar.l(this, f5);
            for (int i11 = 0; i11 < this.f26364b + 1; i11++) {
                i iVar2 = this.f26376n.f26354d[i11];
                if (iVar2 != null && iVar2.f26406z && iVar2.A == iVar.f26395o) {
                    iVar2.l(this, iVar2.B + f5);
                }
            }
            return;
        }
        int i12 = iVar.f26396p;
        if (i12 != -1) {
            r.b bVar = this.f26369g[i12];
            if (!bVar.f26350f) {
                if (bVar.f26349e.f() == 0) {
                    bVar.f26350f = true;
                } else {
                    bVarR = r();
                    bVarR.m(iVar, i10);
                }
            }
            bVar.f26346b = i10;
            return;
        }
        bVarR = r();
        bVarR.i(iVar, i10);
        d(bVarR);
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        r.b bVarR = r();
        i iVarT = t();
        iVarT.f26397q = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        r.b bVarR = r();
        i iVarT = t();
        iVarT.f26397q = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f26349e.c(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        r.b bVarR = r();
        i iVarT = t();
        iVarT.f26397q = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        r.b bVarR = r();
        i iVarT = t();
        iVarT.f26397q = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f26349e.c(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f5, int i10) {
        r.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f5);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    void m(r.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f26373k + 1 >= this.f26368f) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f26364b + 1;
        this.f26364b = i11;
        this.f26373k++;
        iVarA.f26395o = i11;
        iVarA.f26397q = i10;
        this.f26376n.f26354d[i11] = iVarA;
        this.f26366d.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f26373k + 1 >= this.f26368f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f26364b + 1;
        this.f26364b = i10;
        this.f26373k++;
        iVarA.f26395o = i10;
        this.f26376n.f26354d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarH = null;
        if (obj == null) {
            return null;
        }
        if (this.f26373k + 1 >= this.f26368f) {
            y();
        }
        if (obj instanceof u.d) {
            u.d dVar = (u.d) obj;
            iVarH = dVar.h();
            if (iVarH == null) {
                dVar.r(this.f26376n);
                iVarH = dVar.h();
            }
            int i10 = iVarH.f26395o;
            if (i10 == -1 || i10 > this.f26364b || this.f26376n.f26354d[i10] == null) {
                if (i10 != -1) {
                    iVarH.k();
                }
                int i11 = this.f26364b + 1;
                this.f26364b = i11;
                this.f26373k++;
                iVarH.f26395o = i11;
                iVarH.f26402v = i.a.UNRESTRICTED;
                this.f26376n.f26354d[i11] = iVarH;
            }
        }
        return iVarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r0
  0x0038: PHI (r0v6 r.b) = (r0v4 r.b), (r0v11 r.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r.b r() {
        /*
            r5 = this;
            boolean r0 = r.d.f26359v
            r1 = 1
            if (r0 == 0) goto L1f
            r.c r0 = r5.f26376n
            r.f r0 = r0.f26351a
            java.lang.Object r0 = r0.b()
            r.b r0 = (r.b) r0
            if (r0 != 0) goto L38
            r.d$b r0 = new r.d$b
            r.c r3 = r5.f26376n
            r0.<init>(r3)
            long r3 = r.d.f26362y
            long r3 = r3 + r1
            r.d.f26362y = r3
            goto L3b
        L1f:
            r.c r0 = r5.f26376n
            r.f r0 = r0.f26352b
            java.lang.Object r0 = r0.b()
            r.b r0 = (r.b) r0
            if (r0 != 0) goto L38
            r.b r0 = new r.b
            r.c r3 = r5.f26376n
            r0.<init>(r3)
            long r3 = r.d.f26361x
            long r3 = r3 + r1
            r.d.f26361x = r3
            goto L3b
        L38:
            r0.y()
        L3b:
            r.i.g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.r():r.b");
    }

    public i t() {
        if (this.f26373k + 1 >= this.f26368f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f26364b + 1;
        this.f26364b = i10;
        this.f26373k++;
        iVarA.f26395o = i10;
        this.f26376n.f26354d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f26376n;
    }

    public int x(Object obj) {
        i iVarH = ((u.d) obj).h();
        if (iVarH != null) {
            return (int) (iVarH.f26398r + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f26366d.isEmpty()) {
            n();
            return;
        }
        if (this.f26370h || this.f26371i) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f26374l) {
                    z10 = true;
                    break;
                } else if (!this.f26369g[i10].f26350f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                n();
                return;
            }
        }
        A(this.f26366d);
    }
}
