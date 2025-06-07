package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public abstract class v60 extends ej implements w60 {
    public v60() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static w60 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof w60 ? (w60) iInterfaceQueryLocalInterface : new u60(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Intent intent = (Intent) fj.a(parcel, Intent.CREATOR);
            fj.c(parcel);
            M0(intent);
        } else if (i10 == 2) {
            l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            fj.c(parcel);
            j3(aVarW0, string, string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            e();
        }
        parcel2.writeNoException();
        return true;
    }
}
