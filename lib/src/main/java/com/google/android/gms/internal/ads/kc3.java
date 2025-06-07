package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
class kc3 implements hc3 {

    /* renamed from: a, reason: collision with root package name */
    private final dk3 f10956a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f10957b;

    public kc3(dk3 dk3Var, Class cls) {
        if (!dk3Var.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dk3Var.toString(), cls.getName()));
        }
        this.f10956a = dk3Var;
        this.f10957b = cls;
    }

    private final ic3 g() {
        return new ic3(this.f10956a.a());
    }

    private final Object h(jz3 jz3Var) throws GeneralSecurityException {
        if (Void.class.equals(this.f10957b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f10956a.e(jz3Var);
        return this.f10956a.i(jz3Var, this.f10957b);
    }

    @Override // com.google.android.gms.internal.ads.hc3
    public final Object a(ww3 ww3Var) throws GeneralSecurityException {
        try {
            return h(this.f10956a.c(ww3Var));
        } catch (ny3 e5) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f10956a.h().getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.hc3
    public final Object b(jz3 jz3Var) throws GeneralSecurityException {
        String name = this.f10956a.h().getName();
        if (this.f10956a.h().isInstance(jz3Var)) {
            return h(jz3Var);
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(name));
    }

    @Override // com.google.android.gms.internal.ads.hc3
    public final jz3 c(ww3 ww3Var) throws GeneralSecurityException {
        try {
            return g().a(ww3Var);
        } catch (ny3 e5) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f10956a.a().e().getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.hc3
    public final Class d() {
        return this.f10957b;
    }

    @Override // com.google.android.gms.internal.ads.hc3
    public final String e() {
        return this.f10956a.d();
    }

    @Override // com.google.android.gms.internal.ads.hc3
    public final ns3 f(ww3 ww3Var) throws GeneralSecurityException {
        try {
            jz3 jz3VarA = g().a(ww3Var);
            ks3 ks3VarK = ns3.K();
            ks3VarK.v(this.f10956a.d());
            ks3VarK.w(jz3VarA.a());
            ks3VarK.u(this.f10956a.b());
            return (ns3) ks3VarK.m();
        } catch (ny3 e5) {
            throw new GeneralSecurityException("Unexpected proto", e5);
        }
    }
}
