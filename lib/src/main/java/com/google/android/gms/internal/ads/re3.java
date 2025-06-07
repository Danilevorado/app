package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class re3 extends vd3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f14756a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14757b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14758c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final pe3 f14759d;

    /* synthetic */ re3(int i10, int i11, int i12, pe3 pe3Var, qe3 qe3Var) {
        this.f14756a = i10;
        this.f14757b = i11;
        this.f14759d = pe3Var;
    }

    public final int a() {
        return this.f14756a;
    }

    public final pe3 b() {
        return this.f14759d;
    }

    public final boolean c() {
        return this.f14759d != pe3.f13746d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof re3)) {
            return false;
        }
        re3 re3Var = (re3) obj;
        return re3Var.f14756a == this.f14756a && re3Var.f14757b == this.f14757b && re3Var.f14759d == this.f14759d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14756a), Integer.valueOf(this.f14757b), 16, this.f14759d});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f14759d) + ", " + this.f14757b + "-byte IV, 16-byte tag, and " + this.f14756a + "-byte key)";
    }
}
