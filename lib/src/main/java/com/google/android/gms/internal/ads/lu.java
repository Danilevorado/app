package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class lu extends dj implements nu {
    lu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final l4.a i() {
        Parcel parcelW0 = w0(4, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }
}
