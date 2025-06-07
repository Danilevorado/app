package b4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        PendingIntent pendingIntent = null;
        String strF = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = f4.b.t(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) f4.b.e(parcel, iR, PendingIntent.CREATOR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                strF = f4.b.f(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new b(iT, iT2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
