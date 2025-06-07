package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vd0 extends f4.a {
    public static final Parcelable.Creator<vd0> CREATOR = new wd0();

    /* renamed from: m, reason: collision with root package name */
    public final String f16653m;

    /* renamed from: n, reason: collision with root package name */
    public final String f16654n;

    /* renamed from: o, reason: collision with root package name */
    public final k3.h4 f16655o;

    /* renamed from: p, reason: collision with root package name */
    public final k3.c4 f16656p;

    public vd0(String str, String str2, k3.h4 h4Var, k3.c4 c4Var) {
        this.f16653m = str;
        this.f16654n = str2;
        this.f16655o = h4Var;
        this.f16656p = c4Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f16653m, false);
        f4.c.q(parcel, 2, this.f16654n, false);
        f4.c.p(parcel, 3, this.f16655o, i10, false);
        f4.c.p(parcel, 4, this.f16656p, i10, false);
        f4.c.b(parcel, iA);
    }
}
