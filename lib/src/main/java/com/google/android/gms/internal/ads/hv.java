package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class hv extends dj implements jv {
    hv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final boolean H0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(10, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final l4.a g() {
        Parcel parcelW0 = w0(9, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final String i() {
        Parcel parcelW0 = w0(4, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final boolean k0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(17, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }
}
