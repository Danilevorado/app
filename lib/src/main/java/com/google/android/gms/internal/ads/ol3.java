package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class ol3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f13316a;

    /* renamed from: b, reason: collision with root package name */
    private final cw3 f13317b;

    /* synthetic */ ol3(Class cls, cw3 cw3Var, nl3 nl3Var) {
        this.f13316a = cls;
        this.f13317b = cw3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ol3)) {
            return false;
        }
        ol3 ol3Var = (ol3) obj;
        return ol3Var.f13316a.equals(this.f13316a) && ol3Var.f13317b.equals(this.f13317b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13316a, this.f13317b});
    }

    public final String toString() {
        return this.f13316a.getSimpleName() + ", object identifier: " + String.valueOf(this.f13317b);
    }
}
