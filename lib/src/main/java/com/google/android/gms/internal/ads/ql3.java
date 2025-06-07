package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class ql3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f14398a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f14399b;

    /* synthetic */ ql3(Class cls, Class cls2, pl3 pl3Var) {
        this.f14398a = cls;
        this.f14399b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ql3)) {
            return false;
        }
        ql3 ql3Var = (ql3) obj;
        return ql3Var.f14398a.equals(this.f14398a) && ql3Var.f14399b.equals(this.f14399b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14398a, this.f14399b});
    }

    public final String toString() {
        return this.f14398a.getSimpleName() + " with serialization type: " + this.f14399b.getSimpleName();
    }
}
