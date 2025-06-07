package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d1 extends o0 implements f1 {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeLong(j10);
        L0(23, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        q0.e(parcelC, bundle);
        L0(9, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeLong(j10);
        L0(24, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void generateEventId(i1 i1Var) {
        Parcel parcelC = C();
        q0.f(parcelC, i1Var);
        L0(22, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCachedAppInstanceId(i1 i1Var) {
        Parcel parcelC = C();
        q0.f(parcelC, i1Var);
        L0(19, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getConditionalUserProperties(String str, String str2, i1 i1Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        q0.f(parcelC, i1Var);
        L0(10, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCurrentScreenClass(i1 i1Var) {
        Parcel parcelC = C();
        q0.f(parcelC, i1Var);
        L0(17, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCurrentScreenName(i1 i1Var) {
        Parcel parcelC = C();
        q0.f(parcelC, i1Var);
        L0(16, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getGmpAppId(i1 i1Var) {
        Parcel parcelC = C();
        q0.f(parcelC, i1Var);
        L0(21, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getMaxUserProperties(String str, i1 i1Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        q0.f(parcelC, i1Var);
        L0(6, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getUserProperties(String str, String str2, boolean z10, i1 i1Var) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        q0.d(parcelC, z10);
        q0.f(parcelC, i1Var);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void initialize(l4.a aVar, n1 n1Var, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        q0.e(parcelC, n1Var);
        parcelC.writeLong(j10);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        q0.e(parcelC, bundle);
        q0.d(parcelC, z10);
        q0.d(parcelC, z11);
        parcelC.writeLong(j10);
        L0(2, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void logHealthData(int i10, String str, l4.a aVar, l4.a aVar2, l4.a aVar3) {
        Parcel parcelC = C();
        parcelC.writeInt(5);
        parcelC.writeString(str);
        q0.f(parcelC, aVar);
        q0.f(parcelC, aVar2);
        q0.f(parcelC, aVar3);
        L0(33, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityCreated(l4.a aVar, Bundle bundle, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        q0.e(parcelC, bundle);
        parcelC.writeLong(j10);
        L0(27, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityDestroyed(l4.a aVar, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        parcelC.writeLong(j10);
        L0(28, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityPaused(l4.a aVar, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        parcelC.writeLong(j10);
        L0(29, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityResumed(l4.a aVar, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        parcelC.writeLong(j10);
        L0(30, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivitySaveInstanceState(l4.a aVar, i1 i1Var, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        q0.f(parcelC, i1Var);
        parcelC.writeLong(j10);
        L0(31, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityStarted(l4.a aVar, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        parcelC.writeLong(j10);
        L0(25, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityStopped(l4.a aVar, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        parcelC.writeLong(j10);
        L0(26, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void performAction(Bundle bundle, i1 i1Var, long j10) {
        Parcel parcelC = C();
        q0.e(parcelC, bundle);
        q0.f(parcelC, i1Var);
        parcelC.writeLong(j10);
        L0(32, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelC = C();
        q0.e(parcelC, bundle);
        parcelC.writeLong(j10);
        L0(8, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setConsent(Bundle bundle, long j10) {
        Parcel parcelC = C();
        q0.e(parcelC, bundle);
        parcelC.writeLong(j10);
        L0(44, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setCurrentScreen(l4.a aVar, String str, String str2, long j10) {
        Parcel parcelC = C();
        q0.f(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeLong(j10);
        L0(15, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelC = C();
        q0.d(parcelC, z10);
        L0(39, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setUserProperty(String str, String str2, l4.a aVar, boolean z10, long j10) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        q0.f(parcelC, aVar);
        q0.d(parcelC, z10);
        parcelC.writeLong(j10);
        L0(4, parcelC);
    }
}
