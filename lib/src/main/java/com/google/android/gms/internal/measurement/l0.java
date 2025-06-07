package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends x {
    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, r4 r4Var, List list) {
        if (str == null || str.isEmpty() || !r4Var.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        q qVarD = r4Var.d(str);
        if (qVarD instanceof j) {
            return ((j) qVarD).a(r4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
