package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fh3 extends vd3 {

    /* renamed from: a, reason: collision with root package name */
    private final eh3 f8289a;

    private fh3(eh3 eh3Var) {
        this.f8289a = eh3Var;
    }

    public static fh3 b(eh3 eh3Var) {
        return new fh3(eh3Var);
    }

    public final eh3 a() {
        return this.f8289a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fh3) && ((fh3) obj).f8289a == this.f8289a;
    }

    public final int hashCode() {
        return this.f8289a.hashCode();
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f8289a.toString() + ")";
    }
}
