package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class sl3 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15318a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f15319b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15320c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f15321d;

    /* synthetic */ sl3(ml3 ml3Var, rl3 rl3Var) {
        this.f15318a = new HashMap(ml3Var.f12194a);
        this.f15319b = new HashMap(ml3Var.f12195b);
        this.f15320c = new HashMap(ml3Var.f12196c);
        this.f15321d = new HashMap(ml3Var.f12197d);
    }

    public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
        ol3 ol3Var = new ol3(ll3Var.getClass(), ll3Var.f(), null);
        if (this.f15319b.containsKey(ol3Var)) {
            return ((wj3) this.f15319b.get(ol3Var)).a(ll3Var, rd3Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + ol3Var.toString() + " available");
    }

    public final boolean f(ll3 ll3Var) {
        return this.f15319b.containsKey(new ol3(ll3Var.getClass(), ll3Var.f(), null));
    }
}
