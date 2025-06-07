package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class b90 extends ej implements c90 {
    public b90() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) fj.a(parcel, ParcelFileDescriptor.CREATOR);
            fj.c(parcel);
            l0(parcelFileDescriptor);
        } else {
            if (i10 != 2) {
                return false;
            }
            m3.a0 a0Var = (m3.a0) fj.a(parcel, m3.a0.CREATOR);
            fj.c(parcel);
            u0(a0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
