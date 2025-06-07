package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t22 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.e f15658a;

    /* renamed from: b, reason: collision with root package name */
    private final u22 f15659b;

    /* renamed from: c, reason: collision with root package name */
    private final tu2 f15660c;

    /* renamed from: d, reason: collision with root package name */
    private final List f15661d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15662e = ((Boolean) k3.w.c().b(ir.f10160z6)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    private final fz1 f15663f;

    public t22(i4.e eVar, u22 u22Var, fz1 fz1Var, tu2 tu2Var) {
        this.f15658a = eVar;
        this.f15659b = u22Var;
        this.f15663f = fz1Var;
        this.f15660c = tu2Var;
    }

    static /* bridge */ /* synthetic */ void g(t22 t22Var, String str, int i10, long j10, String str2, Integer num) {
        String str3 = str + "." + i10 + "." + j10;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) k3.w.c().b(ir.f10133x1)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        t22Var.f15661d.add(str3);
    }

    final ab3 e(un2 un2Var, hn2 hn2Var, ab3 ab3Var, ou2 ou2Var) {
        ln2 ln2Var = un2Var.f16413b.f15924b;
        long jB = this.f15658a.b();
        String str = hn2Var.f9276x;
        if (str != null) {
            qa3.q(ab3Var, new s22(this, jB, str, hn2Var, ln2Var, ou2Var, un2Var), of0.f13191f);
        }
        return ab3Var;
    }

    public final String f() {
        return TextUtils.join("_", this.f15661d);
    }
}
