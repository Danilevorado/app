package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class md0 extends dj implements od0 {
    md0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void X2(String str, String str2, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, bundle);
        L0(3, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void x(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        L0(2, parcelC);
    }
}
