package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class la0 extends ej implements ma0 {
    public la0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static ma0 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof ma0 ? (ma0) iInterfaceQueryLocalInterface : new ka0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                F1(aVarW0);
                break;
            case 2:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                fj.c(parcel);
                B4(aVarW02, i12);
                break;
            case 3:
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                i0(aVarW03);
                break;
            case 4:
                l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                R(aVarW04);
                break;
            case 5:
                l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                k4(aVarW05);
                break;
            case 6:
                l4.a aVarW06 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                F0(aVarW06);
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                l4.a aVarW07 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                na0 na0Var = (na0) fj.a(parcel, na0.CREATOR);
                fj.c(parcel);
                d5(aVarW07, na0Var);
                break;
            case 8:
                l4.a aVarW08 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                zze(aVarW08);
                break;
            case 9:
                l4.a aVarW09 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                fj.c(parcel);
                A0(aVarW09, i13);
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                l4.a aVarW010 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                m1(aVarW010);
                break;
            case 11:
                l4.a aVarW011 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                R3(aVarW011);
                break;
            case 12:
                fj.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
