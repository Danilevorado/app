package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class hz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 2) {
                strArrG = f4.b.g(parcel, iR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                strArrG2 = f4.b.g(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new gz(strF, strArrG, strArrG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new gz[i10];
    }
}
