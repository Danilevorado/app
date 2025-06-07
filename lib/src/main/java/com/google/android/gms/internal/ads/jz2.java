package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class jz2 extends ej implements kz2 {
    public jz2() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                parcel.readString();
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                parcel.readInt();
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
