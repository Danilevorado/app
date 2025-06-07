package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class d implements b1.q {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f4133a = androidx.core.os.h.a(Looper.getMainLooper());

    @Override // b1.q
    public void a(long j10, Runnable runnable) {
        this.f4133a.postDelayed(runnable, j10);
    }

    @Override // b1.q
    public void b(Runnable runnable) {
        this.f4133a.removeCallbacks(runnable);
    }
}
