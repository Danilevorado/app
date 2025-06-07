package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.v6;
import com.google.android.gms.measurement.internal.w4;
import e4.p;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final w4 f19731a;

    /* renamed from: b, reason: collision with root package name */
    private final v6 f19732b;

    public a(w4 w4Var) {
        super(null);
        p.l(w4Var);
        this.f19731a = w4Var;
        this.f19732b = w4Var.I();
    }

    @Override // x4.w
    public final void M(String str) {
        this.f19731a.w().j(str, this.f19731a.d().b());
    }

    @Override // x4.w
    public final void a(String str, String str2, Bundle bundle) {
        this.f19731a.I().m(str, str2, bundle);
    }

    @Override // x4.w
    public final long b() {
        return this.f19731a.N().r0();
    }

    @Override // x4.w
    public final List c(String str, String str2) {
        return this.f19732b.Z(str, str2);
    }

    @Override // x4.w
    public final Map d(String str, String str2, boolean z10) {
        return this.f19732b.a0(str, str2, z10);
    }

    @Override // x4.w
    public final void e(Bundle bundle) {
        this.f19732b.D(bundle);
    }

    @Override // x4.w
    public final void f(String str, String str2, Bundle bundle) {
        this.f19732b.p(str, str2, bundle);
    }

    @Override // x4.w
    public final String g() {
        return this.f19732b.V();
    }

    @Override // x4.w
    public final String i() {
        return this.f19732b.W();
    }

    @Override // x4.w
    public final String j() {
        return this.f19732b.X();
    }

    @Override // x4.w
    public final String k() {
        return this.f19732b.V();
    }

    @Override // x4.w
    public final int o(String str) {
        this.f19732b.Q(str);
        return 25;
    }

    @Override // x4.w
    public final void y0(String str) {
        this.f19731a.w().k(str, this.f19731a.d().b());
    }
}
