package u2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r2.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f27577e = new C0193a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f27578a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27579b;

    /* renamed from: c, reason: collision with root package name */
    private final b f27580c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27581d;

    /* renamed from: u2.a$a, reason: collision with other inner class name */
    public static final class C0193a {

        /* renamed from: a, reason: collision with root package name */
        private f f27582a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f27583b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f27584c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f27585d = "";

        C0193a() {
        }

        public C0193a a(d dVar) {
            this.f27583b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f27582a, Collections.unmodifiableList(this.f27583b), this.f27584c, this.f27585d);
        }

        public C0193a c(String str) {
            this.f27585d = str;
            return this;
        }

        public C0193a d(b bVar) {
            this.f27584c = bVar;
            return this;
        }

        public C0193a e(f fVar) {
            this.f27582a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f27578a = fVar;
        this.f27579b = list;
        this.f27580c = bVar;
        this.f27581d = str;
    }

    public static C0193a e() {
        return new C0193a();
    }

    public String a() {
        return this.f27581d;
    }

    public b b() {
        return this.f27580c;
    }

    public List c() {
        return this.f27579b;
    }

    public f d() {
        return this.f27578a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
