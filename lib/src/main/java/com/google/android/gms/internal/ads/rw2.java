package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rw2 {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f14997a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f14998b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f14999c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private qw2 f15000d = null;

    public rw2() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f14997a = linkedBlockingQueue;
        this.f14998b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        qw2 qw2Var = (qw2) this.f14999c.poll();
        this.f15000d = qw2Var;
        if (qw2Var != null) {
            qw2Var.executeOnExecutor(this.f14998b, new Object[0]);
        }
    }

    public final void a(qw2 qw2Var) {
        this.f15000d = null;
        c();
    }

    public final void b(qw2 qw2Var) {
        qw2Var.b(this);
        this.f14999c.add(qw2Var);
        if (this.f15000d == null) {
            c();
        }
    }
}
