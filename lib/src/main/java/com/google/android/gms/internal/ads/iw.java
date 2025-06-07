package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class iw extends dj implements jw {
    iw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.jw
    public final void J(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.jw
    public final void c() {
        L0(2, C());
    }
}
