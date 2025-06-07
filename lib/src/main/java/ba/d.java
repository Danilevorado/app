package ba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class d implements x8.a {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f4592a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f4593a = new ArrayList();

        b a(ba.b bVar) {
            this.f4593a.add(bVar);
            return this;
        }

        public d b() {
            return new d(this.f4593a);
        }
    }

    private d(Collection collection) {
        this.f4592a = collection;
    }

    @Override // x8.a
    public Iterator a() {
        return this.f4592a.iterator();
    }
}
