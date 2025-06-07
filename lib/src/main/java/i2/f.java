package i2;

import java.util.ArrayList;
import java.util.List;
import r1.k;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f24282a = new ArrayList();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f24283a;

        /* renamed from: b, reason: collision with root package name */
        final k f24284b;

        a(Class cls, k kVar) {
            this.f24283a = cls;
            this.f24284b = kVar;
        }

        boolean a(Class cls) {
            return this.f24283a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f24282a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f24282a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f24282a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f24284b;
            }
        }
        return null;
    }
}
