package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l90 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        Bundle bundleA = null;
        ff0 ff0Var = null;
        ApplicationInfo applicationInfo = null;
        String strF = null;
        ArrayList arrayListH = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        zp2 zp2Var = null;
        String strF4 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    bundleA = f4.b.a(parcel, iR);
                    break;
                case 2:
                    ff0Var = (ff0) f4.b.e(parcel, iR, ff0.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) f4.b.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 5:
                    arrayListH = f4.b.h(parcel, iR);
                    break;
                case 6:
                    packageInfo = (PackageInfo) f4.b.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 8:
                default:
                    f4.b.x(parcel, iR);
                    break;
                case 9:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    zp2Var = (zp2) f4.b.e(parcel, iR, zp2.CREATOR);
                    break;
                case 11:
                    strF4 = f4.b.f(parcel, iR);
                    break;
                case 12:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 13:
                    zM2 = f4.b.m(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new k90(bundleA, ff0Var, applicationInfo, strF, arrayListH, packageInfo, strF2, strF3, zp2Var, strF4, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k90[i10];
    }
}
