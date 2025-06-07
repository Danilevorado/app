package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class l6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f20157m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f20158n;

    l6(v6 v6Var, AtomicReference atomicReference) {
        this.f20158n = v6Var;
        this.f20157m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20157m) {
            try {
                this.f20157m.set(Long.valueOf(this.f20158n.f20269a.y().p(this.f20158n.f20269a.A().q(), i3.N)));
            } finally {
                this.f20157m.notify();
            }
        }
    }
}
