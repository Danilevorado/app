package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class w implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4498a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4499b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private d f4500c;

    public w(Executor executor, d dVar) {
        this.f4498a = executor;
        this.f4500c = dVar;
    }

    @Override // b5.d0
    public final void c(i iVar) {
        synchronized (this.f4499b) {
            if (this.f4500c == null) {
                return;
            }
            this.f4498a.execute(new v(this, iVar));
        }
    }
}
