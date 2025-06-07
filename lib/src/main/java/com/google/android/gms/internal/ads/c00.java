package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c00 extends f4.a {
    public static final Parcelable.Creator<c00> CREATOR = new d00();

    /* renamed from: m, reason: collision with root package name */
    public final String f6735m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f6736n;

    public c00(String str, Bundle bundle) {
        this.f6735m = str;
        this.f6736n = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f6735m, false);
        f4.c.e(parcel, 2, this.f6736n, false);
        f4.c.b(parcel, iA);
    }
}
