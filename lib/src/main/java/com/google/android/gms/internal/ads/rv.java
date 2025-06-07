package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class rv extends dj implements tv {
    rv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final void P0(jv jvVar, String str) {
        Parcel parcelC = C();
        fj.f(parcelC, jvVar);
        parcelC.writeString(str);
        L0(1, parcelC);
    }
}
