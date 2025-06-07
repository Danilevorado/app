package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class hi4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9148a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9149b;

    public hi4(int i10, boolean z10) {
        this.f9148a = i10;
        this.f9149b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hi4.class == obj.getClass()) {
            hi4 hi4Var = (hi4) obj;
            if (this.f9148a == hi4Var.f9148a && this.f9149b == hi4Var.f9149b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9148a * 31) + (this.f9149b ? 1 : 0);
    }
}
