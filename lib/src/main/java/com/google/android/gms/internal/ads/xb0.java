package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xb0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        String strF = null;
        String strF2 = null;
        ArrayList arrayListH = null;
        ArrayList arrayListH2 = null;
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
                    zM = f4.b.m(parcel, iR);
                    break;
                case 5:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 6:
                    arrayListH = f4.b.h(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 8:
                    zM4 = f4.b.m(parcel, iR);
                    break;
                case 9:
                    arrayListH2 = f4.b.h(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new wb0(strF, strF2, zM, zM2, arrayListH, zM3, zM4, arrayListH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new wb0[i10];
    }
}
