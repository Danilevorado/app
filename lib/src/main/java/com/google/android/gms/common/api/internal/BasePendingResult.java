package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import c4.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult extends c4.c {

    /* renamed from: o, reason: collision with root package name */
    static final ThreadLocal f5623o = new h1();

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f5624p = 0;

    /* renamed from: b, reason: collision with root package name */
    protected final a f5626b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f5627c;

    /* renamed from: f, reason: collision with root package name */
    private c4.g f5630f;

    /* renamed from: h, reason: collision with root package name */
    private c4.f f5632h;

    /* renamed from: i, reason: collision with root package name */
    private Status f5633i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f5634j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5635k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5636l;

    /* renamed from: m, reason: collision with root package name */
    private e4.k f5637m;

    @KeepName
    private i1 resultGuardian;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5625a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f5628d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f5629e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f5631g = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private boolean f5638n = false;

    public static class a extends p4.l {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(c4.g gVar, c4.f fVar) {
            int i10 = BasePendingResult.f5624p;
            sendMessage(obtainMessage(1, new Pair((c4.g) e4.p.l(gVar), fVar)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).e(Status.f5596u);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            c4.g gVar = (c4.g) pair.first;
            c4.f fVar = (c4.f) pair.second;
            try {
                gVar.a(fVar);
            } catch (RuntimeException e5) {
                BasePendingResult.m(fVar);
                throw e5;
            }
        }
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.f5626b = new a(googleApiClient != null ? googleApiClient.h() : Looper.getMainLooper());
        this.f5627c = new WeakReference(googleApiClient);
    }

    private final c4.f i() {
        c4.f fVar;
        synchronized (this.f5625a) {
            e4.p.p(!this.f5634j, "Result has already been consumed.");
            e4.p.p(g(), "Result is not ready.");
            fVar = this.f5632h;
            this.f5632h = null;
            this.f5630f = null;
            this.f5634j = true;
        }
        v0 v0Var = (v0) this.f5631g.getAndSet(null);
        if (v0Var != null) {
            v0Var.f5818a.f5821a.remove(this);
        }
        return (c4.f) e4.p.l(fVar);
    }

    private final void j(c4.f fVar) {
        this.f5632h = fVar;
        this.f5633i = fVar.e();
        d4.e0 e0Var = null;
        this.f5637m = null;
        this.f5628d.countDown();
        if (this.f5635k) {
            this.f5630f = null;
        } else {
            c4.g gVar = this.f5630f;
            if (gVar != null) {
                this.f5626b.removeMessages(2);
                this.f5626b.a(gVar, i());
            } else if (this.f5632h instanceof c4.d) {
                this.resultGuardian = new i1(this, e0Var);
            }
        }
        ArrayList arrayList = this.f5629e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c.a) arrayList.get(i10)).a(this.f5633i);
        }
        this.f5629e.clear();
    }

    public static void m(c4.f fVar) {
        if (fVar instanceof c4.d) {
            try {
                ((c4.d) fVar).b();
            } catch (RuntimeException e5) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(fVar)), e5);
            }
        }
    }

    @Override // c4.c
    public final void b(c.a aVar) {
        e4.p.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f5625a) {
            if (g()) {
                aVar.a(this.f5633i);
            } else {
                this.f5629e.add(aVar);
            }
        }
    }

    public void c() {
        synchronized (this.f5625a) {
            if (!this.f5635k && !this.f5634j) {
                e4.k kVar = this.f5637m;
                if (kVar != null) {
                    try {
                        kVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                m(this.f5632h);
                this.f5635k = true;
                j(d(Status.f5597v));
            }
        }
    }

    protected abstract c4.f d(Status status);

    public final void e(Status status) {
        synchronized (this.f5625a) {
            if (!g()) {
                h(d(status));
                this.f5636l = true;
            }
        }
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f5625a) {
            z10 = this.f5635k;
        }
        return z10;
    }

    public final boolean g() {
        return this.f5628d.getCount() == 0;
    }

    public final void h(c4.f fVar) {
        synchronized (this.f5625a) {
            if (this.f5636l || this.f5635k) {
                m(fVar);
                return;
            }
            g();
            e4.p.p(!g(), "Results have already been set");
            e4.p.p(!this.f5634j, "Result has already been consumed");
            j(fVar);
        }
    }

    public final void l() {
        boolean z10 = true;
        if (!this.f5638n && !((Boolean) f5623o.get()).booleanValue()) {
            z10 = false;
        }
        this.f5638n = z10;
    }

    public final boolean n() {
        boolean zF;
        synchronized (this.f5625a) {
            if (((GoogleApiClient) this.f5627c.get()) == null || !this.f5638n) {
                c();
            }
            zF = f();
        }
        return zF;
    }

    public final void o(v0 v0Var) {
        this.f5631g.set(v0Var);
    }
}
