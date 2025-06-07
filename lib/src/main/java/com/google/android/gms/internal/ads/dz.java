package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class dz extends ej implements ez {
    public dz() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            fj.c(parcel);
            J(string);
        } else {
            if (i10 != 2) {
                return false;
            }
            c();
        }
        parcel2.writeNoException();
        return true;
    }
}
