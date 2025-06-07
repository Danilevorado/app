package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14561a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14564d;

    public r0(int i10, byte[] bArr, int i11, int i12) {
        this.f14561a = i10;
        this.f14562b = bArr;
        this.f14563c = i11;
        this.f14564d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.f14561a == r0Var.f14561a && this.f14563c == r0Var.f14563c && this.f14564d == r0Var.f14564d && Arrays.equals(this.f14562b, r0Var.f14562b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f14561a * 31) + Arrays.hashCode(this.f14562b)) * 31) + this.f14563c) * 31) + this.f14564d;
    }
}
