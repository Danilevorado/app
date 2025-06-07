package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class if3 extends vd3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9716a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9717b = 12;

    /* renamed from: c, reason: collision with root package name */
    private final int f9718c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final gf3 f9719d;

    /* synthetic */ if3(int i10, int i11, int i12, gf3 gf3Var, hf3 hf3Var) {
        this.f9716a = i10;
        this.f9719d = gf3Var;
    }

    public final int a() {
        return this.f9716a;
    }

    public final gf3 b() {
        return this.f9719d;
    }

    public final boolean c() {
        return this.f9719d != gf3.f8705d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof if3)) {
            return false;
        }
        if3 if3Var = (if3) obj;
        return if3Var.f9716a == this.f9716a && if3Var.f9719d == this.f9719d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9716a), 12, 16, this.f9719d});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f9719d) + ", 12-byte IV, 16-byte tag, and " + this.f9716a + "-byte key)";
    }
}
