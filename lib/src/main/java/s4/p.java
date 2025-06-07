package s4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        List listJ = o.f26892x;
        LocationRequest locationRequest = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        long jU = Long.MAX_VALUE;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL != 1) {
                switch (iL) {
                    case 5:
                        listJ = f4.b.j(parcel, iR, e4.d.CREATOR);
                        break;
                    case 6:
                        strF = f4.b.f(parcel, iR);
                        break;
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        zM = f4.b.m(parcel, iR);
                        break;
                    case 8:
                        zM2 = f4.b.m(parcel, iR);
                        break;
                    case 9:
                        zM3 = f4.b.m(parcel, iR);
                        break;
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                        strF2 = f4.b.f(parcel, iR);
                        break;
                    case 11:
                        zM4 = f4.b.m(parcel, iR);
                        break;
                    case 12:
                        zM5 = f4.b.m(parcel, iR);
                        break;
                    case 13:
                        strF3 = f4.b.f(parcel, iR);
                        break;
                    case 14:
                        jU = f4.b.u(parcel, iR);
                        break;
                    default:
                        f4.b.x(parcel, iR);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) f4.b.e(parcel, iR, LocationRequest.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new o(locationRequest, listJ, strF, zM, zM2, zM3, strF2, zM4, zM5, strF3, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new o[i10];
    }
}
