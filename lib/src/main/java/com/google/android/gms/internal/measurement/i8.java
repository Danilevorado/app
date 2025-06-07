package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class i8 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19006a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19007b;

    i8(Object obj, int i10) {
        this.f19006a = obj;
        this.f19007b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.f19006a == i8Var.f19006a && this.f19007b == i8Var.f19007b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f19006a) * 65535) + this.f19007b;
    }
}
