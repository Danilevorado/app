package e4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        Bundle bundleA = null;
        f fVar = null;
        int iT = 0;
        b4.d[] dVarArr = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                bundleA = f4.b.a(parcel, iR);
            } else if (iL == 2) {
                dVarArr = (b4.d[]) f4.b.i(parcel, iR, b4.d.CREATOR);
            } else if (iL == 3) {
                iT = f4.b.t(parcel, iR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                fVar = (f) f4.b.e(parcel, iR, f.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new e1(bundleA, dVarArr, iT, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e1[i10];
    }
}
