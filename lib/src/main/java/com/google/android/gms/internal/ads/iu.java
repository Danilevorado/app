package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class iu extends ej implements ju {
    public iu() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static ju L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof ju ? (ju) iInterfaceQueryLocalInterface : new hu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            String strH = h();
            parcel2.writeNoException();
            parcel2.writeString(strH);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        List listG = g();
        parcel2.writeNoException();
        parcel2.writeList(listG);
        return true;
    }
}
