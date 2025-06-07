package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class hl extends ej implements il {
    public hl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceC;
        pl nlVar;
        switch (i10) {
            case 2:
                iInterfaceC = c();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceC);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    nlVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    nlVar = iInterfaceQueryLocalInterface instanceof pl ? (pl) iInterfaceQueryLocalInterface : new nl(strongBinder2);
                }
                fj.c(parcel);
                l1(aVarW0, nlVar);
                parcel2.writeNoException();
                return true;
            case 5:
                iInterfaceC = e();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceC);
                return true;
            case 6:
                boolean zG = fj.g(parcel);
                fj.c(parcel);
                i5(zG);
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                k3.c2 c2VarL5 = k3.b2.L5(parcel.readStrongBinder());
                fj.c(parcel);
                M4(c2VarL5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
