package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.List;
import java.util.Map;
import l4.a;

/* loaded from: classes.dex */
public abstract class fm0 extends ej implements gm0 {
    public fm0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strE;
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                c0(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                Bundle bundleH0 = h0(bundle2);
                parcel2.writeNoException();
                fj.e(parcel2, bundleH0);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                I2(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                R2(string3, string4, aVarW0);
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean zG = fj.g(parcel);
                fj.c(parcel);
                Map mapR4 = r4(string5, string6, zG);
                parcel2.writeNoException();
                parcel2.writeMap(mapR4);
                return true;
            case 6:
                String string7 = parcel.readString();
                fj.c(parcel);
                int iX = x(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iX);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                Bundle bundle4 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                j0(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                W4(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                fj.c(parcel);
                List listS1 = S1(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listS1);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 11:
                strE = i();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 12:
                long jD = d();
                parcel2.writeNoException();
                parcel2.writeLong(jD);
                return true;
            case 13:
                String string12 = parcel.readString();
                fj.c(parcel);
                b0(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                fj.c(parcel);
                U(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                fj.c(parcel);
                g4(aVarW02, string14, string15);
                parcel2.writeNoException();
                return true;
            case 16:
                strE = g();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 17:
                strE = h();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 18:
                strE = c();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) fj.a(parcel, Bundle.CREATOR);
                fj.c(parcel);
                f0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
