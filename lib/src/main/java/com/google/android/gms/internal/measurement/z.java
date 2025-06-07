package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class z extends x {
    public z() {
        this.f19387a.add(n0.EQUALS);
        this.f19387a.add(n0.GREATER_THAN);
        this.f19387a.add(n0.GREATER_THAN_EQUALS);
        this.f19387a.add(n0.IDENTITY_EQUALS);
        this.f19387a.add(n0.IDENTITY_NOT_EQUALS);
        this.f19387a.add(n0.LESS_THAN);
        this.f19387a.add(n0.LESS_THAN_EQUALS);
        this.f19387a.add(n0.NOT_EQUALS);
    }

    private static boolean c(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            return qVar instanceof i ? (Double.isNaN(qVar.g().doubleValue()) || Double.isNaN(qVar2.g().doubleValue()) || qVar.g().doubleValue() != qVar2.g().doubleValue()) ? false : true : qVar instanceof u ? qVar.i().equals(qVar2.i()) : qVar instanceof g ? qVar.h().equals(qVar2.h()) : qVar == qVar2;
        }
        if (((qVar instanceof v) || (qVar instanceof o)) && ((qVar2 instanceof v) || (qVar2 instanceof o))) {
            return true;
        }
        boolean z10 = qVar instanceof i;
        if (z10 && (qVar2 instanceof u)) {
            return c(qVar, new i(qVar2.g()));
        }
        boolean z11 = qVar instanceof u;
        if ((!z11 || !(qVar2 instanceof i)) && !(qVar instanceof g)) {
            if (qVar2 instanceof g) {
                return c(qVar, new i(qVar2.g()));
            }
            if ((z11 || z10) && (qVar2 instanceof m)) {
                return c(qVar, new u(qVar2.i()));
            }
            if ((qVar instanceof m) && ((qVar2 instanceof u) || (qVar2 instanceof i))) {
                return c(new u(qVar.i()), qVar2);
            }
            return false;
        }
        return c(new i(qVar.g()), qVar2);
    }

    private static boolean d(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.i());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.i());
        }
        if ((qVar instanceof u) && (qVar2 instanceof u)) {
            return qVar.i().compareTo(qVar2.i()) < 0;
        }
        double dDoubleValue = qVar.g().doubleValue();
        double dDoubleValue2 = qVar2.g().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.i());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.i());
        }
        return (((qVar instanceof u) && (qVar2 instanceof u)) || !(Double.isNaN(qVar.g().doubleValue()) || Double.isNaN(qVar2.g().doubleValue()))) && !d(qVar2, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, r4 r4Var, List list) {
        boolean zC;
        boolean zC2;
        s5.h(s5.e(str).name(), 2, list);
        q qVarB = r4Var.b((q) list.get(0));
        q qVarB2 = r4Var.b((q) list.get(1));
        int iOrdinal = s5.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zC2 = c(qVarB, qVarB2);
            } else if (iOrdinal == 42) {
                zC = d(qVarB, qVarB2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zC = d(qVarB2, qVarB);
                        break;
                    case 38:
                        zC = e(qVarB2, qVarB);
                        break;
                    case 39:
                        zC = s5.l(qVarB, qVarB2);
                        break;
                    case 40:
                        zC2 = s5.l(qVarB, qVarB2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zC = e(qVarB, qVarB2);
            }
            zC = !zC2;
        } else {
            zC = c(qVarB, qVarB2);
        }
        return zC ? q.f19198g : q.f19199h;
    }
}
