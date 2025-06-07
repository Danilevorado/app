package u;

import u.d;
import u.e;

/* loaded from: classes.dex */
public class a extends i {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    @Override // u.e
    public void g(r.d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        r.i iVar;
        d dVar2;
        int i10;
        int i11;
        int i12;
        r.i iVar2;
        int i13;
        d[] dVarArr2 = this.W;
        dVarArr2[0] = this.O;
        dVarArr2[2] = this.P;
        dVarArr2[1] = this.Q;
        dVarArr2[3] = this.R;
        int i14 = 0;
        while (true) {
            dVarArr = this.W;
            if (i14 >= dVarArr.length) {
                break;
            }
            dVarArr[i14].f27436i = dVar.q(dVarArr[i14]);
            i14++;
        }
        int i15 = this.N0;
        if (i15 < 0 || i15 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i15];
        if (!this.Q0) {
            p1();
        }
        if (this.Q0) {
            this.Q0 = false;
            int i16 = this.N0;
            if (i16 == 0 || i16 == 1) {
                dVar.f(this.O.f27436i, this.f27459f0);
                iVar2 = this.Q.f27436i;
                i13 = this.f27459f0;
            } else {
                if (i16 != 2 && i16 != 3) {
                    return;
                }
                dVar.f(this.P.f27436i, this.f27461g0);
                iVar2 = this.R.f27436i;
                i13 = this.f27461g0;
            }
            dVar.f(iVar2, i13);
            return;
        }
        for (int i17 = 0; i17 < this.M0; i17++) {
            e eVar = this.L0[i17];
            if ((this.O0 || eVar.h()) && ((((i11 = this.N0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.O.f27433f != null && eVar.Q.f27433f != null) || (((i12 = this.N0) == 2 || i12 == 3) && eVar.R() == e.b.MATCH_CONSTRAINT && eVar.P.f27433f != null && eVar.R.f27433f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.O.k() || this.Q.k();
        boolean z13 = this.P.k() || this.R.k();
        int i18 = !z11 && (((i10 = this.N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i19 = 0; i19 < this.M0; i19++) {
            e eVar2 = this.L0[i19];
            if (this.O0 || eVar2.h()) {
                r.i iVarQ = dVar.q(eVar2.W[this.N0]);
                d[] dVarArr3 = eVar2.W;
                int i20 = this.N0;
                dVarArr3[i20].f27436i = iVarQ;
                int i21 = (dVarArr3[i20].f27433f == null || dVarArr3[i20].f27433f.f27431d != this) ? 0 : dVarArr3[i20].f27434g + 0;
                if (i20 == 0 || i20 == 2) {
                    dVar.i(dVar3.f27436i, iVarQ, this.P0 - i21, z11);
                } else {
                    dVar.g(dVar3.f27436i, iVarQ, this.P0 + i21, z11);
                }
                dVar.e(dVar3.f27436i, iVarQ, this.P0 + i21, i18);
            }
        }
        int i22 = this.N0;
        if (i22 == 0) {
            dVar.e(this.Q.f27436i, this.O.f27436i, 0, 8);
            dVar.e(this.O.f27436i, this.f27449a0.Q.f27436i, 0, 4);
            iVar = this.O.f27436i;
            dVar2 = this.f27449a0.O;
        } else if (i22 == 1) {
            dVar.e(this.O.f27436i, this.Q.f27436i, 0, 8);
            dVar.e(this.O.f27436i, this.f27449a0.O.f27436i, 0, 4);
            iVar = this.O.f27436i;
            dVar2 = this.f27449a0.Q;
        } else if (i22 == 2) {
            dVar.e(this.R.f27436i, this.P.f27436i, 0, 8);
            dVar.e(this.P.f27436i, this.f27449a0.R.f27436i, 0, 4);
            iVar = this.P.f27436i;
            dVar2 = this.f27449a0.P;
        } else {
            if (i22 != 3) {
                return;
            }
            dVar.e(this.P.f27436i, this.R.f27436i, 0, 8);
            dVar.e(this.P.f27436i, this.f27449a0.P.f27436i, 0, 4);
            iVar = this.P.f27436i;
            dVar2 = this.f27449a0.R;
        }
        dVar.e(iVar, dVar2.f27436i, 0, 0);
    }

    @Override // u.e
    public boolean h() {
        return true;
    }

    @Override // u.e
    public boolean l0() {
        return this.Q0;
    }

    @Override // u.e
    public boolean m0() {
        return this.Q0;
    }

    public boolean p1() {
        int i10;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.M0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.L0[i13];
            if ((this.O0 || eVar.h()) && ((((i11 = this.N0) == 0 || i11 == 1) && !eVar.l0()) || (((i12 = this.N0) == 2 || i12 == 3) && !eVar.m0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.M0; i14++) {
            e eVar2 = this.L0[i14];
            if (this.O0 || eVar2.h()) {
                if (!z11) {
                    int i15 = this.N0;
                    if (i15 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i15 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i15 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i15 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z11 = true;
                    }
                    iMax = eVar2.m(bVar3).d();
                    z11 = true;
                }
                int i16 = this.N0;
                if (i16 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i16 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i16 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i16 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    iMax = Math.max(iMax, eVar2.m(bVar).d());
                }
                iMax = Math.min(iMax, eVar2.m(bVar2).d());
            }
        }
        int i17 = iMax + this.P0;
        int i18 = this.N0;
        if (i18 == 0 || i18 == 1) {
            C0(i17, i17);
        } else {
            F0(i17, i17);
        }
        this.Q0 = true;
        return true;
    }

    public boolean q1() {
        return this.O0;
    }

    public int r1() {
        return this.N0;
    }

    public int s1() {
        return this.P0;
    }

    public int t1() {
        int i10 = this.N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // u.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    protected void u1() {
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (this.O0 || eVar.h()) {
                int i11 = this.N0;
                if (i11 == 0 || i11 == 1) {
                    eVar.P0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.P0(1, true);
                }
            }
        }
    }

    public void v1(boolean z10) {
        this.O0 = z10;
    }

    public void w1(int i10) {
        this.N0 = i10;
    }

    public void x1(int i10) {
        this.P0 = i10;
    }
}
