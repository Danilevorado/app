package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class w30 extends dj implements y30 {
    w30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.y30
    public final l4.a c() {
        Parcel parcelW0 = w0(1, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.y30
    public final boolean e() {
        Parcel parcelW0 = w0(2, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }
}
