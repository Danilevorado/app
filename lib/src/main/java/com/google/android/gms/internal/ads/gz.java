package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gz extends f4.a {
    public static final Parcelable.Creator<gz> CREATOR = new hz();

    /* renamed from: m, reason: collision with root package name */
    public final String f8909m;

    /* renamed from: n, reason: collision with root package name */
    public final String[] f8910n;

    /* renamed from: o, reason: collision with root package name */
    public final String[] f8911o;

    gz(String str, String[] strArr, String[] strArr2) {
        this.f8909m = str;
        this.f8910n = strArr;
        this.f8911o = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f8909m, false);
        f4.c.r(parcel, 2, this.f8910n, false);
        f4.c.r(parcel, 3, this.f8911o, false);
        f4.c.b(parcel, iA);
    }
}
