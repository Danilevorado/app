package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ i f4487m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ s f4488n;

    r(s sVar, i iVar) {
        this.f4488n = sVar;
        this.f4487m = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVar = (i) this.f4488n.f4490b.a(this.f4487m);
            if (iVar == null) {
                this.f4488n.d(new NullPointerException("Continuation returned null"));
                return;
            }
            s sVar = this.f4488n;
            Executor executor = k.f4480b;
            iVar.e(executor, sVar);
            iVar.d(executor, this.f4488n);
            iVar.a(executor, this.f4488n);
        } catch (g e5) {
            if (e5.getCause() instanceof Exception) {
                this.f4488n.f4491c.p((Exception) e5.getCause());
            } else {
                this.f4488n.f4491c.p(e5);
            }
        } catch (Exception e10) {
            this.f4488n.f4491c.p(e10);
        }
    }
}
