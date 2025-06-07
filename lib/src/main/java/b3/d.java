package b3;

/* loaded from: classes.dex */
public final class d implements t2.b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f4390a = new d();
    }

    public static d a() {
        return a.f4390a;
    }

    public static b3.a c() {
        return (b3.a) t2.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b3.a get() {
        return c();
    }
}
