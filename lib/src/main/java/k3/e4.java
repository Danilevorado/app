package k3;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        Bundle bundleA = null;
        ArrayList arrayListH = null;
        String strF = null;
        s3 s3Var = null;
        Location location = null;
        String strF2 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        ArrayList arrayListH2 = null;
        String strF3 = null;
        String strF4 = null;
        w0 w0Var = null;
        String strF5 = null;
        ArrayList arrayListH3 = null;
        String strF6 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    jU = f4.b.u(parcel, iR);
                    break;
                case 3:
                    bundleA = f4.b.a(parcel, iR);
                    break;
                case 4:
                    iT2 = f4.b.t(parcel, iR);
                    break;
                case 5:
                    arrayListH = f4.b.h(parcel, iR);
                    break;
                case 6:
                    zM = f4.b.m(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    iT3 = f4.b.t(parcel, iR);
                    break;
                case 8:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 9:
                    strF = f4.b.f(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    s3Var = (s3) f4.b.e(parcel, iR, s3.CREATOR);
                    break;
                case 11:
                    location = (Location) f4.b.e(parcel, iR, Location.CREATOR);
                    break;
                case 12:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 13:
                    bundleA2 = f4.b.a(parcel, iR);
                    break;
                case 14:
                    bundleA3 = f4.b.a(parcel, iR);
                    break;
                case 15:
                    arrayListH2 = f4.b.h(parcel, iR);
                    break;
                case 16:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case 17:
                    strF4 = f4.b.f(parcel, iR);
                    break;
                case 18:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 19:
                    w0Var = (w0) f4.b.e(parcel, iR, w0.CREATOR);
                    break;
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                    iT4 = f4.b.t(parcel, iR);
                    break;
                case 21:
                    strF5 = f4.b.f(parcel, iR);
                    break;
                case 22:
                    arrayListH3 = f4.b.h(parcel, iR);
                    break;
                case 23:
                    iT5 = f4.b.t(parcel, iR);
                    break;
                case 24:
                    strF6 = f4.b.f(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new c4(iT, jU, bundleA, iT2, arrayListH, zM, iT3, zM2, strF, s3Var, location, strF2, bundleA2, bundleA3, arrayListH2, strF3, strF4, zM3, w0Var, iT4, strF5, arrayListH3, iT5, strF6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c4[i10];
    }
}
