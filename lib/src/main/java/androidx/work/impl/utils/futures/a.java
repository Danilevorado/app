package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a implements u5.a {

    /* renamed from: p, reason: collision with root package name */
    static final boolean f4250p = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: q, reason: collision with root package name */
    private static final Logger f4251q = Logger.getLogger(a.class.getName());

    /* renamed from: r, reason: collision with root package name */
    static final b f4252r;

    /* renamed from: s, reason: collision with root package name */
    private static final Object f4253s;

    /* renamed from: m, reason: collision with root package name */
    volatile Object f4254m;

    /* renamed from: n, reason: collision with root package name */
    volatile e f4255n;

    /* renamed from: o, reason: collision with root package name */
    volatile i f4256o;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f4257c;

        /* renamed from: d, reason: collision with root package name */
        static final c f4258d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f4259a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f4260b;

        static {
            if (a.f4250p) {
                f4258d = null;
                f4257c = null;
            } else {
                f4258d = new c(false, null);
                f4257c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f4259a = z10;
            this.f4260b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f4261b = new d(new C0071a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f4262a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0071a extends Throwable {
            C0071a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f4262a = (Throwable) a.f(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f4263d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f4264a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f4265b;

        /* renamed from: c, reason: collision with root package name */
        e f4266c;

        e(Runnable runnable, Executor executor) {
            this.f4264a = runnable;
            this.f4265b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4267a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4268b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4269c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4270d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4271e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f4267a = atomicReferenceFieldUpdater;
            this.f4268b = atomicReferenceFieldUpdater2;
            this.f4269c = atomicReferenceFieldUpdater3;
            this.f4270d = atomicReferenceFieldUpdater4;
            this.f4271e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.work.impl.utils.futures.b.a(this.f4270d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.work.impl.utils.futures.b.a(this.f4271e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.work.impl.utils.futures.b.a(this.f4269c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f4268b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f4267a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final a f4272m;

        /* renamed from: n, reason: collision with root package name */
        final u5.a f4273n;

        g(a aVar, u5.a aVar2) {
            this.f4272m = aVar;
            this.f4273n = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4272m.f4254m != this) {
                return;
            }
            if (a.f4252r.b(this.f4272m, this, a.k(this.f4273n))) {
                a.h(this.f4272m);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f4255n != eVar) {
                    return false;
                }
                aVar.f4255n = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4254m != obj) {
                    return false;
                }
                aVar.f4254m = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f4256o != iVar) {
                    return false;
                }
                aVar.f4256o = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f4276b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f4275a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f4274c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f4275a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f4276b;

        i() {
            a.f4252r.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f4252r.d(this, iVar);
        }

        void b() {
            Thread thread = this.f4275a;
            if (thread != null) {
                this.f4275a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "o"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "n"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "m"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f4252r = hVar;
        if (th != null) {
            f4251q.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4253s = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        String str = "]";
        try {
            Object objL = l(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(t(objL));
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e5) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e5.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(str);
        }
    }

    private static CancellationException e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object f(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    private e g(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4255n;
        } while (!f4252r.a(this, eVar2, e.f4263d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f4266c;
            eVar4.f4266c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void h(a aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.c();
            e eVarG = aVar.g(eVar);
            while (eVarG != null) {
                eVar = eVarG.f4266c;
                Runnable runnable = eVarG.f4264a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f4272m;
                    if (aVar.f4254m == gVar) {
                        if (f4252r.b(aVar, gVar, k(gVar.f4273n))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i(runnable, eVarG.f4265b);
                }
                eVarG = eVar;
            }
            return;
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f4251q.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    private Object j(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).f4260b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f4262a);
        }
        if (obj == f4253s) {
            return null;
        }
        return obj;
    }

    static Object k(u5.a aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f4254m;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f4259a ? cVar.f4260b != null ? new c(false, cVar.f4260b) : c.f4258d : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f4250p) && zIsCancelled) {
            return c.f4258d;
        }
        try {
            Object objL = l(aVar);
            return objL == null ? f4253s : objL;
        } catch (CancellationException e5) {
            if (zIsCancelled) {
                return new c(false, e5);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e5));
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object l(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void o() {
        i iVar;
        do {
            iVar = this.f4256o;
        } while (!f4252r.c(this, iVar, i.f4274c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f4276b;
        }
    }

    private void p(i iVar) {
        iVar.f4275a = null;
        while (true) {
            i iVar2 = this.f4256o;
            if (iVar2 == i.f4274c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f4276b;
                if (iVar2.f4275a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f4276b = iVar4;
                    if (iVar3.f4275a == null) {
                        break;
                    }
                } else if (!f4252r.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f4254m;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f4250p ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f4257c : c.f4258d;
        a aVar = this;
        boolean z11 = false;
        while (true) {
            if (f4252r.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.m();
                }
                h(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                u5.a aVar2 = ((g) obj).f4273n;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z10);
                    return true;
                }
                aVar = (a) aVar2;
                obj = aVar.f4254m;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f4254m;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // u5.a
    public final void d(Runnable runnable, Executor executor) {
        f(runnable);
        f(executor);
        e eVar = this.f4255n;
        if (eVar != e.f4263d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4266c = eVar;
                if (f4252r.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f4255n;
                }
            } while (eVar != e.f4263d);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f4254m;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return j(obj2);
        }
        i iVar = this.f4256o;
        if (iVar != i.f4274c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f4252r.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f4254m;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return j(obj);
                }
                iVar = this.f4256o;
            } while (iVar != i.f4274c);
        }
        return j(this.f4254m);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4254m;
        if ((obj != null) && (!(obj instanceof g))) {
            return j(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f4256o;
            if (iVar != i.f4274c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f4252r.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4254m;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return j(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(iVar2);
                    } else {
                        iVar = this.f4256o;
                    }
                } while (iVar != i.f4274c);
            }
            return j(this.f4254m);
        }
        while (nanos > 0) {
            Object obj3 = this.f4254m;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return j(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4254m instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f4254m != null);
    }

    protected void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String n() {
        Object obj = this.f4254m;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f4273n) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(Object obj) {
        if (obj == null) {
            obj = f4253s;
        }
        if (!f4252r.b(this, null, obj)) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean r(Throwable th) {
        if (!f4252r.b(this, null, new d((Throwable) f(th)))) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean s(u5.a aVar) {
        d dVar;
        f(aVar);
        Object obj = this.f4254m;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f4252r.b(this, null, k(aVar))) {
                    return false;
                }
                h(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (f4252r.b(this, null, gVar)) {
                try {
                    aVar.d(gVar, androidx.work.impl.utils.futures.c.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f4261b;
                    }
                    f4252r.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f4254m;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f4259a);
        }
        return false;
    }

    public String toString() {
        String strN;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                a(sb2);
            } else {
                try {
                    strN = n();
                } catch (RuntimeException e5) {
                    strN = "Exception thrown from implementation: " + e5.getClass();
                }
                if (strN == null || strN.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb2);
                } else {
                    sb2.append("PENDING, info=[");
                    sb2.append(strN);
                    sb2.append("]");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
