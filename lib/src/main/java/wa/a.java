package wa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Lock f28092a;

    /* renamed from: b, reason: collision with root package name */
    private final d8.c f28093b;

    /* renamed from: c, reason: collision with root package name */
    private final v9.a f28094c;

    /* renamed from: d, reason: collision with root package name */
    private final da.a f28095d;

    /* renamed from: e, reason: collision with root package name */
    private final ua.a f28096e;

    /* renamed from: f, reason: collision with root package name */
    private final cb.a f28097f;

    /* renamed from: wa.a$a, reason: collision with other inner class name */
    class RunnableC0208a implements Runnable {
        RunnableC0208a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d();
        }
    }

    public a(ya.a aVar, d8.c cVar, v9.a aVar2, da.a aVar3, ua.a aVar4, cb.a aVar5) {
        this.f28092a = aVar.a();
        this.f28093b = cVar;
        this.f28094c = aVar2;
        this.f28095d = aVar3;
        this.f28096e = aVar4;
        this.f28097f = aVar5;
        a();
    }

    private void a() {
        this.f28096e.lock();
        this.f28092a.lock();
        try {
            this.f28093b.submit(new RunnableC0208a()).b();
        } finally {
            this.f28096e.unlock();
            this.f28092a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (e()) {
            for (ua.c cVar : this.f28096e.a()) {
                String strF = cVar.f();
                this.f28095d.b(strF, this.f28097f.c(strF, cVar.e()));
                this.f28094c.c(strF);
            }
        }
    }

    private boolean e() {
        return !this.f28095d.a().containsAll(this.f28094c.a());
    }

    @Override // wa.b
    public Object b(String str, Object obj) {
        this.f28092a.lock();
        try {
            Object objC = this.f28095d.c(str);
            return objC == null ? obj : this.f28097f.b(objC);
        } finally {
            this.f28092a.unlock();
        }
    }

    @Override // wa.b
    public boolean contains(String str) {
        this.f28092a.lock();
        try {
            return this.f28095d.contains(str);
        } finally {
            this.f28092a.unlock();
        }
    }

    @Override // wa.b
    public Map getAll() {
        this.f28092a.lock();
        try {
            Map all = this.f28095d.getAll();
            HashMap map = new HashMap(all.size());
            for (String str : all.keySet()) {
                map.put(str, this.f28097f.b(all.get(str)));
            }
            return Collections.unmodifiableMap(map);
        } finally {
            this.f28092a.unlock();
        }
    }
}
