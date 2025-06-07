package e4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class m1 extends i {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f23192f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Context f23193g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f23194h;

    /* renamed from: i, reason: collision with root package name */
    private final l1 f23195i;

    /* renamed from: j, reason: collision with root package name */
    private final h4.a f23196j;

    /* renamed from: k, reason: collision with root package name */
    private final long f23197k;

    /* renamed from: l, reason: collision with root package name */
    private final long f23198l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Executor f23199m;

    m1(Context context, Looper looper, Executor executor) {
        l1 l1Var = new l1(this, null);
        this.f23195i = l1Var;
        this.f23193g = context.getApplicationContext();
        this.f23194h = new r4.e(looper, l1Var);
        this.f23196j = h4.a.b();
        this.f23197k = 5000L;
        this.f23198l = 300000L;
        this.f23199m = executor;
    }

    @Override // e4.i
    protected final void c(i1 i1Var, ServiceConnection serviceConnection, String str) {
        p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f23192f) {
            j1 j1Var = (j1) this.f23192f.get(i1Var);
            if (j1Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + i1Var.toString());
            }
            if (!j1Var.h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + i1Var.toString());
            }
            j1Var.f(serviceConnection, str);
            if (j1Var.i()) {
                this.f23194h.sendMessageDelayed(this.f23194h.obtainMessage(0, i1Var), this.f23197k);
            }
        }
    }

    @Override // e4.i
    protected final boolean e(i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f23192f) {
            j1 j1Var = (j1) this.f23192f.get(i1Var);
            if (executor == null) {
                executor = this.f23199m;
            }
            if (j1Var == null) {
                j1Var = new j1(this, i1Var);
                j1Var.d(serviceConnection, serviceConnection, str);
                j1Var.e(str, executor);
                this.f23192f.put(i1Var, j1Var);
            } else {
                this.f23194h.removeMessages(0, i1Var);
                if (j1Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + i1Var.toString());
                }
                j1Var.d(serviceConnection, serviceConnection, str);
                int iA = j1Var.a();
                if (iA == 1) {
                    serviceConnection.onServiceConnected(j1Var.b(), j1Var.c());
                } else if (iA == 2) {
                    j1Var.e(str, executor);
                }
            }
            zJ = j1Var.j();
        }
        return zJ;
    }
}
