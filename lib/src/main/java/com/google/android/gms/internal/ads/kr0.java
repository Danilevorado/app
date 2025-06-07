package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kr0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11194a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11195b;

    public kr0(q44 q44Var, q44 q44Var2) {
        this.f11194a = q44Var;
        this.f11195b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* synthetic */ Object b() {
        d30 d30Var = new d30();
        String str = (String) this.f11195b.b();
        return ((Boolean) ft.f8413a.e()).booleanValue() ? new c30(d30Var, str) : new ef0(str);
    }
}
