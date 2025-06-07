package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hm0 extends dj implements jm0 {
    hm0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.jm0
    public final void L3(l4.a aVar, gm0 gm0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, gm0Var);
        L0(2, parcelC);
    }
}
