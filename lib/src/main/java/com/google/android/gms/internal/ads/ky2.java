package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ky2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        byte[] bArrB = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL != 2) {
                f4.b.x(parcel, iR);
            } else {
                bArrB = f4.b.b(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new jy2(iT, bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new jy2[i10];
    }
}
