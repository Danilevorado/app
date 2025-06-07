package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c implements Handler.Callback {
    public static final Status B = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status C = new Status(4, "The user must be signed in to make this API call.");
    private static final Object D = new Object();
    private static c E;
    private volatile boolean A;

    /* renamed from: o, reason: collision with root package name */
    private e4.s f5656o;

    /* renamed from: p, reason: collision with root package name */
    private e4.u f5657p;

    /* renamed from: q, reason: collision with root package name */
    private final Context f5658q;

    /* renamed from: r, reason: collision with root package name */
    private final b4.e f5659r;

    /* renamed from: s, reason: collision with root package name */
    private final e4.i0 f5660s;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f5667z;

    /* renamed from: m, reason: collision with root package name */
    private long f5654m = 10000;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5655n = false;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicInteger f5661t = new AtomicInteger(1);

    /* renamed from: u, reason: collision with root package name */
    private final AtomicInteger f5662u = new AtomicInteger(0);

    /* renamed from: v, reason: collision with root package name */
    private final Map f5663v = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: w, reason: collision with root package name */
    private k f5664w = null;

    /* renamed from: x, reason: collision with root package name */
    private final Set f5665x = new q.b();

    /* renamed from: y, reason: collision with root package name */
    private final Set f5666y = new q.b();

    private c(Context context, Looper looper, b4.e eVar) {
        this.A = true;
        this.f5658q = context;
        p4.l lVar = new p4.l(looper, this);
        this.f5667z = lVar;
        this.f5659r = eVar;
        this.f5660s = new e4.i0(eVar);
        if (i4.i.a(context)) {
            this.A = false;
        }
        lVar.sendMessage(lVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(d4.b bVar, b4.b bVar2) {
        return new Status(bVar2, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(bVar2));
    }

    private final m0 g(com.google.android.gms.common.api.b bVar) {
        Map map = this.f5663v;
        d4.b bVarH = bVar.h();
        m0 m0Var = (m0) map.get(bVarH);
        if (m0Var == null) {
            m0Var = new m0(this, bVar);
            this.f5663v.put(bVarH, m0Var);
        }
        if (m0Var.a()) {
            this.f5666y.add(bVarH);
        }
        m0Var.B();
        return m0Var;
    }

    private final e4.u h() {
        if (this.f5657p == null) {
            this.f5657p = e4.t.a(this.f5658q);
        }
        return this.f5657p;
    }

    private final void i() {
        e4.s sVar = this.f5656o;
        if (sVar != null) {
            if (sVar.f() > 0 || d()) {
                h().b(sVar);
            }
            this.f5656o = null;
        }
    }

    private final void j(b5.j jVar, int i10, com.google.android.gms.common.api.b bVar) {
        r0 r0VarB;
        if (i10 == 0 || (r0VarB = r0.b(this, i10, bVar.h())) == null) {
            return;
        }
        b5.i iVarA = jVar.a();
        final Handler handler = this.f5667z;
        handler.getClass();
        iVarA.c(new Executor() { // from class: d4.q
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, r0VarB);
    }

    public static c t(Context context) {
        c cVar;
        synchronized (D) {
            if (E == null) {
                E = new c(context.getApplicationContext(), e4.i.b().getLooper(), b4.e.p());
            }
            cVar = E;
        }
        return cVar;
    }

    public final void A(com.google.android.gms.common.api.b bVar, int i10, f fVar, b5.j jVar, d4.j jVar2) {
        j(jVar, fVar.d(), bVar);
        this.f5667z.sendMessage(this.f5667z.obtainMessage(4, new d4.y(new y0(i10, fVar, jVar, jVar2), this.f5662u.get(), bVar)));
    }

    final void B(e4.n nVar, int i10, long j10, int i11) {
        this.f5667z.sendMessage(this.f5667z.obtainMessage(18, new s0(nVar, i10, j10, i11)));
    }

    public final void C(b4.b bVar, int i10) throws Resources.NotFoundException {
        if (e(bVar, i10)) {
            return;
        }
        Handler handler = this.f5667z;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
    }

    public final void D() {
        Handler handler = this.f5667z;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void E(com.google.android.gms.common.api.b bVar) {
        Handler handler = this.f5667z;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    public final void a(k kVar) {
        synchronized (D) {
            if (this.f5664w != kVar) {
                this.f5664w = kVar;
                this.f5665x.clear();
            }
            this.f5665x.addAll(kVar.t());
        }
    }

    final void b(k kVar) {
        synchronized (D) {
            if (this.f5664w == kVar) {
                this.f5664w = null;
                this.f5665x.clear();
            }
        }
    }

    final boolean d() {
        if (this.f5655n) {
            return false;
        }
        e4.r rVarA = e4.q.b().a();
        if (rVarA != null && !rVarA.v()) {
            return false;
        }
        int iA = this.f5660s.a(this.f5658q, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean e(b4.b bVar, int i10) throws Resources.NotFoundException {
        return this.f5659r.z(this.f5658q, bVar, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        m0 m0Var = null;
        switch (i10) {
            case 1:
                this.f5654m = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f5667z.removeMessages(12);
                for (d4.b bVar : this.f5663v.keySet()) {
                    Handler handler = this.f5667z;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f5654m);
                }
                return true;
            case 2:
                a5.a.a(message.obj);
                throw null;
            case 3:
                for (m0 m0Var2 : this.f5663v.values()) {
                    m0Var2.A();
                    m0Var2.B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                d4.y yVar = (d4.y) message.obj;
                m0 m0VarG = (m0) this.f5663v.get(yVar.f22929c.h());
                if (m0VarG == null) {
                    m0VarG = g(yVar.f22929c);
                }
                if (!m0VarG.a() || this.f5662u.get() == yVar.f22928b) {
                    m0VarG.D(yVar.f22927a);
                } else {
                    yVar.f22927a.a(B);
                    m0VarG.I();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                b4.b bVar2 = (b4.b) message.obj;
                Iterator it = this.f5663v.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        m0 m0Var3 = (m0) it.next();
                        if (m0Var3.p() == i11) {
                            m0Var = m0Var3;
                        }
                    }
                }
                if (m0Var == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (bVar2.f() == 13) {
                    m0Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f5659r.g(bVar2.f()) + ": " + bVar2.h()));
                } else {
                    m0Var.e(f(m0Var.f5768o, bVar2));
                }
                return true;
            case 6:
                if (this.f5658q.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f5658q.getApplicationContext());
                    a.b().a(new h0(this));
                    if (!a.b().e(true)) {
                        this.f5654m = 300000L;
                    }
                }
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                g((com.google.android.gms.common.api.b) message.obj);
                return true;
            case 9:
                if (this.f5663v.containsKey(message.obj)) {
                    ((m0) this.f5663v.get(message.obj)).H();
                }
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                Iterator it2 = this.f5666y.iterator();
                while (it2.hasNext()) {
                    m0 m0Var4 = (m0) this.f5663v.remove((d4.b) it2.next());
                    if (m0Var4 != null) {
                        m0Var4.I();
                    }
                }
                this.f5666y.clear();
                return true;
            case 11:
                if (this.f5663v.containsKey(message.obj)) {
                    ((m0) this.f5663v.get(message.obj)).J();
                }
                return true;
            case 12:
                if (this.f5663v.containsKey(message.obj)) {
                    ((m0) this.f5663v.get(message.obj)).b();
                }
                return true;
            case 14:
                a5.a.a(message.obj);
                throw null;
            case 15:
                n0 n0Var = (n0) message.obj;
                if (this.f5663v.containsKey(n0Var.f5781a)) {
                    m0.y((m0) this.f5663v.get(n0Var.f5781a), n0Var);
                }
                return true;
            case 16:
                n0 n0Var2 = (n0) message.obj;
                if (this.f5663v.containsKey(n0Var2.f5781a)) {
                    m0.z((m0) this.f5663v.get(n0Var2.f5781a), n0Var2);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                s0 s0Var = (s0) message.obj;
                if (s0Var.f5809c == 0) {
                    h().b(new e4.s(s0Var.f5808b, Arrays.asList(s0Var.f5807a)));
                } else {
                    e4.s sVar = this.f5656o;
                    if (sVar != null) {
                        List listH = sVar.h();
                        if (sVar.f() != s0Var.f5808b || (listH != null && listH.size() >= s0Var.f5810d)) {
                            this.f5667z.removeMessages(17);
                            i();
                        } else {
                            this.f5656o.v(s0Var.f5807a);
                        }
                    }
                    if (this.f5656o == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(s0Var.f5807a);
                        this.f5656o = new e4.s(s0Var.f5808b, arrayList);
                        Handler handler2 = this.f5667z;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), s0Var.f5809c);
                    }
                }
                return true;
            case 19:
                this.f5655n = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int k() {
        return this.f5661t.getAndIncrement();
    }

    final m0 s(d4.b bVar) {
        return (m0) this.f5663v.get(bVar);
    }

    public final void z(com.google.android.gms.common.api.b bVar, int i10, b bVar2) {
        this.f5667z.sendMessage(this.f5667z.obtainMessage(4, new d4.y(new x0(i10, bVar2), this.f5662u.get(), bVar)));
    }
}
