package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ra {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f14704a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f14705b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f14706c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f14707d;

    /* renamed from: e, reason: collision with root package name */
    private final x9 f14708e;

    /* renamed from: f, reason: collision with root package name */
    private final ga f14709f;

    /* renamed from: g, reason: collision with root package name */
    private final ha[] f14710g;

    /* renamed from: h, reason: collision with root package name */
    private z9 f14711h;

    /* renamed from: i, reason: collision with root package name */
    private final List f14712i;

    /* renamed from: j, reason: collision with root package name */
    private final List f14713j;

    /* renamed from: k, reason: collision with root package name */
    private final ea f14714k;

    public ra(x9 x9Var, ga gaVar, int i10) {
        ea eaVar = new ea(new Handler(Looper.getMainLooper()));
        this.f14704a = new AtomicInteger();
        this.f14705b = new HashSet();
        this.f14706c = new PriorityBlockingQueue();
        this.f14707d = new PriorityBlockingQueue();
        this.f14712i = new ArrayList();
        this.f14713j = new ArrayList();
        this.f14708e = x9Var;
        this.f14709f = gaVar;
        this.f14710g = new ha[4];
        this.f14714k = eaVar;
    }

    public final oa a(oa oaVar) {
        oaVar.k(this);
        synchronized (this.f14705b) {
            this.f14705b.add(oaVar);
        }
        oaVar.l(this.f14704a.incrementAndGet());
        oaVar.r("add-to-queue");
        c(oaVar, 0);
        this.f14706c.add(oaVar);
        return oaVar;
    }

    final void b(oa oaVar) {
        synchronized (this.f14705b) {
            this.f14705b.remove(oaVar);
        }
        synchronized (this.f14712i) {
            Iterator it = this.f14712i.iterator();
            while (it.hasNext()) {
                ((qa) it.next()).a();
            }
        }
        c(oaVar, 5);
    }

    final void c(oa oaVar, int i10) {
        synchronized (this.f14713j) {
            Iterator it = this.f14713j.iterator();
            while (it.hasNext()) {
                ((pa) it.next()).a();
            }
        }
    }

    public final void d() {
        z9 z9Var = this.f14711h;
        if (z9Var != null) {
            z9Var.b();
        }
        ha[] haVarArr = this.f14710g;
        for (int i10 = 0; i10 < 4; i10++) {
            ha haVar = haVarArr[i10];
            if (haVar != null) {
                haVar.a();
            }
        }
        z9 z9Var2 = new z9(this.f14706c, this.f14707d, this.f14708e, this.f14714k);
        this.f14711h = z9Var2;
        z9Var2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            ha haVar2 = new ha(this.f14707d, this.f14709f, this.f14708e, this.f14714k);
            this.f14710g[i11] = haVar2;
            haVar2.start();
        }
    }
}
