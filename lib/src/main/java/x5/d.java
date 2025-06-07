package x5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f28283a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f28284b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28285c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28286d;

    /* renamed from: e, reason: collision with root package name */
    private final h f28287e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f28288f;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Set f28289a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f28290b;

        /* renamed from: c, reason: collision with root package name */
        private int f28291c;

        /* renamed from: d, reason: collision with root package name */
        private int f28292d;

        /* renamed from: e, reason: collision with root package name */
        private h f28293e;

        /* renamed from: f, reason: collision with root package name */
        private Set f28294f;

        private b(Class cls, Class... clsArr) {
            HashSet hashSet = new HashSet();
            this.f28289a = hashSet;
            this.f28290b = new HashSet();
            this.f28291c = 0;
            this.f28292d = 0;
            this.f28294f = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                c0.c(cls2, "Null interface");
            }
            Collections.addAll(this.f28289a, clsArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f28292d = 1;
            return this;
        }

        private b h(int i10) {
            c0.d(this.f28291c == 0, "Instantiation type has already been set.");
            this.f28291c = i10;
            return this;
        }

        private void i(Class cls) {
            c0.a(!this.f28289a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            c0.c(qVar, "Null dependency");
            i(qVar.b());
            this.f28290b.add(qVar);
            return this;
        }

        public b c() {
            return h(1);
        }

        public d d() {
            c0.d(this.f28293e != null, "Missing required property: factory.");
            return new d(new HashSet(this.f28289a), new HashSet(this.f28290b), this.f28291c, this.f28292d, this.f28293e, this.f28294f);
        }

        public b e() {
            return h(2);
        }

        public b f(h hVar) {
            this.f28293e = (h) c0.c(hVar, "Null factory");
            return this;
        }
    }

    private d(Set set, Set set2, int i10, int i11, h hVar, Set set3) {
        this.f28283a = Collections.unmodifiableSet(set);
        this.f28284b = Collections.unmodifiableSet(set2);
        this.f28285c = i10;
        this.f28286d = i11;
        this.f28287e = hVar;
        this.f28288f = Collections.unmodifiableSet(set3);
    }

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static d i(final Object obj, Class cls) {
        return j(cls).f(new h() { // from class: x5.b
            @Override // x5.h
            public final Object a(e eVar) {
                return d.n(obj, eVar);
            }
        }).d();
    }

    public static b j(Class cls) {
        return c(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object n(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o(Object obj, e eVar) {
        return obj;
    }

    public static d p(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).f(new h() { // from class: x5.c
            @Override // x5.h
            public final Object a(e eVar) {
                return d.o(obj, eVar);
            }
        }).d();
    }

    public Set e() {
        return this.f28284b;
    }

    public h f() {
        return this.f28287e;
    }

    public Set g() {
        return this.f28283a;
    }

    public Set h() {
        return this.f28288f;
    }

    public boolean k() {
        return this.f28285c == 1;
    }

    public boolean l() {
        return this.f28285c == 2;
    }

    public boolean m() {
        return this.f28286d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f28283a.toArray()) + ">{" + this.f28285c + ", type=" + this.f28286d + ", deps=" + Arrays.toString(this.f28284b.toArray()) + "}";
    }
}
