package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class x50 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i50 f17413a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u30 f17414b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y50 f17415c;

    x50(y50 y50Var, i50 i50Var, u30 u30Var) {
        this.f17415c = y50Var;
        this.f17413a = i50Var;
        this.f17414b = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            this.f17413a.y(aVar.d());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
