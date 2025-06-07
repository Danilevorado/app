package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i00 extends dj implements k00 {
    i00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final void H(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(2, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final void e() {
        L0(1, C());
    }
}
