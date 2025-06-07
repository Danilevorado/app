package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vc1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16649a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16650b;

    public vc1(q44 q44Var, q44 q44Var2) {
        this.f16649a = q44Var;
        this.f16650b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ff0 ff0VarA = ((cn0) this.f16649a).a();
        j3.t.r();
        return new jj(UUID.randomUUID().toString(), ff0VarA, "native", new JSONObject(), false, true);
    }
}
