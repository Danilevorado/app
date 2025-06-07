package x1;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import x1.m;

/* loaded from: classes.dex */
public class q {

    /* renamed from: e, reason: collision with root package name */
    private static final c f28196e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final m f28197f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f28198a;

    /* renamed from: b, reason: collision with root package name */
    private final c f28199b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f28200c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.util.e f28201d;

    private static class a implements m {
        a() {
        }

        @Override // x1.m
        public m.a a(Object obj, int i10, int i11, r1.h hVar) {
            return null;
        }

        @Override // x1.m
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class f28202a;

        /* renamed from: b, reason: collision with root package name */
        final Class f28203b;

        /* renamed from: c, reason: collision with root package name */
        final n f28204c;

        public b(Class cls, Class cls2, n nVar) {
            this.f28202a = cls;
            this.f28203b = cls2;
            this.f28204c = nVar;
        }

        public boolean a(Class cls) {
            return this.f28202a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f28203b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public p a(List list, androidx.core.util.e eVar) {
            return new p(list, eVar);
        }
    }

    public q(androidx.core.util.e eVar) {
        this(eVar, f28196e);
    }

    q(androidx.core.util.e eVar, c cVar) {
        this.f28198a = new ArrayList();
        this.f28200c = new HashSet();
        this.f28201d = eVar;
        this.f28199b = cVar;
    }

    private void a(Class cls, Class cls2, n nVar, boolean z10) {
        b bVar = new b(cls, cls2, nVar);
        List list = this.f28198a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private m e(b bVar) {
        return (m) n2.k.d(bVar.f28204c.b(this));
    }

    private static m f() {
        return f28197f;
    }

    synchronized void b(Class cls, Class cls2, n nVar) {
        a(cls, cls2, nVar, true);
    }

    synchronized List c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f28198a) {
                if (!this.f28200c.contains(bVar) && bVar.a(cls)) {
                    this.f28200c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f28200c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f28200c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized m d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f28198a) {
                if (this.f28200c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f28200c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f28200c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f28199b.a(arrayList, this.f28201d);
            }
            if (arrayList.size() == 1) {
                return (m) arrayList.get(0);
            }
            if (!z10) {
                throw new i.c(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f28200c.clear();
            throw th;
        }
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f28198a) {
            if (!arrayList.contains(bVar.f28203b) && bVar.a(cls)) {
                arrayList.add(bVar.f28203b);
            }
        }
        return arrayList;
    }
}
