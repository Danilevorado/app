package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4458a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4459b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private f f4460c;

    public a0(Executor executor, f fVar) {
        this.f4458a = executor;
        this.f4460c = fVar;
    }

    @Override // b5.d0
    public final void c(i iVar) {
        if (iVar.n()) {
            synchronized (this.f4459b) {
                if (this.f4460c == null) {
                    return;
                }
                this.f4458a.execute(new z(this, iVar));
            }
        }
    }
}
