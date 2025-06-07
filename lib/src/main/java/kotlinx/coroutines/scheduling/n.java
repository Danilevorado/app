package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25007b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25008c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25009d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25010e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f25011a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ h b(n nVar, h hVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return nVar.a(hVar, z10);
    }

    private final h c(h hVar) {
        if (hVar.f24996n.b() == 1) {
            f25010e.incrementAndGet(this);
        }
        if (e() == 127) {
            return hVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f25011a.get(i10) != null) {
            Thread.yield();
        }
        this.f25011a.lazySet(i10, hVar);
        f25008c.incrementAndGet(this);
        return null;
    }

    private final void d(h hVar) {
        if (hVar != null) {
            if (hVar.f24996n.b() == 1) {
                f25010e.decrementAndGet(this);
            }
        }
    }

    private final h i() {
        h hVar;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f25009d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f25011a.getAndSet(i11, null)) != null) {
                d(hVar);
                return hVar;
            }
        }
    }

    private final boolean j(d dVar) {
        h hVarI = i();
        if (hVarI == null) {
            return false;
        }
        dVar.a(hVarI);
        return true;
    }

    private final long m(n nVar, boolean z10) {
        h hVar;
        do {
            hVar = (h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z10) {
                if (!(hVar.f24996n.b() == 1)) {
                    return -2L;
                }
            }
            long jA = l.f25003e.a() - hVar.f24995m;
            long j10 = l.f24999a;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.work.impl.utils.futures.b.a(f25007b, nVar, hVar, null));
        b(this, hVar, false, 2, null);
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return c(hVar);
        }
        h hVar2 = (h) f25007b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return c(hVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        h hVar = (h) f25007b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h h() {
        h hVar = (h) f25007b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return m(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(kotlinx.coroutines.scheduling.n r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.f25011a
        L6:
            r3 = 1
            if (r0 == r1) goto L3b
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 != 0) goto L10
            goto L3b
        L10:
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.h r5 = (kotlinx.coroutines.scheduling.h) r5
            if (r5 == 0) goto L38
            kotlinx.coroutines.scheduling.i r6 = r5.f24996n
            int r6 = r6.b()
            r7 = 0
            if (r6 != r3) goto L22
            goto L23
        L22:
            r3 = r7
        L23:
            if (r3 == 0) goto L38
            r3 = 0
            boolean r4 = r2.compareAndSet(r4, r5, r3)
            if (r4 == 0) goto L38
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.n.f25010e
            r0.decrementAndGet(r9)
            r9 = 2
            b(r8, r5, r7, r9, r3)
            r0 = -1
            return r0
        L38:
            int r0 = r0 + 1
            goto L6
        L3b:
            long r0 = r8.m(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.n.k(kotlinx.coroutines.scheduling.n):long");
    }

    public final long l(n nVar) {
        h hVarI = nVar.i();
        if (hVarI == null) {
            return m(nVar, false);
        }
        b(this, hVarI, false, 2, null);
        return -1L;
    }
}
