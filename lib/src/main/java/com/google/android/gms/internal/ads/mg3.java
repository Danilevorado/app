package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mg3 extends vd3 {

    /* renamed from: a, reason: collision with root package name */
    private final lg3 f12097a;

    private mg3(lg3 lg3Var) {
        this.f12097a = lg3Var;
    }

    public static mg3 b(lg3 lg3Var) {
        return new mg3(lg3Var);
    }

    public final lg3 a() {
        return this.f12097a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mg3) && ((mg3) obj).f12097a == this.f12097a;
    }

    public final int hashCode() {
        return this.f12097a.hashCode();
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f12097a.toString() + ")";
    }
}
