package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class g0 implements d4.x, d4.g0 {
    final d4.v A;

    /* renamed from: m, reason: collision with root package name */
    private final Lock f5729m;

    /* renamed from: n, reason: collision with root package name */
    private final Condition f5730n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f5731o;

    /* renamed from: p, reason: collision with root package name */
    private final b4.f f5732p;

    /* renamed from: q, reason: collision with root package name */
    private final f0 f5733q;

    /* renamed from: r, reason: collision with root package name */
    final Map f5734r;

    /* renamed from: t, reason: collision with root package name */
    final e4.e f5736t;

    /* renamed from: u, reason: collision with root package name */
    final Map f5737u;

    /* renamed from: v, reason: collision with root package name */
    final a.AbstractC0091a f5738v;

    /* renamed from: w, reason: collision with root package name */
    private volatile d4.o f5739w;

    /* renamed from: y, reason: collision with root package name */
    int f5741y;

    /* renamed from: z, reason: collision with root package name */
    final d0 f5742z;

    /* renamed from: s, reason: collision with root package name */
    final Map f5735s = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    private b4.b f5740x = null;

    public g0(Context context, d0 d0Var, Lock lock, Looper looper, b4.f fVar, Map map, e4.e eVar, Map map2, a.AbstractC0091a abstractC0091a, ArrayList arrayList, d4.v vVar) {
        this.f5731o = context;
        this.f5729m = lock;
        this.f5732p = fVar;
        this.f5734r = map;
        this.f5736t = eVar;
        this.f5737u = map2;
        this.f5738v = abstractC0091a;
        this.f5742z = d0Var;
        this.A = vVar;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d4.f0) arrayList.get(i10)).a(this);
        }
        this.f5733q = new f0(this, looper);
        this.f5730n = lock.newCondition();
        this.f5739w = new z(this);
    }

    @Override // d4.d
    public final void C(int i10) {
        this.f5729m.lock();
        try {
            this.f5739w.b(i10);
        } finally {
            this.f5729m.unlock();
        }
    }

    @Override // d4.d
    public final void L0(Bundle bundle) {
        this.f5729m.lock();
        try {
            this.f5739w.a(bundle);
        } finally {
            this.f5729m.unlock();
        }
    }

    @Override // d4.x
    public final void a() {
        this.f5739w.d();
    }

    @Override // d4.x
    public final void b() {
        if (this.f5739w.e()) {
            this.f5735s.clear();
        }
    }

    @Override // d4.x
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f5739w);
        for (com.google.android.gms.common.api.a aVar : this.f5737u.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            ((a.f) e4.p.l((a.f) this.f5734r.get(aVar.b()))).dump(strValueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // d4.x
    public final boolean d() {
        return this.f5739w instanceof n;
    }

    @Override // d4.x
    public final b e(b bVar) {
        bVar.l();
        return this.f5739w.g(bVar);
    }

    final void h() {
        this.f5729m.lock();
        try {
            this.f5742z.r();
            this.f5739w = new n(this);
            this.f5739w.c();
            this.f5730n.signalAll();
        } finally {
            this.f5729m.unlock();
        }
    }

    final void i() {
        this.f5729m.lock();
        try {
            this.f5739w = new y(this, this.f5736t, this.f5737u, this.f5732p, this.f5738v, this.f5729m, this.f5731o);
            this.f5739w.c();
            this.f5730n.signalAll();
        } finally {
            this.f5729m.unlock();
        }
    }

    final void j(b4.b bVar) {
        this.f5729m.lock();
        try {
            this.f5740x = bVar;
            this.f5739w = new z(this);
            this.f5739w.c();
            this.f5730n.signalAll();
        } finally {
            this.f5729m.unlock();
        }
    }

    final void k(e0 e0Var) {
        f0 f0Var = this.f5733q;
        f0Var.sendMessage(f0Var.obtainMessage(1, e0Var));
    }

    final void l(RuntimeException runtimeException) {
        f0 f0Var = this.f5733q;
        f0Var.sendMessage(f0Var.obtainMessage(2, runtimeException));
    }

    @Override // d4.g0
    public final void p1(b4.b bVar, com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f5729m.lock();
        try {
            this.f5739w.f(bVar, aVar, z10);
        } finally {
            this.f5729m.unlock();
        }
    }
}
