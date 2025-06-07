package k3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class i4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        h4[] h4VarArr = null;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 2:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 3:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 4:
                    iT2 = f4.b.t(parcel, iR);
                    break;
                case 5:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 6:
                    iT3 = f4.b.t(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    iT4 = f4.b.t(parcel, iR);
                    break;
                case 8:
                    h4VarArr = (h4[]) f4.b.i(parcel, iR, h4.CREATOR);
                    break;
                case 9:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 11:
                    zM4 = f4.b.m(parcel, iR);
                    break;
                case 12:
                    zM5 = f4.b.m(parcel, iR);
                    break;
                case 13:
                    zM6 = f4.b.m(parcel, iR);
                    break;
                case 14:
                    zM7 = f4.b.m(parcel, iR);
                    break;
                case 15:
                    zM8 = f4.b.m(parcel, iR);
                    break;
                case 16:
                    zM9 = f4.b.m(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new h4(strF, iT, iT2, zM, iT3, iT4, h4VarArr, zM2, zM3, zM4, zM5, zM6, zM7, zM8, zM9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h4[i10];
    }
}
