package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class y80 extends ej implements z80 {
    public y80() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        c90 a90Var = null;
        if (i10 == 1) {
            o80 o80Var = (o80) fj.a(parcel, o80.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                a90Var = iInterfaceQueryLocalInterface instanceof c90 ? (c90) iInterfaceQueryLocalInterface : new a90(strongBinder);
            }
            fj.c(parcel);
            K2(o80Var, a90Var);
        } else if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof c90) {
                }
            }
            fj.c(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            s80 s80Var = (s80) fj.a(parcel, s80.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                a90Var = iInterfaceQueryLocalInterface3 instanceof c90 ? (c90) iInterfaceQueryLocalInterface3 : new a90(strongBinder3);
            }
            fj.c(parcel);
            z4(s80Var, a90Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
