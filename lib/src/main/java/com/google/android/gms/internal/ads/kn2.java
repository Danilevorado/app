package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kn2 {

    /* renamed from: c, reason: collision with root package name */
    public static final kn2 f11168c = new kn2(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final kn2 f11169d = new kn2(0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f11170a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11171b;

    public kn2(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        gt1.d(z10);
        this.f11170a = i10;
        this.f11171b = i11;
    }

    public final int a() {
        return this.f11171b;
    }

    public final int b() {
        return this.f11170a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof kn2) {
            kn2 kn2Var = (kn2) obj;
            if (this.f11170a == kn2Var.f11170a && this.f11171b == kn2Var.f11171b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f11171b;
        int i11 = this.f11170a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public final String toString() {
        return this.f11170a + "x" + this.f11171b;
    }
}
