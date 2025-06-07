package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class y implements d4.o {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f5825a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f5826b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5827c;

    /* renamed from: d, reason: collision with root package name */
    private final b4.f f5828d;

    /* renamed from: e, reason: collision with root package name */
    private b4.b f5829e;

    /* renamed from: f, reason: collision with root package name */
    private int f5830f;

    /* renamed from: h, reason: collision with root package name */
    private int f5832h;

    /* renamed from: k, reason: collision with root package name */
    private y4.e f5835k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5836l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5837m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5838n;

    /* renamed from: o, reason: collision with root package name */
    private e4.j f5839o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5840p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5841q;

    /* renamed from: r, reason: collision with root package name */
    private final e4.e f5842r;

    /* renamed from: s, reason: collision with root package name */
    private final Map f5843s;

    /* renamed from: t, reason: collision with root package name */
    private final a.AbstractC0091a f5844t;

    /* renamed from: g, reason: collision with root package name */
    private int f5831g = 0;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f5833i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    private final Set f5834j = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList f5845u = new ArrayList();

    public y(g0 g0Var, e4.e eVar, Map map, b4.f fVar, a.AbstractC0091a abstractC0091a, Lock lock, Context context) {
        this.f5825a = g0Var;
        this.f5842r = eVar;
        this.f5843s = map;
        this.f5828d = fVar;
        this.f5844t = abstractC0091a;
        this.f5826b = lock;
        this.f5827c = context;
    }

    static /* bridge */ /* synthetic */ void A(y yVar, z4.l lVar) {
        if (yVar.n(0)) {
            b4.b bVarF = lVar.f();
            if (!bVarF.y()) {
                if (!yVar.p(bVarF)) {
                    yVar.k(bVarF);
                    return;
                } else {
                    yVar.h();
                    yVar.m();
                    return;
                }
            }
            e4.m0 m0Var = (e4.m0) e4.p.l(lVar.h());
            b4.b bVarF2 = m0Var.f();
            if (!bVarF2.y()) {
                String strValueOf = String.valueOf(bVarF2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                yVar.k(bVarF2);
                return;
            }
            yVar.f5838n = true;
            yVar.f5839o = (e4.j) e4.p.l(m0Var.h());
            yVar.f5840p = m0Var.v();
            yVar.f5841q = m0Var.x();
            yVar.m();
        }
    }

    private final void I() {
        ArrayList arrayList = this.f5845u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        this.f5845u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f5837m = false;
        this.f5825a.f5742z.f5689p = Collections.emptySet();
        for (a.c cVar : this.f5834j) {
            if (!this.f5825a.f5735s.containsKey(cVar)) {
                g0 g0Var = this.f5825a;
                g0Var.f5735s.put(cVar, new b4.b(17, null));
            }
        }
    }

    private final void i(boolean z10) {
        y4.e eVar = this.f5835k;
        if (eVar != null) {
            if (eVar.a() && z10) {
                eVar.n();
            }
            eVar.q();
            this.f5839o = null;
        }
    }

    private final void j() {
        this.f5825a.h();
        d4.p.a().execute(new o(this));
        y4.e eVar = this.f5835k;
        if (eVar != null) {
            if (this.f5840p) {
                eVar.e((e4.j) e4.p.l(this.f5839o), this.f5841q);
            }
            i(false);
        }
        Iterator it = this.f5825a.f5735s.keySet().iterator();
        while (it.hasNext()) {
            ((a.f) e4.p.l((a.f) this.f5825a.f5734r.get((a.c) it.next()))).q();
        }
        this.f5825a.A.a(this.f5833i.isEmpty() ? null : this.f5833i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(b4.b bVar) {
        I();
        i(!bVar.x());
        this.f5825a.j(bVar);
        this.f5825a.A.c(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(b4.b bVar, com.google.android.gms.common.api.a aVar, boolean z10) {
        int iB = aVar.c().b();
        if ((!z10 || bVar.x() || this.f5828d.c(bVar.f()) != null) && (this.f5829e == null || iB < this.f5830f)) {
            this.f5829e = bVar;
            this.f5830f = iB;
        }
        g0 g0Var = this.f5825a;
        g0Var.f5735s.put(aVar.b(), bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.f5832h != 0) {
            return;
        }
        if (!this.f5837m || this.f5838n) {
            ArrayList arrayList = new ArrayList();
            this.f5831g = 1;
            this.f5832h = this.f5825a.f5734r.size();
            for (a.c cVar : this.f5825a.f5734r.keySet()) {
                if (!this.f5825a.f5735s.containsKey(cVar)) {
                    arrayList.add((a.f) this.f5825a.f5734r.get(cVar));
                } else if (o()) {
                    j();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f5845u.add(d4.p.a().submit(new t(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(int i10) {
        if (this.f5831g == i10) {
            return true;
        }
        Log.w("GACConnecting", this.f5825a.f5742z.n());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f5832h);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + q(this.f5831g) + " but received callback for step " + q(i10), new Exception());
        k(new b4.b(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        b4.b bVar;
        int i10 = this.f5832h - 1;
        this.f5832h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f5825a.f5742z.n());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new b4.b(8, null);
        } else {
            bVar = this.f5829e;
            if (bVar == null) {
                return true;
            }
            this.f5825a.f5741y = this.f5830f;
        }
        k(bVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(b4.b bVar) {
        return this.f5836l && !bVar.x();
    }

    private static final String q(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set x(y yVar) {
        e4.e eVar = yVar.f5842r;
        if (eVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(eVar.e());
        Map mapI = yVar.f5842r.i();
        for (com.google.android.gms.common.api.a aVar : mapI.keySet()) {
            g0 g0Var = yVar.f5825a;
            if (!g0Var.f5735s.containsKey(aVar.b())) {
                a5.a.a(mapI.get(aVar));
                throw null;
            }
        }
        return hashSet;
    }

    @Override // d4.o
    public final void a(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f5833i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    @Override // d4.o
    public final void b(int i10) {
        k(new b4.b(8, null));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, y4.e] */
    @Override // d4.o
    public final void c() {
        this.f5825a.f5735s.clear();
        this.f5837m = false;
        d4.m mVar = null;
        this.f5829e = null;
        this.f5831g = 0;
        this.f5836l = true;
        this.f5838n = false;
        this.f5840p = false;
        HashMap map = new HashMap();
        boolean z10 = false;
        for (com.google.android.gms.common.api.a aVar : this.f5843s.keySet()) {
            a.f fVar = (a.f) e4.p.l((a.f) this.f5825a.f5734r.get(aVar.b()));
            z10 |= aVar.c().b() == 1;
            boolean zBooleanValue = ((Boolean) this.f5843s.get(aVar)).booleanValue();
            if (fVar.s()) {
                this.f5837m = true;
                if (zBooleanValue) {
                    this.f5834j.add(aVar.b());
                } else {
                    this.f5836l = false;
                }
            }
            map.put(fVar, new p(this, aVar, zBooleanValue));
        }
        if (z10) {
            this.f5837m = false;
        }
        if (this.f5837m) {
            e4.p.l(this.f5842r);
            e4.p.l(this.f5844t);
            this.f5842r.j(Integer.valueOf(System.identityHashCode(this.f5825a.f5742z)));
            w wVar = new w(this, mVar);
            a.AbstractC0091a abstractC0091a = this.f5844t;
            Context context = this.f5827c;
            g0 g0Var = this.f5825a;
            e4.e eVar = this.f5842r;
            this.f5835k = abstractC0091a.c(context, g0Var.f5742z.h(), eVar, eVar.f(), wVar, wVar);
        }
        this.f5832h = this.f5825a.f5734r.size();
        this.f5845u.add(d4.p.a().submit(new s(this, map)));
    }

    @Override // d4.o
    public final void d() {
    }

    @Override // d4.o
    public final boolean e() {
        I();
        i(true);
        this.f5825a.j(null);
        return true;
    }

    @Override // d4.o
    public final void f(b4.b bVar, com.google.android.gms.common.api.a aVar, boolean z10) {
        if (n(1)) {
            l(bVar, aVar, z10);
            if (o()) {
                j();
            }
        }
    }

    @Override // d4.o
    public final b g(b bVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
