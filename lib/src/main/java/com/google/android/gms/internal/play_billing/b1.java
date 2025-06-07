package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19461a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19462b;

    b1(Object obj, int i10) {
        this.f19461a = obj;
        this.f19462b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f19461a == b1Var.f19461a && this.f19462b == b1Var.f19462b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f19461a) * 65535) + this.f19462b;
    }
}
