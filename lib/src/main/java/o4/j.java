package o4;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ l f25739m;

    /* synthetic */ j(l lVar, i iVar) {
        this.f25739m = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jB = this.f25739m.b();
        if (jB == -1 || i4.h.d().a() <= jB) {
            return;
        }
        l.f(this.f25739m.f25741a);
    }
}
