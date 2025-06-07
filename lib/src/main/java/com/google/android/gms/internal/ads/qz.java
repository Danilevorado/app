package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import e4.c;

/* loaded from: classes.dex */
final class qz implements c.a {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ tf0 f14552m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ sz f14553n;

    qz(sz szVar, tf0 tf0Var) {
        this.f14553n = szVar;
        this.f14552m = tf0Var;
    }

    @Override // e4.c.a
    public final void C(int i10) {
        this.f14552m.f(new RuntimeException("onConnectionSuspended: " + i10));
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        try {
            this.f14552m.e(this.f14553n.f15604a.n0());
        } catch (DeadObjectException e5) {
            this.f14552m.f(e5);
        }
    }
}
