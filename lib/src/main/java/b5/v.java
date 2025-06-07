package b5;

/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ i f4496m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ w f4497n;

    v(w wVar, i iVar) {
        this.f4497n = wVar;
        this.f4496m = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4497n.f4499b) {
            w wVar = this.f4497n;
            if (wVar.f4500c != null) {
                wVar.f4500c.a(this.f4496m);
            }
        }
    }
}
