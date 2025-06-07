package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ex1 {

    /* renamed from: a, reason: collision with root package name */
    private long f8023a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f8024b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f8025c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f8026d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f8027e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f8028f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f8029g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f8030h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Object f8031i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final Object f8032j = new Object();

    public final int a() {
        int i10;
        synchronized (this.f8029g) {
            i10 = this.f8024b;
        }
        return i10;
    }

    public final synchronized long b() {
        long j10;
        synchronized (this.f8032j) {
            j10 = this.f8027e;
        }
        return j10;
    }

    public final synchronized long c() {
        long j10;
        synchronized (this.f8031i) {
            j10 = this.f8026d;
        }
        return j10;
    }

    public final synchronized long d() {
        long j10;
        synchronized (this.f8028f) {
            j10 = this.f8023a;
        }
        return j10;
    }

    public final long e() {
        long j10;
        synchronized (this.f8030h) {
            j10 = this.f8025c;
        }
        return j10;
    }

    public final synchronized void f(long j10) {
        synchronized (this.f8032j) {
            this.f8027e = j10;
        }
    }

    public final synchronized void g(long j10) {
        synchronized (this.f8031i) {
            this.f8026d = j10;
        }
    }

    public final synchronized void h(long j10) {
        synchronized (this.f8028f) {
            this.f8023a = j10;
        }
    }

    public final void i(int i10) {
        synchronized (this.f8029g) {
            this.f8024b = i10;
        }
    }

    public final void j(long j10) {
        synchronized (this.f8030h) {
            this.f8025c = j10;
        }
    }
}
