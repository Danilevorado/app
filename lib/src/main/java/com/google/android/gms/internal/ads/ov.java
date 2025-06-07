package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ov extends dj implements qv {
    ov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.qv
    public final void x5(gv gvVar) {
        Parcel parcelC = C();
        fj.f(parcelC, gvVar);
        L0(1, parcelC);
    }
}
