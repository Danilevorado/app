package b3;

/* loaded from: classes.dex */
public final class c implements t2.b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f4389a = new c();
    }

    public static c a() {
        return a.f4389a;
    }

    public static b3.a b() {
        return (b3.a) t2.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // gb.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b3.a get() {
        return b();
    }
}
