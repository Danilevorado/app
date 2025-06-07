package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class a7 extends z6 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f18826m;

    a7(Object obj) {
        this.f18826m = obj;
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final Object a() {
        return this.f18826m;
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a7) {
            return this.f18826m.equals(((a7) obj).f18826m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18826m.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f18826m + ")";
    }
}
