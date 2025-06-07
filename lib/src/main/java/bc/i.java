package bc;

import java.util.List;
import yb.u;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f4621a = true;

    private static final j a(Throwable th, String str) throws Throwable {
        if (f4621a) {
            return new j(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new hb.c();
    }

    static /* synthetic */ j b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(u uVar) {
        return uVar.y() instanceof j;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final u e(g gVar, List list) {
        try {
            return gVar.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, gVar.hintOnError());
        }
    }
}
