package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class pa0 extends dj implements ra0 {
    pa0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ra0
    public final int c() {
        Parcel parcelW0 = w0(2, C());
        int i10 = parcelW0.readInt();
        parcelW0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.ra0
    public final String e() {
        Parcel parcelW0 = w0(1, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }
}
