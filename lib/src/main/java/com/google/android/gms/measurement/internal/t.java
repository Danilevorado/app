package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t extends f4.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: m, reason: collision with root package name */
    private final Bundle f20406m;

    t(Bundle bundle) {
        this.f20406m = bundle;
    }

    final String A(String str) {
        return this.f20406m.getString(str);
    }

    public final int f() {
        return this.f20406m.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String toString() {
        return this.f20406m.toString();
    }

    public final Bundle v() {
        return new Bundle(this.f20406m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.e(parcel, 2, v(), false);
        f4.c.b(parcel, iA);
    }

    final Double x(String str) {
        return Double.valueOf(this.f20406m.getDouble("value"));
    }

    final Long y(String str) {
        return Long.valueOf(this.f20406m.getLong("value"));
    }

    final Object z(String str) {
        return this.f20406m.get(str);
    }
}
