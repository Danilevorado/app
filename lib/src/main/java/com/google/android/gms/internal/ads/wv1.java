package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class wv1 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c90 f17278a;

    wv1(xv1 xv1Var, c90 c90Var) {
        this.f17278a = c90Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        try {
            this.f17278a.u0(m3.a0.h(th));
        } catch (RemoteException e5) {
            m3.n1.l("Ad service can't call client", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f17278a.l0((ParcelFileDescriptor) obj);
        } catch (RemoteException e5) {
            m3.n1.l("Ad service can't call client", e5);
        }
    }
}
