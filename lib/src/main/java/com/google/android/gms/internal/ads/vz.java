package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 2) {
                zM = f4.b.m(parcel, iR);
            } else if (iL == 3) {
                iT = f4.b.t(parcel, iR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                strF2 = f4.b.f(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new tz(strF, zM, iT, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new tz[i10];
    }
}
