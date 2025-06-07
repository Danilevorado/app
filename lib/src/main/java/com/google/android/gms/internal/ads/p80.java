package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p80 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        ApplicationInfo applicationInfo = null;
        String strF = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList arrayListH = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    applicationInfo = (ApplicationInfo) f4.b.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 3:
                    packageInfo = (PackageInfo) f4.b.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 4:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 5:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 6:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    arrayListH = f4.b.h(parcel, iR);
                    break;
                case 8:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 9:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new o80(applicationInfo, strF, packageInfo, strF2, iT, strF3, arrayListH, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o80[i10];
    }
}
