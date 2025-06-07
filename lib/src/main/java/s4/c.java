package s4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        Status status = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            if (f4.b.l(iR) != 1) {
                f4.b.x(parcel, iR);
            } else {
                status = (Status) f4.b.e(parcel, iR, Status.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new b(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
