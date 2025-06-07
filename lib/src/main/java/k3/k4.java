package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        long jU = 0;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = f4.b.t(parcel, iR);
            } else if (iL == 3) {
                strF = f4.b.f(parcel, iR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                jU = f4.b.u(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new j4(iT, iT2, strF, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j4[i10];
    }
}
