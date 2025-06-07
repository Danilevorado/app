package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class x6 extends z6 {

    /* renamed from: m, reason: collision with root package name */
    static final x6 f19397m = new x6();

    private x6() {
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
