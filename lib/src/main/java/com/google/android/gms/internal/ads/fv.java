package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.List;

/* loaded from: classes.dex */
public abstract class fv extends ej implements gv {
    public fv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceH;
        String strK;
        switch (i10) {
            case 2:
                iInterfaceH = h();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceH);
                return true;
            case 3:
                strK = k();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 4:
                List listN = n();
                parcel2.writeNoException();
                parcel2.writeList(listN);
                return true;
            case 5:
                strK = i();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 6:
                iInterfaceH = c();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceH);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                strK = j();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 8:
                strK = g();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 9:
                Bundle bundleB = b();
                parcel2.writeNoException();
                fj.e(parcel2, bundleB);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                m();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceH = d();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceH);
                return true;
            case 12:
                Bundle bundle = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                g3(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                boolean zJ0 = j0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zJ0 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                c0(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceH = f();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceH);
                return true;
            case 16:
                iInterfaceH = e();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceH);
                return true;
            case 17:
                strK = l();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            default:
                return false;
        }
    }
}
