package b5;

/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ i f4501m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ y f4502n;

    x(y yVar, i iVar) {
        this.f4502n = yVar;
        this.f4501m = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4502n.f4504b) {
            y yVar = this.f4502n;
            if (yVar.f4505c != null) {
                yVar.f4505c.d((Exception) e4.p.l(this.f4501m.i()));
            }
        }
    }
}
