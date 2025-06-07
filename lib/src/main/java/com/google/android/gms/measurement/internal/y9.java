package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class y9 implements x4.u {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.k1 f20594a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f20595b;

    y9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.k1 k1Var) {
        this.f20595b = appMeasurementDynamiteService;
        this.f20594a = k1Var;
    }

    @Override // x4.u
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f20594a.t1(str, str2, bundle, j10);
        } catch (RemoteException e5) {
            w4 w4Var = this.f20595b.f19734m;
            if (w4Var != null) {
                w4Var.b().u().b("Event listener threw exception", e5);
            }
        }
    }
}
