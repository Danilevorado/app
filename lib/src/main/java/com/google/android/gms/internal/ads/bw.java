package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bw extends dj implements dw {
    bw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.dw
    public final void M1(mw mwVar) {
        Parcel parcelC = C();
        fj.f(parcelC, mwVar);
        L0(1, parcelC);
    }
}
