package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.ld;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class j5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f20087a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20088b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o5 f20089c;

    j5(o5 o5Var, v vVar, String str) {
        this.f20089c = o5Var;
        this.f20087a = vVar;
        this.f20088b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        s9 s9Var;
        s5 s5Var;
        com.google.android.gms.internal.measurement.q4 q4Var;
        String str;
        Bundle bundle;
        com.google.android.gms.internal.measurement.t4 t4Var;
        String str2;
        r rVarC;
        long j10;
        this.f20089c.f20244m.c();
        z6 z6VarD0 = this.f20089c.f20244m.d0();
        v vVar = this.f20087a;
        String str3 = this.f20088b;
        z6VarD0.f();
        w4.r();
        e4.p.l(vVar);
        e4.p.f(str3);
        if (!z6VarD0.f20269a.y().A(str3, i3.U)) {
            z6VarD0.f20269a.b().o().b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        }
        if (!"_iap".equals(vVar.f20460m) && !"_iapx".equals(vVar.f20460m)) {
            z6VarD0.f20269a.b().o().c("Generating a payload for this event is not available. package_name, event_name", str3, vVar.f20460m);
            return null;
        }
        com.google.android.gms.internal.measurement.q4 q4VarV = com.google.android.gms.internal.measurement.s4.v();
        z6VarD0.f19803b.W().e0();
        try {
            s5 s5VarR = z6VarD0.f19803b.W().R(str3);
            if (s5VarR == null) {
                z6VarD0.f20269a.b().o().b("Log and bundle not available. package_name", str3);
            } else if (s5VarR.J()) {
                com.google.android.gms.internal.measurement.t4 t4VarK1 = com.google.android.gms.internal.measurement.u4.K1();
                t4VarK1.W(1);
                t4VarK1.R("android");
                if (!TextUtils.isEmpty(s5VarR.d0())) {
                    t4VarK1.v(s5VarR.d0());
                }
                if (!TextUtils.isEmpty(s5VarR.f0())) {
                    t4VarK1.x((String) e4.p.l(s5VarR.f0()));
                }
                if (!TextUtils.isEmpty(s5VarR.g0())) {
                    t4VarK1.y((String) e4.p.l(s5VarR.g0()));
                }
                if (s5VarR.L() != -2147483648L) {
                    t4VarK1.z((int) s5VarR.L());
                }
                t4VarK1.N(s5VarR.W());
                t4VarK1.H(s5VarR.U());
                String strI0 = s5VarR.i0();
                String strB0 = s5VarR.b0();
                if (!TextUtils.isEmpty(strI0)) {
                    t4VarK1.M(strI0);
                } else if (!TextUtils.isEmpty(strB0)) {
                    t4VarK1.u(strB0);
                }
                x4.b bVarV = z6VarD0.f19803b.V(str3);
                t4VarK1.E(s5VarR.T());
                if (z6VarD0.f20269a.m() && z6VarD0.f20269a.y().C(t4VarK1.i0()) && bVarV.i(x4.a.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    t4VarK1.G(null);
                }
                t4VarK1.D(bVarV.h());
                if (bVarV.i(x4.a.AD_STORAGE) && (!z6VarD0.f20269a.y().A(null, i3.f20026l0) || s5VarR.I())) {
                    Pair pairL = z6VarD0.f19803b.e0().l(s5VarR.d0(), bVarV);
                    if (s5VarR.I() && !TextUtils.isEmpty((CharSequence) pairL.first)) {
                        try {
                            t4VarK1.X(z6.c((String) pairL.first, Long.toString(vVar.f20463p)));
                            Object obj = pairL.second;
                            if (obj != null) {
                                t4VarK1.P(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e5) {
                            z6VarD0.f20269a.b().o().b("Resettable device id encryption failed", e5.getMessage());
                        }
                    }
                }
                z6VarD0.f20269a.z().i();
                t4VarK1.F(Build.MODEL);
                z6VarD0.f20269a.z().i();
                t4VarK1.Q(Build.VERSION.RELEASE);
                t4VarK1.c0((int) z6VarD0.f20269a.z().n());
                t4VarK1.g0(z6VarD0.f20269a.z().o());
                try {
                    if (bVarV.i(x4.a.ANALYTICS_STORAGE) && s5VarR.e0() != null) {
                        t4VarK1.w(z6.c((String) e4.p.l(s5VarR.e0()), Long.toString(vVar.f20463p)));
                    }
                    if (!TextUtils.isEmpty(s5VarR.h0())) {
                        t4VarK1.L((String) e4.p.l(s5VarR.h0()));
                    }
                    String strD0 = s5VarR.d0();
                    List listC0 = z6VarD0.f19803b.W().c0(strD0);
                    Iterator it = listC0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            s9Var = null;
                            break;
                        }
                        s9Var = (s9) it.next();
                        if ("_lte".equals(s9Var.f20403c)) {
                            break;
                        }
                    }
                    if (s9Var == null || s9Var.f20405e == null) {
                        s9 s9Var2 = new s9(strD0, "auto", "_lte", z6VarD0.f20269a.d().a(), 0L);
                        listC0.add(s9Var2);
                        z6VarD0.f19803b.W().v(s9Var2);
                    }
                    p9 p9VarG0 = z6VarD0.f19803b.g0();
                    p9VarG0.f20269a.b().t().a("Checking account type status for ad personalization signals");
                    if (p9VarG0.f20269a.z().q()) {
                        String strD02 = s5VarR.d0();
                        e4.p.l(strD02);
                        if (s5VarR.I() && p9VarG0.f19803b.a0().A(strD02)) {
                            p9VarG0.f20269a.b().o().a("Turning off ad personalization due to account type");
                            Iterator it2 = listC0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if ("_npa".equals(((s9) it2.next()).f20403c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            listC0.add(new s9(strD02, "auto", "_npa", p9VarG0.f20269a.d().a(), 1L));
                        }
                    }
                    com.google.android.gms.internal.measurement.d5[] d5VarArr = new com.google.android.gms.internal.measurement.d5[listC0.size()];
                    for (int i10 = 0; i10 < listC0.size(); i10++) {
                        com.google.android.gms.internal.measurement.c5 c5VarY = com.google.android.gms.internal.measurement.d5.y();
                        c5VarY.x(((s9) listC0.get(i10)).f20403c);
                        c5VarY.y(((s9) listC0.get(i10)).f20404d);
                        z6VarD0.f19803b.g0().K(c5VarY, ((s9) listC0.get(i10)).f20405e);
                        d5VarArr[i10] = (com.google.android.gms.internal.measurement.d5) c5VarY.k();
                    }
                    t4VarK1.v0(Arrays.asList(d5VarArr));
                    t3 t3VarB = t3.b(vVar);
                    z6VarD0.f20269a.N().y(t3VarB.f20413d, z6VarD0.f19803b.W().Q(str3));
                    z6VarD0.f20269a.N().z(t3VarB, z6VarD0.f20269a.y().l(str3));
                    Bundle bundle2 = t3VarB.f20413d;
                    bundle2.putLong("_c", 1L);
                    z6VarD0.f20269a.b().o().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", vVar.f20462o);
                    if (z6VarD0.f20269a.N().T(t4VarK1.i0())) {
                        z6VarD0.f20269a.N().C(bundle2, "_dbg", 1L);
                        z6VarD0.f20269a.N().C(bundle2, "_r", 1L);
                    }
                    r rVarV = z6VarD0.f19803b.W().V(str3, vVar.f20460m);
                    if (rVarV == null) {
                        t4Var = t4VarK1;
                        s5Var = s5VarR;
                        q4Var = q4VarV;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        rVarC = new r(str3, vVar.f20460m, 0L, 0L, 0L, vVar.f20463p, 0L, null, null, null, null);
                        j10 = 0;
                    } else {
                        s5Var = s5VarR;
                        q4Var = q4VarV;
                        str = str3;
                        bundle = bundle2;
                        t4Var = t4VarK1;
                        str2 = null;
                        long j11 = rVarV.f20325f;
                        rVarC = rVarV.c(vVar.f20463p);
                        j10 = j11;
                    }
                    z6VarD0.f19803b.W().o(rVarC);
                    q qVar = new q(z6VarD0.f20269a, vVar.f20462o, str, vVar.f20460m, vVar.f20463p, j10, bundle);
                    com.google.android.gms.internal.measurement.i4 i4VarZ = com.google.android.gms.internal.measurement.j4.z();
                    i4VarZ.E(qVar.f20279d);
                    i4VarZ.A(qVar.f20277b);
                    i4VarZ.D(qVar.f20280e);
                    s sVar = new s(qVar.f20281f);
                    while (sVar.hasNext()) {
                        String next = sVar.next();
                        com.google.android.gms.internal.measurement.m4 m4VarZ = com.google.android.gms.internal.measurement.n4.z();
                        m4VarZ.B(next);
                        Object objZ = qVar.f20281f.z(next);
                        if (objZ != null) {
                            z6VarD0.f19803b.g0().J(m4VarZ, objZ);
                            i4VarZ.w(m4VarZ);
                        }
                    }
                    com.google.android.gms.internal.measurement.t4 t4Var2 = t4Var;
                    t4Var2.A0(i4VarZ);
                    com.google.android.gms.internal.measurement.v4 v4VarV = com.google.android.gms.internal.measurement.x4.v();
                    com.google.android.gms.internal.measurement.k4 k4VarV = com.google.android.gms.internal.measurement.l4.v();
                    k4VarV.s(rVarC.f20322c);
                    k4VarV.t(vVar.f20460m);
                    v4VarV.s(k4VarV);
                    t4Var2.T(v4VarV);
                    t4Var2.r0(z6VarD0.f19803b.T().k(s5Var.d0(), Collections.emptyList(), t4Var2.m0(), Long.valueOf(i4VarZ.u()), Long.valueOf(i4VarZ.u())));
                    if (i4VarZ.I()) {
                        t4Var2.b0(i4VarZ.u());
                        t4Var2.I(i4VarZ.u());
                    }
                    long jX = s5Var.X();
                    if (jX != 0) {
                        t4Var2.U(jX);
                    }
                    long jZ = s5Var.Z();
                    if (jZ != 0) {
                        t4Var2.V(jZ);
                    } else if (jX != 0) {
                        t4Var2.V(jX);
                    }
                    String strB = s5Var.b();
                    ld.c();
                    if (z6VarD0.f20269a.y().A(str2, i3.A0) && strB != null) {
                        t4Var2.a0(strB);
                    }
                    s5Var.e();
                    t4Var2.A((int) s5Var.Y());
                    z6VarD0.f20269a.y().o();
                    t4Var2.e0(68000L);
                    t4Var2.d0(z6VarD0.f20269a.d().a());
                    t4Var2.Z(true);
                    if (z6VarD0.f20269a.y().A(str2, i3.I0)) {
                        z6VarD0.f19803b.f(t4Var2.i0(), t4Var2);
                    }
                    com.google.android.gms.internal.measurement.q4 q4Var2 = q4Var;
                    q4Var2.s(t4Var2);
                    s5 s5Var2 = s5Var;
                    s5Var2.C(t4Var2.p0());
                    s5Var2.z(t4Var2.o0());
                    z6VarD0.f19803b.W().n(s5Var2);
                    z6VarD0.f19803b.W().m();
                    try {
                        return z6VarD0.f19803b.g0().O(((com.google.android.gms.internal.measurement.s4) q4Var2.k()).e());
                    } catch (IOException e10) {
                        z6VarD0.f20269a.b().p().c("Data loss. Failed to bundle and serialize. appId", s3.y(str), e10);
                        return str2;
                    }
                } catch (SecurityException e11) {
                    z6VarD0.f20269a.b().o().b("app instance id encryption failed", e11.getMessage());
                    bArr = new byte[0];
                }
            } else {
                z6VarD0.f20269a.b().o().b("Log and bundle disabled. package_name", str3);
            }
            bArr = new byte[0];
            return bArr;
        } finally {
            z6VarD0.f19803b.W().f0();
        }
    }
}
