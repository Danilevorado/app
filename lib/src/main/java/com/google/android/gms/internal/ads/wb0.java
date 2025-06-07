package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wb0 extends f4.a {
    public static final Parcelable.Creator<wb0> CREATOR = new xb0();

    /* renamed from: m, reason: collision with root package name */
    public final String f17040m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17041n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17042o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17043p;

    /* renamed from: q, reason: collision with root package name */
    public final List f17044q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17045r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17046s;

    /* renamed from: t, reason: collision with root package name */
    public final List f17047t;

    public wb0(String str, String str2, boolean z10, boolean z11, List list, boolean z12, boolean z13, List list2) {
        this.f17040m = str;
        this.f17041n = str2;
        this.f17042o = z10;
        this.f17043p = z11;
        this.f17044q = list;
        this.f17045r = z12;
        this.f17046s = z13;
        this.f17047t = list2 == null ? new ArrayList() : list2;
    }

    public static wb0 f(JSONObject jSONObject) {
        return new wb0(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), m3.w0.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), m3.w0.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f17040m, false);
        f4.c.q(parcel, 3, this.f17041n, false);
        f4.c.c(parcel, 4, this.f17042o);
        f4.c.c(parcel, 5, this.f17043p);
        f4.c.s(parcel, 6, this.f17044q, false);
        f4.c.c(parcel, 7, this.f17045r);
        f4.c.c(parcel, 8, this.f17046s);
        f4.c.s(parcel, 9, this.f17047t, false);
        f4.c.b(parcel, iA);
    }
}
