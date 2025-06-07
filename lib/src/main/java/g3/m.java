package g3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        IBinder iBinderS = null;
        boolean zM = false;
        IBinder iBinderS2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                zM = f4.b.m(parcel, iR);
            } else if (iL == 2) {
                iBinderS = f4.b.s(parcel, iR);
            } else if (iL != 3) {
                f4.b.x(parcel, iR);
            } else {
                iBinderS2 = f4.b.s(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new g(zM, iBinderS, iBinderS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
