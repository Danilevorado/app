package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class px3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14083a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14084b;

    px3(Object obj, int i10) {
        this.f14083a = obj;
        this.f14084b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof px3)) {
            return false;
        }
        px3 px3Var = (px3) obj;
        return this.f14083a == px3Var.f14083a && this.f14084b == px3Var.f14084b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14083a) * 65535) + this.f14084b;
    }
}
