package r2;

import r2.c;

/* loaded from: classes.dex */
abstract class n {

    public static abstract class a {
        public abstract n a();

        abstract a b(p2.b bVar);

        abstract a c(p2.c cVar);

        abstract a d(p2.e eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract p2.b b();

    abstract p2.c c();

    public byte[] d() {
        return (byte[]) e().a(c().b());
    }

    abstract p2.e e();

    public abstract o f();

    public abstract String g();
}
