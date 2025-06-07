package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jx2 extends fx2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10740a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10741b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10742c;

    /* synthetic */ jx2(String str, boolean z10, boolean z11, ix2 ix2Var) {
        this.f10740a = str;
        this.f10741b = z10;
        this.f10742c = z11;
    }

    @Override // com.google.android.gms.internal.ads.fx2
    public final String b() {
        return this.f10740a;
    }

    @Override // com.google.android.gms.internal.ads.fx2
    public final boolean c() {
        return this.f10742c;
    }

    @Override // com.google.android.gms.internal.ads.fx2
    public final boolean d() {
        return this.f10741b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fx2) {
            fx2 fx2Var = (fx2) obj;
            if (this.f10740a.equals(fx2Var.b()) && this.f10741b == fx2Var.d() && this.f10742c == fx2Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10740a.hashCode() ^ 1000003;
        return (((iHashCode * 1000003) ^ (true != this.f10741b ? 1237 : 1231)) * 1000003) ^ (true == this.f10742c ? 1231 : 1237);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f10740a + ", shouldGetAdvertisingId=" + this.f10741b + ", isGooglePlayServicesAvailable=" + this.f10742c + "}";
    }
}
