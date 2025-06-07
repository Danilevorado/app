package k3;

import android.content.Context;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
final class q extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24714b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24715c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o30 f24716d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f24717e;

    q(r rVar, Context context, String str, o30 o30Var) {
        this.f24717e = rVar;
        this.f24714b = context;
        this.f24715c = str;
        this.f24716d = o30Var;
    }

    @Override // k3.s
    protected final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24714b, "rewarded");
        return new o3();
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.A1(l4.b.p1(this.f24714b), this.f24715c, this.f24716d, 231004000);
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        return gb0.a(this.f24714b, this.f24715c, this.f24716d);
    }
}
