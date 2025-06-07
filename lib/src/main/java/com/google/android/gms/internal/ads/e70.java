package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class e70 extends dj implements g70 {
    e70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.g70
    public final IBinder zze(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(1, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        parcelW0.recycle();
        return strongBinder;
    }
}
