package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class k0 extends x {
    protected k0() {
        this.f19387a.add(n0.ADD);
        this.f19387a.add(n0.DIVIDE);
        this.f19387a.add(n0.MODULUS);
        this.f19387a.add(n0.MULTIPLY);
        this.f19387a.add(n0.NEGATE);
        this.f19387a.add(n0.POST_DECREMENT);
        this.f19387a.add(n0.POST_INCREMENT);
        this.f19387a.add(n0.PRE_DECREMENT);
        this.f19387a.add(n0.PRE_INCREMENT);
        this.f19387a.add(n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, r4 r4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = s5.e(str).ordinal();
        if (iOrdinal == 0) {
            s5.h(n0Var.name(), 2, list);
            q qVarB = r4Var.b((q) list.get(0));
            q qVarB2 = r4Var.b((q) list.get(1));
            return ((qVarB instanceof m) || (qVarB instanceof u) || (qVarB2 instanceof m) || (qVarB2 instanceof u)) ? new u(String.valueOf(qVarB.i()).concat(String.valueOf(qVarB2.i()))) : new i(Double.valueOf(qVarB.g().doubleValue() + qVarB2.g().doubleValue()));
        }
        if (iOrdinal == 21) {
            s5.h(n0.DIVIDE.name(), 2, list);
            return new i(Double.valueOf(r4Var.b((q) list.get(0)).g().doubleValue() / r4Var.b((q) list.get(1)).g().doubleValue()));
        }
        if (iOrdinal == 59) {
            s5.h(n0.SUBTRACT.name(), 2, list);
            return new i(Double.valueOf(r4Var.b((q) list.get(0)).g().doubleValue() + new i(Double.valueOf(-r4Var.b((q) list.get(1)).g().doubleValue())).g().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            s5.h(str, 2, list);
            q qVarB3 = r4Var.b((q) list.get(0));
            r4Var.b((q) list.get(1));
            return qVarB3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            s5.h(str, 1, list);
            return r4Var.b((q) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                s5.h(n0.MODULUS.name(), 2, list);
                return new i(Double.valueOf(r4Var.b((q) list.get(0)).g().doubleValue() % r4Var.b((q) list.get(1)).g().doubleValue()));
            case 45:
                s5.h(n0.MULTIPLY.name(), 2, list);
                return new i(Double.valueOf(r4Var.b((q) list.get(0)).g().doubleValue() * r4Var.b((q) list.get(1)).g().doubleValue()));
            case 46:
                s5.h(n0.NEGATE.name(), 1, list);
                return new i(Double.valueOf(-r4Var.b((q) list.get(0)).g().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
