package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class wy2 extends f4.a {
    public static final Parcelable.Creator<wy2> CREATOR = new xy2();

    /* renamed from: m, reason: collision with root package name */
    public final int f17295m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17296n;

    /* renamed from: o, reason: collision with root package name */
    public final String f17297o;

    /* renamed from: p, reason: collision with root package name */
    public final String f17298p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17299q;

    wy2(int i10, int i11, int i12, String str, String str2) {
        this.f17295m = i10;
        this.f17296n = i11;
        this.f17297o = str;
        this.f17298p = str2;
        this.f17299q = i12;
    }

    public wy2(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f17295m);
        f4.c.k(parcel, 2, this.f17296n);
        f4.c.q(parcel, 3, this.f17297o, false);
        f4.c.q(parcel, 4, this.f17298p, false);
        f4.c.k(parcel, 5, this.f17299q);
        f4.c.b(parcel, iA);
    }
}
