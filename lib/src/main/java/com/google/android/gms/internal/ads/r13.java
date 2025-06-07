package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r13 extends dj implements t13 {
    r13(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.t13
    public final void O1(String str, Bundle bundle, v13 v13Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        fj.d(parcelC, bundle);
        fj.f(parcelC, v13Var);
        p1(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.t13
    public final void c3(Bundle bundle, v13 v13Var) {
        Parcel parcelC = C();
        fj.d(parcelC, bundle);
        fj.f(parcelC, v13Var);
        p1(2, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.t13
    public final void z5(Bundle bundle, v13 v13Var) {
        Parcel parcelC = C();
        fj.d(parcelC, bundle);
        fj.f(parcelC, v13Var);
        p1(3, parcelC);
    }
}
