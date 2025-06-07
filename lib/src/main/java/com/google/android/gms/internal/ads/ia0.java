package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ia0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        k3.c4 c4Var = null;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 2) {
                c4Var = (k3.c4) f4.b.e(parcel, iR, k3.c4.CREATOR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                strF = f4.b.f(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new ha0(c4Var, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ha0[i10];
    }
}
