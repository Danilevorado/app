package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xt0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f17806a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f17807b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f17808c;

    public xt0(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f17806a = q44Var;
        this.f17807b = q44Var2;
        this.f17808c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ut0 ut0Var = (ut0) this.f17806a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setEmptySet = ((JSONObject) this.f17808c.b()) == null ? Collections.emptySet() : Collections.singleton(new x81(ut0Var, bb3Var));
        k44.b(setEmptySet);
        return setEmptySet;
    }
}
