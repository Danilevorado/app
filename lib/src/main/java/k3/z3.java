package k3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.ze0;
import l4.c;

/* loaded from: classes.dex */
public final class z3 extends l4.c {
    public z3() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // l4.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new n0(iBinder);
    }

    public final m0 c(Context context, String str, o30 o30Var) {
        try {
            IBinder iBinderW3 = ((n0) b(context)).w3(l4.b.p1(context), str, o30Var, 231004000);
            if (iBinderW3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderW3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(iBinderW3);
        } catch (RemoteException | c.a e5) {
            ze0.h("Could not create remote builder for AdLoader.", e5);
            return null;
        }
    }
}
