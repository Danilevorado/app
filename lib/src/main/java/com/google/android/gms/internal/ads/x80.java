package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class x80 extends dj implements z80 {
    x80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void K2(o80 o80Var, c90 c90Var) {
        Parcel parcelC = C();
        fj.d(parcelC, o80Var);
        fj.f(parcelC, c90Var);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void z4(s80 s80Var, c90 c90Var) {
        Parcel parcelC = C();
        fj.d(parcelC, s80Var);
        fj.f(parcelC, c90Var);
        L0(3, parcelC);
    }
}
