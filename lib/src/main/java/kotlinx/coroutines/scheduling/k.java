package kotlinx.coroutines.scheduling;

/* loaded from: classes2.dex */
public final class k extends h {

    /* renamed from: o, reason: collision with root package name */
    public final Runnable f24998o;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f24998o = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f24998o.run();
        } finally {
            this.f24996n.a();
        }
    }

    public String toString() {
        return "Task[" + yb.g.a(this.f24998o) + '@' + yb.g.b(this.f24998o) + ", " + this.f24995m + ", " + this.f24996n + ']';
    }
}
