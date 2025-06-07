package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.u2;
import java.util.List;
import java.util.Map;
import x4.w;

/* loaded from: classes.dex */
final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u2 f21343a;

    a(u2 u2Var) {
        this.f21343a = u2Var;
    }

    @Override // x4.w
    public final void M(String str) {
        this.f21343a.E(str);
    }

    @Override // x4.w
    public final void a(String str, String str2, Bundle bundle) {
        this.f21343a.F(str, str2, bundle);
    }

    @Override // x4.w
    public final long b() {
        return this.f21343a.n();
    }

    @Override // x4.w
    public final List c(String str, String str2) {
        return this.f21343a.z(str, str2);
    }

    @Override // x4.w
    public final Map d(String str, String str2, boolean z10) {
        return this.f21343a.A(str, str2, z10);
    }

    @Override // x4.w
    public final void e(Bundle bundle) {
        this.f21343a.b(bundle);
    }

    @Override // x4.w
    public final void f(String str, String str2, Bundle bundle) {
        this.f21343a.H(str, str2, bundle);
    }

    @Override // x4.w
    public final String g() {
        return this.f21343a.v();
    }

    @Override // x4.w
    public final String i() {
        return this.f21343a.w();
    }

    @Override // x4.w
    public final String j() {
        return this.f21343a.x();
    }

    @Override // x4.w
    public final String k() {
        return this.f21343a.y();
    }

    @Override // x4.w
    public final int o(String str) {
        return this.f21343a.m(str);
    }

    @Override // x4.w
    public final void y0(String str) {
        this.f21343a.G(str);
    }
}
