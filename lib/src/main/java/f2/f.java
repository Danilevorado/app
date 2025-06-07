package f2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f23626a = new ArrayList();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Class f23627a;

        /* renamed from: b, reason: collision with root package name */
        final Class f23628b;

        /* renamed from: c, reason: collision with root package name */
        final e f23629c;

        a(Class cls, Class cls2, e eVar) {
            this.f23627a = cls;
            this.f23628b = cls2;
            this.f23629c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f23627a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f23628b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f23626a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f23629c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f23626a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f23628b)) {
                arrayList.add(aVar.f23628b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f23626a.add(new a(cls, cls2, eVar));
    }
}
