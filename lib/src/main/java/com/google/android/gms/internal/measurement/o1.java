package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    jU = f4.b.u(parcel, iR);
                    break;
                case 2:
                    jU2 = f4.b.u(parcel, iR);
                    break;
                case 3:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 4:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 5:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 6:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    bundleA = f4.b.a(parcel, iR);
                    break;
                case 8:
                    strF4 = f4.b.f(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new n1(jU, jU2, zM, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n1[i10];
    }
}
