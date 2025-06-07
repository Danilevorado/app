package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g1 extends o0 implements i1 {
    g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void h0(Bundle bundle) {
        Parcel parcelC = C();
        q0.e(parcelC, bundle);
        L0(1, parcelC);
    }
}
