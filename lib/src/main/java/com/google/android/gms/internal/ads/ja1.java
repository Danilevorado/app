package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ja1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final da1 f10406a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f10407b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f10408c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f10409d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f10410e;

    public ja1(da1 da1Var, q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f10406a = da1Var;
        this.f10407b = q44Var;
        this.f10408c = q44Var2;
        this.f10409d = q44Var3;
        this.f10410e = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        final Context context = (Context) this.f10407b.b();
        final ff0 ff0VarA = ((cn0) this.f10408c).a();
        final hn2 hn2VarA = ((ux0) this.f10409d).a();
        final do2 do2VarA = ((b11) this.f10410e).a();
        return new x81(new a31() { // from class: com.google.android.gms.internal.ads.ca1
            @Override // com.google.android.gms.internal.ads.a31
            public final void m() {
                j3.t.u().n(context, ff0VarA.f8252m, hn2VarA.D.toString(), do2VarA.f7447f);
            }
        }, of0.f13191f);
    }
}
