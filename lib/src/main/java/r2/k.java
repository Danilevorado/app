package r2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements t2.b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f26520a = new k();
    }

    public static k a() {
        return a.f26520a;
    }

    public static Executor b() {
        return (Executor) t2.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // gb.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
