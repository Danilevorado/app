package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pj3 {

    /* renamed from: a, reason: collision with root package name */
    private final wb3 f13915a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f13916b;

    public pj3(dc3 dc3Var) {
        this.f13915a = null;
        this.f13916b = dc3Var;
    }

    public pj3(wb3 wb3Var) {
        this.f13915a = wb3Var;
        this.f13916b = null;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        wb3 wb3Var = this.f13915a;
        return wb3Var != null ? wb3Var.b(bArr, bArr2) : this.f13916b.a(bArr, bArr2);
    }
}
