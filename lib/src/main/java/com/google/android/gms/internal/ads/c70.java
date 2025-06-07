package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class c70 extends ej implements d70 {
    public c70() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static d70 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof d70 ? (d70) iInterfaceQueryLocalInterface : new b70(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                S2(bundle);
                break;
            case 2:
                break;
            case 3:
                t();
                break;
            case 4:
                q();
                break;
            case 5:
                m();
                break;
            case 6:
                Bundle bundle2 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                f0(bundle2);
                parcel2.writeNoException();
                fj.e(parcel2, bundle2);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                B();
                break;
            case 8:
                l();
                break;
            case 9:
                D();
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                g();
                break;
            case 11:
                boolean z10 = z();
                parcel2.writeNoException();
                int i12 = fj.f8294b;
                parcel2.writeInt(z10 ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                fj.c(parcel);
                break;
            case 13:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                R(aVarW0);
                break;
            case 14:
                u();
                break;
            case 15:
                int i13 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                fj.c(parcel);
                Y0(i13, strArrCreateStringArray, iArrCreateIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
