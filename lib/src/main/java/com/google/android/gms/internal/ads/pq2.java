package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class pq2 {

    /* renamed from: a, reason: collision with root package name */
    private final sp2 f14022a;

    /* renamed from: b, reason: collision with root package name */
    private final mq2 f14023b;

    /* renamed from: c, reason: collision with root package name */
    private final op2 f14024c;

    /* renamed from: e, reason: collision with root package name */
    private vq2 f14026e;

    /* renamed from: f, reason: collision with root package name */
    private int f14027f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f14025d = new ArrayDeque();

    public pq2(sp2 sp2Var, op2 op2Var, mq2 mq2Var) {
        this.f14022a = sp2Var;
        this.f14024c = op2Var;
        this.f14023b = mq2Var;
        op2Var.b(new jq2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((Boolean) k3.w.c().b(ir.W5)).booleanValue() && !j3.t.q().h().g().h()) {
            this.f14025d.clear();
            return;
        }
        if (i()) {
            while (!this.f14025d.isEmpty()) {
                nq2 nq2Var = (nq2) this.f14025d.pollFirst();
                if (nq2Var == null || (nq2Var.a() != null && this.f14022a.b(nq2Var.a()))) {
                    vq2 vq2Var = new vq2(this.f14022a, this.f14023b, nq2Var);
                    this.f14026e = vq2Var;
                    vq2Var.d(new kq2(this, nq2Var));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f14026e == null;
    }

    public final synchronized ab3 a(nq2 nq2Var) {
        this.f14027f = 2;
        if (i()) {
            return null;
        }
        return this.f14026e.a(nq2Var);
    }

    public final synchronized void e(nq2 nq2Var) {
        this.f14025d.add(nq2Var);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f14027f = 1;
            h();
        }
    }
}
