package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* loaded from: classes.dex */
final class rp2 {

    /* renamed from: b, reason: collision with root package name */
    private final int f14879b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14880c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f14878a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final rq2 f14881d = new rq2();

    public rp2(int i10, int i11) {
        this.f14879b = i10;
        this.f14880c = i11;
    }

    private final void i() {
        while (!this.f14878a.isEmpty()) {
            if (j3.t.b().a() - ((bq2) this.f14878a.getFirst()).f6645d < this.f14880c) {
                return;
            }
            this.f14881d.g();
            this.f14878a.remove();
        }
    }

    public final int a() {
        return this.f14881d.a();
    }

    public final int b() {
        i();
        return this.f14878a.size();
    }

    public final long c() {
        return this.f14881d.b();
    }

    public final long d() {
        return this.f14881d.c();
    }

    public final bq2 e() {
        this.f14881d.f();
        i();
        if (this.f14878a.isEmpty()) {
            return null;
        }
        bq2 bq2Var = (bq2) this.f14878a.remove();
        if (bq2Var != null) {
            this.f14881d.h();
        }
        return bq2Var;
    }

    public final qq2 f() {
        return this.f14881d.d();
    }

    public final String g() {
        return this.f14881d.e();
    }

    public final boolean h(bq2 bq2Var) {
        this.f14881d.f();
        i();
        if (this.f14878a.size() == this.f14879b) {
            return false;
        }
        this.f14878a.add(bq2Var);
        return true;
    }
}
