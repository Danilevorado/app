package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class t80 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        String strF = null;
        Bundle bundleA = null;
        byte[] bArrB = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 2:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 3:
                    bundleA = f4.b.a(parcel, iR);
                    break;
                case 4:
                    bArrB = f4.b.b(parcel, iR);
                    break;
                case 5:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 6:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new s80(strF, iT, bundleA, bArrB, zM, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s80[i10];
    }
}
