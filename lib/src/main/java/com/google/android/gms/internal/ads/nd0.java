package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class nd0 extends ej implements od0 {
    public nd0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            fj.c(parcel);
        } else if (i10 == 2) {
            String string = parcel.readString();
            fj.c(parcel);
            x(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) fj.a(parcel, Bundle.CREATOR);
            fj.c(parcel);
            X2(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
