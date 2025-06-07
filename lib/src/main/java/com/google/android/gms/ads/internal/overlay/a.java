package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.ads.ff0;
import f4.b;
import j3.j;
import l3.i;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b.y(parcel);
        boolean zM = false;
        int iT = 0;
        int iT2 = 0;
        i iVar = null;
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        IBinder iBinderS3 = null;
        IBinder iBinderS4 = null;
        String strF = null;
        String strF2 = null;
        IBinder iBinderS5 = null;
        String strF3 = null;
        ff0 ff0Var = null;
        String strF4 = null;
        j jVar = null;
        IBinder iBinderS6 = null;
        String strF5 = null;
        IBinder iBinderS7 = null;
        IBinder iBinderS8 = null;
        IBinder iBinderS9 = null;
        IBinder iBinderS10 = null;
        String strF6 = null;
        String strF7 = null;
        IBinder iBinderS11 = null;
        IBinder iBinderS12 = null;
        while (parcel.dataPosition() < iY) {
            int iR = b.r(parcel);
            switch (b.l(iR)) {
                case 2:
                    iVar = (i) b.e(parcel, iR, i.CREATOR);
                    break;
                case 3:
                    iBinderS = b.s(parcel, iR);
                    break;
                case 4:
                    iBinderS2 = b.s(parcel, iR);
                    break;
                case 5:
                    iBinderS3 = b.s(parcel, iR);
                    break;
                case 6:
                    iBinderS4 = b.s(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF = b.f(parcel, iR);
                    break;
                case 8:
                    zM = b.m(parcel, iR);
                    break;
                case 9:
                    strF2 = b.f(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    iBinderS5 = b.s(parcel, iR);
                    break;
                case 11:
                    iT = b.t(parcel, iR);
                    break;
                case 12:
                    iT2 = b.t(parcel, iR);
                    break;
                case 13:
                    strF3 = b.f(parcel, iR);
                    break;
                case 14:
                    ff0Var = (ff0) b.e(parcel, iR, ff0.CREATOR);
                    break;
                case 15:
                default:
                    b.x(parcel, iR);
                    break;
                case 16:
                    strF4 = b.f(parcel, iR);
                    break;
                case 17:
                    jVar = (j) b.e(parcel, iR, j.CREATOR);
                    break;
                case 18:
                    iBinderS6 = b.s(parcel, iR);
                    break;
                case 19:
                    strF5 = b.f(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                    iBinderS7 = b.s(parcel, iR);
                    break;
                case 21:
                    iBinderS8 = b.s(parcel, iR);
                    break;
                case 22:
                    iBinderS9 = b.s(parcel, iR);
                    break;
                case 23:
                    iBinderS10 = b.s(parcel, iR);
                    break;
                case 24:
                    strF6 = b.f(parcel, iR);
                    break;
                case 25:
                    strF7 = b.f(parcel, iR);
                    break;
                case 26:
                    iBinderS11 = b.s(parcel, iR);
                    break;
                case 27:
                    iBinderS12 = b.s(parcel, iR);
                    break;
            }
        }
        b.k(parcel, iY);
        return new AdOverlayInfoParcel(iVar, iBinderS, iBinderS2, iBinderS3, iBinderS4, strF, zM, strF2, iBinderS5, iT, iT2, strF3, ff0Var, strF4, jVar, iBinderS6, strF5, iBinderS7, iBinderS8, iBinderS9, iBinderS10, strF6, strF7, iBinderS11, iBinderS12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
