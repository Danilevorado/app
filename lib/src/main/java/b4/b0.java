package b4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        IBinder iBinderS = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 2:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 4:
                    iBinderS = f4.b.s(parcel, iR);
                    break;
                case 5:
                    zM3 = f4.b.m(parcel, iR);
                    break;
                case 6:
                    zM4 = f4.b.m(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new a0(strF, zM, zM2, iBinderS, zM3, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
