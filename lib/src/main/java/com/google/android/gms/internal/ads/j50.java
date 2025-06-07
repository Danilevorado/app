package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j50 extends dj implements l50 {
    j50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void G2(String str, String str2, k3.c4 c4Var, l4.a aVar, f50 f50Var, u30 u30Var, eu euVar) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, f50Var);
        fj.f(parcelC, u30Var);
        fj.d(parcelC, euVar);
        L0(22, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final boolean H0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(15, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void M3(String str, String str2, k3.c4 c4Var, l4.a aVar, z40 z40Var, u30 u30Var, k3.h4 h4Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, z40Var);
        fj.f(parcelC, u30Var);
        fj.d(parcelC, h4Var);
        L0(13, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void P4(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        L0(19, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void S4(String str, String str2, k3.c4 c4Var, l4.a aVar, c50 c50Var, u30 u30Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, c50Var);
        fj.f(parcelC, u30Var);
        L0(14, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void Z2(String str, String str2, k3.c4 c4Var, l4.a aVar, i50 i50Var, u30 u30Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, i50Var);
        fj.f(parcelC, u30Var);
        L0(16, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final k3.m2 c() {
        Parcel parcelW0 = w0(5, C());
        k3.m2 m2VarL5 = k3.l2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return m2VarL5;
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void c5(String str, String str2, k3.c4 c4Var, l4.a aVar, z40 z40Var, u30 u30Var, k3.h4 h4Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, z40Var);
        fj.f(parcelC, u30Var);
        fj.d(parcelC, h4Var);
        L0(21, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final z50 e() {
        Parcel parcelW0 = w0(2, C());
        z50 z50Var = (z50) fj.a(parcelW0, z50.CREATOR);
        parcelW0.recycle();
        return z50Var;
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final z50 h() {
        Parcel parcelW0 = w0(3, C());
        z50 z50Var = (z50) fj.a(parcelW0, z50.CREATOR);
        parcelW0.recycle();
        return z50Var;
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void h4(String str, String str2, k3.c4 c4Var, l4.a aVar, i50 i50Var, u30 u30Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, i50Var);
        fj.f(parcelC, u30Var);
        L0(20, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final boolean k0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(24, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void l5(String str, String str2, k3.c4 c4Var, l4.a aVar, f50 f50Var, u30 u30Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, f50Var);
        fj.f(parcelC, u30Var);
        L0(18, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void m3(String str, String str2, k3.c4 c4Var, l4.a aVar, w40 w40Var, u30 u30Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        fj.d(parcelC, c4Var);
        fj.f(parcelC, aVar);
        fj.f(parcelC, w40Var);
        fj.f(parcelC, u30Var);
        L0(23, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void n3(l4.a aVar, String str, Bundle bundle, Bundle bundle2, k3.h4 h4Var, o50 o50Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString(str);
        fj.d(parcelC, bundle);
        fj.d(parcelC, bundle2);
        fj.d(parcelC, h4Var);
        fj.f(parcelC, o50Var);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final boolean q3(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(17, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }
}
