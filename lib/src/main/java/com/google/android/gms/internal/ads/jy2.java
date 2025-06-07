package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class jy2 extends f4.a {
    public static final Parcelable.Creator<jy2> CREATOR = new ky2();

    /* renamed from: m, reason: collision with root package name */
    public final int f10748m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f10749n;

    jy2(int i10, byte[] bArr) {
        this.f10748m = i10;
        this.f10749n = bArr;
    }

    public jy2(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f10748m);
        f4.c.f(parcel, 2, this.f10749n, false);
        f4.c.b(parcel, iA);
    }
}
