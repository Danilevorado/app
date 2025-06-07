package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class q implements e, androidx.work.impl.foreground.a {

    /* renamed from: y, reason: collision with root package name */
    private static final String f4224y = b1.j.i("Processor");

    /* renamed from: n, reason: collision with root package name */
    private Context f4226n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.work.a f4227o;

    /* renamed from: p, reason: collision with root package name */
    private i1.c f4228p;

    /* renamed from: q, reason: collision with root package name */
    private WorkDatabase f4229q;

    /* renamed from: u, reason: collision with root package name */
    private List f4233u;

    /* renamed from: s, reason: collision with root package name */
    private Map f4231s = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    private Map f4230r = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private Set f4234v = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    private final List f4235w = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private PowerManager.WakeLock f4225m = null;

    /* renamed from: x, reason: collision with root package name */
    private final Object f4236x = new Object();

    /* renamed from: t, reason: collision with root package name */
    private Map f4232t = new HashMap();

    private static class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private e f4237m;

        /* renamed from: n, reason: collision with root package name */
        private final g1.m f4238n;

        /* renamed from: o, reason: collision with root package name */
        private u5.a f4239o;

        a(e eVar, g1.m mVar, u5.a aVar) {
            this.f4237m = eVar;
            this.f4238n = mVar;
            this.f4239o = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f4239o.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f4237m.l(this.f4238n, zBooleanValue);
        }
    }

    public q(Context context, androidx.work.a aVar, i1.c cVar, WorkDatabase workDatabase, List list) {
        this.f4226n = context;
        this.f4227o = aVar;
        this.f4228p = cVar;
        this.f4229q = workDatabase;
        this.f4233u = list;
    }

    private static boolean i(String str, h0 h0Var) {
        if (h0Var == null) {
            b1.j.e().a(f4224y, "WorkerWrapper could not be found for " + str);
            return false;
        }
        h0Var.g();
        b1.j.e().a(f4224y, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g1.v m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f4229q.K().c(str));
        return this.f4229q.J().l(str);
    }

    private void o(final g1.m mVar, final boolean z10) {
        this.f4228p.a().execute(new Runnable() { // from class: androidx.work.impl.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f4218m.l(mVar, z10);
            }
        });
    }

    private void s() {
        synchronized (this.f4236x) {
            if (!(!this.f4230r.isEmpty())) {
                try {
                    this.f4226n.startService(androidx.work.impl.foreground.b.g(this.f4226n));
                } catch (Throwable th) {
                    b1.j.e().d(f4224y, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f4225m;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f4225m = null;
                }
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(String str) {
        synchronized (this.f4236x) {
            this.f4230r.remove(str);
            s();
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void b(String str, b1.e eVar) {
        synchronized (this.f4236x) {
            b1.j.e().f(f4224y, "Moving WorkSpec (" + str + ") to the foreground");
            h0 h0Var = (h0) this.f4231s.remove(str);
            if (h0Var != null) {
                if (this.f4225m == null) {
                    PowerManager.WakeLock wakeLockB = h1.s.b(this.f4226n, "ProcessorForegroundLck");
                    this.f4225m = wakeLockB;
                    wakeLockB.acquire();
                }
                this.f4230r.put(str, h0Var);
                androidx.core.content.a.m(this.f4226n, androidx.work.impl.foreground.b.f(this.f4226n, h0Var.d(), eVar));
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public boolean c(String str) {
        boolean zContainsKey;
        synchronized (this.f4236x) {
            zContainsKey = this.f4230r.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void l(g1.m mVar, boolean z10) {
        synchronized (this.f4236x) {
            h0 h0Var = (h0) this.f4231s.get(mVar.b());
            if (h0Var != null && mVar.equals(h0Var.d())) {
                this.f4231s.remove(mVar.b());
            }
            b1.j.e().a(f4224y, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z10);
            Iterator it = this.f4235w.iterator();
            while (it.hasNext()) {
                ((e) it.next()).l(mVar, z10);
            }
        }
    }

    public void g(e eVar) {
        synchronized (this.f4236x) {
            this.f4235w.add(eVar);
        }
    }

    public g1.v h(String str) {
        synchronized (this.f4236x) {
            h0 h0Var = (h0) this.f4230r.get(str);
            if (h0Var == null) {
                h0Var = (h0) this.f4231s.get(str);
            }
            if (h0Var == null) {
                return null;
            }
            return h0Var.e();
        }
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f4236x) {
            zContains = this.f4234v.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f4236x) {
            z10 = this.f4231s.containsKey(str) || this.f4230r.containsKey(str);
        }
        return z10;
    }

    public void n(e eVar) {
        synchronized (this.f4236x) {
            this.f4235w.remove(eVar);
        }
    }

    public boolean p(u uVar) {
        return q(uVar, null);
    }

    public boolean q(u uVar, WorkerParameters.a aVar) {
        g1.m mVarA = uVar.a();
        final String strB = mVarA.b();
        final ArrayList arrayList = new ArrayList();
        g1.v vVar = (g1.v) this.f4229q.A(new Callable() { // from class: androidx.work.impl.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4221a.m(arrayList, strB);
            }
        });
        if (vVar == null) {
            b1.j.e().k(f4224y, "Didn't find WorkSpec for id " + mVarA);
            o(mVarA, false);
            return false;
        }
        synchronized (this.f4236x) {
            if (k(strB)) {
                Set set = (Set) this.f4232t.get(strB);
                if (((u) set.iterator().next()).a().a() == mVarA.a()) {
                    set.add(uVar);
                    b1.j.e().a(f4224y, "Work " + mVarA + " is already enqueued for processing");
                } else {
                    o(mVarA, false);
                }
                return false;
            }
            if (vVar.f() != mVarA.a()) {
                o(mVarA, false);
                return false;
            }
            h0 h0VarB = new h0.c(this.f4226n, this.f4227o, this.f4228p, this, this.f4229q, vVar, arrayList).d(this.f4233u).c(aVar).b();
            u5.a aVarC = h0VarB.c();
            aVarC.d(new a(this, uVar.a(), aVarC), this.f4228p.a());
            this.f4231s.put(strB, h0VarB);
            HashSet hashSet = new HashSet();
            hashSet.add(uVar);
            this.f4232t.put(strB, hashSet);
            this.f4228p.b().execute(h0VarB);
            b1.j.e().a(f4224y, getClass().getSimpleName() + ": processing " + mVarA);
            return true;
        }
    }

    public boolean r(String str) {
        h0 h0Var;
        boolean z10;
        synchronized (this.f4236x) {
            b1.j.e().a(f4224y, "Processor cancelling " + str);
            this.f4234v.add(str);
            h0Var = (h0) this.f4230r.remove(str);
            z10 = h0Var != null;
            if (h0Var == null) {
                h0Var = (h0) this.f4231s.remove(str);
            }
            if (h0Var != null) {
                this.f4232t.remove(str);
            }
        }
        boolean zI = i(str, h0Var);
        if (z10) {
            s();
        }
        return zI;
    }

    public boolean t(u uVar) {
        h0 h0Var;
        String strB = uVar.a().b();
        synchronized (this.f4236x) {
            b1.j.e().a(f4224y, "Processor stopping foreground work " + strB);
            h0Var = (h0) this.f4230r.remove(strB);
            if (h0Var != null) {
                this.f4232t.remove(strB);
            }
        }
        return i(strB, h0Var);
    }

    public boolean u(u uVar) {
        String strB = uVar.a().b();
        synchronized (this.f4236x) {
            h0 h0Var = (h0) this.f4231s.remove(strB);
            if (h0Var == null) {
                b1.j.e().a(f4224y, "WorkerWrapper could not be found for " + strB);
                return false;
            }
            Set set = (Set) this.f4232t.get(strB);
            if (set != null && set.contains(uVar)) {
                b1.j.e().a(f4224y, "Processor stopping background work " + strB);
                this.f4232t.remove(strB);
                return i(strB, h0Var);
            }
            return false;
        }
    }
}
