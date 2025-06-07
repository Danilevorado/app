package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f369a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList f370b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private androidx.core.util.a f371c;

    public g(boolean z10) {
        this.f369a = z10;
    }

    void a(a aVar) {
        this.f370b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f369a;
    }

    public final void d() {
        Iterator it = this.f370b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    void e(a aVar) {
        this.f370b.remove(aVar);
    }

    public final void f(boolean z10) {
        this.f369a = z10;
        androidx.core.util.a aVar = this.f371c;
        if (aVar != null) {
            aVar.a(Boolean.valueOf(z10));
        }
    }

    void g(androidx.core.util.a aVar) {
        this.f371c = aVar;
    }
}
