package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class c0 extends d4.t {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f5668a;

    c0(d0 d0Var) {
        this.f5668a = new WeakReference(d0Var);
    }

    @Override // d4.t
    public final void a() {
        d0 d0Var = (d0) this.f5668a.get();
        if (d0Var == null) {
            return;
        }
        d0.p(d0Var);
    }
}
