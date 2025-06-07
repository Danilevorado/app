package k3;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f24731a;

    /* renamed from: b, reason: collision with root package name */
    private final r1 f24732b;

    public s1(r1 r1Var) {
        String strC;
        this.f24732b = r1Var;
        try {
            strC = r1Var.c();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            strC = null;
        }
        this.f24731a = strC;
    }

    public final String toString() {
        return this.f24731a;
    }
}
