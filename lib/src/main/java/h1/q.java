package h1;

import androidx.work.impl.e0;

/* loaded from: classes.dex */
public class q implements Runnable {

    /* renamed from: p, reason: collision with root package name */
    private static final String f24020p = b1.j.i("StopWorkRunnable");

    /* renamed from: m, reason: collision with root package name */
    private final e0 f24021m;

    /* renamed from: n, reason: collision with root package name */
    private final androidx.work.impl.u f24022n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f24023o;

    public q(e0 e0Var, androidx.work.impl.u uVar, boolean z10) {
        this.f24021m = e0Var;
        this.f24022n = uVar;
        this.f24023o = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zT = this.f24023o ? this.f24021m.p().t(this.f24022n) : this.f24021m.p().u(this.f24022n);
        b1.j.e().a(f24020p, "StopWorkRunnable for " + this.f24022n.a().b() + "; Processor.stopWork = " + zT);
    }
}
