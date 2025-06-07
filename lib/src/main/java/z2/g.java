package z2;

/* loaded from: classes.dex */
public final class g implements t2.b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f28785a = new g();
    }

    public static g a() {
        return a.f28785a;
    }

    public static String b() {
        return (String) t2.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // gb.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
