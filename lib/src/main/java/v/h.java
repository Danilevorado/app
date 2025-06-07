package v;

import java.util.ArrayList;
import java.util.Iterator;
import u.d;
import u.e;
import v.b;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f27733a = new b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f27734b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f27735c = 0;

    private static boolean a(int i10, u.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b bVarY = eVar.y();
        e.b bVarR = eVar.R();
        u.f fVar = eVar.I() != null ? (u.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.R();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = bVarY == bVar5 || eVar.l0() || bVarY == e.b.WRAP_CONTENT || (bVarY == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f27492w == 0 && eVar.f27455d0 == 0.0f && eVar.Y(0)) || (bVarY == bVar2 && eVar.f27492w == 1 && eVar.b0(0, eVar.U()));
        boolean z11 = bVarR == bVar5 || eVar.m0() || bVarR == e.b.WRAP_CONTENT || (bVarR == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f27494x == 0 && eVar.f27455d0 == 0.0f && eVar.Y(1)) || (bVarR == bVar && eVar.f27494x == 1 && eVar.b0(1, eVar.v()));
        if (eVar.f27455d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, u.e eVar, b.InterfaceC0195b interfaceC0195b, boolean z10) {
        u.d dVar;
        u.d dVar2;
        u.d dVar3;
        u.d dVar4;
        if (eVar.e0()) {
            return;
        }
        boolean z11 = true;
        f27734b++;
        if (!(eVar instanceof u.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                u.f.N1(i11, eVar, interfaceC0195b, new b.a(), b.a.f27687k);
            }
        }
        u.d dVarM = eVar.m(d.b.LEFT);
        u.d dVarM2 = eVar.m(d.b.RIGHT);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator it = dVarM.c().iterator();
            while (it.hasNext()) {
                u.d dVar5 = (u.d) it.next();
                u.e eVar2 = dVar5.f27431d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.k0() && zA) {
                    u.f.N1(i12, eVar2, interfaceC0195b, new b.a(), b.a.f27687k);
                }
                boolean z12 = ((dVar5 == eVar2.O && (dVar4 = eVar2.Q.f27433f) != null && dVar4.m()) || (dVar5 == eVar2.Q && (dVar3 = eVar2.O.f27433f) != null && dVar3.m())) ? z11 : false;
                e.b bVarY = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarY != bVar || zA) {
                    if (!eVar2.k0()) {
                        u.d dVar6 = eVar2.O;
                        if (dVar5 == dVar6 && eVar2.Q.f27433f == null) {
                            int iE = dVar6.e() + iD;
                            eVar2.C0(iE, eVar2.U() + iE);
                        } else {
                            u.d dVar7 = eVar2.Q;
                            if (dVar5 == dVar7 && dVar6.f27433f == null) {
                                int iE2 = iD - dVar7.e();
                                eVar2.C0(iE2 - eVar2.U(), iE2);
                            } else if (z12 && !eVar2.g0()) {
                                d(i12, interfaceC0195b, eVar2, z10);
                            }
                        }
                        b(i12, eVar2, interfaceC0195b, z10);
                    }
                } else if (eVar2.y() == bVar && eVar2.A >= 0 && eVar2.f27498z >= 0 && ((eVar2.T() == 8 || (eVar2.f27492w == 0 && eVar2.t() == 0.0f)) && !eVar2.g0() && !eVar2.j0() && z12 && !eVar2.g0())) {
                    e(i12, eVar, interfaceC0195b, eVar2, z10);
                }
                z11 = true;
            }
        }
        if (eVar instanceof u.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                u.d dVar8 = (u.d) it2.next();
                u.e eVar3 = dVar8.f27431d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.k0() && zA2) {
                    u.f.N1(i13, eVar3, interfaceC0195b, new b.a(), b.a.f27687k);
                }
                boolean z13 = (dVar8 == eVar3.O && (dVar2 = eVar3.Q.f27433f) != null && dVar2.m()) || (dVar8 == eVar3.Q && (dVar = eVar3.O.f27433f) != null && dVar.m());
                e.b bVarY2 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarY2 != bVar2 || zA2) {
                    if (!eVar3.k0()) {
                        u.d dVar9 = eVar3.O;
                        if (dVar8 == dVar9 && eVar3.Q.f27433f == null) {
                            int iE3 = dVar9.e() + iD2;
                            eVar3.C0(iE3, eVar3.U() + iE3);
                        } else {
                            u.d dVar10 = eVar3.Q;
                            if (dVar8 == dVar10 && dVar9.f27433f == null) {
                                int iE4 = iD2 - dVar10.e();
                                eVar3.C0(iE4 - eVar3.U(), iE4);
                            } else if (z13 && !eVar3.g0()) {
                                d(i13, interfaceC0195b, eVar3, z10);
                            }
                        }
                        b(i13, eVar3, interfaceC0195b, z10);
                    }
                } else if (eVar3.y() == bVar2 && eVar3.A >= 0 && eVar3.f27498z >= 0 && (eVar3.T() == 8 || (eVar3.f27492w == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.g0() && !eVar3.j0() && z13 && !eVar3.g0()) {
                        e(i13, eVar, interfaceC0195b, eVar3, z10);
                    }
                }
            }
        }
        eVar.o0();
    }

    private static void c(int i10, u.a aVar, b.InterfaceC0195b interfaceC0195b, int i11, boolean z10) {
        if (aVar.p1()) {
            int i12 = i10 + 1;
            if (i11 == 0) {
                b(i12, aVar, interfaceC0195b, z10);
            } else {
                i(i12, aVar, interfaceC0195b);
            }
        }
    }

    private static void d(int i10, b.InterfaceC0195b interfaceC0195b, u.e eVar, boolean z10) {
        float fW = eVar.w();
        int iD = eVar.O.f27433f.d();
        int iD2 = eVar.Q.f27433f.d();
        int iE = eVar.O.e() + iD;
        int iE2 = iD2 - eVar.Q.e();
        if (iD == iD2) {
            fW = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iU = eVar.U();
        int i11 = (iD2 - iD) - iU;
        if (iD > iD2) {
            i11 = (iD - iD2) - iU;
        }
        int i12 = ((int) (i11 > 0 ? (fW * i11) + 0.5f : fW * i11)) + iD;
        int i13 = i12 + iU;
        if (iD > iD2) {
            i13 = i12 - iU;
        }
        eVar.C0(i12, i13);
        b(i10 + 1, eVar, interfaceC0195b, z10);
    }

    private static void e(int i10, u.e eVar, b.InterfaceC0195b interfaceC0195b, u.e eVar2, boolean z10) {
        float fW = eVar2.w();
        int iD = eVar2.O.f27433f.d() + eVar2.O.e();
        int iD2 = eVar2.Q.f27433f.d() - eVar2.Q.e();
        if (iD2 >= iD) {
            int iU = eVar2.U();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f27492w;
                if (i11 == 2) {
                    if (!(eVar instanceof u.f)) {
                        eVar = eVar.I();
                    }
                    iU = (int) (eVar2.w() * 0.5f * eVar.U());
                } else if (i11 == 0) {
                    iU = iD2 - iD;
                }
                iU = Math.max(eVar2.f27498z, iU);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    iU = Math.min(i12, iU);
                }
            }
            int i13 = iD + ((int) ((fW * ((iD2 - iD) - iU)) + 0.5f));
            eVar2.C0(i13, iU + i13);
            b(i10 + 1, eVar2, interfaceC0195b, z10);
        }
    }

    private static void f(int i10, b.InterfaceC0195b interfaceC0195b, u.e eVar) {
        float fP = eVar.P();
        int iD = eVar.P.f27433f.d();
        int iD2 = eVar.R.f27433f.d();
        int iE = eVar.P.e() + iD;
        int iE2 = iD2 - eVar.R.e();
        if (iD == iD2) {
            fP = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iV = eVar.v();
        int i11 = (iD2 - iD) - iV;
        if (iD > iD2) {
            i11 = (iD - iD2) - iV;
        }
        int i12 = (int) (i11 > 0 ? (fP * i11) + 0.5f : fP * i11);
        int i13 = iD + i12;
        int i14 = i13 + iV;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iV;
        }
        eVar.F0(i13, i14);
        i(i10 + 1, eVar, interfaceC0195b);
    }

    private static void g(int i10, u.e eVar, b.InterfaceC0195b interfaceC0195b, u.e eVar2) {
        float fP = eVar2.P();
        int iD = eVar2.P.f27433f.d() + eVar2.P.e();
        int iD2 = eVar2.R.f27433f.d() - eVar2.R.e();
        if (iD2 >= iD) {
            int iV = eVar2.v();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f27494x;
                if (i11 == 2) {
                    if (!(eVar instanceof u.f)) {
                        eVar = eVar.I();
                    }
                    iV = (int) (fP * 0.5f * eVar.v());
                } else if (i11 == 0) {
                    iV = iD2 - iD;
                }
                iV = Math.max(eVar2.C, iV);
                int i12 = eVar2.D;
                if (i12 > 0) {
                    iV = Math.min(i12, iV);
                }
            }
            int i13 = iD + ((int) ((fP * ((iD2 - iD) - iV)) + 0.5f));
            eVar2.F0(i13, iV + i13);
            i(i10 + 1, eVar2, interfaceC0195b);
        }
    }

    public static void h(u.f fVar, b.InterfaceC0195b interfaceC0195b) {
        int iR1;
        int iR12;
        e.b bVarY = fVar.y();
        e.b bVarR = fVar.R();
        f27734b = 0;
        f27735c = 0;
        fVar.s0();
        ArrayList arrayListN1 = fVar.n1();
        int size = arrayListN1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u.e) arrayListN1.get(i10)).s0();
        }
        boolean zK1 = fVar.K1();
        if (bVarY == e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            u.e eVar = (u.e) arrayListN1.get(i11);
            if (eVar instanceof u.g) {
                u.g gVar = (u.g) eVar;
                if (gVar.o1() == 1) {
                    if (gVar.p1() != -1) {
                        iR12 = gVar.p1();
                    } else if (gVar.q1() == -1 || !fVar.l0()) {
                        if (fVar.l0()) {
                            iR12 = (int) ((gVar.r1() * fVar.U()) + 0.5f);
                        }
                        z10 = true;
                    } else {
                        iR12 = fVar.U() - gVar.q1();
                    }
                    gVar.s1(iR12);
                    z10 = true;
                }
            } else if ((eVar instanceof u.a) && ((u.a) eVar).t1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                u.e eVar2 = (u.e) arrayListN1.get(i12);
                if (eVar2 instanceof u.g) {
                    u.g gVar2 = (u.g) eVar2;
                    if (gVar2.o1() == 1) {
                        b(0, gVar2, interfaceC0195b, zK1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0195b, zK1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                u.e eVar3 = (u.e) arrayListN1.get(i13);
                if (eVar3 instanceof u.a) {
                    u.a aVar = (u.a) eVar3;
                    if (aVar.t1() == 0) {
                        c(0, aVar, interfaceC0195b, 0, zK1);
                    }
                }
            }
        }
        if (bVarR == e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            u.e eVar4 = (u.e) arrayListN1.get(i14);
            if (eVar4 instanceof u.g) {
                u.g gVar3 = (u.g) eVar4;
                if (gVar3.o1() == 0) {
                    if (gVar3.p1() != -1) {
                        iR1 = gVar3.p1();
                    } else if (gVar3.q1() == -1 || !fVar.m0()) {
                        if (fVar.m0()) {
                            iR1 = (int) ((gVar3.r1() * fVar.v()) + 0.5f);
                        }
                        z12 = true;
                    } else {
                        iR1 = fVar.v() - gVar3.q1();
                    }
                    gVar3.s1(iR1);
                    z12 = true;
                }
            } else if ((eVar4 instanceof u.a) && ((u.a) eVar4).t1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                u.e eVar5 = (u.e) arrayListN1.get(i15);
                if (eVar5 instanceof u.g) {
                    u.g gVar4 = (u.g) eVar5;
                    if (gVar4.o1() == 0) {
                        i(1, gVar4, interfaceC0195b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0195b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                u.e eVar6 = (u.e) arrayListN1.get(i16);
                if (eVar6 instanceof u.a) {
                    u.a aVar2 = (u.a) eVar6;
                    if (aVar2.t1() == 1) {
                        c(0, aVar2, interfaceC0195b, 1, zK1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            u.e eVar7 = (u.e) arrayListN1.get(i17);
            if (eVar7.k0() && a(0, eVar7)) {
                u.f.N1(0, eVar7, interfaceC0195b, f27733a, b.a.f27687k);
                if (!(eVar7 instanceof u.g)) {
                    b(0, eVar7, interfaceC0195b, zK1);
                } else if (((u.g) eVar7).o1() != 0) {
                    b(0, eVar7, interfaceC0195b, zK1);
                }
                i(0, eVar7, interfaceC0195b);
            }
        }
    }

    private static void i(int i10, u.e eVar, b.InterfaceC0195b interfaceC0195b) {
        u.d dVar;
        u.d dVar2;
        u.d dVar3;
        u.d dVar4;
        if (eVar.n0()) {
            return;
        }
        f27735c++;
        if (!(eVar instanceof u.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                u.f.N1(i11, eVar, interfaceC0195b, new b.a(), b.a.f27687k);
            }
        }
        u.d dVarM = eVar.m(d.b.TOP);
        u.d dVarM2 = eVar.m(d.b.BOTTOM);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator it = dVarM.c().iterator();
            while (it.hasNext()) {
                u.d dVar5 = (u.d) it.next();
                u.e eVar2 = dVar5.f27431d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.k0() && zA) {
                    u.f.N1(i12, eVar2, interfaceC0195b, new b.a(), b.a.f27687k);
                }
                boolean z10 = (dVar5 == eVar2.P && (dVar4 = eVar2.R.f27433f) != null && dVar4.m()) || (dVar5 == eVar2.R && (dVar3 = eVar2.P.f27433f) != null && dVar3.m());
                e.b bVarR = eVar2.R();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarR != bVar || zA) {
                    if (!eVar2.k0()) {
                        u.d dVar6 = eVar2.P;
                        if (dVar5 == dVar6 && eVar2.R.f27433f == null) {
                            int iE = dVar6.e() + iD;
                            eVar2.F0(iE, eVar2.v() + iE);
                        } else {
                            u.d dVar7 = eVar2.R;
                            if (dVar5 == dVar7 && dVar6.f27433f == null) {
                                int iE2 = iD - dVar7.e();
                                eVar2.F0(iE2 - eVar2.v(), iE2);
                            } else if (z10 && !eVar2.i0()) {
                                f(i12, interfaceC0195b, eVar2);
                            }
                        }
                        i(i12, eVar2, interfaceC0195b);
                    }
                } else if (eVar2.R() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && (eVar2.T() == 8 || (eVar2.f27494x == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.i0() && !eVar2.j0() && z10 && !eVar2.i0()) {
                        g(i12, eVar, interfaceC0195b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof u.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                u.d dVar8 = (u.d) it2.next();
                u.e eVar3 = dVar8.f27431d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.k0() && zA2) {
                    u.f.N1(i13, eVar3, interfaceC0195b, new b.a(), b.a.f27687k);
                }
                boolean z11 = (dVar8 == eVar3.P && (dVar2 = eVar3.R.f27433f) != null && dVar2.m()) || (dVar8 == eVar3.R && (dVar = eVar3.P.f27433f) != null && dVar.m());
                e.b bVarR2 = eVar3.R();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarR2 != bVar2 || zA2) {
                    if (!eVar3.k0()) {
                        u.d dVar9 = eVar3.P;
                        if (dVar8 == dVar9 && eVar3.R.f27433f == null) {
                            int iE3 = dVar9.e() + iD2;
                            eVar3.F0(iE3, eVar3.v() + iE3);
                        } else {
                            u.d dVar10 = eVar3.R;
                            if (dVar8 == dVar10 && dVar9.f27433f == null) {
                                int iE4 = iD2 - dVar10.e();
                                eVar3.F0(iE4 - eVar3.v(), iE4);
                            } else if (z11 && !eVar3.i0()) {
                                f(i13, interfaceC0195b, eVar3);
                            }
                        }
                        i(i13, eVar3, interfaceC0195b);
                    }
                } else if (eVar3.R() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.T() == 8 || (eVar3.f27494x == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.j0() && z11 && !eVar3.i0()) {
                        g(i13, eVar, interfaceC0195b, eVar3);
                    }
                }
            }
        }
        u.d dVarM3 = eVar.m(d.b.BASELINE);
        if (dVarM3.c() != null && dVarM3.m()) {
            int iD3 = dVarM3.d();
            Iterator it3 = dVarM3.c().iterator();
            while (it3.hasNext()) {
                u.d dVar11 = (u.d) it3.next();
                u.e eVar4 = dVar11.f27431d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, eVar4);
                if (eVar4.k0() && zA3) {
                    u.f.N1(i14, eVar4, interfaceC0195b, new b.a(), b.a.f27687k);
                }
                if (eVar4.R() != e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.k0() && dVar11 == eVar4.S) {
                        eVar4.B0(dVar11.e() + iD3);
                        i(i14, eVar4, interfaceC0195b);
                    }
                }
            }
        }
        eVar.p0();
    }
}
