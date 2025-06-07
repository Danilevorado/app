package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class bm1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f6547a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f6548b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f6549c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f6550d;

    public bm1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f6547a = q44Var;
        this.f6548b = q44Var2;
        this.f6549c = q44Var3;
        this.f6550d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Set setEmptySet;
        final String str = (String) this.f6547a.b();
        Context contextA = ((qm0) this.f6548b).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Map mapB = ((g44) this.f6550d).b();
        if (((Boolean) k3.w.c().b(ir.A4)).booleanValue()) {
            pm pmVar = new pm(new vm(contextA));
            pmVar.b(new om() { // from class: com.google.android.gms.internal.ads.cm1
                @Override // com.google.android.gms.internal.ads.om
                public final void a(go goVar) {
                    goVar.C(str);
                }
            });
            setEmptySet = Collections.singleton(new x81(new em1(pmVar, mapB), bb3Var));
        } else {
            setEmptySet = Collections.emptySet();
        }
        k44.b(setEmptySet);
        return setEmptySet;
    }
}
