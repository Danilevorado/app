package com.google.android.gms.internal.ads;

import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public abstract class yu extends ej implements zu {
    public yu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
            fj.c(parcel);
            o3(aVarW0);
        } else if (i10 == 2) {
            f();
        } else {
            if (i10 != 3) {
                return false;
            }
            l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
            fj.c(parcel);
            G0(aVarW02);
        }
        parcel2.writeNoException();
        return true;
    }
}
