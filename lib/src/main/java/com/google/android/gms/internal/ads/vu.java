package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class vu extends dj implements xu {
    vu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final IBinder d2(l4.a aVar, l4.a aVar2, l4.a aVar3, int i10) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, aVar2);
        fj.f(parcelC, aVar3);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(1, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        parcelW0.recycle();
        return strongBinder;
    }
}
