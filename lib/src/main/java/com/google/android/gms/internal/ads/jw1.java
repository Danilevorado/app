package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jw1 {

    /* renamed from: a, reason: collision with root package name */
    private final hu1 f10728a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10729b;

    public jw1(hu1 hu1Var) {
        this.f10728a = hu1Var;
    }

    public final synchronized void a() {
        while (!this.f10729b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f10729b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z10;
        z10 = this.f10729b;
        this.f10729b = false;
        return z10;
    }

    public final synchronized boolean d() {
        return this.f10729b;
    }

    public final synchronized boolean e() {
        if (this.f10729b) {
            return false;
        }
        this.f10729b = true;
        notifyAll();
        return true;
    }
}
