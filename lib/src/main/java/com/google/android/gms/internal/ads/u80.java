package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u80 extends dj implements w80 {
    u80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void D3(String str, f90 f90Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        fj.f(parcelC, f90Var);
        L0(7, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void Q2(k90 k90Var, f90 f90Var) {
        Parcel parcelC = C();
        fj.d(parcelC, k90Var);
        fj.f(parcelC, f90Var);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void R1(k90 k90Var, f90 f90Var) {
        Parcel parcelC = C();
        fj.d(parcelC, k90Var);
        fj.f(parcelC, f90Var);
        L0(4, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void e4(k90 k90Var, f90 f90Var) {
        Parcel parcelC = C();
        fj.d(parcelC, k90Var);
        fj.f(parcelC, f90Var);
        L0(6, parcelC);
    }
}
