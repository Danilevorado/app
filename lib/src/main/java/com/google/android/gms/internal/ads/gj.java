package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class gj extends dj implements ij {
    gj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.ij
    public final void B2(l4.a aVar, String str) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString("GMA_SDK");
        L0(2, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ij
    public final void E0(byte[] bArr) {
        Parcel parcelC = C();
        parcelC.writeByteArray(bArr);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ij
    public final void a0(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(0);
        L0(6, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ij
    public final void e() {
        L0(3, C());
    }

    @Override // com.google.android.gms.internal.ads.ij
    public final void r0(int[] iArr) {
        Parcel parcelC = C();
        parcelC.writeIntArray(null);
        L0(4, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ij
    public final void w(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(7, parcelC);
    }
}
