package zb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kb.e;
import rb.f;
import rb.h;
import yb.l;
import yb.s;

/* loaded from: classes2.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f28927n;

    /* renamed from: o, reason: collision with root package name */
    private final String f28928o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f28929p;

    /* renamed from: q, reason: collision with root package name */
    private final a f28930q;

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ a(Handler handler, String str, int i10, f fVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private a(Handler handler, String str, boolean z10) {
        super(null);
        this.f28927n = handler;
        this.f28928o = str;
        this.f28929p = z10;
        this._immediate = z10 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f28930q = aVar;
    }

    private final void V(e eVar, Runnable runnable) {
        s.a(eVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        l.a().c(eVar, runnable);
    }

    @Override // yb.u
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public a y() {
        return this.f28930q;
    }

    @Override // yb.c
    public void c(e eVar, Runnable runnable) {
        if (this.f28927n.post(runnable)) {
            return;
        }
        V(eVar, runnable);
    }

    @Override // yb.c
    public boolean e(e eVar) {
        return (this.f28929p && h.a(Looper.myLooper(), this.f28927n.getLooper())) ? false : true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f28927n == this.f28927n;
    }

    public int hashCode() {
        return System.identityHashCode(this.f28927n);
    }

    @Override // yb.c
    public String toString() {
        String strU = U();
        if (strU != null) {
            return strU;
        }
        String string = this.f28928o;
        if (string == null) {
            string = this.f28927n.toString();
        }
        return this.f28929p ? h.j(string, ".immediate") : string;
    }
}
