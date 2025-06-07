package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = true;
        boolean zM2 = true;
        String strF = "";
        String strF2 = strF;
        boolean zM3 = false;
        int iT = 0;
        boolean zM4 = false;
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        long jU5 = 0;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        Boolean boolN = null;
        ArrayList arrayListH = null;
        String strF10 = null;
        String strF11 = null;
        long jU6 = -2147483648L;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 2:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case 3:
                    strF4 = f4.b.f(parcel, iR);
                    break;
                case 4:
                    strF5 = f4.b.f(parcel, iR);
                    break;
                case 5:
                    strF6 = f4.b.f(parcel, iR);
                    break;
                case 6:
                    jU = f4.b.u(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    jU2 = f4.b.u(parcel, iR);
                    break;
                case 8:
                    strF7 = f4.b.f(parcel, iR);
                    break;
                case 9:
                    zM = f4.b.m(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 11:
                    jU6 = f4.b.u(parcel, iR);
                    break;
                case 12:
                    strF8 = f4.b.f(parcel, iR);
                    break;
                case 13:
                    jU3 = f4.b.u(parcel, iR);
                    break;
                case 14:
                    jU4 = f4.b.u(parcel, iR);
                    break;
                case 15:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 16:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 17:
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                default:
                    f4.b.x(parcel, iR);
                    break;
                case 18:
                    zM4 = f4.b.m(parcel, iR);
                    break;
                case 19:
                    strF9 = f4.b.f(parcel, iR);
                    break;
                case 21:
                    boolN = f4.b.n(parcel, iR);
                    break;
                case 22:
                    jU5 = f4.b.u(parcel, iR);
                    break;
                case 23:
                    arrayListH = f4.b.h(parcel, iR);
                    break;
                case 24:
                    strF10 = f4.b.f(parcel, iR);
                    break;
                case 25:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 26:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 27:
                    strF11 = f4.b.f(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new z9(strF3, strF4, strF5, strF6, jU, jU2, strF7, zM, zM3, jU6, strF8, jU3, jU4, iT, zM2, zM4, strF9, boolN, jU5, arrayListH, strF10, strF, strF2, strF11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z9[i10];
    }
}
