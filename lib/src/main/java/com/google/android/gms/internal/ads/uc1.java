package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class uc1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16277a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16278b;

    public uc1(q44 q44Var, q44 q44Var2) {
        this.f16277a = q44Var;
        this.f16278b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new z81((Context) this.f16277a.b(), new HashSet(), ((ux0) this.f16278b).a());
    }
}
