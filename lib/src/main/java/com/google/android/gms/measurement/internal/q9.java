package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q9 extends f4.a {
    public static final Parcelable.Creator<q9> CREATOR = new r9();

    /* renamed from: m, reason: collision with root package name */
    public final int f20313m;

    /* renamed from: n, reason: collision with root package name */
    public final String f20314n;

    /* renamed from: o, reason: collision with root package name */
    public final long f20315o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f20316p;

    /* renamed from: q, reason: collision with root package name */
    public final String f20317q;

    /* renamed from: r, reason: collision with root package name */
    public final String f20318r;

    /* renamed from: s, reason: collision with root package name */
    public final Double f20319s;

    q9(int i10, String str, long j10, Long l10, Float f5, String str2, String str3, Double d10) {
        this.f20313m = i10;
        this.f20314n = str;
        this.f20315o = j10;
        this.f20316p = l10;
        if (i10 == 1) {
            this.f20319s = f5 != null ? Double.valueOf(f5.doubleValue()) : null;
        } else {
            this.f20319s = d10;
        }
        this.f20317q = str2;
        this.f20318r = str3;
    }

    q9(s9 s9Var) {
        this(s9Var.f20403c, s9Var.f20404d, s9Var.f20405e, s9Var.f20402b);
    }

    q9(String str, long j10, Object obj, String str2) {
        e4.p.f(str);
        this.f20313m = 2;
        this.f20314n = str;
        this.f20315o = j10;
        this.f20318r = str2;
        if (obj == null) {
            this.f20316p = null;
            this.f20319s = null;
            this.f20317q = null;
            return;
        }
        if (obj instanceof Long) {
            this.f20316p = (Long) obj;
            this.f20319s = null;
            this.f20317q = null;
        } else if (obj instanceof String) {
            this.f20316p = null;
            this.f20319s = null;
            this.f20317q = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f20316p = null;
            this.f20319s = (Double) obj;
            this.f20317q = null;
        }
    }

    public final Object f() {
        Long l10 = this.f20316p;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f20319s;
        if (d10 != null) {
            return d10;
        }
        String str = this.f20317q;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        r9.a(this, parcel, i10);
    }
}
