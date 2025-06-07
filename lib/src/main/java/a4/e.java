package a4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            if (f4.b.l(iR) != 1) {
                f4.b.x(parcel, iR);
            } else {
                intent = (Intent) f4.b.e(parcel, iR, Intent.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
