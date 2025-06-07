package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class xz extends ej implements yz {
    public xz() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static yz L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof yz ? (yz) iInterfaceQueryLocalInterface : new wz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            e();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            fj.c(parcel);
            s(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
