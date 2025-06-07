package b4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        boolean zM = false;
        boolean zM2 = false;
        IBinder iBinderS = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 2) {
                iBinderS = f4.b.s(parcel, iR);
            } else if (iL == 3) {
                zM = f4.b.m(parcel, iR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                zM2 = f4.b.m(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new e0(strF, iBinderS, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e0[i10];
    }
}
