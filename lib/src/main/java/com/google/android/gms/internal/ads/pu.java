package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class pu extends ej implements qu {
    public pu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static qu L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof qu ? (qu) iInterfaceQueryLocalInterface : new ou(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int iF;
        if (i10 == 1) {
            l4.a aVarE = e();
            parcel2.writeNoException();
            fj.f(parcel2, aVarE);
        } else if (i10 == 2) {
            Uri uriC = c();
            parcel2.writeNoException();
            fj.e(parcel2, uriC);
        } else if (i10 != 3) {
            if (i10 == 4) {
                iF = f();
            } else {
                if (i10 != 5) {
                    return false;
                }
                iF = d();
            }
            parcel2.writeNoException();
            parcel2.writeInt(iF);
        } else {
            double dB = b();
            parcel2.writeNoException();
            parcel2.writeDouble(dB);
        }
        return true;
    }
}
