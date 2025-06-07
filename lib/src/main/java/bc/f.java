package bc;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class f {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f4613a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4614b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4615c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f4616d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4609e = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final l f4612h = new l("REMOVE_FROZEN");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4610f = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4611g = AtomicLongFieldUpdater.newUpdater(f.class, "_state");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | (i10 << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (i10 << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4617a;

        public b(int i10) {
            this.f4617a = i10;
        }
    }

    public f(int i10, boolean z10) {
        this.f4613a = i10;
        this.f4614b = z10;
        int i11 = i10 - 1;
        this.f4615c = i11;
        this.f4616d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final f b(long j10) {
        f fVar = new f(this.f4613a * 2, this.f4614b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f4615c;
            if ((i10 & i12) == (i11 & i12)) {
                fVar._state = f4609e.d(j10, 1152921504606846976L);
                return fVar;
            }
            Object bVar = this.f4616d.get(i12 & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            fVar.f4616d.set(fVar.f4615c & i10, bVar);
            i10++;
        }
    }

    private final f c(long j10) {
        while (true) {
            f fVar = (f) this._next;
            if (fVar != null) {
                return fVar;
            }
            androidx.work.impl.utils.futures.b.a(f4610f, this, null, b(j10));
        }
    }

    private final f e(int i10, Object obj) {
        Object obj2 = this.f4616d.get(this.f4615c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f4617a != i10) {
            return null;
        }
        this.f4616d.set(i10 & this.f4615c, obj);
        return this;
    }

    private final long h() {
        long j10;
        long j11;
        do {
            j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!f4611g.compareAndSet(this, j10, j11));
        return j11;
    }

    private final f k(int i10, int i11) {
        long j10;
        a aVar;
        int i12;
        do {
            j10 = this._state;
            aVar = f4609e;
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return i();
            }
        } while (!f4611g.compareAndSet(this, j10, aVar.b(j10, i11)));
        this.f4616d.set(this.f4615c & i12, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            bc.f$a r14 = bc.f.f4609e
            int r14 = r14.a(r2)
            return r14
        L12:
            bc.f$a r0 = bc.f.f4609e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f4615c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f4614b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f4616d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f4613a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = bc.f.f4611g
            long r11 = r0.c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f4616d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L73
            goto L7d
        L73:
            bc.f r0 = r0.i()
            bc.f r0 = r0.e(r9, r14)
            if (r0 != 0) goto L69
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.f.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f4611g.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j10 = this._state;
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean g() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final f i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j10 = this._state;
            if ((1152921504606846976L & j10) != 0) {
                return f4612h;
            }
            a aVar = f4609e;
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f4615c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f4616d.get(i12 & i10);
            if (obj == null) {
                if (this.f4614b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & 1073741823;
                if (f4611g.compareAndSet(this, j10, aVar.b(j10, i13))) {
                    this.f4616d.set(this.f4615c & i10, null);
                    return obj;
                }
                if (this.f4614b) {
                    f fVarK = this;
                    do {
                        fVarK = fVarK.k(i10, i13);
                    } while (fVarK != null);
                    return obj;
                }
            }
        }
    }
}
