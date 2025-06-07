package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class x30 extends ej implements y30 {
    public x30() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static y30 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof y30 ? (y30) iInterfaceQueryLocalInterface : new w30(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l4.a aVarC = c();
            parcel2.writeNoException();
            fj.f(parcel2, aVarC);
        } else {
            if (i10 != 2) {
                return false;
            }
            boolean zE = e();
            parcel2.writeNoException();
            int i12 = fj.f8294b;
            parcel2.writeInt(zE ? 1 : 0);
        }
        return true;
    }
}
