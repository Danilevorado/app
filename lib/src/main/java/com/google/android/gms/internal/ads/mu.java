package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class mu extends ej implements nu {
    public mu() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        float fC;
        IInterface iInterfaceI;
        xv xvVar;
        int iL;
        switch (i10) {
            case 2:
                fC = c();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case 3:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                R(aVarW0);
                parcel2.writeNoException();
                return true;
            case 4:
                iInterfaceI = i();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceI);
                return true;
            case 5:
                fC = h();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case 6:
                fC = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                iInterfaceI = g();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceI);
                return true;
            case 8:
                iL = l();
                parcel2.writeNoException();
                int i12 = fj.f8294b;
                parcel2.writeInt(iL);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    xvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    xvVar = iInterfaceQueryLocalInterface instanceof xv ? (xv) iInterfaceQueryLocalInterface : new xv(strongBinder);
                }
                fj.c(parcel);
                Y4(xvVar);
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                iL = k();
                parcel2.writeNoException();
                int i122 = fj.f8294b;
                parcel2.writeInt(iL);
                return true;
            default:
                return false;
        }
    }
}
