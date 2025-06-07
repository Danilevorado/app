package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hu extends dj implements ju {
    hu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final List g() {
        Parcel parcelW0 = w0(3, C());
        ArrayList arrayListB = fj.b(parcelW0);
        parcelW0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final String h() {
        Parcel parcelW0 = w0(2, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }
}
