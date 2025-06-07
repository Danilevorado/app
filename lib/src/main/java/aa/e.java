package aa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
class e implements x8.a {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f259a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f260a = new ArrayList();

        b a(aa.b bVar) {
            this.f260a.add(bVar);
            return this;
        }

        public e b() {
            return new e(this.f260a);
        }
    }

    private e(Collection collection) {
        this.f259a = collection;
    }

    @Override // x8.a
    public Iterator a() {
        return this.f259a.iterator();
    }
}
