package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class k90 extends f4.a {
    public static final Parcelable.Creator<k90> CREATOR = new l90();

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f10913m;

    /* renamed from: n, reason: collision with root package name */
    public final ff0 f10914n;

    /* renamed from: o, reason: collision with root package name */
    public final ApplicationInfo f10915o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10916p;

    /* renamed from: q, reason: collision with root package name */
    public final List f10917q;

    /* renamed from: r, reason: collision with root package name */
    public final PackageInfo f10918r;

    /* renamed from: s, reason: collision with root package name */
    public final String f10919s;

    /* renamed from: t, reason: collision with root package name */
    public final String f10920t;

    /* renamed from: u, reason: collision with root package name */
    public zp2 f10921u;

    /* renamed from: v, reason: collision with root package name */
    public String f10922v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10923w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10924x;

    public k90(Bundle bundle, ff0 ff0Var, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zp2 zp2Var, String str4, boolean z10, boolean z11) {
        this.f10913m = bundle;
        this.f10914n = ff0Var;
        this.f10916p = str;
        this.f10915o = applicationInfo;
        this.f10917q = list;
        this.f10918r = packageInfo;
        this.f10919s = str2;
        this.f10920t = str3;
        this.f10921u = zp2Var;
        this.f10922v = str4;
        this.f10923w = z10;
        this.f10924x = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.e(parcel, 1, this.f10913m, false);
        f4.c.p(parcel, 2, this.f10914n, i10, false);
        f4.c.p(parcel, 3, this.f10915o, i10, false);
        f4.c.q(parcel, 4, this.f10916p, false);
        f4.c.s(parcel, 5, this.f10917q, false);
        f4.c.p(parcel, 6, this.f10918r, i10, false);
        f4.c.q(parcel, 7, this.f10919s, false);
        f4.c.q(parcel, 9, this.f10920t, false);
        f4.c.p(parcel, 10, this.f10921u, i10, false);
        f4.c.q(parcel, 11, this.f10922v, false);
        f4.c.c(parcel, 12, this.f10923w);
        f4.c.c(parcel, 13, this.f10924x);
        f4.c.b(parcel, iA);
    }
}
