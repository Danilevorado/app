package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ax1 {

    /* renamed from: a, reason: collision with root package name */
    private final ww1 f6277a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f6278b;

    public ax1(ww1 ww1Var, bb3 bb3Var) {
        this.f6277a = ww1Var;
        this.f6278b = bb3Var;
    }

    public final void a(nr2 nr2Var) {
        bb3 bb3Var = this.f6278b;
        final ww1 ww1Var = this.f6277a;
        qa3.q(bb3Var.g(new Callable() { // from class: com.google.android.gms.internal.ads.yw1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ww1Var.getWritableDatabase();
            }
        }), new zw1(this, nr2Var), this.f6278b);
    }
}
