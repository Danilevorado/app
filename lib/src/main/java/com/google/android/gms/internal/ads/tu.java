package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class tu extends ej implements uu {
    public tu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static uu L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof uu ? (uu) iInterfaceQueryLocalInterface : new su(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        nu luVar;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                T2(string, aVarW0);
                break;
            case 2:
                String string2 = parcel.readString();
                fj.c(parcel);
                l4.a aVarX = x(string2);
                parcel2.writeNoException();
                fj.f(parcel2, aVarX);
                return true;
            case 3:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                R4(aVarW02);
                break;
            case 4:
                d();
                break;
            case 5:
                a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                parcel.readInt();
                fj.c(parcel);
                break;
            case 6:
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                Q0(aVarW03);
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                d0(aVarW04);
                break;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    luVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    luVar = iInterfaceQueryLocalInterface instanceof nu ? (nu) iInterfaceQueryLocalInterface : new lu(strongBinder);
                }
                fj.c(parcel);
                r3(luVar);
                break;
            case 9:
                l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                I3(aVarW05);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
