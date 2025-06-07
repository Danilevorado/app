package e4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h0 implements Handler.Callback {

    /* renamed from: m, reason: collision with root package name */
    private final g0 f23153m;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f23160t;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f23154n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    final ArrayList f23155o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList f23156p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f23157q = false;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicInteger f23158r = new AtomicInteger(0);

    /* renamed from: s, reason: collision with root package name */
    private boolean f23159s = false;

    /* renamed from: u, reason: collision with root package name */
    private final Object f23161u = new Object();

    public h0(Looper looper, g0 g0Var) {
        this.f23153m = g0Var;
        this.f23160t = new p4.l(looper, this);
    }

    public final void a() {
        this.f23157q = false;
        this.f23158r.incrementAndGet();
    }

    public final void b() {
        this.f23157q = true;
    }

    public final void c(b4.b bVar) {
        p.d(this.f23160t, "onConnectionFailure must only be called on the Handler thread");
        this.f23160t.removeMessages(1);
        synchronized (this.f23161u) {
            ArrayList arrayList = new ArrayList(this.f23156p);
            int i10 = this.f23158r.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.c cVar = (GoogleApiClient.c) it.next();
                if (this.f23157q && this.f23158r.get() == i10) {
                    if (this.f23156p.contains(cVar)) {
                        cVar.w0(bVar);
                    }
                }
                return;
            }
        }
    }

    public final void d(Bundle bundle) {
        p.d(this.f23160t, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f23161u) {
            p.o(!this.f23159s);
            this.f23160t.removeMessages(1);
            this.f23159s = true;
            p.o(this.f23155o.isEmpty());
            ArrayList arrayList = new ArrayList(this.f23154n);
            int i10 = this.f23158r.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.b bVar = (GoogleApiClient.b) it.next();
                if (!this.f23157q || !this.f23153m.a() || this.f23158r.get() != i10) {
                    break;
                } else if (!this.f23155o.contains(bVar)) {
                    bVar.L0(bundle);
                }
            }
            this.f23155o.clear();
            this.f23159s = false;
        }
    }

    public final void e(int i10) {
        p.d(this.f23160t, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f23160t.removeMessages(1);
        synchronized (this.f23161u) {
            this.f23159s = true;
            ArrayList arrayList = new ArrayList(this.f23154n);
            int i11 = this.f23158r.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.b bVar = (GoogleApiClient.b) it.next();
                if (!this.f23157q || this.f23158r.get() != i11) {
                    break;
                } else if (this.f23154n.contains(bVar)) {
                    bVar.C(i10);
                }
            }
            this.f23155o.clear();
            this.f23159s = false;
        }
    }

    public final void f(GoogleApiClient.b bVar) {
        p.l(bVar);
        synchronized (this.f23161u) {
            if (this.f23154n.contains(bVar)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(bVar) + " is already registered");
            } else {
                this.f23154n.add(bVar);
            }
        }
        if (this.f23153m.a()) {
            Handler handler = this.f23160t;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(GoogleApiClient.c cVar) {
        p.l(cVar);
        synchronized (this.f23161u) {
            if (this.f23156p.contains(cVar)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(cVar) + " is already registered");
            } else {
                this.f23156p.add(cVar);
            }
        }
    }

    public final void h(GoogleApiClient.c cVar) {
        p.l(cVar);
        synchronized (this.f23161u) {
            if (!this.f23156p.remove(cVar)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(cVar) + " not found");
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i10, new Exception());
            return false;
        }
        GoogleApiClient.b bVar = (GoogleApiClient.b) message.obj;
        synchronized (this.f23161u) {
            if (this.f23157q && this.f23153m.a() && this.f23154n.contains(bVar)) {
                bVar.L0(null);
            }
        }
        return true;
    }
}
