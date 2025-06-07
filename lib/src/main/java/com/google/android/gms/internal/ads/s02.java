package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s02 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f15031a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f15032b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f15033c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f15034d;

    public s02(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f15031a = q44Var;
        this.f15032b = q44Var2;
        this.f15033c = q44Var3;
        this.f15034d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new r02((Context) this.f15031a.b(), (Executor) this.f15032b.b(), (bb1) this.f15033c.b(), (gn2) this.f15034d.b());
    }
}
