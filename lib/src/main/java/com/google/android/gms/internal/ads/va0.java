package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class va0 extends dj implements xa0 {
    va0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void X(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(4, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void c() {
        L0(7, C());
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void e() {
        L0(6, C());
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void h() {
        L0(2, C());
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void j() {
        L0(1, C());
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void j5(ra0 ra0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, ra0Var);
        L0(3, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void o5(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(5, parcelC);
    }
}
