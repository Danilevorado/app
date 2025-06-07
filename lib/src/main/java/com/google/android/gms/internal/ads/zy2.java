package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zy2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        byte[] bArrB = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                bArrB = f4.b.b(parcel, iR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                iT2 = f4.b.t(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new yy2(iT, bArrB, iT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new yy2[i10];
    }
}
