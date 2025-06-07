package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j3 extends com.google.android.gms.internal.measurement.o0 implements x4.f {
    j3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // x4.f
    public final void A2(z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(20, parcelC);
    }

    @Override // x4.f
    public final List A5(String str, String str2, z9 z9Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        Parcel parcelW0 = w0(16, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelW0.createTypedArrayList(d.CREATOR);
        parcelW0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // x4.f
    public final void D1(z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(6, parcelC);
    }

    @Override // x4.f
    public final List L2(String str, String str2, boolean z10, z9 z9Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        com.google.android.gms.internal.measurement.q0.d(parcelC, z10);
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        Parcel parcelW0 = w0(14, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelW0.createTypedArrayList(q9.CREATOR);
        parcelW0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // x4.f
    public final String M2(z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        Parcel parcelW0 = w0(11, parcelC);
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // x4.f
    public final void Q1(Bundle bundle, z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, bundle);
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(19, parcelC);
    }

    @Override // x4.f
    public final List T1(String str, String str2, String str3, boolean z10) {
        Parcel parcelC = C();
        parcelC.writeString(null);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        com.google.android.gms.internal.measurement.q0.d(parcelC, z10);
        Parcel parcelW0 = w0(15, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelW0.createTypedArrayList(q9.CREATOR);
        parcelW0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // x4.f
    public final void b4(d dVar, z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, dVar);
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(12, parcelC);
    }

    @Override // x4.f
    public final void i1(long j10, String str, String str2, String str3) {
        Parcel parcelC = C();
        parcelC.writeLong(j10);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        L0(10, parcelC);
    }

    @Override // x4.f
    public final void i3(q9 q9Var, z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, q9Var);
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(2, parcelC);
    }

    @Override // x4.f
    public final void k5(v vVar, z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, vVar);
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(1, parcelC);
    }

    @Override // x4.f
    public final List p3(String str, String str2, String str3) {
        Parcel parcelC = C();
        parcelC.writeString(null);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        Parcel parcelW0 = w0(17, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelW0.createTypedArrayList(d.CREATOR);
        parcelW0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // x4.f
    public final byte[] q2(v vVar, String str) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, vVar);
        parcelC.writeString(str);
        Parcel parcelW0 = w0(9, parcelC);
        byte[] bArrCreateByteArray = parcelW0.createByteArray();
        parcelW0.recycle();
        return bArrCreateByteArray;
    }

    @Override // x4.f
    public final void v3(z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(18, parcelC);
    }

    @Override // x4.f
    public final void y5(z9 z9Var) {
        Parcel parcelC = C();
        com.google.android.gms.internal.measurement.q0.e(parcelC, z9Var);
        L0(4, parcelC);
    }
}
