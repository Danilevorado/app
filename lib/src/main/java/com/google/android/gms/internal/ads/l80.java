package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l80 extends f4.a {
    public static final Parcelable.Creator<l80> CREATOR = new m80();
    public final Bundle A;
    public final boolean B;
    public final int C;
    public final int D;
    public final float E;
    public final String F;
    public final long G;
    public final String H;
    public final List I;
    public final String J;
    public final eu K;
    public final List L;
    public final long M;
    public final String N;
    public final float O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final String S;
    public final boolean T;
    public final String U;
    public final boolean V;
    public final int W;
    public final Bundle X;
    public final String Y;
    public final k3.q2 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f11369a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Bundle f11370b0;

    /* renamed from: c0, reason: collision with root package name */
    public final String f11371c0;

    /* renamed from: d0, reason: collision with root package name */
    public final String f11372d0;

    /* renamed from: e0, reason: collision with root package name */
    public final String f11373e0;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f11374f0;

    /* renamed from: g0, reason: collision with root package name */
    public final List f11375g0;

    /* renamed from: h0, reason: collision with root package name */
    public final String f11376h0;

    /* renamed from: i0, reason: collision with root package name */
    public final List f11377i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int f11378j0;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f11379k0;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f11380l0;

    /* renamed from: m, reason: collision with root package name */
    public final int f11381m;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f11382m0;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f11383n;

    /* renamed from: n0, reason: collision with root package name */
    public final ArrayList f11384n0;

    /* renamed from: o, reason: collision with root package name */
    public final k3.c4 f11385o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f11386o0;

    /* renamed from: p, reason: collision with root package name */
    public final k3.h4 f11387p;

    /* renamed from: p0, reason: collision with root package name */
    public final e00 f11388p0;

    /* renamed from: q, reason: collision with root package name */
    public final String f11389q;

    /* renamed from: q0, reason: collision with root package name */
    public final String f11390q0;

    /* renamed from: r, reason: collision with root package name */
    public final ApplicationInfo f11391r;

    /* renamed from: r0, reason: collision with root package name */
    public final Bundle f11392r0;

    /* renamed from: s, reason: collision with root package name */
    public final PackageInfo f11393s;

    /* renamed from: t, reason: collision with root package name */
    public final String f11394t;

    /* renamed from: u, reason: collision with root package name */
    public final String f11395u;

    /* renamed from: v, reason: collision with root package name */
    public final String f11396v;

    /* renamed from: w, reason: collision with root package name */
    public final ff0 f11397w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f11398x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11399y;

    /* renamed from: z, reason: collision with root package name */
    public final List f11400z;

    l80(int i10, Bundle bundle, k3.c4 c4Var, k3.h4 h4Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, ff0 ff0Var, Bundle bundle2, int i11, List list, Bundle bundle3, boolean z10, int i12, int i13, float f5, String str5, long j10, String str6, List list2, String str7, eu euVar, List list3, long j11, String str8, float f10, boolean z11, int i14, int i15, boolean z12, String str9, String str10, boolean z13, int i16, Bundle bundle4, String str11, k3.q2 q2Var, boolean z14, Bundle bundle5, String str12, String str13, String str14, boolean z15, List list4, String str15, List list5, int i17, boolean z16, boolean z17, boolean z18, ArrayList arrayList, String str16, e00 e00Var, String str17, Bundle bundle6) {
        this.f11381m = i10;
        this.f11383n = bundle;
        this.f11385o = c4Var;
        this.f11387p = h4Var;
        this.f11389q = str;
        this.f11391r = applicationInfo;
        this.f11393s = packageInfo;
        this.f11394t = str2;
        this.f11395u = str3;
        this.f11396v = str4;
        this.f11397w = ff0Var;
        this.f11398x = bundle2;
        this.f11399y = i11;
        this.f11400z = list;
        this.L = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.A = bundle3;
        this.B = z10;
        this.C = i12;
        this.D = i13;
        this.E = f5;
        this.F = str5;
        this.G = j10;
        this.H = str6;
        this.I = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.J = str7;
        this.K = euVar;
        this.M = j11;
        this.N = str8;
        this.O = f10;
        this.T = z11;
        this.P = i14;
        this.Q = i15;
        this.R = z12;
        this.S = str9;
        this.U = str10;
        this.V = z13;
        this.W = i16;
        this.X = bundle4;
        this.Y = str11;
        this.Z = q2Var;
        this.f11369a0 = z14;
        this.f11370b0 = bundle5;
        this.f11371c0 = str12;
        this.f11372d0 = str13;
        this.f11373e0 = str14;
        this.f11374f0 = z15;
        this.f11375g0 = list4;
        this.f11376h0 = str15;
        this.f11377i0 = list5;
        this.f11378j0 = i17;
        this.f11379k0 = z16;
        this.f11380l0 = z17;
        this.f11382m0 = z18;
        this.f11384n0 = arrayList;
        this.f11386o0 = str16;
        this.f11388p0 = e00Var;
        this.f11390q0 = str17;
        this.f11392r0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f11381m);
        f4.c.e(parcel, 2, this.f11383n, false);
        f4.c.p(parcel, 3, this.f11385o, i10, false);
        f4.c.p(parcel, 4, this.f11387p, i10, false);
        f4.c.q(parcel, 5, this.f11389q, false);
        f4.c.p(parcel, 6, this.f11391r, i10, false);
        f4.c.p(parcel, 7, this.f11393s, i10, false);
        f4.c.q(parcel, 8, this.f11394t, false);
        f4.c.q(parcel, 9, this.f11395u, false);
        f4.c.q(parcel, 10, this.f11396v, false);
        f4.c.p(parcel, 11, this.f11397w, i10, false);
        f4.c.e(parcel, 12, this.f11398x, false);
        f4.c.k(parcel, 13, this.f11399y);
        f4.c.s(parcel, 14, this.f11400z, false);
        f4.c.e(parcel, 15, this.A, false);
        f4.c.c(parcel, 16, this.B);
        f4.c.k(parcel, 18, this.C);
        f4.c.k(parcel, 19, this.D);
        f4.c.h(parcel, 20, this.E);
        f4.c.q(parcel, 21, this.F, false);
        f4.c.n(parcel, 25, this.G);
        f4.c.q(parcel, 26, this.H, false);
        f4.c.s(parcel, 27, this.I, false);
        f4.c.q(parcel, 28, this.J, false);
        f4.c.p(parcel, 29, this.K, i10, false);
        f4.c.s(parcel, 30, this.L, false);
        f4.c.n(parcel, 31, this.M);
        f4.c.q(parcel, 33, this.N, false);
        f4.c.h(parcel, 34, this.O);
        f4.c.k(parcel, 35, this.P);
        f4.c.k(parcel, 36, this.Q);
        f4.c.c(parcel, 37, this.R);
        f4.c.q(parcel, 39, this.S, false);
        f4.c.c(parcel, 40, this.T);
        f4.c.q(parcel, 41, this.U, false);
        f4.c.c(parcel, 42, this.V);
        f4.c.k(parcel, 43, this.W);
        f4.c.e(parcel, 44, this.X, false);
        f4.c.q(parcel, 45, this.Y, false);
        f4.c.p(parcel, 46, this.Z, i10, false);
        f4.c.c(parcel, 47, this.f11369a0);
        f4.c.e(parcel, 48, this.f11370b0, false);
        f4.c.q(parcel, 49, this.f11371c0, false);
        f4.c.q(parcel, 50, this.f11372d0, false);
        f4.c.q(parcel, 51, this.f11373e0, false);
        f4.c.c(parcel, 52, this.f11374f0);
        f4.c.m(parcel, 53, this.f11375g0, false);
        f4.c.q(parcel, 54, this.f11376h0, false);
        f4.c.s(parcel, 55, this.f11377i0, false);
        f4.c.k(parcel, 56, this.f11378j0);
        f4.c.c(parcel, 57, this.f11379k0);
        f4.c.c(parcel, 58, this.f11380l0);
        f4.c.c(parcel, 59, this.f11382m0);
        f4.c.s(parcel, 60, this.f11384n0, false);
        f4.c.q(parcel, 61, this.f11386o0, false);
        f4.c.p(parcel, 63, this.f11388p0, i10, false);
        f4.c.q(parcel, 64, this.f11390q0, false);
        f4.c.e(parcel, 65, this.f11392r0, false);
        f4.c.b(parcel, iA);
    }
}
