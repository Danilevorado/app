package k3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
final class n extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24700b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24701c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o30 f24702d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f24703e;

    n(r rVar, Context context, String str, o30 o30Var) {
        this.f24703e = rVar;
        this.f24700b = context;
        this.f24701c = str;
        this.f24702d = o30Var;
    }

    @Override // k3.s
    protected final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24700b, "native_ad");
        return new i3();
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.x1(l4.b.p1(this.f24700b), this.f24701c, this.f24702d, 231004000);
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        ir.a(this.f24700b);
        if (!((Boolean) w.c().b(ir.f9944f9)).booleanValue()) {
            return this.f24703e.f24723b.c(this.f24700b, this.f24701c, this.f24702d);
        }
        try {
            IBinder iBinderW3 = ((n0) df0.b(this.f24700b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new bf0() { // from class: k3.m
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new n0(obj);
                }
            })).w3(l4.b.p1(this.f24700b), this.f24701c, this.f24702d, 231004000);
            if (iBinderW3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderW3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(iBinderW3);
        } catch (RemoteException | cf0 | NullPointerException e5) {
            this.f24703e.f24729h = b80.c(this.f24700b);
            this.f24703e.f24729h.a(e5, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
