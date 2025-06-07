package k3;

import android.content.Context;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
final class j extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24671b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h4 f24672c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24673d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o30 f24674e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f24675f;

    j(r rVar, Context context, h4 h4Var, String str, o30 o30Var) {
        this.f24675f = rVar;
        this.f24671b = context;
        this.f24672c = h4Var;
        this.f24673d = str;
        this.f24674e = o30Var;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24671b, "app_open");
        return new k3();
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.A3(l4.b.p1(this.f24671b), this.f24672c, this.f24673d, this.f24674e, 231004000);
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f24675f.f24722a.c(this.f24671b, this.f24672c, this.f24673d, this.f24674e, 4);
    }
}
