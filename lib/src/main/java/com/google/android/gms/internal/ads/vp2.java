package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vp2 {

    /* renamed from: a, reason: collision with root package name */
    private final up2 f16827a = new up2();

    /* renamed from: b, reason: collision with root package name */
    private int f16828b;

    /* renamed from: c, reason: collision with root package name */
    private int f16829c;

    /* renamed from: d, reason: collision with root package name */
    private int f16830d;

    /* renamed from: e, reason: collision with root package name */
    private int f16831e;

    /* renamed from: f, reason: collision with root package name */
    private int f16832f;

    vp2() {
    }

    public final up2 a() {
        up2 up2VarClone = this.f16827a.clone();
        up2 up2Var = this.f16827a;
        up2Var.f16424m = false;
        up2Var.f16425n = false;
        return up2VarClone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.f16830d + "\n\tNew pools created: " + this.f16828b + "\n\tPools removed: " + this.f16829c + "\n\tEntries added: " + this.f16832f + "\n\tNo entries retrieved: " + this.f16831e + "\n";
    }

    public final void c() {
        this.f16832f++;
    }

    public final void d() {
        this.f16828b++;
        this.f16827a.f16424m = true;
    }

    public final void e() {
        this.f16831e++;
    }

    public final void f() {
        this.f16830d++;
    }

    public final void g() {
        this.f16829c++;
        this.f16827a.f16425n = true;
    }
}
