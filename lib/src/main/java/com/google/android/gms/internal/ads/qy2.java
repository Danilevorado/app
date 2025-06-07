package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class qy2 extends dj {
    qy2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final void K5(jy2 jy2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, jy2Var);
        L0(2, parcelC);
    }

    public final oy2 w3(my2 my2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, my2Var);
        Parcel parcelW0 = w0(1, parcelC);
        oy2 oy2Var = (oy2) fj.a(parcelW0, oy2.CREATOR);
        parcelW0.recycle();
        return oy2Var;
    }

    public final yy2 x4(wy2 wy2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, wy2Var);
        Parcel parcelW0 = w0(3, parcelC);
        yy2 yy2Var = (yy2) fj.a(parcelW0, yy2.CREATOR);
        parcelW0.recycle();
        return yy2Var;
    }
}
