package k3;

import android.content.Context;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
final class i extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24665b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h4 f24666c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24667d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o30 f24668e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f24669f;

    i(r rVar, Context context, h4 h4Var, String str, o30 o30Var) {
        this.f24669f = rVar;
        this.f24665b = context;
        this.f24666c = h4Var;
        this.f24667d = str;
        this.f24668e = o30Var;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24665b, "banner");
        return new k3();
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.i2(l4.b.p1(this.f24665b), this.f24666c, this.f24667d, this.f24668e, 231004000);
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f24669f.f24722a.c(this.f24665b, this.f24666c, this.f24667d, this.f24668e, 1);
    }
}
