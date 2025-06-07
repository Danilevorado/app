package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j1 extends o0 implements k1 {
    j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final int f() {
        Parcel parcelW0 = w0(2, C());
        int i10 = parcelW0.readInt();
        parcelW0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final void t1(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        q0.e(parcelC, bundle);
        parcelC.writeLong(j10);
        L0(1, parcelC);
    }
}
