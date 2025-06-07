package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class o6 extends u6 {
    o6(q6 q6Var, String str, Double d10, boolean z10) {
        super(q6Var, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
