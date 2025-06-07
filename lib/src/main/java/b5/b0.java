package b5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ i f4461m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ c0 f4462n;

    b0(c0 c0Var, i iVar) {
        this.f4462n = c0Var;
        this.f4461m = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVarA = this.f4462n.f4464b.a(this.f4461m.j());
            if (iVarA == null) {
                this.f4462n.d(new NullPointerException("Continuation returned null"));
                return;
            }
            c0 c0Var = this.f4462n;
            Executor executor = k.f4480b;
            iVarA.e(executor, c0Var);
            iVarA.d(executor, this.f4462n);
            iVarA.a(executor, this.f4462n);
        } catch (g e5) {
            if (e5.getCause() instanceof Exception) {
                this.f4462n.d((Exception) e5.getCause());
            } else {
                this.f4462n.d(e5);
            }
        } catch (CancellationException unused) {
            this.f4462n.a();
        } catch (Exception e10) {
            this.f4462n.d(e10);
        }
    }
}
