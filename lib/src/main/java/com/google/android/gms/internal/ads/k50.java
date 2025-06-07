package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import l4.a;

/* loaded from: classes.dex */
public abstract class k50 extends ej implements l50 {
    public k50() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static l50 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof l50 ? (l50) iInterfaceQueryLocalInterface : new j50(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        z50 z50VarE;
        int iH0;
        o50 m50Var = null;
        w40 t40Var = null;
        f50 d50Var = null;
        z40 x40Var = null;
        i50 g50Var = null;
        f50 d50Var2 = null;
        i50 g50Var2 = null;
        c50 a50Var = null;
        z40 x40Var2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                z50VarE = e();
            } else {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 == 10) {
                            a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                        } else if (i10 != 11) {
                            switch (i10) {
                                case 13:
                                    String string = parcel.readString();
                                    String string2 = parcel.readString();
                                    k3.c4 c4Var = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder = parcel.readStrongBinder();
                                    if (strongBinder != null) {
                                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        x40Var2 = iInterfaceQueryLocalInterface instanceof z40 ? (z40) iInterfaceQueryLocalInterface : new x40(strongBinder);
                                    }
                                    z40 z40Var = x40Var2;
                                    u30 u30VarL5 = t30.L5(parcel.readStrongBinder());
                                    k3.h4 h4Var = (k3.h4) fj.a(parcel, k3.h4.CREATOR);
                                    fj.c(parcel);
                                    M3(string, string2, c4Var, aVarW0, z40Var, u30VarL5, h4Var);
                                    break;
                                case 14:
                                    String string3 = parcel.readString();
                                    String string4 = parcel.readString();
                                    k3.c4 c4Var2 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder2 = parcel.readStrongBinder();
                                    if (strongBinder2 != null) {
                                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                        a50Var = iInterfaceQueryLocalInterface2 instanceof c50 ? (c50) iInterfaceQueryLocalInterface2 : new a50(strongBinder2);
                                    }
                                    c50 c50Var = a50Var;
                                    u30 u30VarL52 = t30.L5(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    S4(string3, string4, c4Var2, aVarW02, c50Var, u30VarL52);
                                    break;
                                case 15:
                                    l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    iH0 = H0(aVarW03);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iH0);
                                    break;
                                case 16:
                                    String string5 = parcel.readString();
                                    String string6 = parcel.readString();
                                    k3.c4 c4Var3 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder3 = parcel.readStrongBinder();
                                    if (strongBinder3 != null) {
                                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        g50Var2 = iInterfaceQueryLocalInterface3 instanceof i50 ? (i50) iInterfaceQueryLocalInterface3 : new g50(strongBinder3);
                                    }
                                    i50 i50Var = g50Var2;
                                    u30 u30VarL53 = t30.L5(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    Z2(string5, string6, c4Var3, aVarW04, i50Var, u30VarL53);
                                    break;
                                case 17:
                                    l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    iH0 = q3(aVarW05);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iH0);
                                    break;
                                case 18:
                                    String string7 = parcel.readString();
                                    String string8 = parcel.readString();
                                    k3.c4 c4Var4 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW06 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder4 = parcel.readStrongBinder();
                                    if (strongBinder4 != null) {
                                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        d50Var2 = iInterfaceQueryLocalInterface4 instanceof f50 ? (f50) iInterfaceQueryLocalInterface4 : new d50(strongBinder4);
                                    }
                                    f50 f50Var = d50Var2;
                                    u30 u30VarL54 = t30.L5(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    l5(string7, string8, c4Var4, aVarW06, f50Var, u30VarL54);
                                    break;
                                case 19:
                                    String string9 = parcel.readString();
                                    fj.c(parcel);
                                    P4(string9);
                                    break;
                                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                                    String string10 = parcel.readString();
                                    String string11 = parcel.readString();
                                    k3.c4 c4Var5 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW07 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder5 = parcel.readStrongBinder();
                                    if (strongBinder5 != null) {
                                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        g50Var = iInterfaceQueryLocalInterface5 instanceof i50 ? (i50) iInterfaceQueryLocalInterface5 : new g50(strongBinder5);
                                    }
                                    i50 i50Var2 = g50Var;
                                    u30 u30VarL55 = t30.L5(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    h4(string10, string11, c4Var5, aVarW07, i50Var2, u30VarL55);
                                    break;
                                case 21:
                                    String string12 = parcel.readString();
                                    String string13 = parcel.readString();
                                    k3.c4 c4Var6 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW08 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder6 = parcel.readStrongBinder();
                                    if (strongBinder6 != null) {
                                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        x40Var = iInterfaceQueryLocalInterface6 instanceof z40 ? (z40) iInterfaceQueryLocalInterface6 : new x40(strongBinder6);
                                    }
                                    z40 z40Var2 = x40Var;
                                    u30 u30VarL56 = t30.L5(parcel.readStrongBinder());
                                    k3.h4 h4Var2 = (k3.h4) fj.a(parcel, k3.h4.CREATOR);
                                    fj.c(parcel);
                                    c5(string12, string13, c4Var6, aVarW08, z40Var2, u30VarL56, h4Var2);
                                    break;
                                case 22:
                                    String string14 = parcel.readString();
                                    String string15 = parcel.readString();
                                    k3.c4 c4Var7 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW09 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder7 = parcel.readStrongBinder();
                                    if (strongBinder7 != null) {
                                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        d50Var = iInterfaceQueryLocalInterface7 instanceof f50 ? (f50) iInterfaceQueryLocalInterface7 : new d50(strongBinder7);
                                    }
                                    f50 f50Var2 = d50Var;
                                    u30 u30VarL57 = t30.L5(parcel.readStrongBinder());
                                    eu euVar = (eu) fj.a(parcel, eu.CREATOR);
                                    fj.c(parcel);
                                    G2(string14, string15, c4Var7, aVarW09, f50Var2, u30VarL57, euVar);
                                    break;
                                case 23:
                                    String string16 = parcel.readString();
                                    String string17 = parcel.readString();
                                    k3.c4 c4Var8 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                                    l4.a aVarW010 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    IBinder strongBinder8 = parcel.readStrongBinder();
                                    if (strongBinder8 != null) {
                                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                        t40Var = iInterfaceQueryLocalInterface8 instanceof w40 ? (w40) iInterfaceQueryLocalInterface8 : new t40(strongBinder8);
                                    }
                                    w40 w40Var = t40Var;
                                    u30 u30VarL58 = t30.L5(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    m3(string16, string17, c4Var8, aVarW010, w40Var, u30VarL58);
                                    break;
                                case 24:
                                    l4.a aVarW011 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                                    fj.c(parcel);
                                    iH0 = k0(aVarW011);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iH0);
                                    break;
                                default:
                                    return false;
                            }
                        } else {
                            parcel.createStringArray();
                        }
                        fj.c(parcel);
                    } else {
                        k3.m2 m2VarC = c();
                        parcel2.writeNoException();
                        fj.f(parcel2, m2VarC);
                    }
                    return true;
                }
                z50VarE = h();
            }
            parcel2.writeNoException();
            fj.e(parcel2, z50VarE);
            return true;
        }
        l4.a aVarW012 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
        String string18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) fj.a(parcel, creator);
        Bundle bundle2 = (Bundle) fj.a(parcel, creator);
        k3.h4 h4Var3 = (k3.h4) fj.a(parcel, k3.h4.CREATOR);
        IBinder strongBinder9 = parcel.readStrongBinder();
        if (strongBinder9 != null) {
            IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            m50Var = iInterfaceQueryLocalInterface9 instanceof o50 ? (o50) iInterfaceQueryLocalInterface9 : new m50(strongBinder9);
        }
        o50 o50Var = m50Var;
        fj.c(parcel);
        n3(aVarW012, string18, bundle, bundle2, h4Var3, o50Var);
        parcel2.writeNoException();
        return true;
    }
}
