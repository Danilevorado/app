package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;
import l4.a;

/* loaded from: classes.dex */
public final class w70 extends f4.a {
    public static final Parcelable.Creator<w70> CREATOR = new x70();

    /* renamed from: m, reason: collision with root package name */
    public final View f17010m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f17011n;

    public w70(IBinder iBinder, IBinder iBinder2) {
        this.f17010m = (View) l4.b.L0(a.AbstractBinderC0158a.w0(iBinder));
        this.f17011n = (Map) l4.b.L0(a.AbstractBinderC0158a.w0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.j(parcel, 1, l4.b.p1(this.f17010m).asBinder(), false);
        f4.c.j(parcel, 2, l4.b.p1(this.f17011n).asBinder(), false);
        f4.c.b(parcel, iA);
    }
}
