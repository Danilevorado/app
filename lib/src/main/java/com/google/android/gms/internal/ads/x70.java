package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x70 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iBinderS = f4.b.s(parcel, iR);
            } else if (iL != 2) {
                f4.b.x(parcel, iR);
            } else {
                iBinderS2 = f4.b.s(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new w70(iBinderS, iBinderS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new w70[i10];
    }
}
