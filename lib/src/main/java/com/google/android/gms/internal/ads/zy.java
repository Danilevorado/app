package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zy extends dj implements cz {
    zy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void x(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        L0(1, parcelC);
    }
}
