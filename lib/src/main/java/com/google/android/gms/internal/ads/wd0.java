package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class wd0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        String strF2 = null;
        k3.h4 h4Var = null;
        k3.c4 c4Var = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 2) {
                strF2 = f4.b.f(parcel, iR);
            } else if (iL == 3) {
                h4Var = (k3.h4) f4.b.e(parcel, iR, k3.h4.CREATOR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                c4Var = (k3.c4) f4.b.e(parcel, iR, k3.c4.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new vd0(strF, strF2, h4Var, c4Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new vd0[i10];
    }
}
