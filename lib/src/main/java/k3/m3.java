package k3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        String strF2 = null;
        w2 w2Var = null;
        IBinder iBinderS = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 3) {
                strF2 = f4.b.f(parcel, iR);
            } else if (iL == 4) {
                w2Var = (w2) f4.b.e(parcel, iR, w2.CREATOR);
            } else if (iL != 5) {
                f4.b.x(parcel, iR);
            } else {
                iBinderS = f4.b.s(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new w2(iT, strF, strF2, w2Var, iBinderS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new w2[i10];
    }
}
