package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zc3 {

    /* renamed from: a, reason: collision with root package name */
    private final bt3 f18520a;

    /* renamed from: b, reason: collision with root package name */
    private final List f18521b;

    /* renamed from: c, reason: collision with root package name */
    private final xn3 f18522c = xn3.f17644b;

    private zc3(bt3 bt3Var, List list) {
        this.f18520a = bt3Var;
        this.f18521b = list;
    }

    static final zc3 a(bt3 bt3Var) throws GeneralSecurityException {
        if (bt3Var == null || bt3Var.K() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zc3(bt3Var, g(bt3Var));
    }

    public static final zc3 b(rc3 rc3Var) {
        gk3 gk3Var = new gk3(kl3.a(rc3Var.a()));
        wc3 wc3Var = new wc3();
        uc3 uc3Var = new uc3(gk3Var, null);
        uc3Var.d();
        uc3Var.e();
        wc3Var.a(uc3Var);
        return wc3Var.b();
    }

    private static jl3 e(at3 at3Var) {
        try {
            return jl3.a(at3Var.L().P(), at3Var.L().O(), at3Var.L().L(), at3Var.O(), at3Var.O() == ut3.RAW ? null : Integer.valueOf(at3Var.K()));
        } catch (GeneralSecurityException e5) {
            throw new ul3("Creating a protokey serialization failed", e5);
        }
    }

    private static Object f(at3 at3Var, Class cls) throws GeneralSecurityException {
        try {
            ns3 ns3VarL = at3Var.L();
            int i10 = qd3.f14253g;
            return qd3.f(ns3VarL.P(), ns3VarL.O(), cls);
        } catch (GeneralSecurityException e5) {
            if (e5.getMessage().contains("No key manager found for key type ") || e5.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e5;
        }
    }

    private static List g(bt3 bt3Var) throws GeneralSecurityException {
        qc3 qc3Var;
        ArrayList arrayList = new ArrayList(bt3Var.K());
        for (at3 at3Var : bt3Var.R()) {
            int iK = at3Var.K();
            try {
                gc3 gc3VarA = ok3.b().a(e(at3Var), rd3.a());
                int iT = at3Var.T() - 2;
                if (iT == 1) {
                    qc3Var = qc3.f14237b;
                } else if (iT == 2) {
                    qc3Var = qc3.f14238c;
                } else {
                    if (iT != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    qc3Var = qc3.f14239d;
                }
                arrayList.add(new yc3(gc3VarA, qc3Var, iK, iK == bt3Var.L(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static final Object h(gc3 gc3Var, Class cls) {
        try {
            int i10 = qd3.f14253g;
            return nk3.a().c(gc3Var, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    final bt3 c() {
        return this.f18520a;
    }

    public final Object d(Class cls) throws GeneralSecurityException {
        Class clsE = qd3.e(cls);
        if (clsE == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        bt3 bt3Var = this.f18520a;
        Charset charset = sd3.f15199a;
        int iL = bt3Var.L();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (at3 at3Var : bt3Var.R()) {
            if (at3Var.T() == 3) {
                if (!at3Var.S()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(at3Var.K())));
                }
                if (at3Var.O() == ut3.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(at3Var.K())));
                }
                if (at3Var.T() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(at3Var.K())));
                }
                if (at3Var.K() == iL) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= at3Var.L().L() == ms3.ASYMMETRIC_PUBLIC;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        gd3 gd3Var = new gd3(clsE, null);
        gd3Var.c(this.f18522c);
        for (int i11 = 0; i11 < this.f18520a.K(); i11++) {
            at3 at3VarN = this.f18520a.N(i11);
            if (at3VarN.T() == 3) {
                Object objF = f(at3VarN, clsE);
                Object objH = this.f18521b.get(i11) != null ? h(((yc3) this.f18521b.get(i11)).a(), clsE) : null;
                if (at3VarN.K() == this.f18520a.L()) {
                    gd3Var.b(objH, objF, at3VarN);
                } else {
                    gd3Var.a(objH, objF, at3VarN);
                }
            }
        }
        return nk3.a().d(gd3Var.d(), cls);
    }

    public final String toString() {
        bt3 bt3Var = this.f18520a;
        Charset charset = sd3.f15199a;
        dt3 dt3VarK = gt3.K();
        dt3VarK.v(bt3Var.L());
        for (at3 at3Var : bt3Var.R()) {
            et3 et3VarK = ft3.K();
            et3VarK.w(at3Var.L().P());
            et3VarK.y(at3Var.T());
            et3VarK.v(at3Var.O());
            et3VarK.u(at3Var.K());
            dt3VarK.u((ft3) et3VarK.m());
        }
        return ((gt3) dt3VarK.m()).toString();
    }
}
