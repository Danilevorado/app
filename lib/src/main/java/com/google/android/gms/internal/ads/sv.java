package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class sv extends ej implements tv {
    public sv() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static tv L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof tv ? (tv) iInterfaceQueryLocalInterface : new rv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        jv hvVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            hvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            hvVar = iInterfaceQueryLocalInterface instanceof jv ? (jv) iInterfaceQueryLocalInterface : new hv(strongBinder);
        }
        String string = parcel.readString();
        fj.c(parcel);
        P0(hvVar, string);
        parcel2.writeNoException();
        return true;
    }
}
