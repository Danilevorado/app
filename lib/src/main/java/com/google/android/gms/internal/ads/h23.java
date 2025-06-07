package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h23 {

    /* renamed from: o, reason: collision with root package name */
    private static final Map f8967o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f8968a;

    /* renamed from: b, reason: collision with root package name */
    private final w13 f8969b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8974g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f8975h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f8979l;

    /* renamed from: m, reason: collision with root package name */
    private IInterface f8980m;

    /* renamed from: n, reason: collision with root package name */
    private final d13 f8981n;

    /* renamed from: d, reason: collision with root package name */
    private final List f8971d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f8972e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f8973f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f8977j = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.z13
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            h23.j(this.f18368a);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f8978k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f8970c = "OverlayDisplayService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f8976i = new WeakReference(null);

    public h23(Context context, w13 w13Var, String str, Intent intent, d13 d13Var, c23 c23Var) {
        this.f8968a = context;
        this.f8969b = w13Var;
        this.f8975h = intent;
        this.f8981n = d13Var;
    }

    public static /* synthetic */ void j(h23 h23Var) {
        h23Var.f8969b.c("reportBinderDeath", new Object[0]);
        c23 c23Var = (c23) h23Var.f8976i.get();
        if (c23Var != null) {
            h23Var.f8969b.c("calling onBinderDied", new Object[0]);
            c23Var.a();
        } else {
            h23Var.f8969b.c("%s : Binder has died.", h23Var.f8970c);
            Iterator it = h23Var.f8971d.iterator();
            while (it.hasNext()) {
                ((x13) it.next()).c(h23Var.v());
            }
            h23Var.f8971d.clear();
        }
        synchronized (h23Var.f8973f) {
            h23Var.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final h23 h23Var, final b5.j jVar) {
        h23Var.f8972e.add(jVar);
        jVar.a().b(new b5.d() { // from class: com.google.android.gms.internal.ads.y13
            @Override // b5.d
            public final void a(b5.i iVar) {
                this.f17863a.t(jVar, iVar);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(h23 h23Var, x13 x13Var) {
        if (h23Var.f8980m != null || h23Var.f8974g) {
            if (!h23Var.f8974g) {
                x13Var.run();
                return;
            } else {
                h23Var.f8969b.c("Waiting to bind to the service.", new Object[0]);
                h23Var.f8971d.add(x13Var);
                return;
            }
        }
        h23Var.f8969b.c("Initiate binding to the service.", new Object[0]);
        h23Var.f8971d.add(x13Var);
        g23 g23Var = new g23(h23Var, null);
        h23Var.f8979l = g23Var;
        h23Var.f8974g = true;
        if (h23Var.f8968a.bindService(h23Var.f8975h, g23Var, 1)) {
            return;
        }
        h23Var.f8969b.c("Failed to bind to the service.", new Object[0]);
        h23Var.f8974g = false;
        Iterator it = h23Var.f8971d.iterator();
        while (it.hasNext()) {
            ((x13) it.next()).c(new i23());
        }
        h23Var.f8971d.clear();
    }

    static /* bridge */ /* synthetic */ void q(h23 h23Var) throws RemoteException {
        h23Var.f8969b.c("linkToDeath", new Object[0]);
        try {
            h23Var.f8980m.asBinder().linkToDeath(h23Var.f8977j, 0);
        } catch (RemoteException e5) {
            h23Var.f8969b.b(e5, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(h23 h23Var) {
        h23Var.f8969b.c("unlinkToDeath", new Object[0]);
        h23Var.f8980m.asBinder().unlinkToDeath(h23Var.f8977j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f8970c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f8972e.iterator();
        while (it.hasNext()) {
            ((b5.j) it.next()).d(v());
        }
        this.f8972e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f8967o;
        synchronized (map) {
            if (!map.containsKey(this.f8970c)) {
                HandlerThread handlerThread = new HandlerThread(this.f8970c, 10);
                handlerThread.start();
                map.put(this.f8970c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f8970c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f8980m;
    }

    public final void s(x13 x13Var, b5.j jVar) {
        c().post(new a23(this, x13Var.b(), jVar, x13Var));
    }

    final /* synthetic */ void t(b5.j jVar, b5.i iVar) {
        synchronized (this.f8973f) {
            this.f8972e.remove(jVar);
        }
    }

    public final void u() {
        c().post(new b23(this));
    }
}
