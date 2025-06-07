package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class d90 extends dj implements f90 {
    d90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void l0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelC = C();
        fj.d(parcelC, parcelFileDescriptor);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void u0(m3.a0 a0Var) {
        Parcel parcelC = C();
        fj.d(parcelC, a0Var);
        L0(2, parcelC);
    }
}
