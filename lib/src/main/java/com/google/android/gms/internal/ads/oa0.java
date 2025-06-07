package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class oa0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 2) {
                strF = f4.b.f(parcel, iR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                iT = f4.b.t(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new na0(strF, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new na0[i10];
    }
}
