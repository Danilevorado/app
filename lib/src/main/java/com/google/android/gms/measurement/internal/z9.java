package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class z9 extends f4.a {
    public static final Parcelable.Creator<z9> CREATOR = new aa();
    public final boolean A;
    public final boolean B;
    public final String C;
    public final Boolean D;
    public final long E;
    public final List F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;

    /* renamed from: m, reason: collision with root package name */
    public final String f20612m;

    /* renamed from: n, reason: collision with root package name */
    public final String f20613n;

    /* renamed from: o, reason: collision with root package name */
    public final String f20614o;

    /* renamed from: p, reason: collision with root package name */
    public final String f20615p;

    /* renamed from: q, reason: collision with root package name */
    public final long f20616q;

    /* renamed from: r, reason: collision with root package name */
    public final long f20617r;

    /* renamed from: s, reason: collision with root package name */
    public final String f20618s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f20619t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20620u;

    /* renamed from: v, reason: collision with root package name */
    public final long f20621v;

    /* renamed from: w, reason: collision with root package name */
    public final String f20622w;

    /* renamed from: x, reason: collision with root package name */
    public final long f20623x;

    /* renamed from: y, reason: collision with root package name */
    public final long f20624y;

    /* renamed from: z, reason: collision with root package name */
    public final int f20625z;

    z9(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11) {
        e4.p.f(str);
        this.f20612m = str;
        this.f20613n = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f20614o = str3;
        this.f20621v = j10;
        this.f20615p = str4;
        this.f20616q = j11;
        this.f20617r = j12;
        this.f20618s = str5;
        this.f20619t = z10;
        this.f20620u = z11;
        this.f20622w = str6;
        this.f20623x = 0L;
        this.f20624y = j14;
        this.f20625z = i10;
        this.A = z12;
        this.B = z13;
        this.C = str7;
        this.D = bool;
        this.E = j15;
        this.F = list;
        this.G = null;
        this.H = str9;
        this.I = str10;
        this.J = str11;
    }

    z9(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11) {
        this.f20612m = str;
        this.f20613n = str2;
        this.f20614o = str3;
        this.f20621v = j12;
        this.f20615p = str4;
        this.f20616q = j10;
        this.f20617r = j11;
        this.f20618s = str5;
        this.f20619t = z10;
        this.f20620u = z11;
        this.f20622w = str6;
        this.f20623x = j13;
        this.f20624y = j14;
        this.f20625z = i10;
        this.A = z12;
        this.B = z13;
        this.C = str7;
        this.D = bool;
        this.E = j15;
        this.F = list;
        this.G = str8;
        this.H = str9;
        this.I = str10;
        this.J = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f20612m, false);
        f4.c.q(parcel, 3, this.f20613n, false);
        f4.c.q(parcel, 4, this.f20614o, false);
        f4.c.q(parcel, 5, this.f20615p, false);
        f4.c.n(parcel, 6, this.f20616q);
        f4.c.n(parcel, 7, this.f20617r);
        f4.c.q(parcel, 8, this.f20618s, false);
        f4.c.c(parcel, 9, this.f20619t);
        f4.c.c(parcel, 10, this.f20620u);
        f4.c.n(parcel, 11, this.f20621v);
        f4.c.q(parcel, 12, this.f20622w, false);
        f4.c.n(parcel, 13, this.f20623x);
        f4.c.n(parcel, 14, this.f20624y);
        f4.c.k(parcel, 15, this.f20625z);
        f4.c.c(parcel, 16, this.A);
        f4.c.c(parcel, 18, this.B);
        f4.c.q(parcel, 19, this.C, false);
        f4.c.d(parcel, 21, this.D, false);
        f4.c.n(parcel, 22, this.E);
        f4.c.s(parcel, 23, this.F, false);
        f4.c.q(parcel, 24, this.G, false);
        f4.c.q(parcel, 25, this.H, false);
        f4.c.q(parcel, 26, this.I, false);
        f4.c.q(parcel, 27, this.J, false);
        f4.c.b(parcel, iA);
    }
}
