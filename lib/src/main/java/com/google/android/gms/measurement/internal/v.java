package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v extends f4.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: m, reason: collision with root package name */
    public final String f20460m;

    /* renamed from: n, reason: collision with root package name */
    public final t f20461n;

    /* renamed from: o, reason: collision with root package name */
    public final String f20462o;

    /* renamed from: p, reason: collision with root package name */
    public final long f20463p;

    v(v vVar, long j10) {
        e4.p.l(vVar);
        this.f20460m = vVar.f20460m;
        this.f20461n = vVar.f20461n;
        this.f20462o = vVar.f20462o;
        this.f20463p = j10;
    }

    public v(String str, t tVar, String str2, long j10) {
        this.f20460m = str;
        this.f20461n = tVar;
        this.f20462o = str2;
        this.f20463p = j10;
    }

    public final String toString() {
        return "origin=" + this.f20462o + ",name=" + this.f20460m + ",params=" + String.valueOf(this.f20461n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w.a(this, parcel, i10);
    }
}
