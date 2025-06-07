package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class su extends dj implements uu {
    su(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void I3(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(9, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void Q0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(6, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void R4(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(3, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void T2(String str, l4.a aVar) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        fj.f(parcelC, aVar);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void b1(l4.a aVar, int i10) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeInt(i10);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void d0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(7, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void r3(nu nuVar) {
        Parcel parcelC = C();
        fj.f(parcelC, nuVar);
        L0(8, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final l4.a x(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        Parcel parcelW0 = w0(2, parcelC);
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }
}
