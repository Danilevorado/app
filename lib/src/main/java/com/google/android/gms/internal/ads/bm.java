package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class bm extends f4.a {
    public static final Parcelable.Creator<bm> CREATOR = new cm();

    /* renamed from: m, reason: collision with root package name */
    public final String f6537m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6538n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6539o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6540p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6541q;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f6542r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f6543s;

    /* renamed from: t, reason: collision with root package name */
    public long f6544t;

    /* renamed from: u, reason: collision with root package name */
    public String f6545u;

    /* renamed from: v, reason: collision with root package name */
    public int f6546v;

    bm(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z10, long j11, String str5, int i10) {
        this.f6537m = str;
        this.f6538n = j10;
        this.f6539o = str2 == null ? "" : str2;
        this.f6540p = str3 == null ? "" : str3;
        this.f6541q = str4 == null ? "" : str4;
        this.f6542r = bundle == null ? new Bundle() : bundle;
        this.f6543s = z10;
        this.f6544t = j11;
        this.f6545u = str5;
        this.f6546v = i10;
    }

    public static bm f(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                ze0.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j10 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new bm(queryParameter, j10, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e5) {
            ze0.h("Unable to parse Uri into cache offering.", e5);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f6537m, false);
        f4.c.n(parcel, 3, this.f6538n);
        f4.c.q(parcel, 4, this.f6539o, false);
        f4.c.q(parcel, 5, this.f6540p, false);
        f4.c.q(parcel, 6, this.f6541q, false);
        f4.c.e(parcel, 7, this.f6542r, false);
        f4.c.c(parcel, 8, this.f6543s);
        f4.c.n(parcel, 9, this.f6544t);
        f4.c.q(parcel, 10, this.f6545u, false);
        f4.c.k(parcel, 11, this.f6546v);
        f4.c.b(parcel, iA);
    }
}
