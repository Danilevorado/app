package f1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class a extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, i1.c cVar) {
        super(context, cVar);
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
    }

    private final boolean m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // f1.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // f1.e
    public void k(Intent intent) {
        Boolean bool;
        rb.h.e(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
        }
        b1.j.e().a(b.f23597a, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                }
                bool = Boolean.FALSE;
                g(bool);
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                }
                bool = Boolean.FALSE;
                g(bool);
                break;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                }
                bool = Boolean.TRUE;
                g(bool);
                break;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                }
                bool = Boolean.TRUE;
                g(bool);
                break;
        }
    }

    @Override // f1.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(m(intentRegisterReceiver));
        }
        b1.j.e().c(b.f23597a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
