package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements q {
    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, r4 r4Var, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof o;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        return q.f19194c;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        return Boolean.FALSE;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return null;
    }
}
