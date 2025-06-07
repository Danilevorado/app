package c1;

import b1.j;
import b1.q;
import g1.v;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    static final String f4643d = j.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final b f4644a;

    /* renamed from: b, reason: collision with root package name */
    private final q f4645b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f4646c = new HashMap();

    /* renamed from: c1.a$a, reason: collision with other inner class name */
    class RunnableC0084a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ v f4647m;

        RunnableC0084a(v vVar) {
            this.f4647m = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.e().a(a.f4643d, "Scheduling work " + this.f4647m.f23739a);
            a.this.f4644a.b(this.f4647m);
        }
    }

    public a(b bVar, q qVar) {
        this.f4644a = bVar;
        this.f4645b = qVar;
    }

    public void a(v vVar) {
        Runnable runnable = (Runnable) this.f4646c.remove(vVar.f23739a);
        if (runnable != null) {
            this.f4645b.b(runnable);
        }
        RunnableC0084a runnableC0084a = new RunnableC0084a(vVar);
        this.f4646c.put(vVar.f23739a, runnableC0084a);
        this.f4645b.a(vVar.c() - System.currentTimeMillis(), runnableC0084a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f4646c.remove(str);
        if (runnable != null) {
            this.f4645b.b(runnable);
        }
    }
}
