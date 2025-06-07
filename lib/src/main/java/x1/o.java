package x1;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final q f28183a;

    /* renamed from: b, reason: collision with root package name */
    private final a f28184b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f28185a = new HashMap();

        /* renamed from: x1.o$a$a, reason: collision with other inner class name */
        private static class C0212a {

            /* renamed from: a, reason: collision with root package name */
            final List f28186a;

            public C0212a(List list) {
                this.f28186a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f28185a.clear();
        }

        public List b(Class cls) {
            C0212a c0212a = (C0212a) this.f28185a.get(cls);
            if (c0212a == null) {
                return null;
            }
            return c0212a.f28186a;
        }

        public void c(Class cls, List list) {
            if (((C0212a) this.f28185a.put(cls, new C0212a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public o(androidx.core.util.e eVar) {
        this(new q(eVar));
    }

    private o(q qVar) {
        this.f28184b = new a();
        this.f28183a = qVar;
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List listB;
        listB = this.f28184b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f28183a.c(cls));
            this.f28184b.c(cls, listB);
        }
        return listB;
    }

    public synchronized void a(Class cls, Class cls2, n nVar) {
        this.f28183a.b(cls, cls2, nVar);
        this.f28184b.a();
    }

    public synchronized List c(Class cls) {
        return this.f28183a.g(cls);
    }

    public List d(Object obj) {
        List listE = e(b(obj));
        if (listE.isEmpty()) {
            throw new i.c(obj);
        }
        int size = listE.size();
        List listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) listE.get(i10);
            if (mVar.b(obj)) {
                if (z10) {
                    listEmptyList = new ArrayList(size - i10);
                    z10 = false;
                }
                listEmptyList.add(mVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new i.c(obj, listE);
        }
        return listEmptyList;
    }
}
