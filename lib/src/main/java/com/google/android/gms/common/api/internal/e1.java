package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class e1 extends d4.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f5703a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f1 f5704b;

    e1(f1 f1Var, Dialog dialog) {
        this.f5704b = f1Var;
        this.f5703a = dialog;
    }

    @Override // d4.t
    public final void a() {
        this.f5704b.f5714n.o();
        if (this.f5703a.isShowing()) {
            this.f5703a.dismiss();
        }
    }
}
