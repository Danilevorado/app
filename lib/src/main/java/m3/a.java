package m3;

/* loaded from: classes.dex */
final class a implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ b0 f25186m;

    a(b0 b0Var) {
        this.f25186m = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25186m.f25193b = Thread.currentThread();
        this.f25186m.a();
    }
}
