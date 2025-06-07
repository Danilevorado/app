package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import l4.a;

/* loaded from: classes.dex */
public final class p30 extends dj implements r30 {
    p30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void A4(l4.a aVar, k3.c4 c4Var, String str, u30 u30Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        fj.f(parcelC, u30Var);
        L0(28, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void B5(l4.a aVar, k3.c4 c4Var, String str, ma0 ma0Var, String str2) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, c4Var);
        parcelC.writeString(null);
        fj.f(parcelC, ma0Var);
        parcelC.writeString(str2);
        L0(10, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void E() {
        L0(8, C());
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void E2(boolean z10) {
        Parcel parcelC = C();
        int i10 = fj.f8294b;
        parcelC.writeInt(z10 ? 1 : 0);
        L0(25, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final boolean G() {
        Parcel parcelW0 = w0(13, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void G3(l4.a aVar, k3.c4 c4Var, String str, u30 u30Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        fj.f(parcelC, u30Var);
        L0(38, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final z30 I() {
        z30 z30Var;
        Parcel parcelW0 = w0(15, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            z30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            z30Var = iInterfaceQueryLocalInterface instanceof z30 ? (z30) iInterfaceQueryLocalInterface : new z30(strongBinder);
        }
        parcelW0.recycle();
        return z30Var;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void J5(l4.a aVar, k3.c4 c4Var, String str, String str2, u30 u30Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.f(parcelC, u30Var);
        L0(7, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void K4(l4.a aVar, k3.h4 h4Var, k3.c4 c4Var, String str, String str2, u30 u30Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, h4Var);
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.f(parcelC, u30Var);
        L0(35, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void L() {
        L0(4, C());
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void N2(l4.a aVar, yz yzVar, List list) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, yzVar);
        parcelC.writeTypedList(list);
        L0(31, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final a40 S() {
        a40 a40Var;
        Parcel parcelW0 = w0(16, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            a40Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            a40Var = iInterfaceQueryLocalInterface instanceof a40 ? (a40) iInterfaceQueryLocalInterface : new a40(strongBinder);
        }
        parcelW0.recycle();
        return a40Var;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void U3(l4.a aVar, k3.c4 c4Var, String str, String str2, u30 u30Var, eu euVar, List list) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.f(parcelC, u30Var);
        fj.d(parcelC, euVar);
        parcelC.writeStringList(list);
        L0(14, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final boolean V() {
        Parcel parcelW0 = w0(22, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void V0(l4.a aVar, k3.c4 c4Var, String str, u30 u30Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        fj.f(parcelC, u30Var);
        L0(32, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void Y2(k3.c4 c4Var, String str) {
        Parcel parcelC = C();
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        L0(11, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final k3.m2 g() {
        Parcel parcelW0 = w0(26, C());
        k3.m2 m2VarL5 = k3.l2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return m2VarL5;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void g0() {
        L0(12, C());
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void h5(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(30, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final y30 j() {
        y30 w30Var;
        Parcel parcelW0 = w0(36, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            w30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            w30Var = iInterfaceQueryLocalInterface instanceof y30 ? (y30) iInterfaceQueryLocalInterface : new w30(strongBinder);
        }
        parcelW0.recycle();
        return w30Var;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final d40 k() {
        d40 b40Var;
        Parcel parcelW0 = w0(27, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            b40Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            b40Var = iInterfaceQueryLocalInterface instanceof d40 ? (d40) iInterfaceQueryLocalInterface : new b40(strongBinder);
        }
        parcelW0.recycle();
        return b40Var;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final z50 l() {
        Parcel parcelW0 = w0(33, C());
        z50 z50Var = (z50) fj.a(parcelW0, z50.CREATOR);
        parcelW0.recycle();
        return z50Var;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final l4.a m() {
        Parcel parcelW0 = w0(2, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final z50 n() {
        Parcel parcelW0 = w0(34, C());
        z50 z50Var = (z50) fj.a(parcelW0, z50.CREATOR);
        parcelW0.recycle();
        return z50Var;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void o4(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(21, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void p() {
        L0(5, C());
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void t3(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(39, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void t4(l4.a aVar, ma0 ma0Var, List list) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, ma0Var);
        parcelC.writeStringList(list);
        L0(23, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void u3(l4.a aVar, k3.h4 h4Var, k3.c4 c4Var, String str, String str2, u30 u30Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, h4Var);
        fj.d(parcelC, c4Var);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.f(parcelC, u30Var);
        L0(6, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void z() {
        L0(9, C());
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void z1(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(37, parcelC);
    }
}
