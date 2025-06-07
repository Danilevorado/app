package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cv extends ej implements ev {
    public cv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceG;
        String strK;
        switch (i10) {
            case 2:
                iInterfaceG = g();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceG);
                return true;
            case 3:
                strK = k();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 4:
                List listP = p();
                parcel2.writeNoException();
                parcel2.writeList(listP);
                return true;
            case 5:
                strK = i();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 6:
                iInterfaceG = e();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceG);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                strK = j();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 8:
                double dB = b();
                parcel2.writeNoException();
                parcel2.writeDouble(dB);
                return true;
            case 9:
                strK = m();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                strK = n();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 11:
                Bundle bundleD = d();
                parcel2.writeNoException();
                fj.e(parcel2, bundleD);
                return true;
            case 12:
                o();
                parcel2.writeNoException();
                return true;
            case 13:
                iInterfaceG = f();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceG);
                return true;
            case 14:
                Bundle bundle = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                j0(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                boolean zJ2 = j2(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zJ2 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                f0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                iInterfaceG = c();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceG);
                return true;
            case 18:
                iInterfaceG = h();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceG);
                return true;
            case 19:
                strK = l();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            default:
                return false;
        }
    }
}
