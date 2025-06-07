package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class me0 implements hk {

    /* renamed from: b, reason: collision with root package name */
    private final m3.p1 f12073b;

    /* renamed from: d, reason: collision with root package name */
    final ke0 f12075d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f12072a = new Object();

    /* renamed from: e, reason: collision with root package name */
    final HashSet f12076e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    final HashSet f12077f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private boolean f12078g = false;

    /* renamed from: c, reason: collision with root package name */
    private final le0 f12074c = new le0();

    public me0(String str, m3.p1 p1Var) {
        this.f12075d = new ke0(str, p1Var);
        this.f12073b = p1Var;
    }

    @Override // com.google.android.gms.internal.ads.hk
    public final void a(boolean z10) {
        ke0 ke0Var;
        int iD;
        long jA = j3.t.b().a();
        if (!z10) {
            this.f12073b.F(jA);
            this.f12073b.L(this.f12075d.f10999d);
            return;
        }
        if (jA - this.f12073b.f() > ((Long) k3.w.c().b(ir.P0)).longValue()) {
            ke0Var = this.f12075d;
            iD = -1;
        } else {
            ke0Var = this.f12075d;
            iD = this.f12073b.d();
        }
        ke0Var.f10999d = iD;
        this.f12078g = true;
    }

    public final ce0 b(i4.e eVar, String str) {
        return new ce0(eVar, this, this.f12074c.a(), str);
    }

    public final String c() {
        return this.f12074c.b();
    }

    public final void d(ce0 ce0Var) {
        synchronized (this.f12072a) {
            this.f12076e.add(ce0Var);
        }
    }

    public final void e() {
        synchronized (this.f12072a) {
            this.f12075d.b();
        }
    }

    public final void f() {
        synchronized (this.f12072a) {
            this.f12075d.c();
        }
    }

    public final void g() {
        synchronized (this.f12072a) {
            this.f12075d.d();
        }
    }

    public final void h() {
        synchronized (this.f12072a) {
            this.f12075d.e();
        }
    }

    public final void i(k3.c4 c4Var, long j10) {
        synchronized (this.f12072a) {
            this.f12075d.f(c4Var, j10);
        }
    }

    public final void j(HashSet hashSet) {
        synchronized (this.f12072a) {
            this.f12076e.addAll(hashSet);
        }
    }

    public final boolean k() {
        return this.f12078g;
    }

    public final Bundle l(Context context, lp2 lp2Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.f12072a) {
            hashSet.addAll(this.f12076e);
            this.f12076e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f12075d.a(context, this.f12074c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f12077f.iterator();
        if (it.hasNext()) {
            a5.a.a(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ce0) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        lp2Var.b(hashSet);
        return bundle;
    }
}
