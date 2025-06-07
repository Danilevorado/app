package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class r70 extends dj implements t70 {
    r70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void P2(List list) {
        Parcel parcelC = C();
        parcelC.writeTypedList(list);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void s(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        L0(2, parcelC);
    }
}
