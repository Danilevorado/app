package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class jb0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                strF = f4.b.f(parcel, iR);
            } else if (iL != 2) {
                f4.b.x(parcel, iR);
            } else {
                strF2 = f4.b.f(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new ib0(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ib0[i10];
    }
}
