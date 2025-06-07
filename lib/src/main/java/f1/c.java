package f1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class c extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, i1.c cVar) {
        super(context, cVar);
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
    }

    @Override // f1.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // f1.e
    public void k(Intent intent) {
        Boolean bool;
        rb.h.e(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        b1.j.e().a(d.f23598a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1980154005) {
                if (iHashCode != 490310653 || !action.equals("android.intent.action.BATTERY_LOW")) {
                    return;
                } else {
                    bool = Boolean.FALSE;
                }
            } else if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                return;
            } else {
                bool = Boolean.TRUE;
            }
            g(bool);
        }
    }

    @Override // f1.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            b1.j.e().c(d.f23598a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
