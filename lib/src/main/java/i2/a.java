package i2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f24268a = new ArrayList();

    /* renamed from: i2.a$a, reason: collision with other inner class name */
    private static final class C0145a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f24269a;

        /* renamed from: b, reason: collision with root package name */
        final r1.d f24270b;

        C0145a(Class cls, r1.d dVar) {
            this.f24269a = cls;
            this.f24270b = dVar;
        }

        boolean a(Class cls) {
            return this.f24269a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, r1.d dVar) {
        this.f24268a.add(new C0145a(cls, dVar));
    }

    public synchronized r1.d b(Class cls) {
        for (C0145a c0145a : this.f24268a) {
            if (c0145a.a(cls)) {
                return c0145a.f24270b;
            }
        }
        return null;
    }
}
