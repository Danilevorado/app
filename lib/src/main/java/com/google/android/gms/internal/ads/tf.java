package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class tf implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ uf f15811m;

    tf(uf ufVar) {
        this.f15811m = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15811m.f16320z) {
            if (this.f15811m.A) {
                return;
            }
            this.f15811m.A = true;
            try {
                uf.n(this.f15811m);
            } catch (Exception e5) {
                this.f15811m.f16312r.c(2023, -1L, e5);
            }
            synchronized (this.f15811m.f16320z) {
                this.f15811m.A = false;
            }
        }
    }
}
