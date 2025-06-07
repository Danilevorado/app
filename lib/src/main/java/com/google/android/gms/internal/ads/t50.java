package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class t50 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f50 f15694a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u30 f15695b;

    t50(y50 y50Var, f50 f50Var, u30 u30Var) {
        this.f15694a = f50Var;
        this.f15695b = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            this.f15694a.y(aVar.d());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
