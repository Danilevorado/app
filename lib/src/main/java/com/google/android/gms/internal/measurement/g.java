package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements q {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f18954m;

    public g(Boolean bool) {
        this.f18954m = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, r4 r4Var, List list) {
        if ("toString".equals(str)) {
            return new u(Boolean.toString(this.f18954m));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f18954m), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f18954m == ((g) obj).f18954m;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        return new g(Boolean.valueOf(this.f18954m));
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        return Double.valueOf(true != this.f18954m ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        return Boolean.valueOf(this.f18954m);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f18954m).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        return Boolean.toString(this.f18954m);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f18954m);
    }
}
