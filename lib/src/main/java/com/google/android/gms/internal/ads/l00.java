package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class l00 extends dj implements n00 {
    l00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void H(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(2, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void U1(h00 h00Var) {
        Parcel parcelC = C();
        fj.f(parcelC, h00Var);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void y(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(3, parcelC);
    }
}
