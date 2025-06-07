package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class d0 extends GoogleApiClient implements d4.v {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f5675b;

    /* renamed from: c, reason: collision with root package name */
    private final e4.h0 f5676c;

    /* renamed from: e, reason: collision with root package name */
    private final int f5678e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f5679f;

    /* renamed from: g, reason: collision with root package name */
    private final Looper f5680g;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f5682i;

    /* renamed from: j, reason: collision with root package name */
    private long f5683j;

    /* renamed from: k, reason: collision with root package name */
    private long f5684k;

    /* renamed from: l, reason: collision with root package name */
    private final b0 f5685l;

    /* renamed from: m, reason: collision with root package name */
    private final b4.e f5686m;

    /* renamed from: n, reason: collision with root package name */
    d4.u f5687n;

    /* renamed from: o, reason: collision with root package name */
    final Map f5688o;

    /* renamed from: p, reason: collision with root package name */
    Set f5689p;

    /* renamed from: q, reason: collision with root package name */
    final e4.e f5690q;

    /* renamed from: r, reason: collision with root package name */
    final Map f5691r;

    /* renamed from: s, reason: collision with root package name */
    final a.AbstractC0091a f5692s;

    /* renamed from: t, reason: collision with root package name */
    private final e f5693t;

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList f5694u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f5695v;

    /* renamed from: w, reason: collision with root package name */
    Set f5696w;

    /* renamed from: x, reason: collision with root package name */
    final w0 f5697x;

    /* renamed from: y, reason: collision with root package name */
    private final e4.g0 f5698y;

    /* renamed from: d, reason: collision with root package name */
    private d4.x f5677d = null;

    /* renamed from: h, reason: collision with root package name */
    final Queue f5681h = new LinkedList();

    public d0(Context context, Lock lock, Looper looper, e4.e eVar, b4.e eVar2, a.AbstractC0091a abstractC0091a, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        this.f5683j = true != i4.d.a() ? 120000L : 10000L;
        this.f5684k = 5000L;
        this.f5689p = new HashSet();
        this.f5693t = new e();
        this.f5695v = null;
        this.f5696w = null;
        a0 a0Var = new a0(this);
        this.f5698y = a0Var;
        this.f5679f = context;
        this.f5675b = lock;
        this.f5676c = new e4.h0(looper, a0Var);
        this.f5680g = looper;
        this.f5685l = new b0(this, looper);
        this.f5686m = eVar2;
        this.f5678e = i10;
        if (i10 >= 0) {
            this.f5695v = Integer.valueOf(i11);
        }
        this.f5691r = map;
        this.f5688o = map2;
        this.f5694u = arrayList;
        this.f5697x = new w0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f5676c.f((GoogleApiClient.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f5676c.g((GoogleApiClient.c) it2.next());
        }
        this.f5690q = eVar;
        this.f5692s = abstractC0091a;
    }

    public static int m(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean zS = false;
        boolean zC = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            zS |= fVar.s();
            zC |= fVar.c();
        }
        if (zS) {
            return (zC && z10) ? 2 : 1;
        }
        return 3;
    }

    static String o(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    static /* bridge */ /* synthetic */ void p(d0 d0Var) {
        d0Var.f5675b.lock();
        try {
            if (d0Var.f5682i) {
                d0Var.t();
            }
        } finally {
            d0Var.f5675b.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void q(d0 d0Var) {
        d0Var.f5675b.lock();
        try {
            if (d0Var.r()) {
                d0Var.t();
            }
        } finally {
            d0Var.f5675b.unlock();
        }
    }

    private final void s(int i10) {
        d4.x g0Var;
        Integer num = this.f5695v;
        if (num == null) {
            this.f5695v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            throw new IllegalStateException("Cannot use sign-in mode: " + o(i10) + ". Mode was already set to " + o(this.f5695v.intValue()));
        }
        if (this.f5677d != null) {
            return;
        }
        boolean zS = false;
        boolean zC = false;
        for (a.f fVar : this.f5688o.values()) {
            zS |= fVar.s();
            zC |= fVar.c();
        }
        int iIntValue = this.f5695v.intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2 && zS) {
                g0Var = g.l(this.f5679f, this, this.f5675b, this.f5680g, this.f5686m, this.f5688o, this.f5690q, this.f5691r, this.f5692s, this.f5694u);
            }
            this.f5677d = g0Var;
        }
        if (!zS) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        if (zC) {
            throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        g0Var = new g0(this.f5679f, this, this.f5675b, this.f5680g, this.f5686m, this.f5688o, this.f5690q, this.f5691r, this.f5692s, this.f5694u, this);
        this.f5677d = g0Var;
    }

    private final void t() {
        this.f5676c.b();
        ((d4.x) e4.p.l(this.f5677d)).a();
    }

    @Override // d4.v
    public final void a(Bundle bundle) {
        while (!this.f5681h.isEmpty()) {
            e((b) this.f5681h.remove());
        }
        this.f5676c.d(bundle);
    }

    @Override // d4.v
    public final void b(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f5682i) {
                this.f5682i = true;
                if (this.f5687n == null && !i4.d.a()) {
                    try {
                        this.f5687n = this.f5686m.u(this.f5679f.getApplicationContext(), new c0(this));
                    } catch (SecurityException unused) {
                    }
                }
                b0 b0Var = this.f5685l;
                b0Var.sendMessageDelayed(b0Var.obtainMessage(1), this.f5683j);
                b0 b0Var2 = this.f5685l;
                b0Var2.sendMessageDelayed(b0Var2.obtainMessage(2), this.f5684k);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f5697x.f5821a.toArray(new BasePendingResult[0])) {
            basePendingResult.e(w0.f5820c);
        }
        this.f5676c.e(i10);
        this.f5676c.a();
        if (i10 == 2) {
            t();
        }
    }

    @Override // d4.v
    public final void c(b4.b bVar) {
        if (!this.f5686m.k(this.f5679f, bVar.f())) {
            r();
        }
        if (this.f5682i) {
            return;
        }
        this.f5676c.c(bVar);
        this.f5676c.a();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.f5675b.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f5678e >= 0) {
                e4.p.p(this.f5695v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f5695v;
                if (num == null) {
                    this.f5695v = Integer.valueOf(m(this.f5688o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) e4.p.l(this.f5695v)).intValue();
            this.f5675b.lock();
            if (iIntValue != 3 && iIntValue != 1) {
                if (iIntValue != 2) {
                    i10 = iIntValue;
                }
                e4.p.b(z10, "Illegal sign-in mode: " + i10);
                s(i10);
                t();
                this.f5675b.unlock();
            }
            i10 = iIntValue;
            z10 = true;
            e4.p.b(z10, "Illegal sign-in mode: " + i10);
            s(i10);
            t();
            this.f5675b.unlock();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f5675b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f5679f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f5682i);
        printWriter.append(" mWorkQueue.size()=").print(this.f5681h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f5697x.f5821a.size());
        d4.x xVar = this.f5677d;
        if (xVar != null) {
            xVar.c(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.f5675b.lock();
        try {
            this.f5697x.b();
            d4.x xVar = this.f5677d;
            if (xVar != null) {
                xVar.b();
            }
            this.f5693t.c();
            for (b bVar : this.f5681h) {
                bVar.o(null);
                bVar.c();
            }
            this.f5681h.clear();
            if (this.f5677d != null) {
                r();
                this.f5676c.a();
            }
        } finally {
            this.f5675b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final b e(b bVar) {
        Map map = this.f5688o;
        com.google.android.gms.common.api.a aVarQ = bVar.q();
        e4.p.b(map.containsKey(bVar.r()), "GoogleApiClient is not configured to use " + (aVarQ != null ? aVarQ.d() : "the API") + " required for this call.");
        this.f5675b.lock();
        try {
            d4.x xVar = this.f5677d;
            if (xVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f5682i) {
                this.f5681h.add(bVar);
                while (!this.f5681h.isEmpty()) {
                    b bVar2 = (b) this.f5681h.remove();
                    this.f5697x.a(bVar2);
                    bVar2.v(Status.f5595t);
                }
            } else {
                bVar = xVar.e(bVar);
            }
            return bVar;
        } finally {
            this.f5675b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final a.f f(a.c cVar) {
        a.f fVar = (a.f) this.f5688o.get(cVar);
        e4.p.m(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context g() {
        return this.f5679f;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper h() {
        return this.f5680g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean i() {
        d4.x xVar = this.f5677d;
        return xVar != null && xVar.d();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void j(GoogleApiClient.c cVar) {
        this.f5676c.g(cVar);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void k(GoogleApiClient.c cVar) {
        this.f5676c.h(cVar);
    }

    final String n() {
        StringWriter stringWriter = new StringWriter();
        d("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    final boolean r() {
        if (!this.f5682i) {
            return false;
        }
        this.f5682i = false;
        this.f5685l.removeMessages(2);
        this.f5685l.removeMessages(1);
        d4.u uVar = this.f5687n;
        if (uVar != null) {
            uVar.b();
            this.f5687n = null;
        }
        return true;
    }
}
