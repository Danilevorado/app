package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class x60 extends dj implements z60 {
    x60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final w60 C0(l4.a aVar, o30 o30Var, int i10) {
        w60 u60Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(1, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            u60Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            u60Var = iInterfaceQueryLocalInterface instanceof w60 ? (w60) iInterfaceQueryLocalInterface : new u60(strongBinder);
        }
        parcelW0.recycle();
        return u60Var;
    }
}
