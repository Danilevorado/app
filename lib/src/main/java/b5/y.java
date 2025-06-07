package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4503a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4504b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private e f4505c;

    public y(Executor executor, e eVar) {
        this.f4503a = executor;
        this.f4505c = eVar;
    }

    @Override // b5.d0
    public final void c(i iVar) {
        if (iVar.n() || iVar.l()) {
            return;
        }
        synchronized (this.f4504b) {
            if (this.f4505c == null) {
                return;
            }
            this.f4503a.execute(new x(this, iVar));
        }
    }
}
