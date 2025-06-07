package bc;

import hb.l;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f4602a;

    static {
        Object objA;
        try {
            l.a aVar = hb.l.f24171m;
            objA = hb.l.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            l.a aVar2 = hb.l.f24171m;
            objA = hb.l.a(hb.m.a(th));
        }
        f4602a = hb.l.c(objA);
    }

    public static final boolean a() {
        return f4602a;
    }
}
