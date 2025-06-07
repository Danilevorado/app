package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class u73 extends k73 implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    final k73 f16214m;

    u73(k73 k73Var) {
        this.f16214m = k73Var;
    }

    @Override // com.google.android.gms.internal.ads.k73
    public final k73 a() {
        return this.f16214m;
    }

    @Override // com.google.android.gms.internal.ads.k73, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f16214m.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u73) {
            return this.f16214m.equals(((u73) obj).f16214m);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f16214m.hashCode();
    }

    public final String toString() {
        return this.f16214m.toString().concat(".reverse()");
    }
}
