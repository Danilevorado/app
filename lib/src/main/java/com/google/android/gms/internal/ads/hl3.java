package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class hl3 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9199a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9200b;

    /* synthetic */ hl3(dl3 dl3Var, gl3 gl3Var) {
        this.f9199a = new HashMap(dl3Var.f7401a);
        this.f9200b = new HashMap(dl3Var.f7402b);
    }

    public final Class a(Class cls) throws GeneralSecurityException {
        if (this.f9200b.containsKey(cls)) {
            return ((nd3) this.f9200b.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object b(gc3 gc3Var, Class cls) throws GeneralSecurityException {
        fl3 fl3Var = new fl3(gc3Var.getClass(), cls, null);
        if (this.f9199a.containsKey(fl3Var)) {
            return ((bl3) this.f9199a.get(fl3Var)).a(gc3Var);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + fl3Var.toString() + " available");
    }

    public final Object c(md3 md3Var, Class cls) throws GeneralSecurityException {
        if (!this.f9200b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        nd3 nd3Var = (nd3) this.f9200b.get(cls);
        if (md3Var.c().equals(nd3Var.a()) && nd3Var.a().equals(md3Var.c())) {
            return nd3Var.c(md3Var);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
