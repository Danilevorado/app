package com.google.android.gms.internal.ads;

import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public abstract class y40 extends ej implements z40 {
    public y40() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
            fj.c(parcel);
            v2(aVarW0);
        } else if (i10 == 2) {
            String string = parcel.readString();
            fj.c(parcel);
            s(string);
        } else if (i10 == 3) {
            k3.w2 w2Var = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
            fj.c(parcel);
            y(w2Var);
        } else {
            if (i10 != 4) {
                return false;
            }
            y30 y30VarL5 = x30.L5(parcel.readStrongBinder());
            fj.c(parcel);
            u4(y30VarL5);
        }
        parcel2.writeNoException();
        return true;
    }
}
