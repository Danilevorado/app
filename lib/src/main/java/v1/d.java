package v1;

import java.io.File;
import v1.a;

/* loaded from: classes.dex */
public abstract class d implements a.InterfaceC0197a {

    /* renamed from: a, reason: collision with root package name */
    private final long f27818a;

    /* renamed from: b, reason: collision with root package name */
    private final a f27819b;

    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f27818a = j10;
        this.f27819b = aVar;
    }

    @Override // v1.a.InterfaceC0197a
    public v1.a build() {
        File fileA = this.f27819b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f27818a);
        }
        return null;
    }
}
