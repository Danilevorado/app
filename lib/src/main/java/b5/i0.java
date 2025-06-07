package b5;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class i0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ h0 f4476m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Callable f4477n;

    i0(h0 h0Var, Callable callable) {
        this.f4476m = h0Var;
        this.f4477n = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4476m.q(this.f4477n.call());
        } catch (Exception e5) {
            this.f4476m.p(e5);
        } catch (Throwable th) {
            this.f4476m.p(new RuntimeException(th));
        }
    }
}
