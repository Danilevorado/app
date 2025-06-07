package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a f5433b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f5434a = new HashMap();

    class a implements e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Object f5435a;

        b(Object obj) {
            this.f5435a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f5435a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        n2.k.d(obj);
        aVar = (e.a) this.f5434a.get(obj.getClass());
        if (aVar == null) {
            Iterator it = this.f5434a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a aVar2 = (e.a) it.next();
                if (aVar2.a().isAssignableFrom(obj.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f5433b;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f5434a.put(aVar.a(), aVar);
    }
}
