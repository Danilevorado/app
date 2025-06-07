package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class gl extends dj implements il {
    gl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.il
    public final k3.j2 e() {
        Parcel parcelW0 = w0(5, C());
        k3.j2 j2VarL5 = k3.i2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return j2VarL5;
    }

    @Override // com.google.android.gms.internal.ads.il
    public final void l1(l4.a aVar, pl plVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, plVar);
        L0(4, parcelC);
    }
}
