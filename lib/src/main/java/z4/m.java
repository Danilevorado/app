package z4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.m0;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        b4.b bVar = null;
        int iT = 0;
        m0 m0Var = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                bVar = (b4.b) f4.b.e(parcel, iR, b4.b.CREATOR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                m0Var = (m0) f4.b.e(parcel, iR, m0.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new l(iT, bVar, m0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
