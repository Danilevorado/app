package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class o80 extends f4.a {
    public static final Parcelable.Creator<o80> CREATOR = new p80();

    /* renamed from: m, reason: collision with root package name */
    public final ApplicationInfo f13051m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13052n;

    /* renamed from: o, reason: collision with root package name */
    public final PackageInfo f13053o;

    /* renamed from: p, reason: collision with root package name */
    public final String f13054p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13055q;

    /* renamed from: r, reason: collision with root package name */
    public final String f13056r;

    /* renamed from: s, reason: collision with root package name */
    public final List f13057s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f13058t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f13059u;

    public o80(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i10, String str3, List list, boolean z10, boolean z11) {
        this.f13052n = str;
        this.f13051m = applicationInfo;
        this.f13053o = packageInfo;
        this.f13054p = str2;
        this.f13055q = i10;
        this.f13056r = str3;
        this.f13057s = list;
        this.f13058t = z10;
        this.f13059u = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.p(parcel, 1, this.f13051m, i10, false);
        f4.c.q(parcel, 2, this.f13052n, false);
        f4.c.p(parcel, 3, this.f13053o, i10, false);
        f4.c.q(parcel, 4, this.f13054p, false);
        f4.c.k(parcel, 5, this.f13055q);
        f4.c.q(parcel, 6, this.f13056r, false);
        f4.c.s(parcel, 7, this.f13057s, false);
        f4.c.c(parcel, 8, this.f13058t);
        f4.c.c(parcel, 9, this.f13059u);
        f4.c.b(parcel, iA);
    }
}
