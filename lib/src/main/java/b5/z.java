package b5;

/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ i f4506m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ a0 f4507n;

    z(a0 a0Var, i iVar) {
        this.f4507n = a0Var;
        this.f4506m = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4507n.f4459b) {
            a0 a0Var = this.f4507n;
            if (a0Var.f4460c != null) {
                a0Var.f4460c.b(this.f4506m.j());
            }
        }
    }
}
