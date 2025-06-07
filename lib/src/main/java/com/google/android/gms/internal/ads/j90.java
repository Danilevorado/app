package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j90 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            if (f4.b.l(iR) != 2) {
                f4.b.x(parcel, iR);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) f4.b.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new h90(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h90[i10];
    }
}
