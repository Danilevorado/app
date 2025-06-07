package z9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class f implements x8.a {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f28924a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f28925a = new ArrayList();

        b a(z9.b bVar) {
            this.f28925a.add(bVar);
            return this;
        }

        public f b() {
            return new f(this.f28925a);
        }
    }

    private f(Collection collection) {
        this.f28924a = collection;
    }

    @Override // x8.a
    public Iterator a() {
        return this.f28924a.iterator();
    }
}
