package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class x92 {

    /* renamed from: a, reason: collision with root package name */
    private final hu1 f17484a;

    /* renamed from: b, reason: collision with root package name */
    private final r32 f17485b;

    /* renamed from: c, reason: collision with root package name */
    private final v72 f17486c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f17487d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f17488e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f17489f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f17490g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17491h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17492i;

    public x92(Looper looper, hu1 hu1Var, v72 v72Var) {
        this(new CopyOnWriteArraySet(), looper, hu1Var, v72Var);
    }

    private x92(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, hu1 hu1Var, v72 v72Var) {
        this.f17484a = hu1Var;
        this.f17487d = copyOnWriteArraySet;
        this.f17486c = v72Var;
        this.f17490g = new Object();
        this.f17488e = new ArrayDeque();
        this.f17489f = new ArrayDeque();
        this.f17485b = hu1Var.b(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.s42
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                x92.g(this.f15082m, message);
                return true;
            }
        });
        this.f17492i = true;
    }

    public static /* synthetic */ boolean g(x92 x92Var, Message message) {
        Iterator it = x92Var.f17487d.iterator();
        while (it.hasNext()) {
            ((w82) it.next()).b(x92Var.f17486c);
            if (x92Var.f17485b.w(0)) {
                return true;
            }
        }
        return true;
    }

    private final void h() {
        if (this.f17492i) {
            gt1.f(Thread.currentThread() == this.f17485b.a().getThread());
        }
    }

    public final x92 a(Looper looper, v72 v72Var) {
        return new x92(this.f17487d, looper, this.f17484a, v72Var);
    }

    public final void b(Object obj) {
        synchronized (this.f17490g) {
            if (this.f17491h) {
                return;
            }
            this.f17487d.add(new w82(obj));
        }
    }

    public final void c() {
        h();
        if (this.f17489f.isEmpty()) {
            return;
        }
        if (!this.f17485b.w(0)) {
            r32 r32Var = this.f17485b;
            r32Var.D(r32Var.K(0));
        }
        boolean z10 = !this.f17488e.isEmpty();
        this.f17488e.addAll(this.f17489f);
        this.f17489f.clear();
        if (z10) {
            return;
        }
        while (!this.f17488e.isEmpty()) {
            ((Runnable) this.f17488e.peekFirst()).run();
            this.f17488e.removeFirst();
        }
    }

    public final void d(final int i10, final u62 u62Var) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f17487d);
        this.f17489f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.t52
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i11 = i10;
                u62 u62Var2 = u62Var;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((w82) it.next()).a(i11, u62Var2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.f17490g) {
            this.f17491h = true;
        }
        Iterator it = this.f17487d.iterator();
        while (it.hasNext()) {
            ((w82) it.next()).c(this.f17486c);
        }
        this.f17487d.clear();
    }

    public final void f(Object obj) {
        h();
        Iterator it = this.f17487d.iterator();
        while (it.hasNext()) {
            w82 w82Var = (w82) it.next();
            if (w82Var.f17017a.equals(obj)) {
                w82Var.c(this.f17486c);
                this.f17487d.remove(w82Var);
            }
        }
    }
}
