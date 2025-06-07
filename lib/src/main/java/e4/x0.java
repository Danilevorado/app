package e4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iT2 = 0;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                zM = f4.b.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = f4.b.m(parcel, iR);
            } else if (iL == 4) {
                iT2 = f4.b.t(parcel, iR);
            } else if (iL != 5) {
                f4.b.x(parcel, iR);
            } else {
                iT3 = f4.b.t(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new r(iT, zM, zM2, iT2, iT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
