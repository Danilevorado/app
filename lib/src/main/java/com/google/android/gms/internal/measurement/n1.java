package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n1 extends f4.a {
    public static final Parcelable.Creator<n1> CREATOR = new o1();

    /* renamed from: m, reason: collision with root package name */
    public final long f19120m;

    /* renamed from: n, reason: collision with root package name */
    public final long f19121n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19122o;

    /* renamed from: p, reason: collision with root package name */
    public final String f19123p;

    /* renamed from: q, reason: collision with root package name */
    public final String f19124q;

    /* renamed from: r, reason: collision with root package name */
    public final String f19125r;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f19126s;

    /* renamed from: t, reason: collision with root package name */
    public final String f19127t;

    public n1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f19120m = j10;
        this.f19121n = j11;
        this.f19122o = z10;
        this.f19123p = str;
        this.f19124q = str2;
        this.f19125r = str3;
        this.f19126s = bundle;
        this.f19127t = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.n(parcel, 1, this.f19120m);
        f4.c.n(parcel, 2, this.f19121n);
        f4.c.c(parcel, 3, this.f19122o);
        f4.c.q(parcel, 4, this.f19123p, false);
        f4.c.q(parcel, 5, this.f19124q, false);
        f4.c.q(parcel, 6, this.f19125r, false);
        f4.c.e(parcel, 7, this.f19126s, false);
        f4.c.q(parcel, 8, this.f19127t, false);
        f4.c.b(parcel, iA);
    }
}
