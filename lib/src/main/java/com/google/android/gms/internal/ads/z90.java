package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class z90 extends ej implements aa0 {
    public z90() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String strD = d();
            parcel2.writeNoException();
            parcel2.writeString(strD);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iB = b();
            parcel2.writeNoException();
            parcel2.writeInt(iB);
        }
        return true;
    }
}
