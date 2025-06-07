package k3;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
final class f3 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ h3 f24644m;

    f3(h3 h3Var) {
        this.f24644m = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i3 i3Var = this.f24644m.f24650m;
        if (i3Var.f24670m != null) {
            try {
                i3Var.f24670m.H(1);
            } catch (RemoteException e5) {
                ze0.h("Could not notify onAdFailedToLoad event.", e5);
            }
        }
    }
}
