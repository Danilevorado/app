package androidx.room;

import java.io.File;
import java.util.concurrent.Callable;
import u0.h;

/* loaded from: classes.dex */
class l0 implements h.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f3737a;

    /* renamed from: b, reason: collision with root package name */
    private final File f3738b;

    /* renamed from: c, reason: collision with root package name */
    private final Callable f3739c;

    /* renamed from: d, reason: collision with root package name */
    private final h.c f3740d;

    l0(String str, File file, Callable callable, h.c cVar) {
        this.f3737a = str;
        this.f3738b = file;
        this.f3739c = callable;
        this.f3740d = cVar;
    }

    @Override // u0.h.c
    public u0.h a(h.b bVar) {
        return new k0(bVar.f27528a, this.f3737a, this.f3738b, this.f3739c, bVar.f27530c.f27527a, this.f3740d.a(bVar));
    }
}
