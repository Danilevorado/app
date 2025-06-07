package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class zz extends dj implements b00 {
    zz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.b00
    public final void e3(List list) {
        Parcel parcelC = C();
        parcelC.writeTypedList(list);
        L0(1, parcelC);
    }
}
