package yb;

import hb.l;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final List f28603a = wb.h.d(wb.f.a(ServiceLoader.load(d.class, d.class.getClassLoader()).iterator()));

    public static final void a(kb.e eVar, Throwable th) {
        Iterator it = f28603a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).handleException(eVar, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, f.b(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            l.a aVar = hb.l.f24171m;
            hb.b.a(th, new k(eVar));
            hb.l.a(hb.q.f24177a);
        } catch (Throwable th3) {
            l.a aVar2 = hb.l.f24171m;
            hb.l.a(hb.m.a(th3));
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
