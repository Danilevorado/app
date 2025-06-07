package b4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        long jU = -1;
        int iT = 0;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 2) {
                iT = f4.b.t(parcel, iR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                jU = f4.b.u(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new d(strF, iT, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
