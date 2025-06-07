package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class u implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4493a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4494b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private c f4495c;

    public u(Executor executor, c cVar) {
        this.f4493a = executor;
        this.f4495c = cVar;
    }

    @Override // b5.d0
    public final void c(i iVar) {
        if (iVar.l()) {
            synchronized (this.f4494b) {
                if (this.f4495c == null) {
                    return;
                }
                this.f4493a.execute(new t(this));
            }
        }
    }
}
