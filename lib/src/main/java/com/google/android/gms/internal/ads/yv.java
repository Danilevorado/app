package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yv extends dj implements aw {
    yv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void N0(k3.q0 q0Var, l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, q0Var);
        fj.f(parcelC, aVar);
        L0(1, parcelC);
    }
}
