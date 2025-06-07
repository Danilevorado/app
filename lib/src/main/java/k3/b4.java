package k3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.d80;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.ze0;
import l4.c;

/* loaded from: classes.dex */
public final class b4 extends l4.c {

    /* renamed from: c, reason: collision with root package name */
    private d80 f24609c;

    public b4() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // l4.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof r0 ? (r0) iInterfaceQueryLocalInterface : new r0(iBinder);
    }

    public final q0 c(Context context, h4 h4Var, String str, o30 o30Var, int i10) {
        ir.a(context);
        if (!((Boolean) w.c().b(ir.f9944f9)).booleanValue()) {
            try {
                IBinder iBinderW3 = ((r0) b(context)).w3(l4.b.p1(context), h4Var, str, o30Var, 231004000, i10);
                if (iBinderW3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderW3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof q0 ? (q0) iInterfaceQueryLocalInterface : new o0(iBinderW3);
            } catch (RemoteException | c.a e5) {
                ze0.c("Could not create remote AdManager.", e5);
                return null;
            }
        }
        try {
            IBinder iBinderW32 = ((r0) df0.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new bf0() { // from class: k3.a4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof r0 ? (r0) iInterfaceQueryLocalInterface2 : new r0(obj);
                }
            })).w3(l4.b.p1(context), h4Var, str, o30Var, 231004000, i10);
            if (iBinderW32 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderW32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof q0 ? (q0) iInterfaceQueryLocalInterface2 : new o0(iBinderW32);
        } catch (RemoteException | cf0 | NullPointerException e10) {
            d80 d80VarC = b80.c(context);
            this.f24609c = d80VarC;
            d80VarC.a(e10, "AdManagerCreator.newAdManagerByDynamiteLoader");
            ze0.i("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
