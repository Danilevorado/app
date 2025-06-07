package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h8 extends x3 {

    /* renamed from: c, reason: collision with root package name */
    private final g8 f19988c;

    /* renamed from: d, reason: collision with root package name */
    private x4.f f19989d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f19990e;

    /* renamed from: f, reason: collision with root package name */
    private final o f19991f;

    /* renamed from: g, reason: collision with root package name */
    private final y8 f19992g;

    /* renamed from: h, reason: collision with root package name */
    private final List f19993h;

    /* renamed from: i, reason: collision with root package name */
    private final o f19994i;

    protected h8(w4 w4Var) {
        super(w4Var);
        this.f19993h = new ArrayList();
        this.f19992g = new y8(w4Var.d());
        this.f19988c = new g8(this);
        this.f19991f = new r7(this, w4Var);
        this.f19994i = new t7(this, w4Var);
    }

    private final z9 C(boolean z10) {
        Pair pairA;
        this.f20269a.x();
        k3 k3VarA = this.f20269a.A();
        String str = null;
        if (z10) {
            s3 s3VarB = this.f20269a.b();
            if (s3VarB.f20269a.F().f19921d != null && (pairA = s3VarB.f20269a.F().f19921d.a()) != null && pairA != g4.f19919x) {
                str = String.valueOf(pairA.second) + ":" + ((String) pairA.first);
            }
        }
        return k3VarA.o(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        f();
        this.f20269a.b().t().b("Processing queued up service tasks", Integer.valueOf(this.f19993h.size()));
        Iterator it = this.f19993h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e5) {
                this.f20269a.b().p().b("Task exception while flushing queue", e5);
            }
        }
        this.f19993h.clear();
        this.f19994i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        f();
        this.f19992g.b();
        o oVar = this.f19991f;
        this.f20269a.y();
        oVar.d(((Long) i3.K.a(null)).longValue());
    }

    private final void F(Runnable runnable) {
        f();
        if (y()) {
            runnable.run();
            return;
        }
        int size = this.f19993h.size();
        this.f20269a.y();
        if (size >= 1000) {
            this.f20269a.b().p().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f19993h.add(runnable);
        this.f19994i.d(60000L);
        P();
    }

    private final boolean G() {
        this.f20269a.x();
        return true;
    }

    static /* bridge */ /* synthetic */ void M(h8 h8Var, ComponentName componentName) {
        h8Var.f();
        if (h8Var.f19989d != null) {
            h8Var.f19989d = null;
            h8Var.f20269a.b().t().b("Disconnected from device MeasurementService", componentName);
            h8Var.f();
            h8Var.P();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean A() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h8.A():boolean");
    }

    final Boolean J() {
        return this.f19990e;
    }

    protected final void O() {
        f();
        g();
        z9 z9VarC = C(true);
        this.f20269a.C().p();
        F(new o7(this, z9VarC));
    }

    final void P() {
        f();
        g();
        if (y()) {
            return;
        }
        if (A()) {
            this.f19988c.c();
            return;
        }
        if (this.f20269a.y().G()) {
            return;
        }
        this.f20269a.x();
        List<ResolveInfo> listQueryIntentServices = this.f20269a.a().getPackageManager().queryIntentServices(new Intent().setClassName(this.f20269a.a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.f20269a.b().p().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextA = this.f20269a.a();
        this.f20269a.x();
        intent.setComponent(new ComponentName(contextA, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f19988c.b(intent);
    }

    public final void Q() {
        f();
        g();
        this.f19988c.d();
        try {
            h4.a.b().c(this.f20269a.a(), this.f19988c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f19989d = null;
    }

    public final void R(com.google.android.gms.internal.measurement.i1 i1Var) {
        f();
        g();
        F(new n7(this, C(false), i1Var));
    }

    public final void S(AtomicReference atomicReference) {
        f();
        g();
        F(new m7(this, atomicReference, C(false)));
    }

    protected final void T(com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2) {
        f();
        g();
        F(new z7(this, str, str2, C(false), i1Var));
    }

    protected final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        f();
        g();
        F(new y7(this, atomicReference, null, str2, str3, C(false)));
    }

    protected final void V(com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2, boolean z10) {
        f();
        g();
        F(new i7(this, str, str2, C(false), z10, i1Var));
    }

    protected final void W(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        f();
        g();
        F(new a8(this, atomicReference, null, str2, str3, C(false), z10));
    }

    @Override // com.google.android.gms.measurement.internal.x3
    protected final boolean l() {
        return false;
    }

    protected final void m(v vVar, String str) {
        e4.p.l(vVar);
        f();
        g();
        G();
        F(new w7(this, true, C(true), this.f20269a.C().t(vVar), vVar, str));
    }

    public final void n(com.google.android.gms.internal.measurement.i1 i1Var, v vVar, String str) {
        f();
        g();
        if (this.f20269a.N().p0(12451000) == 0) {
            F(new s7(this, vVar, str, i1Var));
        } else {
            this.f20269a.b().u().a("Not bundling data. Service unavailable or out of date");
            this.f20269a.N().G(i1Var, new byte[0]);
        }
    }

    protected final void o() {
        f();
        g();
        z9 z9VarC = C(false);
        G();
        this.f20269a.C().o();
        F(new l7(this, z9VarC));
    }

    final void p(x4.f fVar, f4.a aVar, z9 z9Var) {
        int size;
        q3 q3VarP;
        String str;
        f();
        g();
        G();
        this.f20269a.y();
        int i10 = 0;
        int i11 = 100;
        while (i10 < 1001 && i11 == 100) {
            ArrayList arrayList = new ArrayList();
            List listN = this.f20269a.C().n(100);
            if (listN != null) {
                arrayList.addAll(listN);
                size = listN.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList.add(aVar);
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                f4.a aVar2 = (f4.a) arrayList.get(i12);
                if (aVar2 instanceof v) {
                    try {
                        fVar.k5((v) aVar2, z9Var);
                    } catch (RemoteException e5) {
                        e = e5;
                        q3VarP = this.f20269a.b().p();
                        str = "Failed to send event to the service";
                        q3VarP.b(str, e);
                    }
                } else if (aVar2 instanceof q9) {
                    try {
                        fVar.i3((q9) aVar2, z9Var);
                    } catch (RemoteException e10) {
                        e = e10;
                        q3VarP = this.f20269a.b().p();
                        str = "Failed to send user property to the service";
                        q3VarP.b(str, e);
                    }
                } else if (aVar2 instanceof d) {
                    try {
                        fVar.b4((d) aVar2, z9Var);
                    } catch (RemoteException e11) {
                        e = e11;
                        q3VarP = this.f20269a.b().p();
                        str = "Failed to send conditional user property to the service";
                        q3VarP.b(str, e);
                    }
                } else {
                    this.f20269a.b().p().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i10++;
            i11 = size;
        }
    }

    protected final void q(d dVar) {
        e4.p.l(dVar);
        f();
        g();
        this.f20269a.x();
        F(new x7(this, true, C(true), this.f20269a.C().s(dVar), new d(dVar), dVar));
    }

    protected final void r(boolean z10) {
        f();
        g();
        if (z10) {
            G();
            this.f20269a.C().o();
        }
        if (z()) {
            F(new v7(this, C(false)));
        }
    }

    protected final void s(a7 a7Var) {
        f();
        g();
        F(new p7(this, a7Var));
    }

    public final void t(Bundle bundle) {
        f();
        g();
        F(new q7(this, C(false), bundle));
    }

    protected final void u() {
        f();
        g();
        F(new u7(this, C(true)));
    }

    protected final void v(x4.f fVar) {
        f();
        e4.p.l(fVar);
        this.f19989d = fVar;
        E();
        D();
    }

    protected final void w(q9 q9Var) {
        f();
        g();
        G();
        F(new k7(this, C(true), this.f20269a.C().u(q9Var), q9Var));
    }

    public final boolean y() {
        f();
        g();
        return this.f19989d != null;
    }

    final boolean z() {
        f();
        g();
        return !A() || this.f20269a.N().o0() >= ((Integer) i3.f20018h0.a(null)).intValue();
    }
}
