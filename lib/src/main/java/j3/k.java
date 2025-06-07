package j3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        int iT = 0;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        float fP = 0.0f;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 2:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 4:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 5:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 6:
                    fP = f4.b.p(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 8:
                    zM4 = f4.b.m(parcel, iR);
                    break;
                case 9:
                    zM5 = f4.b.m(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    zM6 = f4.b.m(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new j(zM, zM2, strF, zM3, fP, iT, zM4, zM5, zM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
