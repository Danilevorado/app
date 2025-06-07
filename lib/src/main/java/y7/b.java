package y7;

import m9.h;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    private static volatile s9.d f28576d;

    /* renamed from: f, reason: collision with root package name */
    private static volatile h f28578f;

    /* renamed from: a, reason: collision with root package name */
    private static final s9.c f28573a = new s9.a(c9.a.b());

    /* renamed from: b, reason: collision with root package name */
    private static final o9.c f28574b = new o9.c(b());

    /* renamed from: c, reason: collision with root package name */
    private static final r8.b f28575c = new r8.b(b());

    /* renamed from: e, reason: collision with root package name */
    private static final Object f28577e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f28579g = new Object();

    private static o9.c a() {
        return f28574b;
    }

    public static s9.c b() {
        return f28573a;
    }

    public static h c() {
        synchronized (f28579g) {
            if (f28578f == null) {
                if (c9.a.b() == null) {
                    return null;
                }
                f28578f = new h(b9.b.a(), d(), a(), e(), b(), ka.e.f());
            }
            return f28578f;
        }
    }

    public static s9.d d() {
        synchronized (f28577e) {
            if (f28576d == null) {
                if (c9.a.b() == null) {
                    return null;
                }
                f28576d = new s9.b(c9.a.b());
            }
            return f28576d;
        }
    }

    private static r8.b e() {
        return f28575c;
    }
}
