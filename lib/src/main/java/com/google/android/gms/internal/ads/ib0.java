package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ib0 extends f4.a {
    public static final Parcelable.Creator<ib0> CREATOR = new jb0();

    /* renamed from: m, reason: collision with root package name */
    public final String f9665m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9666n;

    public ib0(String str, String str2) {
        this.f9665m = str;
        this.f9666n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f9665m, false);
        f4.c.q(parcel, 2, this.f9666n, false);
        f4.c.b(parcel, iA);
    }
}
