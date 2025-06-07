package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import l4.a;

/* loaded from: classes.dex */
public final class b40 extends dj implements d40 {
    b40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void A() {
        L0(19, C());
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String B() {
        Parcel parcelW0 = w0(10, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void D2(l4.a aVar, l4.a aVar2, l4.a aVar3) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, aVar2);
        fj.f(parcelC, aVar3);
        L0(21, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final boolean F() {
        Parcel parcelW0 = w0(18, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void H3(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(20, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void I4(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(22, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final boolean O() {
        Parcel parcelW0 = w0(17, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final double c() {
        Parcel parcelW0 = w0(8, C());
        double d10 = parcelW0.readDouble();
        parcelW0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final float e() {
        Parcel parcelW0 = w0(23, C());
        float f5 = parcelW0.readFloat();
        parcelW0.recycle();
        return f5;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final float g() {
        Parcel parcelW0 = w0(24, C());
        float f5 = parcelW0.readFloat();
        parcelW0.recycle();
        return f5;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final float h() {
        Parcel parcelW0 = w0(25, C());
        float f5 = parcelW0.readFloat();
        parcelW0.recycle();
        return f5;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final Bundle i() {
        Parcel parcelW0 = w0(16, C());
        Bundle bundle = (Bundle) fj.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final k3.m2 j() {
        Parcel parcelW0 = w0(11, C());
        k3.m2 m2VarL5 = k3.l2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return m2VarL5;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final ju k() {
        Parcel parcelW0 = w0(12, C());
        ju juVarL5 = iu.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return juVarL5;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final qu l() {
        Parcel parcelW0 = w0(5, C());
        qu quVarL5 = pu.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return quVarL5;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final l4.a m() {
        Parcel parcelW0 = w0(14, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final l4.a n() {
        Parcel parcelW0 = w0(13, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String o() {
        Parcel parcelW0 = w0(7, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final l4.a p() {
        Parcel parcelW0 = w0(15, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String q() {
        Parcel parcelW0 = w0(4, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String r() {
        Parcel parcelW0 = w0(6, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String t() {
        Parcel parcelW0 = w0(2, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String u() {
        Parcel parcelW0 = w0(9, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final List v() {
        Parcel parcelW0 = w0(3, C());
        ArrayList arrayListB = fj.b(parcelW0);
        parcelW0.recycle();
        return arrayListB;
    }
}
