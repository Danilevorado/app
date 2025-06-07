package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ik1 implements g21 {

    /* renamed from: m, reason: collision with root package name */
    private final nk0 f9776m;

    ik1(nk0 nk0Var) {
        this.f9776m = nk0Var;
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void d(Context context) {
        nk0 nk0Var = this.f9776m;
        if (nk0Var != null) {
            nk0Var.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void e(Context context) {
        nk0 nk0Var = this.f9776m;
        if (nk0Var != null) {
            nk0Var.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void o(Context context) {
        nk0 nk0Var = this.f9776m;
        if (nk0Var != null) {
            nk0Var.onPause();
        }
    }
}
