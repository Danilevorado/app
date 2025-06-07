package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class jl extends dj implements ll {
    jl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void E1(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(3, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void J3(il ilVar) {
        Parcel parcelC = C();
        fj.f(parcelC, ilVar);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void K(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(2, parcelC);
    }
}
