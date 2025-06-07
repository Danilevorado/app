package o2;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final g f25698a = new C0169a();

    /* renamed from: o2.a$a, reason: collision with other inner class name */
    class C0169a implements g {
        C0169a() {
        }

        @Override // o2.a.g
        public void a(Object obj) {
        }
    }

    class b implements d {
        b() {
        }

        @Override // o2.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a() {
            return new ArrayList();
        }
    }

    class c implements g {
        c() {
        }

        @Override // o2.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    public interface d {
        Object a();
    }

    private static final class e implements androidx.core.util.e {

        /* renamed from: a, reason: collision with root package name */
        private final d f25699a;

        /* renamed from: b, reason: collision with root package name */
        private final g f25700b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.core.util.e f25701c;

        e(androidx.core.util.e eVar, d dVar, g gVar) {
            this.f25701c = eVar;
            this.f25699a = dVar;
            this.f25700b = gVar;
        }

        @Override // androidx.core.util.e
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).i().b(true);
            }
            this.f25700b.a(obj);
            return this.f25701c.a(obj);
        }

        @Override // androidx.core.util.e
        public Object b() {
            Object objB = this.f25701c.b();
            if (objB == null) {
                objB = this.f25699a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objB.getClass());
                }
            }
            if (objB instanceof f) {
                ((f) objB).i().b(false);
            }
            return objB;
        }
    }

    public interface f {
        o2.c i();
    }

    public interface g {
        void a(Object obj);
    }

    private static androidx.core.util.e a(androidx.core.util.e eVar, d dVar) {
        return b(eVar, dVar, c());
    }

    private static androidx.core.util.e b(androidx.core.util.e eVar, d dVar, g gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static g c() {
        return f25698a;
    }

    public static androidx.core.util.e d(int i10, d dVar) {
        return a(new androidx.core.util.g(i10), dVar);
    }

    public static androidx.core.util.e e() {
        return f(20);
    }

    public static androidx.core.util.e f(int i10) {
        return b(new androidx.core.util.g(i10), new b(), new c());
    }
}
