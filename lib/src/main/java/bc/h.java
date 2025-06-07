package bc;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import yb.u;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4618a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f4619b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f4620c;

    static {
        h hVar = new h();
        f4618a = hVar;
        f4619b = m.e("kotlinx.coroutines.fast.service.loader", true);
        f4620c = hVar.a();
    }

    private h() {
    }

    private final u a() {
        Object next;
        try {
            List listC = f4619b ? a.f4601a.c() : wb.h.d(wb.f.a(ServiceLoader.load(g.class, g.class.getClassLoader()).iterator()));
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((g) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((g) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            g gVar = (g) next;
            u uVarE = gVar == null ? null : i.e(gVar, listC);
            return uVarE == null ? i.b(null, null, 3, null) : uVarE;
        } catch (Throwable th) {
            return i.b(th, null, 2, null);
        }
    }
}
