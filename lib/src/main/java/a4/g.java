package a4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class g implements Parcelable.Creator {
    g() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new i(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
