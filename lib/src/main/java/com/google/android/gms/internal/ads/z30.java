package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import l4.a;

/* loaded from: classes.dex */
public final class z30 extends dj {
    z30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final void B() {
        L0(10, C());
    }

    public final void H3(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(16, parcelC);
    }

    public final qu K5() {
        Parcel parcelW0 = w0(5, C());
        qu quVarL5 = pu.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return quVarL5;
    }

    public final l4.a L5() {
        Parcel parcelW0 = w0(18, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    public final l4.a M5() {
        Parcel parcelW0 = w0(20, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    public final List N5() {
        Parcel parcelW0 = w0(3, C());
        ArrayList arrayListB = fj.b(parcelW0);
        parcelW0.recycle();
        return arrayListB;
    }

    public final void O5(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(11, parcelC);
    }

    public final void P5(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(12, parcelC);
    }

    public final void Q5(l4.a aVar, l4.a aVar2, l4.a aVar3) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, aVar2);
        fj.f(parcelC, aVar3);
        L0(22, parcelC);
    }

    public final boolean R5() {
        Parcel parcelW0 = w0(14, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    public final boolean S5() {
        Parcel parcelW0 = w0(13, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    public final double c() {
        Parcel parcelW0 = w0(7, C());
        double d10 = parcelW0.readDouble();
        parcelW0.recycle();
        return d10;
    }

    public final Bundle e() {
        Parcel parcelW0 = w0(15, C());
        Bundle bundle = (Bundle) fj.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle;
    }

    public final l4.a l() {
        Parcel parcelW0 = w0(21, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    public final String m() {
        Parcel parcelW0 = w0(6, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    public final String n() {
        Parcel parcelW0 = w0(4, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    public final String o() {
        Parcel parcelW0 = w0(9, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    public final String p() {
        Parcel parcelW0 = w0(2, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    public final String q() {
        Parcel parcelW0 = w0(8, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    public final k3.m2 w3() {
        Parcel parcelW0 = w0(17, C());
        k3.m2 m2VarL5 = k3.l2.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return m2VarL5;
    }

    public final ju x4() {
        Parcel parcelW0 = w0(19, C());
        ju juVarL5 = iu.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return juVarL5;
    }
}
