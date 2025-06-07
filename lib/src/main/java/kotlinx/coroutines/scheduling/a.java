package kotlinx.coroutines.scheduling;

import hb.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: m, reason: collision with root package name */
    public final int f24964m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24965n;

    /* renamed from: o, reason: collision with root package name */
    public final long f24966o;

    /* renamed from: p, reason: collision with root package name */
    public final String f24967p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f24968q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f24969r;

    /* renamed from: s, reason: collision with root package name */
    public final bc.k f24970s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0156a f24959t = new C0156a(null);

    /* renamed from: x, reason: collision with root package name */
    public static final bc.l f24963x = new bc.l("NOT_IN_STACK");

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f24960u = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f24961v = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24962w = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a, reason: collision with other inner class name */
    public static final class C0156a {
        private C0156a() {
        }

        public /* synthetic */ C0156a(rb.f fVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24971a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f24971a = iArr;
        }
    }

    public final class c extends Thread {

        /* renamed from: t, reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f24972t = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: m, reason: collision with root package name */
        public final n f24973m;

        /* renamed from: n, reason: collision with root package name */
        public d f24974n;
        private volatile Object nextParkedWorker;

        /* renamed from: o, reason: collision with root package name */
        private long f24975o;

        /* renamed from: p, reason: collision with root package name */
        private long f24976p;

        /* renamed from: q, reason: collision with root package name */
        private int f24977q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f24978r;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f24973m = new n();
            this.f24974n = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f24963x;
            this.f24977q = sb.c.f27092m.b();
        }

        public c(int i10) {
            this();
            o(i10);
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.f24961v.addAndGet(a.this, -2097152L);
            if (this.f24974n != d.TERMINATED) {
                this.f24974n = d.DORMANT;
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && s(d.BLOCKING)) {
                a.this.c0();
            }
        }

        private final void d(h hVar) {
            int iB = hVar.f24996n.b();
            i(iB);
            c(iB);
            a.this.Z(hVar);
            b(iB);
        }

        private final h e(boolean z10) {
            h hVarM;
            h hVarM2;
            if (z10) {
                boolean z11 = k(a.this.f24964m * 2) == 0;
                if (z11 && (hVarM2 = m()) != null) {
                    return hVarM2;
                }
                h hVarH = this.f24973m.h();
                if (hVarH != null) {
                    return hVarH;
                }
                if (!z11 && (hVarM = m()) != null) {
                    return hVarM;
                }
            } else {
                h hVarM3 = m();
                if (hVarM3 != null) {
                    return hVarM3;
                }
            }
            return t(false);
        }

        private final void i(int i10) {
            this.f24975o = 0L;
            if (this.f24974n == d.PARKING) {
                this.f24974n = d.BLOCKING;
            }
        }

        private final boolean j() {
            return this.nextParkedWorker != a.f24963x;
        }

        private final void l() {
            if (this.f24975o == 0) {
                this.f24975o = System.nanoTime() + a.this.f24966o;
            }
            LockSupport.parkNanos(a.this.f24966o);
            if (System.nanoTime() - this.f24975o >= 0) {
                this.f24975o = 0L;
                u();
            }
        }

        private final h m() {
            kotlinx.coroutines.scheduling.d dVar;
            if (k(2) == 0) {
                h hVar = (h) a.this.f24968q.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f24969r;
            } else {
                h hVar2 = (h) a.this.f24969r.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f24968q;
            }
            return (h) dVar.d();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f24974n != d.TERMINATED) {
                    h hVarF = f(this.f24978r);
                    if (hVarF != null) {
                        this.f24976p = 0L;
                        d(hVarF);
                    } else {
                        this.f24978r = false;
                        if (this.f24976p == 0) {
                            r();
                        } else if (z10) {
                            s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f24976p);
                            this.f24976p = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            s(d.TERMINATED);
        }

        private final boolean q() {
            boolean z10;
            if (this.f24974n != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (a.f24961v.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f24974n = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void r() {
            if (!j()) {
                a.this.X(this);
                return;
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !a.this.isTerminated() && this.f24974n != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final h t(boolean z10) {
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iK = k(i10);
            a aVar = a.this;
            int i11 = 0;
            long jMin = Long.MAX_VALUE;
            while (i11 < i10) {
                i11++;
                iK++;
                if (iK > i10) {
                    iK = 1;
                }
                c cVar = (c) aVar.f24970s.b(iK);
                if (cVar != null && cVar != this) {
                    n nVar = this.f24973m;
                    n nVar2 = cVar.f24973m;
                    long jK = z10 ? nVar.k(nVar2) : nVar.l(nVar2);
                    if (jK == -1) {
                        return this.f24973m.h();
                    }
                    if (jK > 0) {
                        jMin = Math.min(jMin, jK);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f24976p = jMin;
            return null;
        }

        private final void u() {
            a aVar = a.this;
            synchronized (aVar.f24970s) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f24964m) {
                    return;
                }
                if (f24972t.compareAndSet(this, -1, 1)) {
                    int iG = g();
                    o(0);
                    aVar.Y(this, iG, 0);
                    int andDecrement = (int) (a.f24961v.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != iG) {
                        Object objB = aVar.f24970s.b(andDecrement);
                        rb.h.b(objB);
                        c cVar = (c) objB;
                        aVar.f24970s.c(iG, cVar);
                        cVar.o(iG);
                        aVar.Y(cVar, andDecrement, iG);
                    }
                    aVar.f24970s.c(andDecrement, null);
                    q qVar = q.f24177a;
                    this.f24974n = d.TERMINATED;
                }
            }
        }

        public final h f(boolean z10) {
            h hVarH;
            if (q()) {
                return e(z10);
            }
            if (!z10 || (hVarH = this.f24973m.h()) == null) {
                hVarH = (h) a.this.f24969r.d();
            }
            return hVarH == null ? t(true) : hVarH;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i10) {
            int i11 = this.f24977q;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f24977q = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void o(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f24967p);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.f24974n;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f24961v.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f24974n = dVar;
            }
            return z10;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f24964m = i10;
        this.f24965n = i11;
        this.f24966o = j10;
        this.f24967p = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f24968q = new kotlinx.coroutines.scheduling.d();
        this.f24969r = new kotlinx.coroutines.scheduling.d();
        this.parkedWorkersStack = 0L;
        this.f24970s = new bc.k(i10 + 1);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void U(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f25004f;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.y(runnable, iVar, z10);
    }

    private final int V(c cVar) {
        int iG;
        do {
            Object objH = cVar.h();
            if (objH == f24963x) {
                return -1;
            }
            if (objH == null) {
                return 0;
            }
            cVar = (c) objH;
            iG = cVar.g();
        } while (iG == 0);
        return iG;
    }

    private final c W() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c cVar = (c) this.f24970s.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iV = V(cVar);
            if (iV >= 0 && f24960u.compareAndSet(this, j10, iV | j11)) {
                cVar.p(f24963x);
                return cVar;
            }
        }
    }

    private final boolean a(h hVar) {
        return (hVar.f24996n.b() == 1 ? this.f24969r : this.f24968q).a(hVar);
    }

    private final void b0(boolean z10) {
        long jAddAndGet = f24961v.addAndGet(this, 2097152L);
        if (z10 || g0() || e0(jAddAndGet)) {
            return;
        }
        g0();
    }

    private final int c() {
        int i10;
        synchronized (this.f24970s) {
            if (isTerminated()) {
                i10 = -1;
            } else {
                long j10 = this.controlState;
                int i11 = (int) (j10 & 2097151);
                int iA = ub.f.a(i11 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iA >= this.f24964m) {
                    return 0;
                }
                if (i11 >= this.f24965n) {
                    return 0;
                }
                int i12 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i12 > 0 && this.f24970s.b(i12) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(i12);
                this.f24970s.c(i12, cVar);
                if (!(i12 == ((int) (2097151 & f24961v.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i10 = iA + 1;
            }
            return i10;
        }
    }

    private final h d0(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f24974n == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f24996n.b() == 0 && cVar.f24974n == d.BLOCKING) {
            return hVar;
        }
        cVar.f24978r = true;
        return cVar.f24973m.a(hVar, z10);
    }

    private final boolean e0(long j10) {
        if (ub.f.a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f24964m) {
            int iC = c();
            if (iC == 1 && this.f24964m > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    private final c f() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar != null && rb.h.a(a.this, this)) {
            return cVar;
        }
        return null;
    }

    static /* synthetic */ boolean f0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.controlState;
        }
        return aVar.e0(j10);
    }

    private final boolean g0() {
        c cVarW;
        do {
            cVarW = W();
            if (cVarW == null) {
                return false;
            }
        } while (!c.f24972t.compareAndSet(cVarW, -1, 0));
        LockSupport.unpark(cVarW);
        return true;
    }

    public final boolean X(c cVar) {
        long j10;
        int iG;
        if (cVar.h() != f24963x) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            iG = cVar.g();
            cVar.p(this.f24970s.b((int) (2097151 & j10)));
        } while (!f24960u.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | iG));
        return true;
    }

    public final void Y(c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int iV = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iV == i10) {
                iV = i11 == 0 ? V(cVar) : i11;
            }
            if (iV >= 0 && f24960u.compareAndSet(this, j10, j11 | iV)) {
                return;
            }
        }
    }

    public final void Z(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void a0(long j10) throws InterruptedException {
        int i10;
        if (f24962w.compareAndSet(this, 0, 1)) {
            c cVarF = f();
            synchronized (this.f24970s) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    Object objB = this.f24970s.b(i11);
                    rb.h.b(objB);
                    c cVar = (c) objB;
                    if (cVar != cVarF) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f24973m.g(this.f24969r);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            this.f24969r.b();
            this.f24968q.b();
            while (true) {
                h hVarF = cVarF == null ? null : cVarF.f(true);
                if (hVarF == null && (hVarF = (h) this.f24968q.d()) == null && (hVarF = (h) this.f24969r.d()) == null) {
                    break;
                } else {
                    Z(hVarF);
                }
            }
            if (cVarF != null) {
                cVarF.s(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void c0() {
        if (g0() || f0(this, 0L, 1, null)) {
            return;
        }
        g0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        a0(10000L);
    }

    public final h e(Runnable runnable, i iVar) {
        long jA = l.f25003e.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, jA, iVar);
        }
        h hVar = (h) runnable;
        hVar.f24995m = jA;
        hVar.f24996n = iVar;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        U(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int iA = this.f24970s.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (i15 < iA) {
            int i16 = i15 + 1;
            c cVar = (c) this.f24970s.b(i15);
            if (cVar != null) {
                int iF = cVar.f24973m.f();
                int i17 = b.f24971a[cVar.f24974n.ordinal()];
                if (i17 != 1) {
                    if (i17 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(iF);
                        c10 = 'b';
                    } else if (i17 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(iF);
                        c10 = 'c';
                    } else if (i17 == 4) {
                        i13++;
                        if (iF > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(iF);
                            c10 = 'd';
                        }
                    } else if (i17 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
            i15 = i16;
        }
        long j10 = this.controlState;
        return this.f24967p + '@' + yb.g.b(this) + "[Pool Size {core = " + this.f24964m + ", max = " + this.f24965n + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f24968q.c() + ", global blocking queue size = " + this.f24969r.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f24964m - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void y(Runnable runnable, i iVar, boolean z10) {
        yb.b.a();
        h hVarE = e(runnable, iVar);
        c cVarF = f();
        h hVarD0 = d0(cVarF, hVarE, z10);
        if (hVarD0 != null && !a(hVarD0)) {
            throw new RejectedExecutionException(rb.h.j(this.f24967p, " was terminated"));
        }
        boolean z11 = z10 && cVarF != null;
        if (hVarE.f24996n.b() != 0) {
            b0(z11);
        } else {
            if (z11) {
                return;
            }
            c0();
        }
    }
}
