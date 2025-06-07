package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class wz extends dj implements yz {
    wz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.yz
    public final void s(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        L0(3, parcelC);
    }
}
