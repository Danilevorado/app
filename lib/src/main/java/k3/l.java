package k3;

import android.content.Context;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
final class l extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24686b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h4 f24687c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24688d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o30 f24689e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f24690f;

    l(r rVar, Context context, h4 h4Var, String str, o30 o30Var) {
        this.f24690f = rVar;
        this.f24686b = context;
        this.f24687c = h4Var;
        this.f24688d = str;
        this.f24689e = o30Var;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24686b, "interstitial");
        return new k3();
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.k1(l4.b.p1(this.f24686b), this.f24687c, this.f24688d, this.f24689e, 231004000);
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f24690f.f24722a.c(this.f24686b, this.f24687c, this.f24688d, this.f24689e, 2);
    }
}
