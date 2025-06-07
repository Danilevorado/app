package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u60 extends dj implements w60 {
    u60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void M0(Intent intent) {
        Parcel parcelC = C();
        fj.d(parcelC, intent);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        L0(3, C());
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void j3(l4.a aVar, String str, String str2) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        L0(2, parcelC);
    }
}
