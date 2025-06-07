package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class fl3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8323a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8324b;

    /* synthetic */ fl3(Class cls, Class cls2, el3 el3Var) {
        this.f8323a = cls;
        this.f8324b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        return fl3Var.f8323a.equals(this.f8323a) && fl3Var.f8324b.equals(this.f8324b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8323a, this.f8324b});
    }

    public final String toString() {
        return this.f8323a.getSimpleName() + " with primitive type: " + this.f8324b.getSimpleName();
    }
}
