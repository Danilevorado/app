package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class jv1 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f90 f10724a;

    jv1(nv1 nv1Var, f90 f90Var) {
        this.f10724a = f90Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        try {
            this.f10724a.u0(m3.a0.h(th));
        } catch (RemoteException e5) {
            m3.n1.l("Service can't call client", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f10724a.l0((ParcelFileDescriptor) obj);
        } catch (RemoteException e5) {
            m3.n1.l("Service can't call client", e5);
        }
    }
}
