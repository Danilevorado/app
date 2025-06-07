package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gf0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 2) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 3) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 4) {
                iT2 = f4.b.t(parcel, iR);
            } else if (iL == 5) {
                zM = f4.b.m(parcel, iR);
            } else if (iL != 6) {
                f4.b.x(parcel, iR);
            } else {
                zM2 = f4.b.m(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new ff0(strF, iT, iT2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ff0[i10];
    }
}
