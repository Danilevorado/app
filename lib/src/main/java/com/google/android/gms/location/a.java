package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;
import f4.b;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        int iT = 102;
        long jU = 3600000;
        long jU2 = 600000;
        long jU3 = Long.MAX_VALUE;
        int iT2 = Integer.MAX_VALUE;
        float fP = 0.0f;
        long jU4 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b.r(parcel);
            switch (b.l(iR)) {
                case 1:
                    iT = b.t(parcel, iR);
                    break;
                case 2:
                    jU = b.u(parcel, iR);
                    break;
                case 3:
                    jU2 = b.u(parcel, iR);
                    break;
                case 4:
                    zM = b.m(parcel, iR);
                    break;
                case 5:
                    jU3 = b.u(parcel, iR);
                    break;
                case 6:
                    iT2 = b.t(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    fP = b.p(parcel, iR);
                    break;
                case 8:
                    jU4 = b.u(parcel, iR);
                    break;
                case 9:
                    zM2 = b.m(parcel, iR);
                    break;
                default:
                    b.x(parcel, iR);
                    break;
            }
        }
        b.k(parcel, iY);
        return new LocationRequest(iT, jU, jU2, zM, jU3, iT2, fP, jU4, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
