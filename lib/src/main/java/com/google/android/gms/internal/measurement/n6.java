package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class n6 extends u6 {
    n6(q6 q6Var, String str, Boolean bool, boolean z10) {
        super(q6Var, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.u6
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (r5.f19248c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (r5.f19249d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.c() + ": " + ((String) obj));
        return null;
    }
}
