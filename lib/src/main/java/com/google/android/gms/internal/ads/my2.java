package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class my2 extends f4.a {
    public static final Parcelable.Creator<my2> CREATOR = new ny2();

    /* renamed from: m, reason: collision with root package name */
    public final int f12311m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12312n;

    /* renamed from: o, reason: collision with root package name */
    public final String f12313o;

    my2(int i10, String str, String str2) {
        this.f12311m = i10;
        this.f12312n = str;
        this.f12313o = str2;
    }

    public my2(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f12311m);
        f4.c.q(parcel, 2, this.f12312n, false);
        f4.c.q(parcel, 3, this.f12313o, false);
        f4.c.b(parcel, iA);
    }
}
