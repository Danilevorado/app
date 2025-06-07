package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class ta0 extends ej implements ua0 {
    public ta0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static ua0 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof ua0 ? (ua0) iInterfaceQueryLocalInterface : new sa0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceF;
        bb0 za0Var = null;
        bb0 za0Var2 = null;
        cb0 cb0Var = null;
        xa0 va0Var = null;
        switch (i10) {
            case 1:
                k3.c4 c4Var = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    za0Var = iInterfaceQueryLocalInterface instanceof bb0 ? (bb0) iInterfaceQueryLocalInterface : new za0(strongBinder);
                }
                fj.c(parcel);
                E4(c4Var, za0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    va0Var = iInterfaceQueryLocalInterface2 instanceof xa0 ? (xa0) iInterfaceQueryLocalInterface2 : new va0(strongBinder2);
                }
                fj.c(parcel);
                n2(va0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zP = p();
                parcel2.writeNoException();
                int i12 = fj.f8294b;
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 4:
                String strC = c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 5:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                J0(aVarW0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    cb0Var = iInterfaceQueryLocalInterface3 instanceof cb0 ? (cb0) iInterfaceQueryLocalInterface3 : new cb0(strongBinder3);
                }
                fj.c(parcel);
                H1(cb0Var);
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                ib0 ib0Var = (ib0) fj.a(parcel, ib0.CREATOR);
                fj.c(parcel);
                y4(ib0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                k3.z1 z1VarL5 = k3.y1.L5(parcel.readStrongBinder());
                fj.c(parcel);
                s4(z1VarL5);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleB = b();
                parcel2.writeNoException();
                fj.e(parcel2, bundleB);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                boolean zG = fj.g(parcel);
                fj.c(parcel);
                O4(aVarW02, zG);
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceF = f();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceF);
                return true;
            case 12:
                iInterfaceF = d();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceF);
                return true;
            case 13:
                k3.c2 c2VarL5 = k3.b2.L5(parcel.readStrongBinder());
                fj.c(parcel);
                g2(c2VarL5);
                parcel2.writeNoException();
                return true;
            case 14:
                k3.c4 c4Var2 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    za0Var2 = iInterfaceQueryLocalInterface4 instanceof bb0 ? (bb0) iInterfaceQueryLocalInterface4 : new za0(strongBinder4);
                }
                fj.c(parcel);
                s3(c4Var2, za0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zG2 = fj.g(parcel);
                fj.c(parcel);
                n0(zG2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
