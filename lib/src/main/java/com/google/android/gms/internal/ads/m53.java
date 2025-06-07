package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
final class m53 extends k73 implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    final Comparator f11933m;

    m53(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.f11933m = comparator;
    }

    @Override // com.google.android.gms.internal.ads.k73, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f11933m.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m53) {
            return this.f11933m.equals(((m53) obj).f11933m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11933m.hashCode();
    }

    public final String toString() {
        return this.f11933m.toString();
    }
}
