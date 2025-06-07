package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fr implements tt {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f8378a;

    fr(gr grVar) {
        this.f8378a = grVar;
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final Double a(String str, double d10) {
        try {
            return Double.valueOf(this.f8378a.f8868e.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f8378a.f8868e.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final String b(String str, String str2) {
        return this.f8378a.f8868e.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final Long c(String str, long j10) {
        try {
            return Long.valueOf(this.f8378a.f8868e.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f8378a.f8868e.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final Boolean d(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.f8378a.f8868e.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f8378a.f8868e.getString(str, String.valueOf(z10)));
        }
    }
}
