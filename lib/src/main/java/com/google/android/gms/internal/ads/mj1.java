package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mj1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12171a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12172b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12173c;

    public mj1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f12171a = q44Var;
        this.f12172b = q44Var2;
        this.f12173c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* synthetic */ Object b() {
        q44 q44Var = this.f12171a;
        q44 q44Var2 = this.f12172b;
        int i10 = ((b11) this.f12173c).a().f7456o.f14418a;
        int i11 = i10 - 1;
        if (i10 != 0) {
            return i11 != 0 ? ((k42) q44Var2).b() : ((k42) q44Var).b();
        }
        throw null;
    }
}
