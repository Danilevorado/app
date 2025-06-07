package k3;

import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.ads.az;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.n30;
import com.google.android.gms.internal.ads.o30;
import l4.a;

/* loaded from: classes.dex */
public abstract class a1 extends ej implements b1 {
    public a1() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceI2;
        switch (i10) {
            case 1:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                h4 h4Var = (h4) fj.a(parcel, h4.CREATOR);
                String string = parcel.readString();
                o30 o30VarL5 = n30.L5(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = i2(aVarW0, h4Var, string, o30VarL5, i12);
                break;
            case 2:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                h4 h4Var2 = (h4) fj.a(parcel, h4.CREATOR);
                String string2 = parcel.readString();
                o30 o30VarL52 = n30.L5(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = k1(aVarW02, h4Var2, string2, o30VarL52, i13);
                break;
            case 3:
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                o30 o30VarL53 = n30.L5(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = x1(aVarW03, string3, o30VarL53, i14);
                break;
            case 4:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                parcel2.writeNoException();
                fj.f(parcel2, null);
                return true;
            case 5:
                l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                iInterfaceI2 = R0(aVarW04, aVarW05);
                break;
            case 6:
                l4.a aVarW06 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                o30 o30VarL54 = n30.L5(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = z3(aVarW06, o30VarL54, i15);
                break;
            case 8:
                l4.a aVarW07 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                iInterfaceI2 = J0(aVarW07);
                break;
            case 9:
                l4.a aVarW08 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = A0(aVarW08, i16);
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                l4.a aVarW09 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                h4 h4Var3 = (h4) fj.a(parcel, h4.CREATOR);
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = s2(aVarW09, h4Var3, string4, i17);
                break;
            case 11:
                l4.a aVarW010 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                l4.a aVarW011 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                l4.a aVarW012 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                iInterfaceI2 = U4(aVarW010, aVarW011, aVarW012);
                break;
            case 12:
                l4.a aVarW013 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                o30 o30VarL55 = n30.L5(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = A1(aVarW013, string5, o30VarL55, i18);
                break;
            case 13:
                l4.a aVarW014 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                h4 h4Var4 = (h4) fj.a(parcel, h4.CREATOR);
                String string6 = parcel.readString();
                o30 o30VarL56 = n30.L5(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = A3(aVarW014, h4Var4, string6, o30VarL56, i19);
                break;
            case 14:
                l4.a aVarW015 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                o30 o30VarL57 = n30.L5(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = W1(aVarW015, o30VarL57, i20);
                break;
            case 15:
                l4.a aVarW016 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                o30 o30VarL58 = n30.L5(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = j1(aVarW016, o30VarL58, i21);
                break;
            case 16:
                l4.a aVarW017 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                o30 o30VarL59 = n30.L5(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                cz czVarL5 = az.L5(parcel.readStrongBinder());
                fj.c(parcel);
                iInterfaceI2 = Z0(aVarW017, o30VarL59, i22, czVarL5);
                break;
            case 17:
                l4.a aVarW018 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                o30 o30VarL510 = n30.L5(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                fj.c(parcel);
                iInterfaceI2 = G1(aVarW018, o30VarL510, i23);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        fj.f(parcel2, iInterfaceI2);
        return true;
    }
}
