package androidx.lifecycle;

import androidx.lifecycle.g0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h0 {
    static {
        g0.b.a aVar = g0.b.f3129a;
    }

    public static f0 a(g0.b bVar, Class cls) {
        rb.h.e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static f0 b(g0.b bVar, Class cls, n0.a aVar) {
        rb.h.e(cls, "modelClass");
        rb.h.e(aVar, "extras");
        return bVar.a(cls);
    }
}
