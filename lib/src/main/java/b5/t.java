package b5;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ u f4492m;

    t(u uVar) {
        this.f4492m = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4492m.f4494b) {
            u uVar = this.f4492m;
            if (uVar.f4495c != null) {
                uVar.f4495c.a();
            }
        }
    }
}
