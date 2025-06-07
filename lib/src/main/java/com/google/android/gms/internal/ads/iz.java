package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class iz extends f4.a {
    public static final Parcelable.Creator<iz> CREATOR = new jz();

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10219m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10220n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10221o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f10222p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f10223q;

    /* renamed from: r, reason: collision with root package name */
    public final String[] f10224r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f10225s;

    /* renamed from: t, reason: collision with root package name */
    public final long f10226t;

    iz(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.f10219m = z10;
        this.f10220n = str;
        this.f10221o = i10;
        this.f10222p = bArr;
        this.f10223q = strArr;
        this.f10224r = strArr2;
        this.f10225s = z11;
        this.f10226t = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.c(parcel, 1, this.f10219m);
        f4.c.q(parcel, 2, this.f10220n, false);
        f4.c.k(parcel, 3, this.f10221o);
        f4.c.f(parcel, 4, this.f10222p, false);
        f4.c.r(parcel, 5, this.f10223q, false);
        f4.c.r(parcel, 6, this.f10224r, false);
        f4.c.c(parcel, 7, this.f10225s);
        f4.c.n(parcel, 8, this.f10226t);
        f4.c.b(parcel, iA);
    }
}
