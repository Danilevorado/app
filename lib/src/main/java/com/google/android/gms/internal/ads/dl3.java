package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dl3 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f7401a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7402b;

    public dl3() {
        this.f7401a = new HashMap();
        this.f7402b = new HashMap();
    }

    public dl3(hl3 hl3Var) {
        this.f7401a = new HashMap(hl3Var.f9199a);
        this.f7402b = new HashMap(hl3Var.f9200b);
    }

    public final dl3 a(bl3 bl3Var) throws GeneralSecurityException {
        fl3 fl3Var = new fl3(bl3Var.c(), bl3Var.d(), null);
        if (this.f7401a.containsKey(fl3Var)) {
            bl3 bl3Var2 = (bl3) this.f7401a.get(fl3Var);
            if (!bl3Var2.equals(bl3Var) || !bl3Var.equals(bl3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(fl3Var.toString()));
            }
        } else {
            this.f7401a.put(fl3Var, bl3Var);
        }
        return this;
    }

    public final dl3 b(nd3 nd3Var) throws GeneralSecurityException {
        Objects.requireNonNull(nd3Var, "wrapper must be non-null");
        Map map = this.f7402b;
        Class clsB = nd3Var.b();
        if (map.containsKey(clsB)) {
            nd3 nd3Var2 = (nd3) this.f7402b.get(clsB);
            if (!nd3Var2.equals(nd3Var) || !nd3Var.equals(nd3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsB.toString()));
            }
        } else {
            this.f7402b.put(clsB, nd3Var);
        }
        return this;
    }
}
