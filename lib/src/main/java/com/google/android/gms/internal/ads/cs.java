package com.google.android.gms.internal.ads;

import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public abstract class cs extends ej implements es {
    public cs() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strB;
        if (i10 == 1) {
            strB = b();
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                    fj.c(parcel);
                    d0(aVarW0);
                } else if (i10 == 4) {
                    c();
                } else {
                    if (i10 != 5) {
                        return false;
                    }
                    e();
                }
                parcel2.writeNoException();
                return true;
            }
            strB = d();
        }
        parcel2.writeNoException();
        parcel2.writeString(strB);
        return true;
    }
}
