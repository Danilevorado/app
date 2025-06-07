package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class n03 extends z03 {

    /* renamed from: a, reason: collision with root package name */
    private final String f12348a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12349b;

    /* synthetic */ n03(String str, String str2, m03 m03Var) {
        this.f12348a = str;
        this.f12349b = str2;
    }

    @Override // com.google.android.gms.internal.ads.z03
    public final String a() {
        return this.f12349b;
    }

    @Override // com.google.android.gms.internal.ads.z03
    public final String b() {
        return this.f12348a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z03) {
            z03 z03Var = (z03) obj;
            String str = this.f12348a;
            if (str != null ? str.equals(z03Var.b()) : z03Var.b() == null) {
                String str2 = this.f12349b;
                String strA = z03Var.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12348a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f12349b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f12348a + ", appId=" + this.f12349b + "}";
    }
}
