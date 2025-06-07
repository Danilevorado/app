package x5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class d0 extends x5.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f28295a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f28296b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f28297c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f28298d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f28299e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f28300f;

    /* renamed from: g, reason: collision with root package name */
    private final e f28301g;

    private static class a implements e6.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f28302a;

        /* renamed from: b, reason: collision with root package name */
        private final e6.c f28303b;

        public a(Set set, e6.c cVar) {
            this.f28302a = set;
            this.f28303b = cVar;
        }
    }

    d0(d dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : dVar.e()) {
            if (qVar.d()) {
                boolean zF = qVar.f();
                Class clsB = qVar.b();
                if (zF) {
                    hashSet4.add(clsB);
                } else {
                    hashSet.add(clsB);
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else {
                boolean zF2 = qVar.f();
                Class clsB2 = qVar.b();
                if (zF2) {
                    hashSet5.add(clsB2);
                } else {
                    hashSet2.add(clsB2);
                }
            }
        }
        if (!dVar.h().isEmpty()) {
            hashSet.add(e6.c.class);
        }
        this.f28295a = Collections.unmodifiableSet(hashSet);
        this.f28296b = Collections.unmodifiableSet(hashSet2);
        this.f28297c = Collections.unmodifiableSet(hashSet3);
        this.f28298d = Collections.unmodifiableSet(hashSet4);
        this.f28299e = Collections.unmodifiableSet(hashSet5);
        this.f28300f = dVar.h();
        this.f28301g = eVar;
    }

    @Override // x5.a, x5.e
    public Object a(Class cls) {
        if (!this.f28295a.contains(cls)) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f28301g.a(cls);
        return !cls.equals(e6.c.class) ? objA : new a(this.f28300f, (e6.c) objA);
    }

    @Override // x5.a, x5.e
    public Set b(Class cls) {
        if (this.f28298d.contains(cls)) {
            return this.f28301g.b(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // x5.e
    public h6.b c(Class cls) {
        if (this.f28296b.contains(cls)) {
            return this.f28301g.c(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // x5.e
    public h6.b d(Class cls) {
        if (this.f28299e.contains(cls)) {
            return this.f28301g.d(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
