package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            if (f4.b.l(iR) != 15) {
                f4.b.x(parcel, iR);
            } else {
                strF = f4.b.f(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new s3(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s3[i10];
    }
}
