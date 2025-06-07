package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class q80 extends f4.a {
    public static final Parcelable.Creator<q80> CREATOR = new r80();

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14186m;

    /* renamed from: n, reason: collision with root package name */
    public final List f14187n;

    public q80(boolean z10, List list) {
        this.f14186m = z10;
        this.f14187n = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.c(parcel, 2, this.f14186m);
        f4.c.s(parcel, 3, this.f14187n, false);
        f4.c.b(parcel, iA);
    }
}
