package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class m extends r4.a {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final l4.a K5(l4.a aVar, String str, int i10) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(i10);
        Parcel parcelC = C(4, parcelW0);
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarW0;
    }

    public final int L0(l4.a aVar, String str, boolean z10) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(z10 ? 1 : 0);
        Parcel parcelC = C(3, parcelW0);
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final l4.a L5(l4.a aVar, String str, boolean z10, long j10) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(z10 ? 1 : 0);
        parcelW0.writeLong(j10);
        Parcel parcelC = C(7, parcelW0);
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarW0;
    }

    public final int c() {
        Parcel parcelC = C(6, w0());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final int p1(l4.a aVar, String str, boolean z10) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(z10 ? 1 : 0);
        Parcel parcelC = C(5, parcelW0);
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final l4.a w3(l4.a aVar, String str, int i10) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(i10);
        Parcel parcelC = C(2, parcelW0);
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarW0;
    }

    public final l4.a x4(l4.a aVar, String str, int i10, l4.a aVar2) {
        Parcel parcelW0 = w0();
        r4.c.d(parcelW0, aVar);
        parcelW0.writeString(str);
        parcelW0.writeInt(i10);
        r4.c.d(parcelW0, aVar2);
        Parcel parcelC = C(8, parcelW0);
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarW0;
    }
}
