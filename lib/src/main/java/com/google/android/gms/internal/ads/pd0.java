package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class pd0 extends dj implements rd0 {
    pd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void b5(l4.a aVar, vd0 vd0Var, od0 od0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, vd0Var);
        fj.f(parcelC, od0Var);
        L0(1, parcelC);
    }
}
