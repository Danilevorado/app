package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class h6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f19974m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f19975n;

    h6(v6 v6Var, AtomicReference atomicReference) {
        this.f19975n = v6Var;
        this.f19974m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f19974m) {
            try {
                this.f19974m.set(Boolean.valueOf(this.f19975n.f20269a.y().A(this.f19975n.f20269a.A().q(), i3.L)));
            } finally {
                this.f19974m.notify();
            }
        }
    }
}
