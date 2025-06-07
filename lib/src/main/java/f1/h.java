package f1;

import android.content.Context;
import hb.q;
import ib.r;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final i1.c f23604a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f23605b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f23606c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f23607d;

    /* renamed from: e, reason: collision with root package name */
    private Object f23608e;

    protected h(Context context, i1.c cVar) {
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
        this.f23604a = cVar;
        Context applicationContext = context.getApplicationContext();
        rb.h.d(applicationContext, "context.applicationContext");
        this.f23605b = applicationContext;
        this.f23606c = new Object();
        this.f23607d = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        rb.h.e(list, "$listenersList");
        rb.h.e(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((d1.a) it.next()).a(hVar.f23608e);
        }
    }

    public final void c(d1.a aVar) {
        rb.h.e(aVar, "listener");
        synchronized (this.f23606c) {
            if (this.f23607d.add(aVar)) {
                if (this.f23607d.size() == 1) {
                    this.f23608e = e();
                    b1.j.e().a(i.f23609a, getClass().getSimpleName() + ": initial state = " + this.f23608e);
                    h();
                }
                aVar.a(this.f23608e);
            }
            q qVar = q.f24177a;
        }
    }

    protected final Context d() {
        return this.f23605b;
    }

    public abstract Object e();

    public final void f(d1.a aVar) {
        rb.h.e(aVar, "listener");
        synchronized (this.f23606c) {
            if (this.f23607d.remove(aVar) && this.f23607d.isEmpty()) {
                i();
            }
            q qVar = q.f24177a;
        }
    }

    public final void g(Object obj) {
        synchronized (this.f23606c) {
            Object obj2 = this.f23608e;
            if (obj2 == null || !rb.h.a(obj2, obj)) {
                this.f23608e = obj;
                final List listN = r.n(this.f23607d);
                this.f23604a.a().execute(new Runnable() { // from class: f1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listN, this);
                    }
                });
                q qVar = q.f24177a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
