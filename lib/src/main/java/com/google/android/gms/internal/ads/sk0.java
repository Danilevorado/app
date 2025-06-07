package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class sk0 implements View.OnAttachStateChangeListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ zb0 f15301m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ vk0 f15302n;

    sk0(vk0 vk0Var, zb0 zb0Var) {
        this.f15302n = vk0Var;
        this.f15301m = zb0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15302n.u(view, this.f15301m, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
