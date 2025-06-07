package e4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        int iT = 0;
        r rVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    rVar = (r) f4.b.e(parcel, iR, r.CREATOR);
                    break;
                case 2:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 4:
                    iArrC = f4.b.c(parcel, iR);
                    break;
                case 5:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 6:
                    iArrC2 = f4.b.c(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new f(rVar, zM, zM2, iArrC, iT, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
