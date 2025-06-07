package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class lv extends dj implements nv {
    lv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.nv
    public final void e1(ev evVar) {
        Parcel parcelC = C();
        fj.f(parcelC, evVar);
        L0(1, parcelC);
    }
}
