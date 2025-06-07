package a9;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f247a = new ConcurrentHashMap();

    private static boolean c(final g gVar, Handler handler) {
        final List list;
        Class<?> cls = gVar.getClass();
        Map map = f247a;
        if (!map.containsKey(cls) || (list = (List) map.get(cls)) == null) {
            return false;
        }
        handler.post(new Runnable() { // from class: a9.h
            @Override // java.lang.Runnable
            public final void run() {
                i.d(gVar, list);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(g gVar, List list) {
        ArrayList arrayList;
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(gVar);
        }
    }

    public static boolean e(g gVar) {
        return c(gVar, new Handler(Looper.getMainLooper()));
    }

    public static o f(Class cls, j jVar) {
        if (jVar == null) {
            return null;
        }
        Map map = f247a;
        List linkedList = (List) map.get(cls);
        if (linkedList == null) {
            linkedList = new LinkedList();
            map.put(cls, linkedList);
        }
        synchronized (linkedList) {
            linkedList.add(jVar);
        }
        return new o(cls, jVar);
    }

    public static void g(Class cls, j jVar) {
        List list;
        Map map = f247a;
        if (map.containsKey(cls) && (list = (List) map.get(cls)) != null) {
            synchronized (list) {
                list.remove(jVar);
            }
        }
    }
}
