package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class pc3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f13688b = Logger.getLogger(pc3.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f13689a;

    pc3() {
        this.f13689a = new ConcurrentHashMap();
    }

    pc3(pc3 pc3Var) {
        this.f13689a = new ConcurrentHashMap(pc3Var.f13689a);
    }

    private final synchronized oc3 g(String str) {
        if (!this.f13689a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (oc3) this.f13689a.get(str);
    }

    private final synchronized void h(oc3 oc3Var, boolean z10) {
        String strE = oc3Var.b().e();
        oc3 oc3Var2 = (oc3) this.f13689a.get(strE);
        if (oc3Var2 != null && !oc3Var2.d().equals(oc3Var.d())) {
            f13688b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strE));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strE, oc3Var2.d().getName(), oc3Var.d().getName()));
        }
        if (z10) {
            this.f13689a.put(strE, oc3Var);
        } else {
            this.f13689a.putIfAbsent(strE, oc3Var);
        }
    }

    final hc3 a(String str, Class cls) throws GeneralSecurityException {
        oc3 oc3VarG = g(str);
        if (oc3VarG.c().contains(cls)) {
            return oc3VarG.a(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(oc3VarG.d());
        Set<Class> setC = oc3VarG.c();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : setC) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb2.toString());
    }

    final hc3 b(String str) {
        return g(str).b();
    }

    final synchronized void c(il3 il3Var, dk3 dk3Var) {
        Class clsF;
        if (!yh3.a(1)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(il3Var.getClass()) + " as it is not FIPS compatible.");
        }
        if (!yh3.a(dk3Var.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(dk3Var.getClass()) + " as it is not FIPS compatible.");
        }
        String strD = il3Var.d();
        String strD2 = dk3Var.d();
        if (this.f13689a.containsKey(strD) && ((oc3) this.f13689a.get(strD)).f() != null && (clsF = ((oc3) this.f13689a.get(strD)).f()) != null && !clsF.getName().equals(dk3Var.getClass().getName())) {
            f13688b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + strD + " with inconsistent public key type " + strD2);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", il3Var.getClass().getName(), clsF.getName(), dk3Var.getClass().getName()));
        }
        h(new nc3(il3Var, dk3Var), true);
        h(new mc3(dk3Var), false);
    }

    final synchronized void d(hc3 hc3Var) {
        if (!yh3.a(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        h(new lc3(hc3Var), false);
    }

    final synchronized void e(dk3 dk3Var) {
        if (!yh3.a(dk3Var.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(dk3Var.getClass()) + " as it is not FIPS compatible.");
        }
        h(new mc3(dk3Var), false);
    }

    final boolean f(String str) {
        return this.f13689a.containsKey(str);
    }
}
