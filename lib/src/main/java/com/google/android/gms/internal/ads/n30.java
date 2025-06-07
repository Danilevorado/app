package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class n30 extends ej implements o30 {
    public n30() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static o30 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof o30 ? (o30) iInterfaceQueryLocalInterface : new m30(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceX;
        int iS;
        if (i10 != 1) {
            if (i10 == 2) {
                String string = parcel.readString();
                fj.c(parcel);
                iS = s(string);
            } else if (i10 == 3) {
                String string2 = parcel.readString();
                fj.c(parcel);
                iInterfaceX = Y(string2);
            } else {
                if (i10 != 4) {
                    return false;
                }
                String string3 = parcel.readString();
                fj.c(parcel);
                iS = W(string3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(iS);
            return true;
        }
        String string4 = parcel.readString();
        fj.c(parcel);
        iInterfaceX = x(string4);
        parcel2.writeNoException();
        fj.f(parcel2, iInterfaceX);
        return true;
    }
}
