package m3;

import android.content.Context;
import k3.w2;

/* loaded from: classes.dex */
final class u extends k3.u1 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Context f25325m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ x f25326n;

    u(x xVar, Context context) {
        this.f25326n = xVar;
        this.f25325m = context;
    }

    @Override // k3.w1
    public final void P3(w2 w2Var) {
        if (w2Var == null) {
            return;
        }
        this.f25326n.i(this.f25325m, w2Var.f24789n, true, true);
    }
}
