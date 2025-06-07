package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class za0 extends dj implements bb0 {
    za0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void H(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(2, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() {
        L0(1, C());
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void y(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(3, parcelC);
    }
}
