package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.List;
import l4.a;

/* loaded from: classes.dex */
public abstract class iv extends ej implements jv {
    public iv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static jv L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof jv ? (jv) iInterfaceQueryLocalInterface : new hv(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strI4;
        IInterface iInterfaceE0;
        boolean zQ;
        int i12;
        boolean zH0;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                fj.c(parcel);
                strI4 = i4(string);
                parcel2.writeNoException();
                parcel2.writeString(strI4);
                return true;
            case 2:
                String string2 = parcel.readString();
                fj.c(parcel);
                iInterfaceE0 = e0(string2);
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceE0);
                return true;
            case 3:
                List<String> listK = k();
                parcel2.writeNoException();
                parcel2.writeStringList(listK);
                return true;
            case 4:
                strI4 = i();
                parcel2.writeNoException();
                parcel2.writeString(strI4);
                return true;
            case 5:
                String string3 = parcel.readString();
                fj.c(parcel);
                U(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                p();
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                iInterfaceE0 = c();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceE0);
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterfaceE0 = g();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceE0);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                zH0 = H0(aVarW0);
                parcel2.writeNoException();
                i12 = zH0;
                parcel2.writeInt(i12);
                return true;
            case 11:
                parcel2.writeNoException();
                iInterfaceE0 = null;
                fj.f(parcel2, iInterfaceE0);
                return true;
            case 12:
                zQ = q();
                parcel2.writeNoException();
                int i13 = fj.f8294b;
                i12 = zQ;
                parcel2.writeInt(i12);
                return true;
            case 13:
                zQ = B();
                parcel2.writeNoException();
                int i132 = fj.f8294b;
                i12 = zQ;
                parcel2.writeInt(i12);
                return true;
            case 14:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                b3(aVarW02);
                parcel2.writeNoException();
                return true;
            case 15:
                n();
                parcel2.writeNoException();
                return true;
            case 16:
                iInterfaceE0 = e();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceE0);
                return true;
            case 17:
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                zH0 = k0(aVarW03);
                parcel2.writeNoException();
                i12 = zH0;
                parcel2.writeInt(i12);
                return true;
            default:
                return false;
        }
    }
}
