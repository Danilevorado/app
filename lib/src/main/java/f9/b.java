package f9;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class b implements db.a {

    /* renamed from: a, reason: collision with root package name */
    private final e9.a f23679a;

    public b(e9.a aVar) {
        this.f23679a = aVar;
    }

    @Override // db.a
    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this.f23679a);
        }
    }
}
