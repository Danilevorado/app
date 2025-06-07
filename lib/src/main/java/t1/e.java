package t1;

import java.io.File;
import v1.a;

/* loaded from: classes.dex */
class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final r1.d f27151a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27152b;

    /* renamed from: c, reason: collision with root package name */
    private final r1.h f27153c;

    e(r1.d dVar, Object obj, r1.h hVar) {
        this.f27151a = dVar;
        this.f27152b = obj;
        this.f27153c = hVar;
    }

    @Override // v1.a.b
    public boolean a(File file) {
        return this.f27151a.b(this.f27152b, file, this.f27153c);
    }
}
