package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
final class q3 implements Parcelable.Creator {
    q3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        Objects.requireNonNull(strArrCreateStringArray);
        return new r3(string, string2, c63.t(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r3[i10];
    }
}
