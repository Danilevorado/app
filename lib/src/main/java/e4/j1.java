package e4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class j1 implements ServiceConnection, n1 {

    /* renamed from: m, reason: collision with root package name */
    private final Map f23175m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private int f23176n = 2;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23177o;

    /* renamed from: p, reason: collision with root package name */
    private IBinder f23178p;

    /* renamed from: q, reason: collision with root package name */
    private final i1 f23179q;

    /* renamed from: r, reason: collision with root package name */
    private ComponentName f23180r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ m1 f23181s;

    public j1(m1 m1Var, i1 i1Var) {
        this.f23181s = m1Var;
        this.f23179q = i1Var;
    }

    public final int a() {
        return this.f23176n;
    }

    public final ComponentName b() {
        return this.f23180r;
    }

    public final IBinder c() {
        return this.f23178p;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f23175m.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f23176n = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (i4.m.m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            m1 m1Var = this.f23181s;
            boolean zD = m1Var.f23196j.d(m1Var.f23193g, str, this.f23179q.b(m1Var.f23193g), this, 4225, executor);
            this.f23177o = zD;
            if (zD) {
                this.f23181s.f23194h.sendMessageDelayed(this.f23181s.f23194h.obtainMessage(1, this.f23179q), this.f23181s.f23198l);
            } else {
                this.f23176n = 2;
                try {
                    m1 m1Var2 = this.f23181s;
                    m1Var2.f23196j.c(m1Var2.f23193g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f23175m.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f23181s.f23194h.removeMessages(1, this.f23179q);
        m1 m1Var = this.f23181s;
        m1Var.f23196j.c(m1Var.f23193g, this);
        this.f23177o = false;
        this.f23176n = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f23175m.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f23175m.isEmpty();
    }

    public final boolean j() {
        return this.f23177o;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f23181s.f23192f) {
            this.f23181s.f23194h.removeMessages(1, this.f23179q);
            this.f23178p = iBinder;
            this.f23180r = componentName;
            Iterator it = this.f23175m.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f23176n = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f23181s.f23192f) {
            this.f23181s.f23194h.removeMessages(1, this.f23179q);
            this.f23178p = null;
            this.f23180r = componentName;
            Iterator it = this.f23175m.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f23176n = 2;
        }
    }
}
