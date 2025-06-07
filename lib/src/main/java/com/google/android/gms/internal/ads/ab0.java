package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ab0 extends ej implements bb0 {
    public ab0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            h();
        } else if (i10 == 2) {
            int i12 = parcel.readInt();
            fj.c(parcel);
            H(i12);
        } else {
            if (i10 != 3) {
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
