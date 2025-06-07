package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class sa0 extends dj implements ua0 {
    sa0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void E4(k3.c4 c4Var, bb0 bb0Var) {
        Parcel parcelC = C();
        fj.d(parcelC, c4Var);
        fj.f(parcelC, bb0Var);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void J0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final k3.j2 d() {
        Parcel parcelW0 = w0(12, C());
        k3.j2 j2VarL5 = k3.i2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return j2VarL5;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void n2(xa0 xa0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, xa0Var);
        L0(2, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void s3(k3.c4 c4Var, bb0 bb0Var) {
        Parcel parcelC = C();
        fj.d(parcelC, c4Var);
        fj.f(parcelC, bb0Var);
        L0(14, parcelC);
    }
}
