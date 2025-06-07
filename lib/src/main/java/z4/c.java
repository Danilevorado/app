package z4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        Intent intent = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = f4.b.t(parcel, iR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                intent = (Intent) f4.b.e(parcel, iR, Intent.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new b(iT, iT2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
