package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class v80 extends ej implements w80 {
    public v80() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        f90 d90Var = null;
        if (i10 != 1) {
            if (i10 == 2) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                fj.c(parcel);
            } else if (i10 == 4) {
                k90 k90Var = (k90) fj.a(parcel, k90.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    d90Var = iInterfaceQueryLocalInterface instanceof f90 ? (f90) iInterfaceQueryLocalInterface : new d90(strongBinder2);
                }
                fj.c(parcel);
                R1(k90Var, d90Var);
            } else if (i10 == 5) {
                k90 k90Var2 = (k90) fj.a(parcel, k90.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    d90Var = iInterfaceQueryLocalInterface2 instanceof f90 ? (f90) iInterfaceQueryLocalInterface2 : new d90(strongBinder3);
                }
                fj.c(parcel);
                Q2(k90Var2, d90Var);
            } else if (i10 == 6) {
                k90 k90Var3 = (k90) fj.a(parcel, k90.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    d90Var = iInterfaceQueryLocalInterface3 instanceof f90 ? (f90) iInterfaceQueryLocalInterface3 : new d90(strongBinder4);
                }
                fj.c(parcel);
                e4(k90Var3, d90Var);
            } else {
                if (i10 != 7) {
                    return false;
                }
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    d90Var = iInterfaceQueryLocalInterface4 instanceof f90 ? (f90) iInterfaceQueryLocalInterface4 : new d90(strongBinder5);
                }
                fj.c(parcel);
                D3(string, d90Var);
            }
            parcel2.writeNoException();
        } else {
            fj.c(parcel);
            parcel2.writeNoException();
            fj.e(parcel2, null);
        }
        return true;
    }
}
