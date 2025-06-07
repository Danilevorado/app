package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.e0;
import b1.j;
import h1.l;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f4068a = j.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Intent f4069m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f4070n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f4071o;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4069m = intent;
            this.f4070n = context;
            this.f4071o = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f4069m.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4069m.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4069m.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4069m.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j.e().a(ConstraintProxyUpdateReceiver.f4068a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                l.a(this.f4070n, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                l.a(this.f4070n, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                l.a(this.f4070n, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                l.a(this.f4070n, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4071o.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            e0.n(context).t().c(new a(intent, context, goAsync()));
            return;
        }
        j.e().a(f4068a, "Ignoring unknown action " + action);
    }
}
