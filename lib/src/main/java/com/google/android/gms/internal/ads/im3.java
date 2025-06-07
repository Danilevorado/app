package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class im3 extends on3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9798a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9799b;

    /* renamed from: c, reason: collision with root package name */
    private final gm3 f9800c;

    /* synthetic */ im3(int i10, int i11, gm3 gm3Var, hm3 hm3Var) {
        this.f9798a = i10;
        this.f9799b = i11;
        this.f9800c = gm3Var;
    }

    public final int a() {
        return this.f9798a;
    }

    public final int b() {
        gm3 gm3Var = this.f9800c;
        if (gm3Var == gm3.f8812e) {
            return this.f9799b;
        }
        if (gm3Var == gm3.f8809b || gm3Var == gm3.f8810c || gm3Var == gm3.f8811d) {
            return this.f9799b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final gm3 c() {
        return this.f9800c;
    }

    public final boolean d() {
        return this.f9800c != gm3.f8812e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof im3)) {
            return false;
        }
        im3 im3Var = (im3) obj;
        return im3Var.f9798a == this.f9798a && im3Var.b() == b() && im3Var.f9800c == this.f9800c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9798a), Integer.valueOf(this.f9799b), this.f9800c});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f9800c) + ", " + this.f9799b + "-byte tags, and " + this.f9798a + "-byte key)";
    }
}
