package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class o6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f20247m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f20248n;

    o6(v6 v6Var, AtomicReference atomicReference) {
        this.f20248n = v6Var;
        this.f20247m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20247m) {
            try {
                this.f20247m.set(Double.valueOf(this.f20248n.f20269a.y().i(this.f20248n.f20269a.A().q(), i3.P)));
            } finally {
                this.f20247m.notify();
            }
        }
    }
}
