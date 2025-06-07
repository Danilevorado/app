package x5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class u implements e6.d, e6.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f28336a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f28337b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f28338c;

    u(Executor executor) {
        this.f28338c = executor;
    }

    private synchronized Set e(e6.a aVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, e6.a aVar) {
        ((e6.b) entry.getKey()).a(aVar);
    }

    @Override // e6.d
    public synchronized void a(Class cls, Executor executor, e6.b bVar) {
        c0.b(cls);
        c0.b(bVar);
        c0.b(executor);
        if (!this.f28336a.containsKey(cls)) {
            this.f28336a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f28336a.get(cls)).put(bVar, executor);
    }

    @Override // e6.d
    public void b(Class cls, e6.b bVar) {
        a(cls, this.f28338c, bVar);
    }

    void d() {
        Queue queue;
        synchronized (this) {
            queue = this.f28337b;
            if (queue != null) {
                this.f28337b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                a5.a.a(it.next());
                g(null);
            }
        }
    }

    public void g(final e6.a aVar) {
        c0.b(aVar);
        synchronized (this) {
            Queue queue = this.f28337b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry entry : e(aVar)) {
                ((Executor) entry.getValue()).execute(new Runnable(entry, aVar) { // from class: x5.t

                    /* renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ Map.Entry f28335m;

                    @Override // java.lang.Runnable
                    public final void run() {
                        u.f(this.f28335m, null);
                    }
                });
            }
        }
    }
}
