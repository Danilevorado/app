package yb;

/* loaded from: classes2.dex */
public abstract class f {
    public static final void a(kb.e eVar, Throwable th) {
        try {
            d dVar = (d) eVar.get(d.f28601k);
            if (dVar == null) {
                e.a(eVar, th);
            } else {
                dVar.handleException(eVar, th);
            }
        } catch (Throwable th2) {
            e.a(eVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        hb.b.a(runtimeException, th);
        return runtimeException;
    }
}
