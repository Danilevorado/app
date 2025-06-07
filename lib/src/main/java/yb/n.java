package yb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class n extends o implements j {

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28615p = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_queue");

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28616q = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    private final Runnable b0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof bc.f) {
                bc.f fVar = (bc.f) obj;
                Object objJ = fVar.j();
                if (objJ != bc.f.f4612h) {
                    return (Runnable) objJ;
                }
                androidx.work.impl.utils.futures.b.a(f28615p, this, obj, fVar.i());
            } else {
                if (obj == p.f28618b) {
                    return null;
                }
                if (androidx.work.impl.utils.futures.b.a(f28615p, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean d0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (e0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.work.impl.utils.futures.b.a(f28615p, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof bc.f) {
                bc.f fVar = (bc.f) obj;
                int iA = fVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.work.impl.utils.futures.b.a(f28615p, this, obj, fVar.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == p.f28618b) {
                    return false;
                }
                bc.f fVar2 = new bc.f(8, true);
                fVar2.a((Runnable) obj);
                fVar2.a(runnable);
                if (androidx.work.impl.utils.futures.b.a(f28615p, this, obj, fVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private final boolean e0() {
        return this._isCompleted;
    }

    @Override // yb.m
    protected long U() {
        if (super.U() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof bc.f)) {
                return obj == p.f28618b ? Long.MAX_VALUE : 0L;
            }
            if (!((bc.f) obj).g()) {
                return 0L;
            }
        }
        a5.a.a(this._delayed);
        return Long.MAX_VALUE;
    }

    @Override // yb.c
    public final void c(kb.e eVar, Runnable runnable) {
        c0(runnable);
    }

    public void c0(Runnable runnable) {
        if (d0(runnable)) {
            a0();
        } else {
            h.f28604r.c0(runnable);
        }
    }

    protected boolean f0() {
        if (!X()) {
            return false;
        }
        a5.a.a(this._delayed);
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof bc.f) {
                return ((bc.f) obj).g();
            }
            if (obj != p.f28618b) {
                return false;
            }
        }
        return true;
    }

    public long g0() {
        if (Y()) {
            return 0L;
        }
        a5.a.a(this._delayed);
        Runnable runnableB0 = b0();
        if (runnableB0 == null) {
            return U();
        }
        runnableB0.run();
        return 0L;
    }

    protected final void h0() {
        this._queue = null;
        this._delayed = null;
    }
}
