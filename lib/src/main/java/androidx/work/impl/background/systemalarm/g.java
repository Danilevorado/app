package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.e0;
import androidx.work.impl.q;
import androidx.work.impl.v;
import b1.j;
import g1.m;
import h1.s;
import h1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class g implements androidx.work.impl.e {

    /* renamed from: w, reason: collision with root package name */
    static final String f4103w = j.i("SystemAlarmDispatcher");

    /* renamed from: m, reason: collision with root package name */
    final Context f4104m;

    /* renamed from: n, reason: collision with root package name */
    final i1.c f4105n;

    /* renamed from: o, reason: collision with root package name */
    private final y f4106o;

    /* renamed from: p, reason: collision with root package name */
    private final q f4107p;

    /* renamed from: q, reason: collision with root package name */
    private final e0 f4108q;

    /* renamed from: r, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f4109r;

    /* renamed from: s, reason: collision with root package name */
    final List f4110s;

    /* renamed from: t, reason: collision with root package name */
    Intent f4111t;

    /* renamed from: u, reason: collision with root package name */
    private c f4112u;

    /* renamed from: v, reason: collision with root package name */
    private v f4113v;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorA;
            d dVar;
            synchronized (g.this.f4110s) {
                g gVar = g.this;
                gVar.f4111t = (Intent) gVar.f4110s.get(0);
            }
            Intent intent = g.this.f4111t;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f4111t.getIntExtra("KEY_START_ID", 0);
                j jVarE = j.e();
                String str = g.f4103w;
                jVarE.a(str, "Processing command " + g.this.f4111t + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = s.b(g.this.f4104m, action + " (" + intExtra + ")");
                try {
                    j.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    g gVar2 = g.this;
                    gVar2.f4109r.o(gVar2.f4111t, intExtra, gVar2);
                    j.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorA = g.this.f4105n.a();
                    dVar = new d(g.this);
                } catch (Throwable th) {
                    try {
                        j jVarE2 = j.e();
                        String str2 = g.f4103w;
                        jVarE2.d(str2, "Unexpected error in onHandleIntent", th);
                        j.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorA = g.this.f4105n.a();
                        dVar = new d(g.this);
                    } catch (Throwable th2) {
                        j.e().a(g.f4103w, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        g.this.f4105n.a().execute(new d(g.this));
                        throw th2;
                    }
                }
                executorA.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final g f4115m;

        /* renamed from: n, reason: collision with root package name */
        private final Intent f4116n;

        /* renamed from: o, reason: collision with root package name */
        private final int f4117o;

        b(g gVar, Intent intent, int i10) {
            this.f4115m = gVar;
            this.f4116n = intent;
            this.f4117o = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4115m.a(this.f4116n, this.f4117o);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final g f4118m;

        d(g gVar) {
            this.f4118m = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4118m.c();
        }
    }

    g(Context context) {
        this(context, null, null);
    }

    g(Context context, q qVar, e0 e0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f4104m = applicationContext;
        this.f4113v = new v();
        this.f4109r = new androidx.work.impl.background.systemalarm.b(applicationContext, this.f4113v);
        e0Var = e0Var == null ? e0.n(context) : e0Var;
        this.f4108q = e0Var;
        this.f4106o = new y(e0Var.l().k());
        qVar = qVar == null ? e0Var.p() : qVar;
        this.f4107p = qVar;
        this.f4105n = e0Var.t();
        qVar.g(this);
        this.f4110s = new ArrayList();
        this.f4111t = null;
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f4110s) {
            Iterator it = this.f4110s.iterator();
            while (it.hasNext()) {
                if (str.equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock wakeLockB = s.b(this.f4104m, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f4108q.t().c(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        j jVarE = j.e();
        String str = f4103w;
        jVarE.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f4110s) {
            boolean z10 = this.f4110s.isEmpty() ? false : true;
            this.f4110s.add(intent);
            if (!z10) {
                k();
            }
        }
        return true;
    }

    void c() {
        j jVarE = j.e();
        String str = f4103w;
        jVarE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f4110s) {
            if (this.f4111t != null) {
                j.e().a(str, "Removing command " + this.f4111t);
                if (!((Intent) this.f4110s.remove(0)).equals(this.f4111t)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f4111t = null;
            }
            i1.a aVarB = this.f4105n.b();
            if (!this.f4109r.n() && this.f4110s.isEmpty() && !aVarB.x()) {
                j.e().a(str, "No more commands & intents.");
                c cVar = this.f4112u;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.f4110s.isEmpty()) {
                k();
            }
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        this.f4105n.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f4104m, mVar, z10), 0));
    }

    q e() {
        return this.f4107p;
    }

    i1.c f() {
        return this.f4105n;
    }

    e0 g() {
        return this.f4108q;
    }

    y h() {
        return this.f4106o;
    }

    void j() {
        j.e().a(f4103w, "Destroying SystemAlarmDispatcher");
        this.f4107p.n(this);
        this.f4112u = null;
    }

    void l(c cVar) {
        if (this.f4112u != null) {
            j.e().c(f4103w, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f4112u = cVar;
        }
    }
}
