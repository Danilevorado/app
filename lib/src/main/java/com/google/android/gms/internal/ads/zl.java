package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        long jU = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) f4.b.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            } else if (iL == 3) {
                zM = f4.b.m(parcel, iR);
            } else if (iL == 4) {
                zM2 = f4.b.m(parcel, iR);
            } else if (iL == 5) {
                jU = f4.b.u(parcel, iR);
            } else if (iL != 6) {
                f4.b.x(parcel, iR);
            } else {
                zM3 = f4.b.m(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new yl(parcelFileDescriptor, zM, zM2, jU, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new yl[i10];
    }
}
