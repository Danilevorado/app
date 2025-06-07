package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class dm extends dj {
    dm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final yl K5(bm bmVar) {
        Parcel parcelC = C();
        fj.d(parcelC, bmVar);
        Parcel parcelW0 = w0(2, parcelC);
        yl ylVar = (yl) fj.a(parcelW0, yl.CREATOR);
        parcelW0.recycle();
        return ylVar;
    }

    public final long w3(bm bmVar) {
        Parcel parcelC = C();
        fj.d(parcelC, bmVar);
        Parcel parcelW0 = w0(3, parcelC);
        long j10 = parcelW0.readLong();
        parcelW0.recycle();
        return j10;
    }

    public final yl x4(bm bmVar) {
        Parcel parcelC = C();
        fj.d(parcelC, bmVar);
        Parcel parcelW0 = w0(1, parcelC);
        yl ylVar = (yl) fj.a(parcelW0, yl.CREATOR);
        parcelW0.recycle();
        return ylVar;
    }
}
