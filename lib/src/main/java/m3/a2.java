package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class a2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b2 f25191a;

    /* synthetic */ a2(b2 b2Var, z1 z1Var) {
        this.f25191a = b2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b2 b2Var;
        boolean z10;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            b2Var = this.f25191a;
            z10 = true;
        } else {
            if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            b2Var = this.f25191a;
            z10 = false;
        }
        b2Var.f25200c = z10;
    }
}
