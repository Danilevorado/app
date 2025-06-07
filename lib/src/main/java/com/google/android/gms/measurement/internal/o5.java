package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class o5 extends x4.e {

    /* renamed from: m, reason: collision with root package name */
    private final n9 f20244m;

    /* renamed from: n, reason: collision with root package name */
    private Boolean f20245n;

    /* renamed from: o, reason: collision with root package name */
    private String f20246o;

    public o5(n9 n9Var, String str) {
        e4.p.l(n9Var);
        this.f20244m = n9Var;
        this.f20246o = null;
    }

    private final void L5(z9 z9Var, boolean z10) {
        e4.p.l(z9Var);
        e4.p.f(z9Var.f20612m);
        M5(z9Var.f20612m, false);
        this.f20244m.h0().L(z9Var.f20613n, z9Var.C);
    }

    private final void M5(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f20244m.b().p().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f20245n == null) {
                    this.f20245n = Boolean.valueOf("com.google.android.gms".equals(this.f20246o) || i4.r.a(this.f20244m.a(), Binder.getCallingUid()) || b4.j.a(this.f20244m.a()).c(Binder.getCallingUid()));
                }
                if (this.f20245n.booleanValue()) {
                    return;
                }
            } catch (SecurityException e5) {
                this.f20244m.b().p().b("Measurement Service called with invalid calling package. appId", s3.y(str));
                throw e5;
            }
        }
        if (this.f20246o == null && b4.i.l(this.f20244m.a(), Binder.getCallingUid(), str)) {
            this.f20246o = str;
        }
        if (str.equals(this.f20246o)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void w0(v vVar, z9 z9Var) {
        this.f20244m.c();
        this.f20244m.h(vVar, z9Var);
    }

    @Override // x4.f
    public final void A2(z9 z9Var) {
        e4.p.f(z9Var.f20612m);
        e4.p.l(z9Var.H);
        g5 g5Var = new g5(this, z9Var);
        e4.p.l(g5Var);
        if (this.f20244m.B().C()) {
            g5Var.run();
        } else {
            this.f20244m.B().z(g5Var);
        }
    }

    @Override // x4.f
    public final List A5(String str, String str2, z9 z9Var) {
        L5(z9Var, false);
        String str3 = z9Var.f20612m;
        e4.p.l(str3);
        try {
            return (List) this.f20244m.B().q(new c5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e5) {
            this.f20244m.b().p().b("Failed to get conditional user properties", e5);
            return Collections.emptyList();
        }
    }

    @Override // x4.f
    public final void D1(z9 z9Var) {
        L5(z9Var, false);
        K5(new f5(this, z9Var));
    }

    final void K5(Runnable runnable) {
        e4.p.l(runnable);
        if (this.f20244m.B().C()) {
            runnable.run();
        } else {
            this.f20244m.B().y(runnable);
        }
    }

    final v L0(v vVar, z9 z9Var) {
        t tVar;
        if ("_cmp".equals(vVar.f20460m) && (tVar = vVar.f20461n) != null && tVar.f() != 0) {
            String strA = vVar.f20461n.A("_cis");
            if ("referrer broadcast".equals(strA) || "referrer API".equals(strA)) {
                this.f20244m.b().s().b("Event has been filtered ", vVar.toString());
                return new v("_cmpx", vVar.f20461n, vVar.f20462o, vVar.f20463p);
            }
        }
        return vVar;
    }

    @Override // x4.f
    public final List L2(String str, String str2, boolean z10, z9 z9Var) {
        L5(z9Var, false);
        String str3 = z9Var.f20612m;
        e4.p.l(str3);
        try {
            List<s9> list = (List) this.f20244m.B().q(new a5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s9 s9Var : list) {
                if (z10 || !u9.W(s9Var.f20403c)) {
                    arrayList.add(new q9(s9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e5) {
            this.f20244m.b().p().c("Failed to query user properties. appId", s3.y(z9Var.f20612m), e5);
            return Collections.emptyList();
        }
    }

    @Override // x4.f
    public final String M2(z9 z9Var) {
        L5(z9Var, false);
        return this.f20244m.j0(z9Var);
    }

    @Override // x4.f
    public final void Q1(final Bundle bundle, z9 z9Var) {
        L5(z9Var, false);
        final String str = z9Var.f20612m;
        e4.p.l(str);
        K5(new Runnable() { // from class: com.google.android.gms.measurement.internal.x4
            @Override // java.lang.Runnable
            public final void run() {
                this.f20557m.x4(str, bundle);
            }
        });
    }

    @Override // x4.f
    public final List T1(String str, String str2, String str3, boolean z10) {
        M5(str, true);
        try {
            List<s9> list = (List) this.f20244m.B().q(new b5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s9 s9Var : list) {
                if (z10 || !u9.W(s9Var.f20403c)) {
                    arrayList.add(new q9(s9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e5) {
            this.f20244m.b().p().c("Failed to get user properties as. appId", s3.y(str), e5);
            return Collections.emptyList();
        }
    }

    @Override // x4.f
    public final void Z1(d dVar) {
        e4.p.l(dVar);
        e4.p.l(dVar.f19840o);
        e4.p.f(dVar.f19838m);
        M5(dVar.f19838m, true);
        K5(new z4(this, new d(dVar)));
    }

    @Override // x4.f
    public final void b4(d dVar, z9 z9Var) {
        e4.p.l(dVar);
        e4.p.l(dVar.f19840o);
        L5(z9Var, false);
        d dVar2 = new d(dVar);
        dVar2.f19838m = z9Var.f20612m;
        K5(new y4(this, dVar2, z9Var));
    }

    @Override // x4.f
    public final void i1(long j10, String str, String str2, String str3) {
        K5(new n5(this, str2, str3, str, j10));
    }

    @Override // x4.f
    public final void i3(q9 q9Var, z9 z9Var) {
        e4.p.l(q9Var);
        L5(z9Var, false);
        K5(new k5(this, q9Var, z9Var));
    }

    @Override // x4.f
    public final void k5(v vVar, z9 z9Var) {
        e4.p.l(vVar);
        L5(z9Var, false);
        K5(new h5(this, vVar, z9Var));
    }

    @Override // x4.f
    public final List m2(z9 z9Var, boolean z10) {
        L5(z9Var, false);
        String str = z9Var.f20612m;
        e4.p.l(str);
        try {
            List<s9> list = (List) this.f20244m.B().q(new l5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s9 s9Var : list) {
                if (z10 || !u9.W(s9Var.f20403c)) {
                    arrayList.add(new q9(s9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e5) {
            this.f20244m.b().p().c("Failed to get user properties. appId", s3.y(z9Var.f20612m), e5);
            return null;
        }
    }

    @Override // x4.f
    public final List p3(String str, String str2, String str3) {
        M5(str, true);
        try {
            return (List) this.f20244m.B().q(new d5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e5) {
            this.f20244m.b().p().b("Failed to get conditional user properties as", e5);
            return Collections.emptyList();
        }
    }

    @Override // x4.f
    public final byte[] q2(v vVar, String str) {
        e4.p.f(str);
        e4.p.l(vVar);
        M5(str, true);
        this.f20244m.b().o().b("Log and bundle. event", this.f20244m.X().d(vVar.f20460m));
        long jC = this.f20244m.d().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f20244m.B().r(new j5(this, vVar, str)).get();
            if (bArr == null) {
                this.f20244m.b().p().b("Log and bundle returned null. appId", s3.y(str));
                bArr = new byte[0];
            }
            this.f20244m.b().o().d("Log and bundle processed. event, size, time_ms", this.f20244m.X().d(vVar.f20460m), Integer.valueOf(bArr.length), Long.valueOf((this.f20244m.d().c() / 1000000) - jC));
            return bArr;
        } catch (InterruptedException | ExecutionException e5) {
            this.f20244m.b().p().d("Failed to log and bundle. appId, event, error", s3.y(str), this.f20244m.X().d(vVar.f20460m), e5);
            return null;
        }
    }

    @Override // x4.f
    public final void v3(z9 z9Var) {
        e4.p.f(z9Var.f20612m);
        M5(z9Var.f20612m, false);
        K5(new e5(this, z9Var));
    }

    final void w3(v vVar, z9 z9Var) {
        q3 q3VarT;
        String str;
        String str2;
        if (!this.f20244m.a0().C(z9Var.f20612m)) {
            w0(vVar, z9Var);
            return;
        }
        this.f20244m.b().t().b("EES config found for", z9Var.f20612m);
        q4 q4VarA0 = this.f20244m.a0();
        String str3 = z9Var.f20612m;
        com.google.android.gms.internal.measurement.c1 c1Var = TextUtils.isEmpty(str3) ? null : (com.google.android.gms.internal.measurement.c1) q4VarA0.f20295j.c(str3);
        if (c1Var != null) {
            try {
                Map mapI = this.f20244m.g0().I(vVar.f20461n.v(), true);
                String strA = x4.q.a(vVar.f20460m);
                if (strA == null) {
                    strA = vVar.f20460m;
                }
                if (c1Var.e(new com.google.android.gms.internal.measurement.b(strA, vVar.f20463p, mapI))) {
                    if (c1Var.g()) {
                        this.f20244m.b().t().b("EES edited event", vVar.f20460m);
                        vVar = this.f20244m.g0().z(c1Var.a().b());
                    }
                    w0(vVar, z9Var);
                    if (c1Var.f()) {
                        for (com.google.android.gms.internal.measurement.b bVar : c1Var.a().c()) {
                            this.f20244m.b().t().b("EES logging created event", bVar.d());
                            w0(this.f20244m.g0().z(bVar), z9Var);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.x1 unused) {
                this.f20244m.b().p().c("EES error. appId, eventName", z9Var.f20613n, vVar.f20460m);
            }
            q3VarT = this.f20244m.b().t();
            str = vVar.f20460m;
            str2 = "EES was not applied to event";
        } else {
            q3VarT = this.f20244m.b().t();
            str = z9Var.f20612m;
            str2 = "EES not loaded for";
        }
        q3VarT.b(str2, str);
        w0(vVar, z9Var);
    }

    final /* synthetic */ void x4(String str, Bundle bundle) {
        l lVarW = this.f20244m.W();
        lVarW.f();
        lVarW.g();
        byte[] bArrE = lVarW.f19803b.g0().A(new q(lVarW.f20269a, "", str, "dep", 0L, 0L, bundle)).e();
        lVarW.f20269a.b().t().c("Saving default event parameters, appId, data size", lVarW.f20269a.D().d(str), Integer.valueOf(bArrE.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrE);
        try {
            if (lVarW.P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                lVarW.f20269a.b().p().b("Failed to insert default event parameters (got -1). appId", s3.y(str));
            }
        } catch (SQLiteException e5) {
            lVarW.f20269a.b().p().c("Error storing default event parameters. appId", s3.y(str), e5);
        }
    }

    @Override // x4.f
    public final void y1(v vVar, String str, String str2) {
        e4.p.l(vVar);
        e4.p.f(str);
        M5(str, true);
        K5(new i5(this, vVar, str));
    }

    @Override // x4.f
    public final void y5(z9 z9Var) {
        L5(z9Var, false);
        K5(new m5(this, z9Var));
    }
}
