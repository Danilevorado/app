package z4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        ArrayList arrayListH = null;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                arrayListH = f4.b.h(parcel, iR);
            } else if (iL != 2) {
                f4.b.x(parcel, iR);
            } else {
                strF = f4.b.f(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new h(arrayListH, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
