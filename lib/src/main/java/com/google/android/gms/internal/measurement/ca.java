package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class ca implements ja {

    /* renamed from: a, reason: collision with root package name */
    private final y9 f18881a;

    /* renamed from: b, reason: collision with root package name */
    private final pa f18882b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18883c;

    /* renamed from: d, reason: collision with root package name */
    private final k8 f18884d;

    private ca(pa paVar, k8 k8Var, y9 y9Var) {
        this.f18882b = paVar;
        this.f18883c = k8Var.c(y9Var);
        this.f18884d = k8Var;
        this.f18881a = y9Var;
    }

    static ca j(pa paVar, k8 k8Var, y9 y9Var) {
        return new ca(paVar, k8Var, y9Var);
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final int a(Object obj) {
        pa paVar = this.f18882b;
        int iB = paVar.b(paVar.c(obj));
        if (!this.f18883c) {
            return iB;
        }
        this.f18884d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final int b(Object obj) {
        int iHashCode = this.f18882b.c(obj).hashCode();
        if (!this.f18883c) {
            return iHashCode;
        }
        this.f18884d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final Object c() {
        return this.f18881a.w0().p();
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final void d(Object obj) {
        this.f18882b.g(obj);
        this.f18884d.b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final void e(Object obj, Object obj2) {
        la.f(this.f18882b, obj, obj2);
        if (this.f18883c) {
            la.e(this.f18884d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final boolean f(Object obj, Object obj2) {
        if (!this.f18882b.c(obj).equals(this.f18882b.c(obj2))) {
            return false;
        }
        if (!this.f18883c) {
            return true;
        }
        this.f18884d.a(obj);
        this.f18884d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final boolean g(Object obj) {
        this.f18884d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final void h(Object obj, gb gbVar) {
        this.f18884d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final void i(Object obj, byte[] bArr, int i10, int i11, k7 k7Var) {
        u8 u8Var = (u8) obj;
        if (u8Var.zzc == qa.c()) {
            u8Var.zzc = qa.e();
        }
        a5.a.a(obj);
        throw null;
    }
}
