package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class nl extends dj implements pl {
    nl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.pl
    public final void I0(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(3, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.pl
    public final void b() {
        L0(5, C());
    }

    @Override // com.google.android.gms.internal.ads.pl
    public final void c() {
        L0(4, C());
    }

    @Override // com.google.android.gms.internal.ads.pl
    public final void d() {
        L0(2, C());
    }

    @Override // com.google.android.gms.internal.ads.pl
    public final void e() {
        L0(1, C());
    }
}
