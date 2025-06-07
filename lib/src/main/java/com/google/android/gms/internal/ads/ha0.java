package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ha0 extends f4.a {
    public static final Parcelable.Creator<ha0> CREATOR = new ia0();

    /* renamed from: m, reason: collision with root package name */
    public final k3.c4 f9075m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9076n;

    public ha0(k3.c4 c4Var, String str) {
        this.f9075m = c4Var;
        this.f9076n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.p(parcel, 2, this.f9075m, i10, false);
        f4.c.q(parcel, 3, this.f9076n, false);
        f4.c.b(parcel, iA);
    }
}
