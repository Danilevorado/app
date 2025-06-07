package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 2) {
                zM = f4.b.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = f4.b.m(parcel, iR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                zM3 = f4.b.m(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new v3(zM, zM2, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v3[i10];
    }
}
