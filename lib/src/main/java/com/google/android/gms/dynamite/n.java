package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class n extends r4.a {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final l4.a L0(l4.a aVar, String str, int i10, l4.a aVar2) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(i10);
        r4.c.d(parcelW0, aVar2);
        Parcel parcelC = C(2, parcelW0);
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarW0;
    }

    public final l4.a p1(l4.a aVar, String str, int i10, l4.a aVar2) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(i10);
        r4.c.d(parcelW0, aVar2);
        Parcel parcelC = C(3, parcelW0);
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarW0;
    }
}
