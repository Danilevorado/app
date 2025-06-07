package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tz extends f4.a {
    public static final Parcelable.Creator<tz> CREATOR = new vz();

    /* renamed from: m, reason: collision with root package name */
    public final String f16101m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f16102n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16103o;

    /* renamed from: p, reason: collision with root package name */
    public final String f16104p;

    public tz(String str, boolean z10, int i10, String str2) {
        this.f16101m = str;
        this.f16102n = z10;
        this.f16103o = i10;
        this.f16104p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f16101m, false);
        f4.c.c(parcel, 2, this.f16102n);
        f4.c.k(parcel, 3, this.f16103o);
        f4.c.q(parcel, 4, this.f16104p, false);
        f4.c.b(parcel, iA);
    }
}
