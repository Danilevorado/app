package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
abstract class x implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ y f5823m;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        this.f5823m.f5826b.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e5) {
                this.f5823m.f5825a.l(e5);
            }
        } finally {
            this.f5823m.f5826b.unlock();
        }
    }
}
