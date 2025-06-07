package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class hv0 {

    /* renamed from: a, reason: collision with root package name */
    private final bx0 f9422a;

    /* renamed from: b, reason: collision with root package name */
    private final View f9423b;

    /* renamed from: c, reason: collision with root package name */
    private final in2 f9424c;

    /* renamed from: d, reason: collision with root package name */
    private final nk0 f9425d;

    public hv0(View view, nk0 nk0Var, bx0 bx0Var, in2 in2Var) {
        this.f9423b = view;
        this.f9425d = nk0Var;
        this.f9422a = bx0Var;
        this.f9424c = in2Var;
    }

    public static final x81 f(final Context context, final ff0 ff0Var, final hn2 hn2Var, final do2 do2Var) {
        return new x81(new a31() { // from class: com.google.android.gms.internal.ads.fv0
            @Override // com.google.android.gms.internal.ads.a31
            public final void m() {
                j3.t.u().n(context, ff0Var.f8252m, hn2Var.D.toString(), do2Var.f7447f);
            }
        }, of0.f13191f);
    }

    public static final Set g(sw0 sw0Var) {
        return Collections.singleton(new x81(sw0Var, of0.f13191f));
    }

    public static final x81 h(qw0 qw0Var) {
        return new x81(qw0Var, of0.f13190e);
    }

    public final View a() {
        return this.f9423b;
    }

    public final nk0 b() {
        return this.f9425d;
    }

    public final bx0 c() {
        return this.f9422a;
    }

    public y21 d(Set set) {
        return new y21(set);
    }

    public final in2 e() {
        return this.f9424c;
    }
}
