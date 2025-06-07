package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class x40 extends dj implements z40 {
    x40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final void y(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(3, parcelC);
    }
}
