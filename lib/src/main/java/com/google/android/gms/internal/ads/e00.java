package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class e00 extends f4.a {
    public static final Parcelable.Creator<e00> CREATOR = new f00();

    /* renamed from: m, reason: collision with root package name */
    public final int f7578m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7579n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7580o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7581p;

    public e00(int i10, int i11, String str, int i12) {
        this.f7578m = i10;
        this.f7579n = i11;
        this.f7580o = str;
        this.f7581p = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f7579n);
        f4.c.q(parcel, 2, this.f7580o, false);
        f4.c.k(parcel, 3, this.f7581p);
        f4.c.k(parcel, AdError.NETWORK_ERROR_CODE, this.f7578m);
        f4.c.b(parcel, iA);
    }
}
