package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        String strF = null;
        String strF2 = null;
        q9 q9Var = null;
        String strF3 = null;
        v vVar = null;
        v vVar2 = null;
        v vVar3 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 2:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 3:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 4:
                    q9Var = (q9) f4.b.e(parcel, iR, q9.CREATOR);
                    break;
                case 5:
                    jU = f4.b.u(parcel, iR);
                    break;
                case 6:
                    zM = f4.b.m(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case 8:
                    vVar = (v) f4.b.e(parcel, iR, v.CREATOR);
                    break;
                case 9:
                    jU2 = f4.b.u(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    vVar2 = (v) f4.b.e(parcel, iR, v.CREATOR);
                    break;
                case 11:
                    jU3 = f4.b.u(parcel, iR);
                    break;
                case 12:
                    vVar3 = (v) f4.b.e(parcel, iR, v.CREATOR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new d(strF, strF2, q9Var, jU, zM, strF3, vVar, jU2, vVar2, jU3, vVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
