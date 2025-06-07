package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class g implements d4.x {

    /* renamed from: m, reason: collision with root package name */
    private final Context f5715m;

    /* renamed from: n, reason: collision with root package name */
    private final d0 f5716n;

    /* renamed from: o, reason: collision with root package name */
    private final Looper f5717o;

    /* renamed from: p, reason: collision with root package name */
    private final g0 f5718p;

    /* renamed from: q, reason: collision with root package name */
    private final g0 f5719q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f5720r;

    /* renamed from: t, reason: collision with root package name */
    private final a.f f5722t;

    /* renamed from: u, reason: collision with root package name */
    private Bundle f5723u;

    /* renamed from: y, reason: collision with root package name */
    private final Lock f5727y;

    /* renamed from: s, reason: collision with root package name */
    private final Set f5721s = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: v, reason: collision with root package name */
    private b4.b f5724v = null;

    /* renamed from: w, reason: collision with root package name */
    private b4.b f5725w = null;

    /* renamed from: x, reason: collision with root package name */
    private boolean f5726x = false;

    /* renamed from: z, reason: collision with root package name */
    private int f5728z = 0;

    private g(Context context, d0 d0Var, Lock lock, Looper looper, b4.f fVar, Map map, Map map2, e4.e eVar, a.AbstractC0091a abstractC0091a, a.f fVar2, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f5715m = context;
        this.f5716n = d0Var;
        this.f5727y = lock;
        this.f5717o = looper;
        this.f5722t = fVar2;
        this.f5718p = new g0(context, d0Var, lock, looper, fVar, map2, null, map4, null, arrayList2, new j1(this, null));
        this.f5719q = new g0(context, d0Var, lock, looper, fVar, map, eVar, map3, abstractC0091a, arrayList, new k1(this, null));
        q.a aVar = new q.a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put((a.c) it.next(), this.f5718p);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put((a.c) it2.next(), this.f5719q);
        }
        this.f5720r = Collections.unmodifiableMap(aVar);
    }

    private final void f(b4.b bVar) {
        int i10 = this.f5728z;
        if (i10 == 1) {
            g();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f5716n.c(bVar);
            g();
        }
        this.f5728z = 0;
    }

    private final void g() {
        Iterator it = this.f5721s.iterator();
        while (it.hasNext()) {
            ((d4.i) it.next()).a();
        }
        this.f5721s.clear();
    }

    private final boolean h() {
        b4.b bVar = this.f5725w;
        return bVar != null && bVar.f() == 4;
    }

    private final boolean i(b bVar) {
        g0 g0Var = (g0) this.f5720r.get(bVar.r());
        e4.p.m(g0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return g0Var.equals(this.f5719q);
    }

    private static boolean j(b4.b bVar) {
        return bVar != null && bVar.y();
    }

    public static g l(Context context, d0 d0Var, Lock lock, Looper looper, b4.f fVar, Map map, e4.e eVar, Map map2, a.AbstractC0091a abstractC0091a, ArrayList arrayList) {
        q.a aVar = new q.a();
        q.a aVar2 = new q.a();
        a.f fVar2 = null;
        for (Map.Entry entry : map.entrySet()) {
            a.f fVar3 = (a.f) entry.getValue();
            if (true == fVar3.c()) {
                fVar2 = fVar3;
            }
            boolean zS = fVar3.s();
            a.c cVar = (a.c) entry.getKey();
            if (zS) {
                aVar.put(cVar, fVar3);
            } else {
                aVar2.put(cVar, fVar3);
            }
        }
        e4.p.p(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        q.a aVar3 = new q.a();
        q.a aVar4 = new q.a();
        for (com.google.android.gms.common.api.a aVar5 : map2.keySet()) {
            a.c cVarB = aVar5.b();
            if (aVar.containsKey(cVarB)) {
                aVar3.put(aVar5, (Boolean) map2.get(aVar5));
            } else {
                if (!aVar2.containsKey(cVarB)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                aVar4.put(aVar5, (Boolean) map2.get(aVar5));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d4.f0 f0Var = (d4.f0) arrayList.get(i10);
            if (aVar3.containsKey(f0Var.f22904m)) {
                arrayList2.add(f0Var);
            } else {
                if (!aVar4.containsKey(f0Var.f22904m)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(f0Var);
            }
        }
        return new g(context, d0Var, lock, looper, fVar, aVar, aVar2, eVar, abstractC0091a, fVar2, arrayList2, arrayList3, aVar3, aVar4);
    }

    static /* bridge */ /* synthetic */ void s(g gVar, int i10, boolean z10) {
        gVar.f5716n.b(i10, z10);
        gVar.f5725w = null;
        gVar.f5724v = null;
    }

    static /* bridge */ /* synthetic */ void t(g gVar, Bundle bundle) {
        Bundle bundle2 = gVar.f5723u;
        if (bundle2 == null) {
            gVar.f5723u = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void u(g gVar) {
        b4.b bVar;
        if (!j(gVar.f5724v)) {
            if (gVar.f5724v != null && j(gVar.f5725w)) {
                gVar.f5719q.b();
                gVar.f((b4.b) e4.p.l(gVar.f5724v));
                return;
            }
            b4.b bVar2 = gVar.f5724v;
            if (bVar2 == null || (bVar = gVar.f5725w) == null) {
                return;
            }
            if (gVar.f5719q.f5741y < gVar.f5718p.f5741y) {
                bVar2 = bVar;
            }
            gVar.f(bVar2);
            return;
        }
        if (j(gVar.f5725w) || gVar.h()) {
            int i10 = gVar.f5728z;
            if (i10 == 1) {
                gVar.g();
            } else if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((d0) e4.p.l(gVar.f5716n)).a(gVar.f5723u);
                gVar.g();
            }
            gVar.f5728z = 0;
            return;
        }
        b4.b bVar3 = gVar.f5725w;
        if (bVar3 != null) {
            if (gVar.f5728z == 1) {
                gVar.g();
            } else {
                gVar.f(bVar3);
                gVar.f5718p.b();
            }
        }
    }

    private final PendingIntent w() {
        a.f fVar = this.f5722t;
        if (fVar == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f5715m, System.identityHashCode(this.f5716n), fVar.r(), p4.g.f25921a | 134217728);
    }

    @Override // d4.x
    public final void a() {
        this.f5728z = 2;
        this.f5726x = false;
        this.f5725w = null;
        this.f5724v = null;
        this.f5718p.a();
        this.f5719q.a();
    }

    @Override // d4.x
    public final void b() {
        this.f5725w = null;
        this.f5724v = null;
        this.f5728z = 0;
        this.f5718p.b();
        this.f5719q.b();
        g();
    }

    @Override // d4.x
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f5719q.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f5718p.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // d4.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f5727y
            r0.lock()
            com.google.android.gms.common.api.internal.g0 r0 = r3.f5718p     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            com.google.android.gms.common.api.internal.g0 r0 = r3.f5719q     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            boolean r0 = r3.h()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.f5728z     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L22
        L21:
            r1 = r2
        L22:
            java.util.concurrent.locks.Lock r0 = r3.f5727y
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.f5727y
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.g.d():boolean");
    }

    @Override // d4.x
    public final b e(b bVar) {
        if (!i(bVar)) {
            return this.f5718p.e(bVar);
        }
        if (!h()) {
            return this.f5719q.e(bVar);
        }
        bVar.v(new Status(4, (String) null, w()));
        return bVar;
    }
}
