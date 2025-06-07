package l3;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Intent intent = null;
        IBinder iBinderS = null;
        boolean zM = false;
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
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case 5:
                    strF4 = f4.b.f(parcel, iR);
                    break;
                case 6:
                    strF5 = f4.b.f(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF6 = f4.b.f(parcel, iR);
                    break;
                case 8:
                    strF7 = f4.b.f(parcel, iR);
                    break;
                case 9:
                    intent = (Intent) f4.b.e(parcel, iR, Intent.CREATOR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    iBinderS = f4.b.s(parcel, iR);
                    break;
                case 11:
                    zM = f4.b.m(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new i(strF, strF2, strF3, strF4, strF5, strF6, strF7, intent, iBinderS, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
