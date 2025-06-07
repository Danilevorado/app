package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import l4.a;

/* loaded from: classes.dex */
public final class kw extends dj implements mw {
    kw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String B() {
        Parcel parcelW0 = w0(9, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final double c() {
        Parcel parcelW0 = w0(8, C());
        double d10 = parcelW0.readDouble();
        parcelW0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final k3.m2 g() {
        Parcel parcelW0 = w0(11, C());
        k3.m2 m2VarL5 = k3.l2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return m2VarL5;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final k3.j2 h() {
        Parcel parcelW0 = w0(31, C());
        k3.j2 j2VarL5 = k3.i2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return j2VarL5;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final ju i() {
        ju huVar;
        Parcel parcelW0 = w0(14, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            huVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            huVar = iInterfaceQueryLocalInterface instanceof ju ? (ju) iInterfaceQueryLocalInterface : new hu(strongBinder);
        }
        parcelW0.recycle();
        return huVar;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final qu k() {
        qu ouVar;
        Parcel parcelW0 = w0(5, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            ouVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            ouVar = iInterfaceQueryLocalInterface instanceof qu ? (qu) iInterfaceQueryLocalInterface : new ou(strongBinder);
        }
        parcelW0.recycle();
        return ouVar;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final l4.a l() {
        Parcel parcelW0 = w0(19, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String m() {
        Parcel parcelW0 = w0(7, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final l4.a n() {
        Parcel parcelW0 = w0(18, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String o() {
        Parcel parcelW0 = w0(6, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String p() {
        Parcel parcelW0 = w0(4, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String q() {
        Parcel parcelW0 = w0(2, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String t() {
        Parcel parcelW0 = w0(10, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final List u() {
        Parcel parcelW0 = w0(3, C());
        ArrayList arrayListB = fj.b(parcelW0);
        parcelW0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final List v() {
        Parcel parcelW0 = w0(23, C());
        ArrayList arrayListB = fj.b(parcelW0);
        parcelW0.recycle();
        return arrayListB;
    }
}
