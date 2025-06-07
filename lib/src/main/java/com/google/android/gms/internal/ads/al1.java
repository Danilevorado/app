package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class al1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f6138a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f6139b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f6140c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f6141d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f6142e;

    public al1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5) {
        this.f6138a = q44Var;
        this.f6139b = q44Var2;
        this.f6140c = q44Var3;
        this.f6141d = q44Var4;
        this.f6142e = q44Var5;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f6138a).a();
        final String strB = ((rr1) this.f6139b).b();
        ff0 ff0VarA = ((cn0) this.f6140c).a();
        final an anVar = (an) this.f6141d.b();
        final String str = (String) this.f6142e.b();
        pm pmVar = new pm(new vm(contextA));
        rp rpVarK = sp.K();
        rpVarK.u(ff0VarA.f8253n);
        rpVarK.w(ff0VarA.f8254o);
        rpVarK.v(true != ff0VarA.f8255p ? 2 : 0);
        final sp spVar = (sp) rpVarK.m();
        pmVar.b(new om() { // from class: com.google.android.gms.internal.ads.zk1
            @Override // com.google.android.gms.internal.ads.om
            public final void a(go goVar) {
                an anVar2 = anVar;
                String str2 = strB;
                sp spVar2 = spVar;
                String str3 = str;
                bn bnVar = (bn) goVar.u().i();
                bnVar.u(anVar2);
                goVar.z(bnVar);
                xn xnVar = (xn) goVar.v().i();
                xnVar.u(str2);
                xnVar.v(spVar2);
                goVar.B(xnVar);
                goVar.C(str3);
            }
        });
        return pmVar;
    }
}
