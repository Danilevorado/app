package k3;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
final class j3 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ k3 f24676m;

    j3(k3 k3Var) {
        this.f24676m = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k3 k3Var = this.f24676m;
        if (k3Var.f24685m != null) {
            try {
                k3Var.f24685m.H(1);
            } catch (RemoteException e5) {
                ze0.h("Could not notify onAdFailedToLoad event.", e5);
            }
        }
    }
}
