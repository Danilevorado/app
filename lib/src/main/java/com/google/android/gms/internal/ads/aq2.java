package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class aq2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    iT2 = f4.b.t(parcel, iR);
                    break;
                case 3:
                    iT3 = f4.b.t(parcel, iR);
                    break;
                case 4:
                    iT4 = f4.b.t(parcel, iR);
                    break;
                case 5:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 6:
                    iT5 = f4.b.t(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    iT6 = f4.b.t(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new zp2(iT, iT2, iT3, iT4, strF, iT5, iT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zp2[i10];
    }
}
