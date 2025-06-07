package e4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        IBinder iBinderS = null;
        b4.b bVar = null;
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                iBinderS = f4.b.s(parcel, iR);
            } else if (iL == 3) {
                bVar = (b4.b) f4.b.e(parcel, iR, b4.b.CREATOR);
            } else if (iL == 4) {
                zM = f4.b.m(parcel, iR);
            } else if (iL != 5) {
                f4.b.x(parcel, iR);
            } else {
                zM2 = f4.b.m(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new m0(iT, iBinderS, bVar, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m0[i10];
    }
}
