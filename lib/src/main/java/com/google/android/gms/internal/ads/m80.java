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
public final class m80 implements Parcelable.Creator {
    public static final l80 a(Parcel parcel) {
        int iY = f4.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        float fP = 0.0f;
        float fP2 = 0.0f;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        boolean zM2 = false;
        int iT5 = 0;
        int iT6 = 0;
        boolean zM3 = false;
        boolean zM4 = false;
        int iT7 = 0;
        boolean zM5 = false;
        boolean zM6 = false;
        int iT8 = 0;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        Bundle bundleA = null;
        k3.c4 c4Var = null;
        k3.h4 h4Var = null;
        String strF = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        ff0 ff0Var = null;
        Bundle bundleA2 = null;
        ArrayList arrayListH = null;
        Bundle bundleA3 = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListH2 = null;
        String strF7 = null;
        eu euVar = null;
        ArrayList arrayListH3 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        Bundle bundleA4 = null;
        String strF11 = null;
        k3.q2 q2Var = null;
        Bundle bundleA5 = null;
        String strF12 = null;
        String strF13 = null;
        String strF14 = null;
        ArrayList arrayListD = null;
        String strF15 = null;
        ArrayList arrayListH4 = null;
        ArrayList arrayListH5 = null;
        String strF16 = null;
        e00 e00Var = null;
        String strF17 = null;
        Bundle bundleA6 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    bundleA = f4.b.a(parcel, iR);
                    break;
                case 3:
                    c4Var = (k3.c4) f4.b.e(parcel, iR, k3.c4.CREATOR);
                    break;
                case 4:
                    h4Var = (k3.h4) f4.b.e(parcel, iR, k3.h4.CREATOR);
                    break;
                case 5:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) f4.b.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    packageInfo = (PackageInfo) f4.b.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 8:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 9:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    strF4 = f4.b.f(parcel, iR);
                    break;
                case 11:
                    ff0Var = (ff0) f4.b.e(parcel, iR, ff0.CREATOR);
                    break;
                case 12:
                    bundleA2 = f4.b.a(parcel, iR);
                    break;
                case 13:
                    iT2 = f4.b.t(parcel, iR);
                    break;
                case 14:
                    arrayListH = f4.b.h(parcel, iR);
                    break;
                case 15:
                    bundleA3 = f4.b.a(parcel, iR);
                    break;
                case 16:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    f4.b.x(parcel, iR);
                    break;
                case 18:
                    iT3 = f4.b.t(parcel, iR);
                    break;
                case 19:
                    iT4 = f4.b.t(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                    fP = f4.b.p(parcel, iR);
                    break;
                case 21:
                    strF5 = f4.b.f(parcel, iR);
                    break;
                case 25:
                    jU = f4.b.u(parcel, iR);
                    break;
                case 26:
                    strF6 = f4.b.f(parcel, iR);
                    break;
                case 27:
                    arrayListH2 = f4.b.h(parcel, iR);
                    break;
                case 28:
                    strF7 = f4.b.f(parcel, iR);
                    break;
                case 29:
                    euVar = (eu) f4.b.e(parcel, iR, eu.CREATOR);
                    break;
                case 30:
                    arrayListH3 = f4.b.h(parcel, iR);
                    break;
                case 31:
                    jU2 = f4.b.u(parcel, iR);
                    break;
                case 33:
                    strF8 = f4.b.f(parcel, iR);
                    break;
                case 34:
                    fP2 = f4.b.p(parcel, iR);
                    break;
                case 35:
                    iT5 = f4.b.t(parcel, iR);
                    break;
                case 36:
                    iT6 = f4.b.t(parcel, iR);
                    break;
                case 37:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 39:
                    strF9 = f4.b.f(parcel, iR);
                    break;
                case 40:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 41:
                    strF10 = f4.b.f(parcel, iR);
                    break;
                case 42:
                    zM4 = f4.b.m(parcel, iR);
                    break;
                case 43:
                    iT7 = f4.b.t(parcel, iR);
                    break;
                case 44:
                    bundleA4 = f4.b.a(parcel, iR);
                    break;
                case 45:
                    strF11 = f4.b.f(parcel, iR);
                    break;
                case 46:
                    q2Var = (k3.q2) f4.b.e(parcel, iR, k3.q2.CREATOR);
                    break;
                case 47:
                    zM5 = f4.b.m(parcel, iR);
                    break;
                case 48:
                    bundleA5 = f4.b.a(parcel, iR);
                    break;
                case 49:
                    strF12 = f4.b.f(parcel, iR);
                    break;
                case 50:
                    strF13 = f4.b.f(parcel, iR);
                    break;
                case 51:
                    strF14 = f4.b.f(parcel, iR);
                    break;
                case 52:
                    zM6 = f4.b.m(parcel, iR);
                    break;
                case 53:
                    arrayListD = f4.b.d(parcel, iR);
                    break;
                case 54:
                    strF15 = f4.b.f(parcel, iR);
                    break;
                case 55:
                    arrayListH4 = f4.b.h(parcel, iR);
                    break;
                case 56:
                    iT8 = f4.b.t(parcel, iR);
                    break;
                case 57:
                    zM7 = f4.b.m(parcel, iR);
                    break;
                case 58:
                    zM8 = f4.b.m(parcel, iR);
                    break;
                case 59:
                    zM9 = f4.b.m(parcel, iR);
                    break;
                case 60:
                    arrayListH5 = f4.b.h(parcel, iR);
                    break;
                case 61:
                    strF16 = f4.b.f(parcel, iR);
                    break;
                case 63:
                    e00Var = (e00) f4.b.e(parcel, iR, e00.CREATOR);
                    break;
                case 64:
                    strF17 = f4.b.f(parcel, iR);
                    break;
                case 65:
                    bundleA6 = f4.b.a(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new l80(iT, bundleA, c4Var, h4Var, strF, applicationInfo, packageInfo, strF2, strF3, strF4, ff0Var, bundleA2, iT2, arrayListH, bundleA3, zM, iT3, iT4, fP, strF5, jU, strF6, arrayListH2, strF7, euVar, arrayListH3, jU2, strF8, fP2, zM2, iT5, iT6, zM3, strF9, strF10, zM4, iT7, bundleA4, strF11, q2Var, zM5, bundleA5, strF12, strF13, strF14, zM6, arrayListD, strF15, arrayListH4, iT8, zM7, zM8, zM9, arrayListH5, strF16, e00Var, strF17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l80[i10];
    }
}
