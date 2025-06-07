package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public abstract class t30 extends ej implements u30 {
    public t30() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static u30 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof u30 ? (u30) iInterfaceQueryLocalInterface : new s30(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                e();
                parcel2.writeNoException();
                return true;
            case 3:
                int i12 = parcel.readInt();
                fj.c(parcel);
                w(i12);
                parcel2.writeNoException();
                return true;
            case 4:
                m();
                parcel2.writeNoException();
                return true;
            case 5:
                o();
                parcel2.writeNoException();
                return true;
            case 6:
                p();
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                n();
                parcel2.writeNoException();
                return true;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                fj.c(parcel);
                f3(string, string2);
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                iv.L5(parcel.readStrongBinder());
                parcel.readString();
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
                v();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readString();
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                N();
                parcel2.writeNoException();
                return true;
            case 14:
                na0 na0Var = (na0) fj.a(parcel, na0.CREATOR);
                fj.c(parcel);
                u5(na0Var);
                parcel2.writeNoException();
                return true;
            case 15:
                D();
                parcel2.writeNoException();
                return true;
            case 16:
                ra0 ra0VarL5 = qa0.L5(parcel.readStrongBinder());
                fj.c(parcel);
                V3(ra0VarL5);
                parcel2.writeNoException();
                return true;
            case 17:
                int i13 = parcel.readInt();
                fj.c(parcel);
                s0(i13);
                parcel2.writeNoException();
                return true;
            case 18:
                u();
                parcel2.writeNoException();
                return true;
            case 19:
                fj.c(parcel);
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                A();
                parcel2.writeNoException();
                return true;
            case 21:
                String string3 = parcel.readString();
                fj.c(parcel);
                b0(string3);
                parcel2.writeNoException();
                return true;
            case 22:
                int i14 = parcel.readInt();
                String string4 = parcel.readString();
                fj.c(parcel);
                X1(i14, string4);
                parcel2.writeNoException();
                return true;
            case 23:
                k3.w2 w2Var = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
                fj.c(parcel);
                I1(w2Var);
                parcel2.writeNoException();
                return true;
            case 24:
                k3.w2 w2Var2 = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
                fj.c(parcel);
                v0(w2Var2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
