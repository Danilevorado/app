package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class gu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        int iT2 = 0;
        boolean zM2 = false;
        int iT3 = 0;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        boolean zM4 = false;
        k3.v3 v3Var = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 3:
                    iT2 = f4.b.t(parcel, iR);
                    break;
                case 4:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 5:
                    iT3 = f4.b.t(parcel, iR);
                    break;
                case 6:
                    v3Var = (k3.v3) f4.b.e(parcel, iR, k3.v3.CREATOR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 8:
                    iT4 = f4.b.t(parcel, iR);
                    break;
                case 9:
                    iT5 = f4.b.t(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    zM4 = f4.b.m(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new eu(iT, zM, iT2, zM2, iT3, v3Var, zM3, iT4, iT5, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new eu[i10];
    }
}
