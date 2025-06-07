package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j0 extends x {
    protected j0() {
        this.f19387a.add(n0.FOR_IN);
        this.f19387a.add(n0.FOR_IN_CONST);
        this.f19387a.add(n0.FOR_IN_LET);
        this.f19387a.add(n0.FOR_LET);
        this.f19387a.add(n0.FOR_OF);
        this.f19387a.add(n0.FOR_OF_CONST);
        this.f19387a.add(n0.FOR_OF_LET);
        this.f19387a.add(n0.WHILE);
    }

    private static q c(h0 h0Var, Iterator it, q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                q qVarC = h0Var.a((q) it.next()).c((f) qVar);
                if (qVarC instanceof h) {
                    h hVar = (h) qVarC;
                    if ("break".equals(hVar.b())) {
                        return q.f19193b;
                    }
                    if ("return".equals(hVar.b())) {
                        return hVar;
                    }
                }
            }
        }
        return q.f19193b;
    }

    private static q d(h0 h0Var, q qVar, q qVar2) {
        return c(h0Var, qVar.l(), qVar2);
    }

    private static q e(h0 h0Var, q qVar, q qVar2) {
        if (qVar instanceof Iterable) {
            return c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b4  */
    @Override // com.google.android.gms.internal.measurement.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.q a(java.lang.String r11, com.google.android.gms.internal.measurement.r4 r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j0.a(java.lang.String, com.google.android.gms.internal.measurement.r4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
