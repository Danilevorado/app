package bc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4608a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public e(boolean z10) {
        this._cur = new f(8, z10);
    }

    public final boolean a(Object obj) {
        while (true) {
            f fVar = (f) this._cur;
            int iA = fVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.work.impl.utils.futures.b.a(f4608a, this, fVar, fVar.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            f fVar = (f) this._cur;
            if (fVar.d()) {
                return;
            } else {
                androidx.work.impl.utils.futures.b.a(f4608a, this, fVar, fVar.i());
            }
        }
    }

    public final int c() {
        return ((f) this._cur).f();
    }

    public final Object d() {
        while (true) {
            f fVar = (f) this._cur;
            Object objJ = fVar.j();
            if (objJ != f.f4612h) {
                return objJ;
            }
            androidx.work.impl.utils.futures.b.a(f4608a, this, fVar, fVar.i());
        }
    }
}
