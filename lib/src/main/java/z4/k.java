package z4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.k0;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        k0 k0Var = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL != 2) {
                f4.b.x(parcel, iR);
            } else {
                k0Var = (k0) f4.b.e(parcel, iR, k0.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new j(iT, k0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
