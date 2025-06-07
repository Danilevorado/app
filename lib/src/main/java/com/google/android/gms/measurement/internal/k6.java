package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class k6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f20126m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f20127n;

    k6(v6 v6Var, AtomicReference atomicReference) {
        this.f20127n = v6Var;
        this.f20126m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20126m) {
            try {
                this.f20126m.set(this.f20127n.f20269a.y().v(this.f20127n.f20269a.A().q(), i3.M));
            } finally {
                this.f20126m.notify();
            }
        }
    }
}
