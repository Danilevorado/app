package wb;

import ib.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class h extends g {
    public static final Collection c(b bVar, Collection collection) {
        rb.h.e(bVar, "<this>");
        rb.h.e(collection, "destination");
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static List d(b bVar) {
        rb.h.e(bVar, "<this>");
        return j.f(e(bVar));
    }

    public static final List e(b bVar) {
        rb.h.e(bVar, "<this>");
        return (List) c(bVar, new ArrayList());
    }
}
