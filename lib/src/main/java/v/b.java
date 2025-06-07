package v;

import java.util.ArrayList;
import u.d;
import u.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f27684a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f27685b = new a();

    /* renamed from: c, reason: collision with root package name */
    private u.f f27686c;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f27687k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f27688l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f27689m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f27690a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f27691b;

        /* renamed from: c, reason: collision with root package name */
        public int f27692c;

        /* renamed from: d, reason: collision with root package name */
        public int f27693d;

        /* renamed from: e, reason: collision with root package name */
        public int f27694e;

        /* renamed from: f, reason: collision with root package name */
        public int f27695f;

        /* renamed from: g, reason: collision with root package name */
        public int f27696g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f27697h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f27698i;

        /* renamed from: j, reason: collision with root package name */
        public int f27699j;
    }

    /* renamed from: v.b$b, reason: collision with other inner class name */
    public interface InterfaceC0195b {
        void a();

        void b(u.e eVar, a aVar);
    }

    public b(u.f fVar) {
        this.f27686c = fVar;
    }

    private boolean a(InterfaceC0195b interfaceC0195b, u.e eVar, int i10) {
        this.f27685b.f27690a = eVar.y();
        this.f27685b.f27691b = eVar.R();
        this.f27685b.f27692c = eVar.U();
        this.f27685b.f27693d = eVar.v();
        a aVar = this.f27685b;
        aVar.f27698i = false;
        aVar.f27699j = i10;
        e.b bVar = aVar.f27690a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f27691b == bVar2;
        boolean z12 = z10 && eVar.f27455d0 > 0.0f;
        boolean z13 = z11 && eVar.f27455d0 > 0.0f;
        if (z12 && eVar.f27496y[0] == 4) {
            aVar.f27690a = e.b.FIXED;
        }
        if (z13 && eVar.f27496y[1] == 4) {
            aVar.f27691b = e.b.FIXED;
        }
        interfaceC0195b.b(eVar, aVar);
        eVar.g1(this.f27685b.f27694e);
        eVar.I0(this.f27685b.f27695f);
        eVar.H0(this.f27685b.f27697h);
        eVar.x0(this.f27685b.f27696g);
        a aVar2 = this.f27685b;
        aVar2.f27699j = a.f27687k;
        return aVar2.f27698i;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0093 A[PHI: r10
  0x0093: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:52:0x0090, B:50:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(u.f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.O1(r1)
            v.b$b r2 = r13.E1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La0
            java.util.ArrayList r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            u.e r5 = (u.e) r5
            boolean r6 = r5 instanceof u.g
            if (r6 == 0) goto L22
            goto L9c
        L22:
            boolean r6 = r5 instanceof u.a
            if (r6 == 0) goto L28
            goto L9c
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto L9c
        L30:
            if (r1 == 0) goto L47
            v.l r6 = r5.f27456e
            if (r6 == 0) goto L47
            v.n r7 = r5.f27458f
            if (r7 == 0) goto L47
            v.g r6 = r6.f27768e
            boolean r6 = r6.f27720j
            if (r6 == 0) goto L47
            v.g r6 = r7.f27768e
            boolean r6 = r6.f27720j
            if (r6 == 0) goto L47
            goto L9c
        L47:
            u.e$b r6 = r5.s(r3)
            r7 = 1
            u.e$b r8 = r5.s(r7)
            u.e$b r9 = u.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f27492w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f27494x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L93
            boolean r11 = r13.O1(r7)
            if (r11 == 0) goto L93
            if (r6 != r9) goto L78
            int r11 = r5.f27492w
            if (r11 != 0) goto L78
            if (r8 == r9) goto L78
            boolean r11 = r5.g0()
            if (r11 != 0) goto L78
            r10 = r7
        L78:
            if (r8 != r9) goto L87
            int r11 = r5.f27494x
            if (r11 != 0) goto L87
            if (r6 == r9) goto L87
            boolean r11 = r5.g0()
            if (r11 != 0) goto L87
            r10 = r7
        L87:
            if (r6 == r9) goto L8b
            if (r8 != r9) goto L93
        L8b:
            float r6 = r5.f27455d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L93
            goto L94
        L93:
            r7 = r10
        L94:
            if (r7 == 0) goto L97
            goto L9c
        L97:
            int r6 = v.b.a.f27687k
            r12.a(r2, r5, r6)
        L9c:
            int r4 = r4 + 1
            goto L12
        La0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.b.b(u.f):void");
    }

    private void c(u.f fVar, String str, int i10, int i11, int i12) {
        int iG = fVar.G();
        int iF = fVar.F();
        fVar.W0(0);
        fVar.V0(0);
        fVar.g1(i11);
        fVar.I0(i12);
        fVar.W0(iG);
        fVar.V0(iF);
        this.f27686c.S1(i10);
        this.f27686c.o1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    public long d(u.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zD1;
        int i19;
        u.f fVar2;
        int i20;
        boolean z10;
        int i21;
        b bVar = this;
        InterfaceC0195b interfaceC0195bE1 = fVar.E1();
        int size = fVar.L0.size();
        int iU = fVar.U();
        int iV = fVar.v();
        boolean zB = u.j.b(i10, 128);
        boolean z11 = false;
        boolean z12 = zB || u.j.b(i10, 64);
        if (z12) {
            for (int i22 = 0; i22 < size; i22++) {
                u.e eVar = (u.e) fVar.L0.get(i22);
                e.b bVarY = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z13 = (bVarY == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z13) || ((eVar.i0() && z13) || eVar.g0() || eVar.i0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = r.d.f26355r;
        }
        boolean z15 = z12 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        if (z15) {
            int iMin = Math.min(fVar.E(), i14);
            int iMin2 = Math.min(fVar.D(), i16);
            if (i13 == 1073741824 && fVar.U() != iMin) {
                fVar.g1(iMin);
                fVar.H1();
            }
            if (i15 == 1073741824 && fVar.v() != iMin2) {
                fVar.I0(iMin2);
                fVar.H1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zD1 = fVar.B1(zB);
                i19 = 2;
            } else {
                boolean zC1 = fVar.C1(zB);
                if (i13 == 1073741824) {
                    zC1 &= fVar.D1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zD1 = fVar.D1(zB, 1) & zC1;
                    i19++;
                } else {
                    zD1 = zC1;
                }
            }
            if (zD1) {
                fVar.l1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zD1 = false;
            i19 = 0;
        }
        if (zD1 && i19 == 2) {
            return 0L;
        }
        int iF1 = fVar.F1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f27684a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, iU, iV);
        }
        if (size2 > 0) {
            e.b bVarY2 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z16 = bVarY2 == bVar3;
            boolean z17 = fVar.R() == bVar3;
            int iMax = Math.max(fVar.U(), bVar.f27686c.G());
            int iMax2 = Math.max(fVar.v(), bVar.f27686c.F());
            for (int i23 = 0; i23 < size2; i23++) {
            }
            int i24 = 0;
            for (int i25 = 2; i24 < i25; i25 = 2) {
                boolean z18 = z11;
                for (?? r10 = z11; r10 < size2; r10++) {
                    u.e eVar2 = (u.e) bVar.f27684a.get(r10);
                    int i26 = size2;
                    if ((eVar2 instanceof u.h) || (eVar2 instanceof u.g) || eVar2.T() == 8 || (z15 && eVar2.f27456e.f27768e.f27720j && eVar2.f27458f.f27768e.f27720j)) {
                        z10 = z15;
                        i21 = iF1;
                    } else {
                        int iU2 = eVar2.U();
                        int iV2 = eVar2.v();
                        z10 = z15;
                        int iN = eVar2.n();
                        int i27 = a.f27688l;
                        i21 = iF1;
                        if (i24 == 1) {
                            i27 = a.f27689m;
                        }
                        boolean zA = bVar.a(interfaceC0195bE1, eVar2, i27) | z18;
                        int iU3 = eVar2.U();
                        int iV3 = eVar2.v();
                        if (iU3 != iU2) {
                            eVar2.g1(iU3);
                            if (z16 && eVar2.K() > iMax) {
                                iMax = Math.max(iMax, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                            }
                            zA = true;
                        }
                        if (iV3 != iV2) {
                            eVar2.I0(iV3);
                            if (z17 && eVar2.p() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                            }
                            zA = true;
                        }
                        z18 = (!eVar2.X() || iN == eVar2.n()) ? zA : true;
                    }
                    bVar = this;
                    size2 = i26;
                    z15 = z10;
                    iF1 = i21;
                }
                boolean z19 = z15;
                int i28 = iF1;
                int i29 = size2;
                if (!z18) {
                    fVar2 = fVar;
                    i20 = i28;
                    break;
                }
                i24++;
                c(fVar, "intermediate pass", i24, iU, iV);
                bVar = this;
                size2 = i29;
                z15 = z19;
                iF1 = i28;
                z11 = false;
            }
            fVar2 = fVar;
            i20 = iF1;
        } else {
            fVar2 = fVar;
            i20 = iF1;
        }
        fVar2.R1(i20);
        return 0L;
    }

    public void e(u.f fVar) {
        this.f27684a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            u.e eVar = (u.e) fVar.L0.get(i10);
            e.b bVarY = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarY == bVar || eVar.R() == bVar) {
                this.f27684a.add(eVar);
            }
        }
        fVar.H1();
    }
}
