package b4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        int iT = 0;
        String strF = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                zM = f4.b.m(parcel, iR);
            } else if (iL == 2) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 3) {
                iT2 = f4.b.t(parcel, iR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                iT = f4.b.t(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new c0(zM, strF, iT2, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
