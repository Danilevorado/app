package k3;

import android.content.Context;

/* loaded from: classes.dex */
final class k extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24681b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h4 f24682c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24683d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f24684e;

    k(r rVar, Context context, h4 h4Var, String str) {
        this.f24684e = rVar;
        this.f24681b = context;
        this.f24682c = h4Var;
        this.f24683d = str;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24681b, "search");
        return new k3();
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.s2(l4.b.p1(this.f24681b), this.f24682c, this.f24683d, 231004000);
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f24684e.f24722a.c(this.f24681b, this.f24682c, this.f24683d, null, 3);
    }
}
