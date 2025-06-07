package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends x {
    protected a0() {
        this.f19387a.add(n0.APPLY);
        this.f19387a.add(n0.BLOCK);
        this.f19387a.add(n0.BREAK);
        this.f19387a.add(n0.CASE);
        this.f19387a.add(n0.DEFAULT);
        this.f19387a.add(n0.CONTINUE);
        this.f19387a.add(n0.DEFINE_FUNCTION);
        this.f19387a.add(n0.FN);
        this.f19387a.add(n0.IF);
        this.f19387a.add(n0.QUOTE);
        this.f19387a.add(n0.RETURN);
        this.f19387a.add(n0.SWITCH);
        this.f19387a.add(n0.TERNARY);
    }

    private static q c(r4 r4Var, List list) {
        s5.i(n0.FN.name(), 2, list);
        q qVarB = r4Var.b((q) list.get(0));
        q qVarB2 = r4Var.b((q) list.get(1));
        if (!(qVarB2 instanceof f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", qVarB2.getClass().getCanonicalName()));
        }
        List listS = ((f) qVarB2).s();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new p(qVarB.i(), listS, arrayList, r4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        if (r8.equals("continue") == false) goto L65;
     */
    @Override // com.google.android.gms.internal.measurement.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.q a(java.lang.String r8, com.google.android.gms.internal.measurement.r4 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.a0.a(java.lang.String, com.google.android.gms.internal.measurement.r4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
