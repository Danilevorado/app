package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ff0 extends f4.a {
    public static final Parcelable.Creator<ff0> CREATOR = new gf0();

    /* renamed from: m, reason: collision with root package name */
    public String f8252m;

    /* renamed from: n, reason: collision with root package name */
    public int f8253n;

    /* renamed from: o, reason: collision with root package name */
    public int f8254o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8255p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8256q;

    public ff0(int i10, int i11, boolean z10, boolean z11) {
        this(231004000, i11, true, false, z11);
    }

    public ff0(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        this("afma-sdk-a-v" + i10 + "." + i11 + "." + (z10 ? "0" : "1"), i10, i11, z10, z12);
    }

    ff0(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f8252m = str;
        this.f8253n = i10;
        this.f8254o = i11;
        this.f8255p = z10;
        this.f8256q = z11;
    }

    public static ff0 f() {
        return new ff0(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f8252m, false);
        f4.c.k(parcel, 3, this.f8253n);
        f4.c.k(parcel, 4, this.f8254o);
        f4.c.c(parcel, 5, this.f8255p);
        f4.c.c(parcel, 6, this.f8256q);
        f4.c.b(parcel, iA);
    }
}
