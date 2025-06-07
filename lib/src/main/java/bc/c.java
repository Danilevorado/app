package bc;

/* loaded from: classes2.dex */
public final class c extends yb.c implements Runnable, yb.j {

    /* renamed from: n, reason: collision with root package name */
    private final yb.c f4603n;

    /* renamed from: o, reason: collision with root package name */
    private final int f4604o;

    /* renamed from: p, reason: collision with root package name */
    private final /* synthetic */ yb.j f4605p;

    /* renamed from: q, reason: collision with root package name */
    private final e f4606q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f4607r;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public c(yb.c cVar, int i10) {
        this.f4603n = cVar;
        this.f4604o = i10;
        yb.j jVar = cVar instanceof yb.j ? (yb.j) cVar : null;
        this.f4605p = jVar == null ? yb.i.a() : jVar;
        this.f4606q = new e(false);
        this.f4607r = new Object();
    }

    private final boolean U() {
        synchronized (this.f4607r) {
            if (this.runningWorkers >= this.f4604o) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    private final boolean y(Runnable runnable) {
        this.f4606q.a(runnable);
        return this.runningWorkers >= this.f4604o;
    }

    @Override // yb.c
    public void c(kb.e eVar, Runnable runnable) {
        if (!y(runnable) && U()) {
            this.f4603n.c(this, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r1 = r4.f4607r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.f4606q.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r4.runningWorkers++;
        r2 = hb.q.f24177a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            bc.e r2 = r4.f4606q
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kb.f r3 = kb.f.f24958m
            yb.f.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            yb.c r2 = r4.f4603n
            boolean r2 = r2.e(r4)
            if (r2 == 0) goto L2
            yb.c r0 = r4.f4603n
            r0.c(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f4607r
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            bc.e r2 = r4.f4606q     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            hb.q r2 = hb.q.f24177a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.c.run():void");
    }
}
