package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class u03 extends m13 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16127a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16128b;

    /* synthetic */ u03(int i10, String str, t03 t03Var) {
        this.f16127a = i10;
        this.f16128b = str;
    }

    @Override // com.google.android.gms.internal.ads.m13
    public final int a() {
        return this.f16127a;
    }

    @Override // com.google.android.gms.internal.ads.m13
    public final String b() {
        return this.f16128b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m13) {
            m13 m13Var = (m13) obj;
            if (this.f16127a == m13Var.a()) {
                String str = this.f16128b;
                String strB = m13Var.b();
                if (str != null ? str.equals(strB) : strB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f16127a ^ 1000003;
        String str = this.f16128b;
        return (i10 * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f16127a + ", sessionToken=" + this.f16128b + "}";
    }
}
