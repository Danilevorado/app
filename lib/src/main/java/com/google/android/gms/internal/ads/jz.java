package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class jz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        int iT = 0;
        boolean zM2 = false;
        String strF = null;
        byte[] bArrB = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 2:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 3:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 4:
                    bArrB = f4.b.b(parcel, iR);
                    break;
                case 5:
                    strArrG = f4.b.g(parcel, iR);
                    break;
                case 6:
                    strArrG2 = f4.b.g(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 8:
                    jU = f4.b.u(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new iz(zM, strF, iT, bArrB, strArrG, strArrG2, zM2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new iz[i10];
    }
}
