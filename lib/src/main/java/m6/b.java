package m6;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f25356a;

    private b() {
    }

    public static b b() {
        if (f25356a == null) {
            f25356a = new b();
        }
        return f25356a;
    }

    @Override // m6.a
    public long a() {
        return System.currentTimeMillis();
    }
}
