package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class kl extends ej implements ll {
    public kl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static ll L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof ll ? (ll) iInterfaceQueryLocalInterface : new jl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        il glVar;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                glVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                glVar = iInterfaceQueryLocalInterface instanceof il ? (il) iInterfaceQueryLocalInterface : new gl(strongBinder);
            }
            fj.c(parcel);
            J3(glVar);
        } else if (i10 == 2) {
            parcel.readInt();
            fj.c(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            k3.w2 w2Var = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
            fj.c(parcel);
            E1(w2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
