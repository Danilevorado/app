package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class sd0 extends dj implements ud0 {
    sd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.ud0
    public final rd0 C0(l4.a aVar, o30 o30Var, int i10) {
        rd0 pd0Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(2, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            pd0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            pd0Var = iInterfaceQueryLocalInterface instanceof rd0 ? (rd0) iInterfaceQueryLocalInterface : new pd0(strongBinder);
        }
        parcelW0.recycle();
        return pd0Var;
    }
}
