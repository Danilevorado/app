package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s80 extends f4.a {
    public static final Parcelable.Creator<s80> CREATOR = new t80();

    /* renamed from: m, reason: collision with root package name */
    public final String f15145m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15146n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f15147o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f15148p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15149q;

    /* renamed from: r, reason: collision with root package name */
    public final String f15150r;

    /* renamed from: s, reason: collision with root package name */
    public final String f15151s;

    public s80(String str, int i10, Bundle bundle, byte[] bArr, boolean z10, String str2, String str3) {
        this.f15145m = str;
        this.f15146n = i10;
        this.f15147o = bundle;
        this.f15148p = bArr;
        this.f15149q = z10;
        this.f15150r = str2;
        this.f15151s = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f15145m, false);
        f4.c.k(parcel, 2, this.f15146n);
        f4.c.e(parcel, 3, this.f15147o, false);
        f4.c.f(parcel, 4, this.f15148p, false);
        f4.c.c(parcel, 5, this.f15149q);
        f4.c.q(parcel, 6, this.f15150r, false);
        f4.c.q(parcel, 7, this.f15151s, false);
        f4.c.b(parcel, iA);
    }
}
