package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public abstract class g00 extends ej implements h00 {
    public g00() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceB;
        k00 i00Var;
        if (i10 != 3) {
            if (i10 == 4) {
                f();
            } else if (i10 == 5) {
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    i00Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    i00Var = iInterfaceQueryLocalInterface instanceof k00 ? (k00) iInterfaceQueryLocalInterface : new i00(strongBinder);
                }
                fj.c(parcel);
                q4(aVarW0, i00Var);
            } else if (i10 == 6) {
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                zze(aVarW02);
            } else {
                if (i10 != 7) {
                    return false;
                }
                iInterfaceB = d();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterfaceB = b();
        parcel2.writeNoException();
        fj.f(parcel2, iInterfaceB);
        return true;
    }
}
