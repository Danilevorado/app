package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r80 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        ArrayList arrayListH = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 2) {
                zM = f4.b.m(parcel, iR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                arrayListH = f4.b.h(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new q80(zM, arrayListH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q80[i10];
    }
}
