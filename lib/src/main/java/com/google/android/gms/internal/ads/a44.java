package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a44 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private q44 f5941a;

    public static void a(q44 q44Var, q44 q44Var2) {
        a44 a44Var = (a44) q44Var;
        if (a44Var.f5941a != null) {
            throw new IllegalStateException();
        }
        a44Var.f5941a = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final Object b() {
        q44 q44Var = this.f5941a;
        if (q44Var != null) {
            return q44Var.b();
        }
        throw new IllegalStateException();
    }
}
