package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class s50 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c50 f15110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u30 f15111b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y50 f15112c;

    s50(y50 y50Var, c50 c50Var, u30 u30Var) {
        this.f15112c = y50Var;
        this.f15110a = c50Var;
        this.f15111b = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            this.f15110a.y(aVar.d());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
