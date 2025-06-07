package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gn3 extends on3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8827a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8828b;

    /* renamed from: c, reason: collision with root package name */
    private final en3 f8829c;

    /* renamed from: d, reason: collision with root package name */
    private final dn3 f8830d;

    /* synthetic */ gn3(int i10, int i11, en3 en3Var, dn3 dn3Var, fn3 fn3Var) {
        this.f8827a = i10;
        this.f8828b = i11;
        this.f8829c = en3Var;
        this.f8830d = dn3Var;
    }

    public final int a() {
        return this.f8827a;
    }

    public final int b() {
        en3 en3Var = this.f8829c;
        if (en3Var == en3.f7917e) {
            return this.f8828b;
        }
        if (en3Var == en3.f7914b || en3Var == en3.f7915c || en3Var == en3.f7916d) {
            return this.f8828b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final en3 c() {
        return this.f8829c;
    }

    public final boolean d() {
        return this.f8829c != en3.f7917e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gn3)) {
            return false;
        }
        gn3 gn3Var = (gn3) obj;
        return gn3Var.f8827a == this.f8827a && gn3Var.b() == b() && gn3Var.f8829c == this.f8829c && gn3Var.f8830d == this.f8830d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8827a), Integer.valueOf(this.f8828b), this.f8829c, this.f8830d});
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.f8829c) + ", hashType: " + String.valueOf(this.f8830d) + ", " + this.f8828b + "-byte tags, and " + this.f8827a + "-byte key)";
    }
}
