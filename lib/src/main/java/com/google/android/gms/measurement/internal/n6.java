package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class n6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f20203m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f20204n;

    n6(v6 v6Var, AtomicReference atomicReference) {
        this.f20204n = v6Var;
        this.f20203m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20203m) {
            try {
                this.f20203m.set(Integer.valueOf(this.f20204n.f20269a.y().m(this.f20204n.f20269a.A().q(), i3.O)));
            } finally {
                this.f20203m.notify();
            }
        }
    }
}
