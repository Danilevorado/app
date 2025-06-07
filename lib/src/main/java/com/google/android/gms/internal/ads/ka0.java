package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ka0 extends dj implements ma0 {
    ka0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void A0(l4.a aVar, int i10) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeInt(i10);
        L0(9, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void F0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(6, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void F1(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void R(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(4, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void R3(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(11, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void d5(l4.a aVar, na0 na0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, na0Var);
        L0(7, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void i0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(3, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void k4(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void zze(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(8, parcelC);
    }
}
