package e4;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class a1 extends q0 {

    /* renamed from: m, reason: collision with root package name */
    private c f23071m;

    /* renamed from: n, reason: collision with root package name */
    private final int f23072n;

    public a1(c cVar, int i10) {
        this.f23071m = cVar;
        this.f23072n = i10;
    }

    @Override // e4.l
    public final void I5(int i10, IBinder iBinder, Bundle bundle) {
        p.m(this.f23071m, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f23071m.R(i10, iBinder, bundle, this.f23072n);
        this.f23071m = null;
    }

    @Override // e4.l
    public final void O3(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // e4.l
    public final void j4(int i10, IBinder iBinder, e1 e1Var) {
        c cVar = this.f23071m;
        p.m(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        p.l(e1Var);
        c.g0(cVar, e1Var);
        I5(i10, iBinder, e1Var.f23128m);
    }
}
