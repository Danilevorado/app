package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class n50 extends ej implements o50 {
    public n50() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            fj.c(parcel);
            s(string);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            fj.c(parcel);
            J(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            k3.w2 w2Var = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
            fj.c(parcel);
            a3(w2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
