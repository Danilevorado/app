package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class fw extends dj implements hw {
    fw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final boolean G0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(2, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }
}
