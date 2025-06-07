package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends x {
    protected e0() {
        this.f19387a.add(n0.AND);
        this.f19387a.add(n0.NOT);
        this.f19387a.add(n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, r4 r4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = s5.e(str).ordinal();
        if (iOrdinal == 1) {
            s5.h(n0.AND.name(), 2, list);
            q qVarB = r4Var.b((q) list.get(0));
            if (!qVarB.h().booleanValue()) {
                return qVarB;
            }
        } else {
            if (iOrdinal == 47) {
                s5.h(n0.NOT.name(), 1, list);
                return new g(Boolean.valueOf(!r4Var.b((q) list.get(0)).h().booleanValue()));
            }
            if (iOrdinal != 50) {
                return super.b(str);
            }
            s5.h(n0.OR.name(), 2, list);
            q qVarB2 = r4Var.b((q) list.get(0));
            if (qVarB2.h().booleanValue()) {
                return qVarB2;
            }
        }
        return r4Var.b((q) list.get(1));
    }
}
