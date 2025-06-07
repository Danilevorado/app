package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class iz2 extends dj implements kz2 {
    iz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.kz2
    public final void E0(byte[] bArr) {
        Parcel parcelC = C();
        parcelC.writeByteArray(bArr);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.kz2
    public final void H5(l4.a aVar, String str, String str2) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeString(null);
        L0(8, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.kz2
    public final void a0(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(6, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.kz2
    public final void e() {
        L0(3, C());
    }

    @Override // com.google.android.gms.internal.ads.kz2
    public final void r0(int[] iArr) {
        Parcel parcelC = C();
        parcelC.writeIntArray(null);
        L0(4, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.kz2
    public final void w(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(7, parcelC);
    }
}
