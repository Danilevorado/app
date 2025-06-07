package k3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class m4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        w2 w2Var = null;
        Bundle bundleA = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 2:
                    jU = f4.b.u(parcel, iR);
                    break;
                case 3:
                    w2Var = (w2) f4.b.e(parcel, iR, w2.CREATOR);
                    break;
                case 4:
                    bundleA = f4.b.a(parcel, iR);
                    break;
                case 5:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 6:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF4 = f4.b.f(parcel, iR);
                    break;
                case 8:
                    strF5 = f4.b.f(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new l4(strF, jU, w2Var, bundleA, strF2, strF3, strF4, strF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l4[i10];
    }
}
