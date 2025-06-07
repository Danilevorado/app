package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lw extends ej implements mw {
    public lw() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strQ;
        List listU;
        IInterface iInterfaceK;
        jw iwVar;
        int i12;
        boolean zT;
        switch (i10) {
            case 2:
                strQ = q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 3:
                listU = u();
                parcel2.writeNoException();
                parcel2.writeList(listU);
                return true;
            case 4:
                strQ = p();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 5:
                iInterfaceK = k();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceK);
                return true;
            case 6:
                strQ = o();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                strQ = m();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 8:
                double dC = c();
                parcel2.writeNoException();
                parcel2.writeDouble(dC);
                return true;
            case 9:
                strQ = B();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                strQ = t();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 11:
                iInterfaceK = g();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceK);
                return true;
            case 12:
                strQ = r();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 13:
                A();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterfaceK = i();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceK);
                return true;
            case 15:
                Bundle bundle = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                p5(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                boolean zW2 = W2(bundle2);
                parcel2.writeNoException();
                i12 = zW2;
                parcel2.writeInt(i12);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                F4(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                iInterfaceK = n();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceK);
                return true;
            case 19:
                iInterfaceK = l();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceK);
                return true;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                Bundle bundleE = e();
                parcel2.writeNoException();
                fj.e(parcel2, bundleE);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    iwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    iwVar = iInterfaceQueryLocalInterface instanceof jw ? (jw) iInterfaceQueryLocalInterface : new iw(strongBinder);
                }
                fj.c(parcel);
                a2(iwVar);
                parcel2.writeNoException();
                return true;
            case 22:
                D();
                parcel2.writeNoException();
                return true;
            case 23:
                listU = v();
                parcel2.writeNoException();
                parcel2.writeList(listU);
                return true;
            case 24:
                zT = T();
                parcel2.writeNoException();
                int i13 = fj.f8294b;
                i12 = zT;
                parcel2.writeInt(i12);
                return true;
            case 25:
                k3.r1 r1VarL5 = k3.q1.L5(parcel.readStrongBinder());
                fj.c(parcel);
                h2(r1VarL5);
                parcel2.writeNoException();
                return true;
            case 26:
                k3.o1 o1VarL5 = k3.n1.L5(parcel.readStrongBinder());
                fj.c(parcel);
                K1(o1VarL5);
                parcel2.writeNoException();
                return true;
            case 27:
                Q();
                parcel2.writeNoException();
                return true;
            case 28:
                F();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterfaceK = j();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceK);
                return true;
            case 30:
                zT = P();
                parcel2.writeNoException();
                int i132 = fj.f8294b;
                i12 = zT;
                parcel2.writeInt(i12);
                return true;
            case 31:
                iInterfaceK = h();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceK);
                return true;
            case 32:
                k3.c2 c2VarL5 = k3.b2.L5(parcel.readStrongBinder());
                fj.c(parcel);
                v5(c2VarL5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
