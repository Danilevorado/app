package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class h0 implements Runnable {
    static final String E = b1.j.i("WorkerWrapper");
    private String A;
    private volatile boolean D;

    /* renamed from: m, reason: collision with root package name */
    Context f4183m;

    /* renamed from: n, reason: collision with root package name */
    private final String f4184n;

    /* renamed from: o, reason: collision with root package name */
    private List f4185o;

    /* renamed from: p, reason: collision with root package name */
    private WorkerParameters.a f4186p;

    /* renamed from: q, reason: collision with root package name */
    g1.v f4187q;

    /* renamed from: r, reason: collision with root package name */
    androidx.work.c f4188r;

    /* renamed from: s, reason: collision with root package name */
    i1.c f4189s;

    /* renamed from: u, reason: collision with root package name */
    private androidx.work.a f4191u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.work.impl.foreground.a f4192v;

    /* renamed from: w, reason: collision with root package name */
    private WorkDatabase f4193w;

    /* renamed from: x, reason: collision with root package name */
    private g1.w f4194x;

    /* renamed from: y, reason: collision with root package name */
    private g1.b f4195y;

    /* renamed from: z, reason: collision with root package name */
    private List f4196z;

    /* renamed from: t, reason: collision with root package name */
    c.a f4190t = c.a.a();
    androidx.work.impl.utils.futures.d B = androidx.work.impl.utils.futures.d.u();
    final androidx.work.impl.utils.futures.d C = androidx.work.impl.utils.futures.d.u();

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ u5.a f4197m;

        a(u5.a aVar) {
            this.f4197m = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h0.this.C.isCancelled()) {
                return;
            }
            try {
                this.f4197m.get();
                b1.j.e().a(h0.E, "Starting work for " + h0.this.f4187q.f23741c);
                h0 h0Var = h0.this;
                h0Var.C.s(h0Var.f4188r.startWork());
            } catch (Throwable th) {
                h0.this.C.r(th);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f4199m;

        b(String str) {
            this.f4199m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    c.a aVar = (c.a) h0.this.C.get();
                    if (aVar == null) {
                        b1.j.e().c(h0.E, h0.this.f4187q.f23741c + " returned a null result. Treating it as a failure.");
                    } else {
                        b1.j.e().a(h0.E, h0.this.f4187q.f23741c + " returned a " + aVar + ".");
                        h0.this.f4190t = aVar;
                    }
                } catch (InterruptedException e5) {
                    e = e5;
                    b1.j.e().d(h0.E, this.f4199m + " failed because it threw an exception/error", e);
                } catch (CancellationException e10) {
                    b1.j.e().g(h0.E, this.f4199m + " was cancelled", e10);
                } catch (ExecutionException e11) {
                    e = e11;
                    b1.j.e().d(h0.E, this.f4199m + " failed because it threw an exception/error", e);
                }
            } finally {
                h0.this.j();
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Context f4201a;

        /* renamed from: b, reason: collision with root package name */
        androidx.work.c f4202b;

        /* renamed from: c, reason: collision with root package name */
        androidx.work.impl.foreground.a f4203c;

        /* renamed from: d, reason: collision with root package name */
        i1.c f4204d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.a f4205e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f4206f;

        /* renamed from: g, reason: collision with root package name */
        g1.v f4207g;

        /* renamed from: h, reason: collision with root package name */
        List f4208h;

        /* renamed from: i, reason: collision with root package name */
        private final List f4209i;

        /* renamed from: j, reason: collision with root package name */
        WorkerParameters.a f4210j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, i1.c cVar, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, g1.v vVar, List list) {
            this.f4201a = context.getApplicationContext();
            this.f4204d = cVar;
            this.f4203c = aVar2;
            this.f4205e = aVar;
            this.f4206f = workDatabase;
            this.f4207g = vVar;
            this.f4209i = list;
        }

        public h0 b() {
            return new h0(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f4210j = aVar;
            }
            return this;
        }

        public c d(List list) {
            this.f4208h = list;
            return this;
        }
    }

    h0(c cVar) {
        this.f4183m = cVar.f4201a;
        this.f4189s = cVar.f4204d;
        this.f4192v = cVar.f4203c;
        g1.v vVar = cVar.f4207g;
        this.f4187q = vVar;
        this.f4184n = vVar.f23739a;
        this.f4185o = cVar.f4208h;
        this.f4186p = cVar.f4210j;
        this.f4188r = cVar.f4202b;
        this.f4191u = cVar.f4205e;
        WorkDatabase workDatabase = cVar.f4206f;
        this.f4193w = workDatabase;
        this.f4194x = workDatabase.J();
        this.f4195y = this.f4193w.E();
        this.f4196z = cVar.f4209i;
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f4184n);
        sb2.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(c.a aVar) {
        if (aVar instanceof c.a.C0066c) {
            b1.j.e().f(E, "Worker result SUCCESS for " + this.A);
            if (!this.f4187q.j()) {
                q();
                return;
            }
        } else {
            if (aVar instanceof c.a.b) {
                b1.j.e().f(E, "Worker result RETRY for " + this.A);
                k();
                return;
            }
            b1.j.e().f(E, "Worker result FAILURE for " + this.A);
            if (!this.f4187q.j()) {
                p();
                return;
            }
        }
        l();
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f4194x.j(str2) != b1.t.CANCELLED) {
                this.f4194x.o(b1.t.FAILED, str2);
            }
            linkedList.addAll(this.f4195y.d(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(u5.a aVar) {
        if (this.C.isCancelled()) {
            aVar.cancel(true);
        }
    }

    private void k() {
        this.f4193w.e();
        try {
            this.f4194x.o(b1.t.ENQUEUED, this.f4184n);
            this.f4194x.n(this.f4184n, System.currentTimeMillis());
            this.f4194x.f(this.f4184n, -1L);
            this.f4193w.B();
        } finally {
            this.f4193w.i();
            m(true);
        }
    }

    private void l() {
        this.f4193w.e();
        try {
            this.f4194x.n(this.f4184n, System.currentTimeMillis());
            this.f4194x.o(b1.t.ENQUEUED, this.f4184n);
            this.f4194x.m(this.f4184n);
            this.f4194x.d(this.f4184n);
            this.f4194x.f(this.f4184n, -1L);
            this.f4193w.B();
        } finally {
            this.f4193w.i();
            m(false);
        }
    }

    private void m(boolean z10) {
        this.f4193w.e();
        try {
            if (!this.f4193w.J().e()) {
                h1.l.a(this.f4183m, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f4194x.o(b1.t.ENQUEUED, this.f4184n);
                this.f4194x.f(this.f4184n, -1L);
            }
            if (this.f4187q != null && this.f4188r != null && this.f4192v.c(this.f4184n)) {
                this.f4192v.a(this.f4184n);
            }
            this.f4193w.B();
            this.f4193w.i();
            this.B.q(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f4193w.i();
            throw th;
        }
    }

    private void n() {
        boolean z10;
        b1.t tVarJ = this.f4194x.j(this.f4184n);
        if (tVarJ == b1.t.RUNNING) {
            b1.j.e().a(E, "Status for " + this.f4184n + " is RUNNING; not doing any work and rescheduling for later execution");
            z10 = true;
        } else {
            b1.j.e().a(E, "Status for " + this.f4184n + " is " + tVarJ + " ; not doing any work");
            z10 = false;
        }
        m(z10);
    }

    private void o() {
        androidx.work.b bVarB;
        if (r()) {
            return;
        }
        this.f4193w.e();
        try {
            g1.v vVar = this.f4187q;
            if (vVar.f23740b != b1.t.ENQUEUED) {
                n();
                this.f4193w.B();
                b1.j.e().a(E, this.f4187q.f23741c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((vVar.j() || this.f4187q.i()) && System.currentTimeMillis() < this.f4187q.c()) {
                b1.j.e().a(E, String.format("Delaying execution for %s because it is being executed before schedule.", this.f4187q.f23741c));
                m(true);
                this.f4193w.B();
                return;
            }
            this.f4193w.B();
            this.f4193w.i();
            if (this.f4187q.j()) {
                bVarB = this.f4187q.f23743e;
            } else {
                b1.h hVarB = this.f4191u.f().b(this.f4187q.f23742d);
                if (hVarB == null) {
                    b1.j.e().c(E, "Could not create Input Merger " + this.f4187q.f23742d);
                    p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f4187q.f23743e);
                arrayList.addAll(this.f4194x.q(this.f4184n));
                bVarB = hVarB.b(arrayList);
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f4184n), bVarB, this.f4196z, this.f4186p, this.f4187q.f23749k, this.f4191u.d(), this.f4189s, this.f4191u.n(), new h1.x(this.f4193w, this.f4189s), new h1.w(this.f4193w, this.f4192v, this.f4189s));
            if (this.f4188r == null) {
                this.f4188r = this.f4191u.n().b(this.f4183m, this.f4187q.f23741c, workerParameters);
            }
            androidx.work.c cVar = this.f4188r;
            if (cVar == null) {
                b1.j.e().c(E, "Could not create Worker " + this.f4187q.f23741c);
                p();
                return;
            }
            if (cVar.isUsed()) {
                b1.j.e().c(E, "Received an already-used Worker " + this.f4187q.f23741c + "; Worker Factory should return new instances");
                p();
                return;
            }
            this.f4188r.setUsed();
            if (!s()) {
                n();
                return;
            }
            if (r()) {
                return;
            }
            h1.v vVar2 = new h1.v(this.f4183m, this.f4187q, this.f4188r, workerParameters.b(), this.f4189s);
            this.f4189s.a().execute(vVar2);
            final u5.a aVarB = vVar2.b();
            this.C.d(new Runnable() { // from class: androidx.work.impl.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4180m.i(aVarB);
                }
            }, new h1.r());
            aVarB.d(new a(aVarB), this.f4189s.a());
            this.C.d(new b(this.A), this.f4189s.b());
        } finally {
            this.f4193w.i();
        }
    }

    private void q() {
        this.f4193w.e();
        try {
            this.f4194x.o(b1.t.SUCCEEDED, this.f4184n);
            this.f4194x.u(this.f4184n, ((c.a.C0066c) this.f4190t).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f4195y.d(this.f4184n)) {
                if (this.f4194x.j(str) == b1.t.BLOCKED && this.f4195y.a(str)) {
                    b1.j.e().f(E, "Setting status to enqueued for " + str);
                    this.f4194x.o(b1.t.ENQUEUED, str);
                    this.f4194x.n(str, jCurrentTimeMillis);
                }
            }
            this.f4193w.B();
        } finally {
            this.f4193w.i();
            m(false);
        }
    }

    private boolean r() {
        if (!this.D) {
            return false;
        }
        b1.j.e().a(E, "Work interrupted for " + this.A);
        if (this.f4194x.j(this.f4184n) == null) {
            m(false);
        } else {
            m(!r0.b());
        }
        return true;
    }

    private boolean s() {
        boolean z10;
        this.f4193w.e();
        try {
            if (this.f4194x.j(this.f4184n) == b1.t.ENQUEUED) {
                this.f4194x.o(b1.t.RUNNING, this.f4184n);
                this.f4194x.r(this.f4184n);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4193w.B();
            return z10;
        } finally {
            this.f4193w.i();
        }
    }

    public u5.a c() {
        return this.B;
    }

    public g1.m d() {
        return g1.y.a(this.f4187q);
    }

    public g1.v e() {
        return this.f4187q;
    }

    public void g() {
        this.D = true;
        r();
        this.C.cancel(true);
        if (this.f4188r != null && this.C.isCancelled()) {
            this.f4188r.stop();
            return;
        }
        b1.j.e().a(E, "WorkSpec " + this.f4187q + " is already done. Not interrupting.");
    }

    void j() {
        if (!r()) {
            this.f4193w.e();
            try {
                b1.t tVarJ = this.f4194x.j(this.f4184n);
                this.f4193w.I().a(this.f4184n);
                if (tVarJ == null) {
                    m(false);
                } else if (tVarJ == b1.t.RUNNING) {
                    f(this.f4190t);
                } else if (!tVarJ.b()) {
                    k();
                }
                this.f4193w.B();
            } finally {
                this.f4193w.i();
            }
        }
        List list = this.f4185o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(this.f4184n);
            }
            t.b(this.f4191u, this.f4193w, this.f4185o);
        }
    }

    void p() {
        this.f4193w.e();
        try {
            h(this.f4184n);
            this.f4194x.u(this.f4184n, ((c.a.C0065a) this.f4190t).e());
            this.f4193w.B();
        } finally {
            this.f4193w.i();
            m(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A = b(this.f4196z);
        o();
    }
}
