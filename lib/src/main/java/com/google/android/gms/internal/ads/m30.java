package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m30 extends dj implements o30 {
    m30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final boolean W(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        Parcel parcelW0 = w0(4, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final l50 Y(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        Parcel parcelW0 = w0(3, parcelC);
        l50 l50VarL5 = k50.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return l50VarL5;
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final boolean s(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        Parcel parcelW0 = w0(2, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final r30 x(String str) {
        r30 p30Var;
        Parcel parcelC = C();
        parcelC.writeString(str);
        Parcel parcelW0 = w0(1, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            p30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            p30Var = iInterfaceQueryLocalInterface instanceof r30 ? (r30) iInterfaceQueryLocalInterface : new p30(strongBinder);
        }
        parcelW0.recycle();
        return p30Var;
    }
}
