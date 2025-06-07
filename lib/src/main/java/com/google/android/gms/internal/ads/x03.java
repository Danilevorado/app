package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class x03 extends p13 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17336a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17337b;

    /* synthetic */ x03(String str, String str2, w03 w03Var) {
        this.f17336a = str;
        this.f17337b = str2;
    }

    @Override // com.google.android.gms.internal.ads.p13
    public final String a() {
        return this.f17337b;
    }

    @Override // com.google.android.gms.internal.ads.p13
    public final String b() {
        return this.f17336a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p13) {
            p13 p13Var = (p13) obj;
            String str = this.f17336a;
            if (str != null ? str.equals(p13Var.b()) : p13Var.b() == null) {
                String str2 = this.f17337b;
                String strA = p13Var.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17336a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f17337b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f17336a + ", appId=" + this.f17337b + "}";
    }
}
