package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class fs extends dj implements hs {
    fs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final void Y1(es esVar) {
        Parcel parcelC = C();
        fj.f(parcelC, esVar);
        L0(1, parcelC);
    }
}
