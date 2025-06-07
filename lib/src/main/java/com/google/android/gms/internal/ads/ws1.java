package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class ws1 implements i41 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f17257m;

    /* renamed from: n, reason: collision with root package name */
    private final ed0 f17258n;

    ws1(Context context, ed0 ed0Var) {
        this.f17257m = context;
        this.f17258n = ed0Var;
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(un2 un2Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(un2Var.f16413b.f15924b.f11676d)) {
            return;
        }
        this.f17258n.u(this.f17257m, un2Var.f16412a.f14851a.f7445d);
        this.f17258n.q(this.f17257m, un2Var.f16413b.f15924b.f11676d);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) {
    }
}
