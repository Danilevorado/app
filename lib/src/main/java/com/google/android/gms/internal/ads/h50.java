package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class h50 extends ej implements i50 {
    public h50() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            h();
        } else if (i10 == 3) {
            String string = parcel.readString();
            fj.c(parcel);
            s(string);
        } else {
            if (i10 != 4) {
                return false;
            }
            k3.w2 w2Var = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
            fj.c(parcel);
            y(w2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
