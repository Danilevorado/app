package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ol extends ej implements pl {
    public ol() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            e();
        } else if (i10 == 2) {
            d();
        } else if (i10 == 3) {
            k3.w2 w2Var = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
            fj.c(parcel);
            I0(w2Var);
        } else if (i10 == 4) {
            c();
        } else {
            if (i10 != 5) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
