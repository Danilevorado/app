package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;
import l4.a;

/* loaded from: classes.dex */
public abstract class q30 extends ej implements r30 {
    public q30() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceM;
        Parcelable parcelableC;
        u30 s30Var = null;
        switch (i10) {
            case 1:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.h4 h4Var = (k3.h4) fj.a(parcel, k3.h4.CREATOR);
                k3.c4 c4Var = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface instanceof u30 ? (u30) iInterfaceQueryLocalInterface : new s30(strongBinder);
                }
                u30 u30Var = s30Var;
                fj.c(parcel);
                u1(aVarW0, h4Var, c4Var, string, u30Var);
                parcel2.writeNoException();
                return true;
            case 2:
                iInterfaceM = m();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 3:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.c4 c4Var2 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface2 instanceof u30 ? (u30) iInterfaceQueryLocalInterface2 : new s30(strongBinder2);
                }
                fj.c(parcel);
                T3(aVarW02, c4Var2, string2, s30Var);
                parcel2.writeNoException();
                return true;
            case 4:
                L();
                parcel2.writeNoException();
                return true;
            case 5:
                p();
                parcel2.writeNoException();
                return true;
            case 6:
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.h4 h4Var2 = (k3.h4) fj.a(parcel, k3.h4.CREATOR);
                k3.c4 c4Var3 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface3 instanceof u30 ? (u30) iInterfaceQueryLocalInterface3 : new s30(strongBinder3);
                }
                u30 u30Var2 = s30Var;
                fj.c(parcel);
                u3(aVarW03, h4Var2, c4Var3, string3, string4, u30Var2);
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.c4 c4Var4 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface4 instanceof u30 ? (u30) iInterfaceQueryLocalInterface4 : new s30(strongBinder4);
                }
                u30 u30Var3 = s30Var;
                fj.c(parcel);
                J5(aVarW04, c4Var4, string5, string6, u30Var3);
                parcel2.writeNoException();
                return true;
            case 8:
                E();
                parcel2.writeNoException();
                return true;
            case 9:
                z();
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.c4 c4Var5 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string7 = parcel.readString();
                ma0 ma0VarL5 = la0.L5(parcel.readStrongBinder());
                String string8 = parcel.readString();
                fj.c(parcel);
                B5(aVarW05, c4Var5, string7, ma0VarL5, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                k3.c4 c4Var6 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string9 = parcel.readString();
                fj.c(parcel);
                Y2(c4Var6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                g0();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zG = G();
                parcel2.writeNoException();
                int i12 = fj.f8294b;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 14:
                l4.a aVarW06 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.c4 c4Var7 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface5 instanceof u30 ? (u30) iInterfaceQueryLocalInterface5 : new s30(strongBinder5);
                }
                u30 u30Var4 = s30Var;
                eu euVar = (eu) fj.a(parcel, eu.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                fj.c(parcel);
                U3(aVarW06, c4Var7, string10, string11, u30Var4, euVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
            case 16:
                parcel2.writeNoException();
                fj.f(parcel2, null);
                return true;
            case 17:
                parcelableC = c();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableC);
                return true;
            case 18:
                parcelableC = e();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableC);
                return true;
            case 19:
                parcelableC = h();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableC);
                return true;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                k3.c4 c4Var8 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                fj.c(parcel);
                q1(c4Var8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                l4.a aVarW07 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                o4(aVarW07);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i13 = fj.f8294b;
                parcel2.writeInt(0);
                return true;
            case 23:
                l4.a aVarW08 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                ma0 ma0VarL52 = la0.L5(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                fj.c(parcel);
                t4(aVarW08, ma0VarL52, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                iInterfaceM = i();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 25:
                boolean zG2 = fj.g(parcel);
                fj.c(parcel);
                E2(zG2);
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceM = g();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 27:
                iInterfaceM = k();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 28:
                l4.a aVarW09 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.c4 c4Var9 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface6 instanceof u30 ? (u30) iInterfaceQueryLocalInterface6 : new s30(strongBinder6);
                }
                fj.c(parcel);
                A4(aVarW09, c4Var9, string14, s30Var);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                l4.a aVarW010 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                h5(aVarW010);
                parcel2.writeNoException();
                return true;
            case 31:
                l4.a aVarW011 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                yz yzVarL5 = xz.L5(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(c00.CREATOR);
                fj.c(parcel);
                N2(aVarW011, yzVarL5, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                l4.a aVarW012 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.c4 c4Var10 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface7 instanceof u30 ? (u30) iInterfaceQueryLocalInterface7 : new s30(strongBinder7);
                }
                fj.c(parcel);
                V0(aVarW012, c4Var10, string15, s30Var);
                parcel2.writeNoException();
                return true;
            case 33:
                parcelableC = l();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableC);
                return true;
            case 34:
                parcelableC = n();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableC);
                return true;
            case 35:
                l4.a aVarW013 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.h4 h4Var3 = (k3.h4) fj.a(parcel, k3.h4.CREATOR);
                k3.c4 c4Var11 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface8 instanceof u30 ? (u30) iInterfaceQueryLocalInterface8 : new s30(strongBinder8);
                }
                u30 u30Var5 = s30Var;
                fj.c(parcel);
                K4(aVarW013, h4Var3, c4Var11, string16, string17, u30Var5);
                parcel2.writeNoException();
                return true;
            case 36:
                iInterfaceM = j();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 37:
                l4.a aVarW014 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                z1(aVarW014);
                parcel2.writeNoException();
                return true;
            case 38:
                l4.a aVarW015 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                k3.c4 c4Var12 = (k3.c4) fj.a(parcel, k3.c4.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    s30Var = iInterfaceQueryLocalInterface9 instanceof u30 ? (u30) iInterfaceQueryLocalInterface9 : new s30(strongBinder9);
                }
                fj.c(parcel);
                G3(aVarW015, c4Var12, string18, s30Var);
                parcel2.writeNoException();
                return true;
            case 39:
                l4.a aVarW016 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                t3(aVarW016);
                parcel2.writeNoException();
                return true;
        }
    }
}
