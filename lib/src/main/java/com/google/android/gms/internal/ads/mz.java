package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class mz extends dj {
    mz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void w3(gz gzVar, lz lzVar) {
        Parcel parcelC = C();
        fj.d(parcelC, gzVar);
        fj.f(parcelC, lzVar);
        p1(2, parcelC);
    }
}
