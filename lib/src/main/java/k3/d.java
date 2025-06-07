package k3;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
final class d extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24628b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o30 f24629c;

    d(r rVar, Context context, o30 o30Var) {
        this.f24628b = context;
        this.f24629c = o30Var;
    }

    @Override // k3.s
    protected final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24628b, "out_of_context_tester");
        return null;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        l4.a aVarP1 = l4.b.p1(this.f24628b);
        ir.a(this.f24628b);
        if (((Boolean) w.c().b(ir.I8)).booleanValue()) {
            return b1Var.G1(aVarP1, this.f24629c, 231004000);
        }
        return null;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        l4.a aVarP1 = l4.b.p1(this.f24628b);
        ir.a(this.f24628b);
        if (!((Boolean) w.c().b(ir.I8)).booleanValue()) {
            return null;
        }
        try {
            return ((g2) df0.b(this.f24628b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new bf0() { // from class: k3.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof g2 ? (g2) iInterfaceQueryLocalInterface : new g2(obj);
                }
            })).w3(aVarP1, this.f24629c, 231004000);
        } catch (RemoteException | cf0 | NullPointerException e5) {
            b80.c(this.f24628b).a(e5, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
