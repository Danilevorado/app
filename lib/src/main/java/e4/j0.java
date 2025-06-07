package e4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        String strF = null;
        String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = -1;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    iT2 = f4.b.t(parcel, iR);
                    break;
                case 3:
                    iT3 = f4.b.t(parcel, iR);
                    break;
                case 4:
                    jU = f4.b.u(parcel, iR);
                    break;
                case 5:
                    jU2 = f4.b.u(parcel, iR);
                    break;
                case 6:
                    strF = f4.b.f(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case 8:
                    iT4 = f4.b.t(parcel, iR);
                    break;
                case 9:
                    iT5 = f4.b.t(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new n(iT, iT2, iT3, jU, jU2, strF, strF2, iT4, iT5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
