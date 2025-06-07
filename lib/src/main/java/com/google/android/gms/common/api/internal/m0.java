package com.google.android.gms.common.api.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class m0 implements GoogleApiClient.b, GoogleApiClient.c, d4.g0 {

    /* renamed from: n, reason: collision with root package name */
    private final a.f f5767n;

    /* renamed from: o, reason: collision with root package name */
    private final d4.b f5768o;

    /* renamed from: p, reason: collision with root package name */
    private final j f5769p;

    /* renamed from: s, reason: collision with root package name */
    private final int f5772s;

    /* renamed from: t, reason: collision with root package name */
    private final d4.c0 f5773t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5774u;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ c f5778y;

    /* renamed from: m, reason: collision with root package name */
    private final Queue f5766m = new LinkedList();

    /* renamed from: q, reason: collision with root package name */
    private final Set f5770q = new HashSet();

    /* renamed from: r, reason: collision with root package name */
    private final Map f5771r = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private final List f5775v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private b4.b f5776w = null;

    /* renamed from: x, reason: collision with root package name */
    private int f5777x = 0;

    public m0(c cVar, com.google.android.gms.common.api.b bVar) {
        this.f5778y = cVar;
        a.f fVarM = bVar.m(cVar.f5667z.getLooper(), this);
        this.f5767n = fVarM;
        this.f5768o = bVar.h();
        this.f5769p = new j();
        this.f5772s = bVar.l();
        if (fVarM.s()) {
            this.f5773t = bVar.n(cVar.f5658q, cVar.f5667z);
        } else {
            this.f5773t = null;
        }
    }

    private final b4.d c(b4.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            b4.d[] dVarArrK = this.f5767n.k();
            if (dVarArrK == null) {
                dVarArrK = new b4.d[0];
            }
            q.a aVar = new q.a(dVarArrK.length);
            for (b4.d dVar : dVarArrK) {
                aVar.put(dVar.f(), Long.valueOf(dVar.h()));
            }
            for (b4.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.f());
                if (l10 == null || l10.longValue() < dVar2.h()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void d(b4.b bVar) {
        Iterator it = this.f5770q.iterator();
        if (!it.hasNext()) {
            this.f5770q.clear();
            return;
        }
        a5.a.a(it.next());
        if (e4.o.a(bVar, b4.b.f4399q)) {
            this.f5767n.l();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        e4.p.c(this.f5778y.f5667z);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        e4.p.c(this.f5778y.f5667z);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5766m.iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (!z10 || a1Var.f5646a == 2) {
                if (status != null) {
                    a1Var.a(status);
                } else {
                    a1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f5766m);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a1 a1Var = (a1) arrayList.get(i10);
            if (!this.f5767n.a()) {
                return;
            }
            if (m(a1Var)) {
                this.f5766m.remove(a1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        A();
        d(b4.b.f4399q);
        l();
        Iterator it = this.f5771r.values().iterator();
        if (it.hasNext()) {
            a5.a.a(it.next());
            throw null;
        }
        g();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i10) {
        A();
        this.f5774u = true;
        this.f5769p.e(i10, this.f5767n.o());
        d4.b bVar = this.f5768o;
        c cVar = this.f5778y;
        cVar.f5667z.sendMessageDelayed(Message.obtain(cVar.f5667z, 9, bVar), 5000L);
        d4.b bVar2 = this.f5768o;
        c cVar2 = this.f5778y;
        cVar2.f5667z.sendMessageDelayed(Message.obtain(cVar2.f5667z, 11, bVar2), 120000L);
        this.f5778y.f5660s.c();
        Iterator it = this.f5771r.values().iterator();
        if (it.hasNext()) {
            a5.a.a(it.next());
            throw null;
        }
    }

    private final void j() {
        this.f5778y.f5667z.removeMessages(12, this.f5768o);
        d4.b bVar = this.f5768o;
        c cVar = this.f5778y;
        cVar.f5667z.sendMessageDelayed(cVar.f5667z.obtainMessage(12, bVar), this.f5778y.f5654m);
    }

    private final void k(a1 a1Var) {
        a1Var.d(this.f5769p, a());
        try {
            a1Var.c(this);
        } catch (DeadObjectException unused) {
            C(1);
            this.f5767n.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f5774u) {
            c cVar = this.f5778y;
            cVar.f5667z.removeMessages(11, this.f5768o);
            c cVar2 = this.f5778y;
            cVar2.f5667z.removeMessages(9, this.f5768o);
            this.f5774u = false;
        }
    }

    private final boolean m(a1 a1Var) throws Resources.NotFoundException {
        if (!(a1Var instanceof d4.w)) {
            k(a1Var);
            return true;
        }
        d4.w wVar = (d4.w) a1Var;
        b4.d dVarC = c(wVar.g(this));
        if (dVarC == null) {
            k(a1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f5767n.getClass().getName() + " could not execute call because it requires feature (" + dVarC.f() + ", " + dVarC.h() + ").");
        if (!this.f5778y.A || !wVar.f(this)) {
            wVar.b(new c4.h(dVarC));
            return true;
        }
        n0 n0Var = new n0(this.f5768o, dVarC, null);
        int iIndexOf = this.f5775v.indexOf(n0Var);
        if (iIndexOf >= 0) {
            n0 n0Var2 = (n0) this.f5775v.get(iIndexOf);
            this.f5778y.f5667z.removeMessages(15, n0Var2);
            c cVar = this.f5778y;
            cVar.f5667z.sendMessageDelayed(Message.obtain(cVar.f5667z, 15, n0Var2), 5000L);
            return false;
        }
        this.f5775v.add(n0Var);
        c cVar2 = this.f5778y;
        cVar2.f5667z.sendMessageDelayed(Message.obtain(cVar2.f5667z, 15, n0Var), 5000L);
        c cVar3 = this.f5778y;
        cVar3.f5667z.sendMessageDelayed(Message.obtain(cVar3.f5667z, 16, n0Var), 120000L);
        b4.b bVar = new b4.b(2, null);
        if (n(bVar)) {
            return false;
        }
        this.f5778y.e(bVar, this.f5772s);
        return false;
    }

    private final boolean n(b4.b bVar) {
        synchronized (c.D) {
            c cVar = this.f5778y;
            if (cVar.f5664w == null || !cVar.f5665x.contains(this.f5768o)) {
                return false;
            }
            this.f5778y.f5664w.s(bVar, this.f5772s);
            return true;
        }
    }

    private final boolean o(boolean z10) {
        e4.p.c(this.f5778y.f5667z);
        if (!this.f5767n.a() || !this.f5771r.isEmpty()) {
            return false;
        }
        if (!this.f5769p.g()) {
            this.f5767n.f("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        j();
        return false;
    }

    static /* bridge */ /* synthetic */ void y(m0 m0Var, n0 n0Var) {
        if (m0Var.f5775v.contains(n0Var) && !m0Var.f5774u) {
            if (m0Var.f5767n.a()) {
                m0Var.g();
            } else {
                m0Var.B();
            }
        }
    }

    static /* bridge */ /* synthetic */ void z(m0 m0Var, n0 n0Var) {
        b4.d[] dVarArrG;
        if (m0Var.f5775v.remove(n0Var)) {
            m0Var.f5778y.f5667z.removeMessages(15, n0Var);
            m0Var.f5778y.f5667z.removeMessages(16, n0Var);
            b4.d dVar = n0Var.f5782b;
            ArrayList arrayList = new ArrayList(m0Var.f5766m.size());
            for (a1 a1Var : m0Var.f5766m) {
                if ((a1Var instanceof d4.w) && (dVarArrG = ((d4.w) a1Var).g(m0Var)) != null && i4.b.c(dVarArrG, dVar)) {
                    arrayList.add(a1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a1 a1Var2 = (a1) arrayList.get(i10);
                m0Var.f5766m.remove(a1Var2);
                a1Var2.b(new c4.h(dVar));
            }
        }
    }

    public final void A() {
        e4.p.c(this.f5778y.f5667z);
        this.f5776w = null;
    }

    public final void B() {
        b4.b bVar;
        e4.p.c(this.f5778y.f5667z);
        if (this.f5767n.a() || this.f5767n.i()) {
            return;
        }
        try {
            c cVar = this.f5778y;
            int iB = cVar.f5660s.b(cVar.f5658q, this.f5767n);
            if (iB != 0) {
                b4.b bVar2 = new b4.b(iB, null);
                Log.w("GoogleApiManager", "The service for " + this.f5767n.getClass().getName() + " is not available: " + bVar2.toString());
                F(bVar2, null);
                return;
            }
            c cVar2 = this.f5778y;
            a.f fVar = this.f5767n;
            p0 p0Var = new p0(cVar2, fVar, this.f5768o);
            if (fVar.s()) {
                ((d4.c0) e4.p.l(this.f5773t)).L5(p0Var);
            }
            try {
                this.f5767n.j(p0Var);
            } catch (SecurityException e5) {
                e = e5;
                bVar = new b4.b(10);
                F(bVar, e);
            }
        } catch (IllegalStateException e10) {
            e = e10;
            bVar = new b4.b(10);
        }
    }

    @Override // d4.d
    public final void C(int i10) {
        if (Looper.myLooper() == this.f5778y.f5667z.getLooper()) {
            i(i10);
        } else {
            this.f5778y.f5667z.post(new j0(this, i10));
        }
    }

    public final void D(a1 a1Var) {
        e4.p.c(this.f5778y.f5667z);
        if (this.f5767n.a()) {
            if (m(a1Var)) {
                j();
                return;
            } else {
                this.f5766m.add(a1Var);
                return;
            }
        }
        this.f5766m.add(a1Var);
        b4.b bVar = this.f5776w;
        if (bVar == null || !bVar.x()) {
            B();
        } else {
            F(this.f5776w, null);
        }
    }

    final void E() {
        this.f5777x++;
    }

    public final void F(b4.b bVar, Exception exc) {
        e4.p.c(this.f5778y.f5667z);
        d4.c0 c0Var = this.f5773t;
        if (c0Var != null) {
            c0Var.M5();
        }
        A();
        this.f5778y.f5660s.c();
        d(bVar);
        if ((this.f5767n instanceof g4.e) && bVar.f() != 24) {
            this.f5778y.f5655n = true;
            c cVar = this.f5778y;
            cVar.f5667z.sendMessageDelayed(cVar.f5667z.obtainMessage(19), 300000L);
        }
        if (bVar.f() == 4) {
            e(c.C);
            return;
        }
        if (this.f5766m.isEmpty()) {
            this.f5776w = bVar;
            return;
        }
        if (exc != null) {
            e4.p.c(this.f5778y.f5667z);
            f(null, exc, false);
            return;
        }
        if (!this.f5778y.A) {
            e(c.f(this.f5768o, bVar));
            return;
        }
        f(c.f(this.f5768o, bVar), null, true);
        if (this.f5766m.isEmpty() || n(bVar) || this.f5778y.e(bVar, this.f5772s)) {
            return;
        }
        if (bVar.f() == 18) {
            this.f5774u = true;
        }
        if (!this.f5774u) {
            e(c.f(this.f5768o, bVar));
            return;
        }
        c cVar2 = this.f5778y;
        cVar2.f5667z.sendMessageDelayed(Message.obtain(cVar2.f5667z, 9, this.f5768o), 5000L);
    }

    public final void G(b4.b bVar) {
        e4.p.c(this.f5778y.f5667z);
        a.f fVar = this.f5767n;
        fVar.f("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(bVar));
        F(bVar, null);
    }

    public final void H() {
        e4.p.c(this.f5778y.f5667z);
        if (this.f5774u) {
            B();
        }
    }

    public final void I() {
        e4.p.c(this.f5778y.f5667z);
        e(c.B);
        this.f5769p.f();
        for (d.a aVar : (d.a[]) this.f5771r.keySet().toArray(new d.a[0])) {
            D(new z0(aVar, new b5.j()));
        }
        d(new b4.b(4));
        if (this.f5767n.a()) {
            this.f5767n.b(new l0(this));
        }
    }

    public final void J() {
        e4.p.c(this.f5778y.f5667z);
        if (this.f5774u) {
            l();
            c cVar = this.f5778y;
            e(cVar.f5659r.i(cVar.f5658q) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f5767n.f("Timing out connection while resuming.");
        }
    }

    @Override // d4.d
    public final void L0(Bundle bundle) {
        if (Looper.myLooper() == this.f5778y.f5667z.getLooper()) {
            h();
        } else {
            this.f5778y.f5667z.post(new i0(this));
        }
    }

    public final boolean a() {
        return this.f5767n.s();
    }

    public final boolean b() {
        return o(true);
    }

    public final int p() {
        return this.f5772s;
    }

    @Override // d4.g0
    public final void p1(b4.b bVar, com.google.android.gms.common.api.a aVar, boolean z10) {
        throw null;
    }

    final int q() {
        return this.f5777x;
    }

    public final a.f s() {
        return this.f5767n;
    }

    public final Map u() {
        return this.f5771r;
    }

    @Override // d4.g
    public final void w0(b4.b bVar) {
        F(bVar, null);
    }
}
