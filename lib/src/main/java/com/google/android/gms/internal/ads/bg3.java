package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class bg3 extends vd3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6473a;

    /* renamed from: b, reason: collision with root package name */
    private final zf3 f6474b;

    /* synthetic */ bg3(int i10, zf3 zf3Var, ag3 ag3Var) {
        this.f6473a = i10;
        this.f6474b = zf3Var;
    }

    public final int a() {
        return this.f6473a;
    }

    public final zf3 b() {
        return this.f6474b;
    }

    public final boolean c() {
        return this.f6474b != zf3.f18564d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3Var = (bg3) obj;
        return bg3Var.f6473a == this.f6473a && bg3Var.f6474b == this.f6474b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6473a), this.f6474b});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f6474b) + ", " + this.f6473a + "-byte key)";
    }
}
