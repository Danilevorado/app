package wa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class c implements wa.b {

    /* renamed from: a, reason: collision with root package name */
    private final Lock f28099a;

    /* renamed from: b, reason: collision with root package name */
    private final d8.c f28100b;

    /* renamed from: c, reason: collision with root package name */
    private final v9.a f28101c;

    /* renamed from: d, reason: collision with root package name */
    private final da.a f28102d;

    /* renamed from: e, reason: collision with root package name */
    private final ua.a f28103e;

    /* renamed from: f, reason: collision with root package name */
    private final cb.a f28104f;

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28105a;

        a(String str) {
            this.f28105a = str;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return c.this.a(this.f28105a);
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28107a;

        b(String str) {
            this.f28107a = str;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return c.this.a(this.f28107a);
        }
    }

    public c(ya.a aVar, d8.c cVar, v9.a aVar2, da.a aVar3, ua.a aVar4, cb.a aVar5) {
        this.f28099a = aVar.a();
        this.f28100b = cVar;
        this.f28101c = aVar2;
        this.f28102d = aVar3;
        this.f28103e = aVar4;
        this.f28104f = aVar5;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str) {
        Object objC = this.f28104f.c(str, this.f28103e.c(str).e());
        this.f28102d.b(str, objC);
        return objC;
    }

    private void d() {
        this.f28099a.lock();
        try {
            Iterator it = this.f28103e.e().iterator();
            while (it.hasNext()) {
                this.f28101c.c((String) it.next());
            }
        } finally {
            this.f28099a.unlock();
        }
    }

    private Object e(String str) {
        Object objC = this.f28102d.c(str);
        if (objC != null) {
            return objC;
        }
        this.f28103e.lock();
        try {
            return this.f28100b.submit(new a(str)).c();
        } finally {
            this.f28103e.unlock();
        }
    }

    private Object f(String str, Object obj) {
        Object objC = this.f28102d.c(str);
        if (objC != null) {
            return objC;
        }
        if (!this.f28101c.a().contains(str)) {
            return obj;
        }
        this.f28103e.lock();
        try {
            return this.f28100b.submit(new b(str)).a(obj);
        } finally {
            this.f28103e.unlock();
        }
    }

    @Override // wa.b
    public Object b(String str, Object obj) {
        this.f28099a.lock();
        try {
            return this.f28104f.b(f(str, obj));
        } finally {
            this.f28099a.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // wa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(java.lang.String r2) {
        /*
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.f28099a
            r0.lock()
            v9.a r0 = r1.f28101c     // Catch: java.lang.Throwable -> L22
            java.util.Set r0 = r0.a()     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1b
            da.a r0 = r1.f28102d     // Catch: java.lang.Throwable -> L22
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.util.concurrent.locks.Lock r0 = r1.f28099a
            r0.unlock()
            return r2
        L22:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.f28099a
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.c.contains(java.lang.String):boolean");
    }

    @Override // wa.b
    public Map getAll() {
        this.f28099a.lock();
        try {
            Set<String> setA = this.f28101c.a();
            HashMap map = new HashMap(setA.size());
            for (String str : setA) {
                map.put(str, this.f28104f.b(e(str)));
            }
            return Collections.unmodifiableMap(map);
        } finally {
            this.f28099a.unlock();
        }
    }
}
