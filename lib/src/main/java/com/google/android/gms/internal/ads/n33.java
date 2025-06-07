package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class n33 extends e33 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f12387m;

    n33(Object obj) {
        this.f12387m = obj;
    }

    @Override // com.google.android.gms.internal.ads.e33
    public final e33 a(w23 w23Var) {
        Object objA = w23Var.a(this.f12387m);
        i33.c(objA, "the Function passed to Optional.transform() must not return null.");
        return new n33(objA);
    }

    @Override // com.google.android.gms.internal.ads.e33
    public final Object b(Object obj) {
        return this.f12387m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n33) {
            return this.f12387m.equals(((n33) obj).f12387m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12387m.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f12387m.toString() + ")";
    }
}
