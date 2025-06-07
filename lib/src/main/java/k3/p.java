package k3;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.tu;
import com.google.android.gms.internal.ads.wu;
import com.google.android.gms.internal.ads.xu;

/* loaded from: classes.dex */
final class p extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f24707b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f24708c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f24709d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f24710e;

    p(r rVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f24710e = rVar;
        this.f24707b = frameLayout;
        this.f24708c = frameLayout2;
        this.f24709d = context;
    }

    @Override // k3.s
    protected final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24709d, "native_ad_view_delegate");
        return new l3();
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.R0(l4.b.p1(this.f24707b), l4.b.p1(this.f24708c));
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        ir.a(this.f24709d);
        if (!((Boolean) w.c().b(ir.f9944f9)).booleanValue()) {
            return this.f24710e.f24725d.c(this.f24709d, this.f24707b, this.f24708c);
        }
        try {
            return tu.L5(((xu) df0.b(this.f24709d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new bf0() { // from class: k3.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    return wu.L5(obj);
                }
            })).d2(l4.b.p1(this.f24709d), l4.b.p1(this.f24707b), l4.b.p1(this.f24708c), 231004000));
        } catch (RemoteException | cf0 | NullPointerException e5) {
            this.f24710e.f24729h = b80.c(this.f24709d);
            this.f24710e.f24729h.a(e5, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
