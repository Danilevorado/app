package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.List;
import l4.a;

/* loaded from: classes.dex */
public abstract class c40 extends ej implements d40 {
    public c40() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static d40 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof d40 ? (d40) iInterfaceQueryLocalInterface : new b40(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strT;
        IInterface iInterfaceL;
        int iO;
        float fE;
        switch (i10) {
            case 2:
                strT = t();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 3:
                List listV = v();
                parcel2.writeNoException();
                parcel2.writeList(listV);
                return true;
            case 4:
                strT = q();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 5:
                iInterfaceL = l();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceL);
                return true;
            case 6:
                strT = r();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                strT = o();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 8:
                double dC = c();
                parcel2.writeNoException();
                parcel2.writeDouble(dC);
                return true;
            case 9:
                strT = u();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                strT = B();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 11:
                iInterfaceL = j();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceL);
                return true;
            case 12:
                parcel2.writeNoException();
                iInterfaceL = null;
                fj.f(parcel2, iInterfaceL);
                return true;
            case 13:
                iInterfaceL = n();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceL);
                return true;
            case 14:
                iInterfaceL = m();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceL);
                return true;
            case 15:
                iInterfaceL = p();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceL);
                return true;
            case 16:
                Bundle bundleI = i();
                parcel2.writeNoException();
                fj.e(parcel2, bundleI);
                return true;
            case 17:
                iO = O();
                parcel2.writeNoException();
                int i12 = fj.f8294b;
                parcel2.writeInt(iO);
                return true;
            case 18:
                iO = F();
                parcel2.writeNoException();
                int i122 = fj.f8294b;
                parcel2.writeInt(iO);
                return true;
            case 19:
                A();
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                H3(aVarW0);
                parcel2.writeNoException();
                return true;
            case 21:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                D2(aVarW02, aVarW03, aVarW04);
                parcel2.writeNoException();
                return true;
            case 22:
                l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                I4(aVarW05);
                parcel2.writeNoException();
                return true;
            case 23:
                fE = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case 24:
                fE = g();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case 25:
                fE = h();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            default:
                return false;
        }
    }
}
