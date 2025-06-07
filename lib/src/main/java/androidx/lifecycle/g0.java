package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import n0.a;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f3121a;

    /* renamed from: b, reason: collision with root package name */
    private final b f3122b;

    /* renamed from: c, reason: collision with root package name */
    private final n0.a f3123c;

    public static class a extends c {

        /* renamed from: g, reason: collision with root package name */
        private static a f3125g;

        /* renamed from: e, reason: collision with root package name */
        private final Application f3127e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0047a f3124f = new C0047a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final a.b f3126h = C0047a.C0048a.f3128a;

        /* renamed from: androidx.lifecycle.g0$a$a, reason: collision with other inner class name */
        public static final class C0047a {

            /* renamed from: androidx.lifecycle.g0$a$a$a, reason: collision with other inner class name */
            private static final class C0048a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0048a f3128a = new C0048a();

                private C0048a() {
                }
            }

            private C0047a() {
            }

            public /* synthetic */ C0047a(rb.f fVar) {
                this();
            }

            public final b a(k0 k0Var) {
                rb.h.e(k0Var, "owner");
                if (!(k0Var instanceof i)) {
                    return c.f3131b.a();
                }
                b bVarL = ((i) k0Var).l();
                rb.h.d(bVarL, "owner.defaultViewModelProviderFactory");
                return bVarL;
            }

            public final a b(Application application) {
                rb.h.e(application, "application");
                if (a.f3125g == null) {
                    a.f3125g = new a(application);
                }
                a aVar = a.f3125g;
                rb.h.b(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            rb.h.e(application, "application");
        }

        private a(Application application, int i10) {
            this.f3127e = application;
        }

        private final f0 g(Class cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                f0 f0Var = (f0) cls.getConstructor(Application.class).newInstance(application);
                rb.h.d(f0Var, "{\n                try {\n…          }\n            }");
                return f0Var;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        @Override // androidx.lifecycle.g0.c, androidx.lifecycle.g0.b
        public f0 a(Class cls) {
            rb.h.e(cls, "modelClass");
            Application application = this.f3127e;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.g0.c, androidx.lifecycle.g0.b
        public f0 b(Class cls, n0.a aVar) {
            rb.h.e(cls, "modelClass");
            rb.h.e(aVar, "extras");
            if (this.f3127e != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f3126h);
            if (application != null) {
                return g(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3129a = a.f3130a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f3130a = new a();

            private a() {
            }
        }

        f0 a(Class cls);

        f0 b(Class cls, n0.a aVar);
    }

    public static class c implements b {

        /* renamed from: c, reason: collision with root package name */
        private static c f3132c;

        /* renamed from: b, reason: collision with root package name */
        public static final a f3131b = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final a.b f3133d = a.C0049a.f3134a;

        public static final class a {

            /* renamed from: androidx.lifecycle.g0$c$a$a, reason: collision with other inner class name */
            private static final class C0049a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0049a f3134a = new C0049a();

                private C0049a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(rb.f fVar) {
                this();
            }

            public final c a() {
                if (c.f3132c == null) {
                    c.f3132c = new c();
                }
                c cVar = c.f3132c;
                rb.h.b(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.g0.b
        public f0 a(Class cls) throws IllegalAccessException, InstantiationException {
            rb.h.e(cls, "modelClass");
            try {
                Object objNewInstance = cls.newInstance();
                rb.h.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (f0) objNewInstance;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        }

        @Override // androidx.lifecycle.g0.b
        public /* synthetic */ f0 b(Class cls, n0.a aVar) {
            return h0.b(this, cls, aVar);
        }
    }

    public static class d {
        public abstract void c(f0 f0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, b bVar) {
        this(j0Var, bVar, null, 4, null);
        rb.h.e(j0Var, "store");
        rb.h.e(bVar, "factory");
    }

    public g0(j0 j0Var, b bVar, n0.a aVar) {
        rb.h.e(j0Var, "store");
        rb.h.e(bVar, "factory");
        rb.h.e(aVar, "defaultCreationExtras");
        this.f3121a = j0Var;
        this.f3122b = bVar;
        this.f3123c = aVar;
    }

    public /* synthetic */ g0(j0 j0Var, b bVar, n0.a aVar, int i10, rb.f fVar) {
        this(j0Var, bVar, (i10 & 4) != 0 ? a.C0164a.f25446b : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(k0 k0Var) {
        rb.h.e(k0Var, "owner");
        j0 j0VarR = k0Var.r();
        rb.h.d(j0VarR, "owner.viewModelStore");
        this(j0VarR, a.f3124f.a(k0Var), i0.a(k0Var));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(k0 k0Var, b bVar) {
        rb.h.e(k0Var, "owner");
        rb.h.e(bVar, "factory");
        j0 j0VarR = k0Var.r();
        rb.h.d(j0VarR, "owner.viewModelStore");
        this(j0VarR, bVar, i0.a(k0Var));
    }

    public f0 a(Class cls) {
        rb.h.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public f0 b(String str, Class cls) {
        f0 f0VarA;
        rb.h.e(str, "key");
        rb.h.e(cls, "modelClass");
        f0 f0VarB = this.f3121a.b(str);
        if (!cls.isInstance(f0VarB)) {
            n0.d dVar = new n0.d(this.f3123c);
            dVar.c(c.f3133d, str);
            try {
                f0VarA = this.f3122b.b(cls, dVar);
            } catch (AbstractMethodError unused) {
                f0VarA = this.f3122b.a(cls);
            }
            this.f3121a.d(str, f0VarA);
            return f0VarA;
        }
        Object obj = this.f3122b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            rb.h.d(f0VarB, "viewModel");
            dVar2.c(f0VarB);
        }
        Objects.requireNonNull(f0VarB, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return f0VarB;
    }
}
