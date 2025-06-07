package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
final class e7 implements Serializable, b7 {

    /* renamed from: m, reason: collision with root package name */
    final Object f18913m;

    e7(Object obj) {
        this.f18913m = obj;
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final Object a() {
        return this.f18913m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e7)) {
            return false;
        }
        Object obj2 = this.f18913m;
        Object obj3 = ((e7) obj).f18913m;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18913m});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f18913m + ")";
    }
}
