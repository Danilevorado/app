package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r0 extends o0 implements t0 {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final Bundle h0(Bundle bundle) {
        Parcel parcelC = C();
        q0.e(parcelC, bundle);
        Parcel parcelW0 = w0(1, parcelC);
        Bundle bundle2 = (Bundle) q0.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle2;
    }
}
