package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a00 extends ej implements b00 {
    public a00() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static b00 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof b00 ? (b00) iInterfaceQueryLocalInterface : new zz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(tz.CREATOR);
        fj.c(parcel);
        e3(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
