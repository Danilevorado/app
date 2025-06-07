package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ba0 extends dj {
    ba0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void w3(aa0 aa0Var, String str, String str2) {
        Parcel parcelC = C();
        fj.f(parcelC, aa0Var);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        L0(2, parcelC);
    }
}
