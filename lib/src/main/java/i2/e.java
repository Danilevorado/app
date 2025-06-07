package i2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r1.j;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f24277a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f24278b = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f24279a;

        /* renamed from: b, reason: collision with root package name */
        final Class f24280b;

        /* renamed from: c, reason: collision with root package name */
        final j f24281c;

        public a(Class cls, Class cls2, j jVar) {
            this.f24279a = cls;
            this.f24280b = cls2;
            this.f24281c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f24279a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f24280b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        if (!this.f24277a.contains(str)) {
            this.f24277a.add(str);
        }
        arrayList = (List) this.f24278b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f24278b.put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f24277a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f24278b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f24281c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f24277a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f24278b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f24280b)) {
                        arrayList.add(aVar.f24280b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        ArrayList<String> arrayList = new ArrayList(this.f24277a);
        this.f24277a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f24277a.add((String) it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f24277a.add(str);
            }
        }
    }
}
