package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class q84 {

    /* renamed from: a, reason: collision with root package name */
    private final p84 f14190a;

    /* renamed from: b, reason: collision with root package name */
    private final o84 f14191b;

    /* renamed from: c, reason: collision with root package name */
    private final hu1 f14192c;

    /* renamed from: d, reason: collision with root package name */
    private final h11 f14193d;

    /* renamed from: e, reason: collision with root package name */
    private int f14194e;

    /* renamed from: f, reason: collision with root package name */
    private Object f14195f;

    /* renamed from: g, reason: collision with root package name */
    private final Looper f14196g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14197h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14198i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14199j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14200k;

    public q84(o84 o84Var, p84 p84Var, h11 h11Var, int i10, hu1 hu1Var, Looper looper) {
        this.f14191b = o84Var;
        this.f14190a = p84Var;
        this.f14193d = h11Var;
        this.f14196g = looper;
        this.f14192c = hu1Var;
        this.f14197h = i10;
    }

    public final int a() {
        return this.f14194e;
    }

    public final Looper b() {
        return this.f14196g;
    }

    public final p84 c() {
        return this.f14190a;
    }

    public final q84 d() {
        gt1.f(!this.f14198i);
        this.f14198i = true;
        this.f14191b.a(this);
        return this;
    }

    public final q84 e(Object obj) {
        gt1.f(!this.f14198i);
        this.f14195f = obj;
        return this;
    }

    public final q84 f(int i10) {
        gt1.f(!this.f14198i);
        this.f14194e = i10;
        return this;
    }

    public final Object g() {
        return this.f14195f;
    }

    public final synchronized void h(boolean z10) {
        this.f14199j = z10 | this.f14199j;
        this.f14200k = true;
        notifyAll();
    }

    public final synchronized boolean i(long j10) {
        gt1.f(this.f14198i);
        gt1.f(this.f14196g.getThread() != Thread.currentThread());
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (!this.f14200k) {
            if (j10 <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j10);
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.f14199j;
    }

    public final synchronized boolean j() {
        return false;
    }
}
