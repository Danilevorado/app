package h1;

import androidx.work.WorkerParameters;
import androidx.work.impl.e0;

/* loaded from: classes.dex */
public class p implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private e0 f24017m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.work.impl.u f24018n;

    /* renamed from: o, reason: collision with root package name */
    private WorkerParameters.a f24019o;

    public p(e0 e0Var, androidx.work.impl.u uVar, WorkerParameters.a aVar) {
        this.f24017m = e0Var;
        this.f24018n = uVar;
        this.f24019o = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24017m.p().q(this.f24018n, this.f24019o);
    }
}
