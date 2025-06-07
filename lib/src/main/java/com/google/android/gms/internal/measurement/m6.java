package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class m6 extends u6 {
    m6(q6 q6Var, String str, Long l10, boolean z10) {
        super(q6Var, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
