package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ml3 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12194a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f12195b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f12196c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f12197d;

    public ml3() {
        this.f12194a = new HashMap();
        this.f12195b = new HashMap();
        this.f12196c = new HashMap();
        this.f12197d = new HashMap();
    }

    public ml3(sl3 sl3Var) {
        this.f12194a = new HashMap(sl3Var.f15318a);
        this.f12195b = new HashMap(sl3Var.f15319b);
        this.f12196c = new HashMap(sl3Var.f15320c);
        this.f12197d = new HashMap(sl3Var.f15321d);
    }

    public final ml3 a(wj3 wj3Var) throws GeneralSecurityException {
        ol3 ol3Var = new ol3(wj3Var.d(), wj3Var.c(), null);
        if (this.f12195b.containsKey(ol3Var)) {
            wj3 wj3Var2 = (wj3) this.f12195b.get(ol3Var);
            if (!wj3Var2.equals(wj3Var) || !wj3Var.equals(wj3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ol3Var.toString()));
            }
        } else {
            this.f12195b.put(ol3Var, wj3Var);
        }
        return this;
    }

    public final ml3 b(ak3 ak3Var) throws GeneralSecurityException {
        ql3 ql3Var = new ql3(ak3Var.b(), ak3Var.c(), null);
        if (this.f12194a.containsKey(ql3Var)) {
            ak3 ak3Var2 = (ak3) this.f12194a.get(ql3Var);
            if (!ak3Var2.equals(ak3Var) || !ak3Var.equals(ak3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ql3Var.toString()));
            }
        } else {
            this.f12194a.put(ql3Var, ak3Var);
        }
        return this;
    }

    public final ml3 c(tk3 tk3Var) throws GeneralSecurityException {
        ol3 ol3Var = new ol3(tk3Var.c(), tk3Var.b(), null);
        if (this.f12197d.containsKey(ol3Var)) {
            tk3 tk3Var2 = (tk3) this.f12197d.get(ol3Var);
            if (!tk3Var2.equals(tk3Var) || !tk3Var.equals(tk3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ol3Var.toString()));
            }
        } else {
            this.f12197d.put(ol3Var, tk3Var);
        }
        return this;
    }

    public final ml3 d(xk3 xk3Var) throws GeneralSecurityException {
        ql3 ql3Var = new ql3(xk3Var.b(), xk3Var.c(), null);
        if (this.f12196c.containsKey(ql3Var)) {
            xk3 xk3Var2 = (xk3) this.f12196c.get(ql3Var);
            if (!xk3Var2.equals(xk3Var) || !xk3Var.equals(xk3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ql3Var.toString()));
            }
        } else {
            this.f12196c.put(ql3Var, xk3Var);
        }
        return this;
    }
}
