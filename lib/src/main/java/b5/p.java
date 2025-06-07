package b5;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ i f4482m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ q f4483n;

    p(q qVar, i iVar) {
        this.f4483n = qVar;
        this.f4482m = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4482m.l()) {
            this.f4483n.f4486c.r();
            return;
        }
        try {
            this.f4483n.f4486c.q(this.f4483n.f4485b.a(this.f4482m));
        } catch (g e5) {
            if (e5.getCause() instanceof Exception) {
                this.f4483n.f4486c.p((Exception) e5.getCause());
            } else {
                this.f4483n.f4486c.p(e5);
            }
        } catch (Exception e10) {
            this.f4483n.f4486c.p(e10);
        }
    }
}
