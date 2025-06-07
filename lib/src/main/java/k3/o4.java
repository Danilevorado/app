package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            if (f4.b.l(iR) != 2) {
                f4.b.x(parcel, iR);
            } else {
                iT = f4.b.t(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new n4(iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n4[i10];
    }
}
