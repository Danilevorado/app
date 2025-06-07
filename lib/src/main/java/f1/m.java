package f1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class m extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, i1.c cVar) {
        super(context, cVar);
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
    }

    @Override // f1.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // f1.e
    public void k(Intent intent) {
        Boolean bool;
        rb.h.e(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        b1.j.e().a(n.f23615a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1181163412) {
                if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return;
                } else {
                    bool = Boolean.TRUE;
                }
            } else if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return;
            } else {
                bool = Boolean.FALSE;
            }
            g(bool);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // f1.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.d()
            android.content.IntentFilter r1 = r5.j()
            r2 = 0
            android.content.Intent r0 = r0.registerReceiver(r2, r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3d
            java.lang.String r3 = r0.getAction()
            if (r3 != 0) goto L18
            goto L3d
        L18:
            java.lang.String r0 = r0.getAction()
            if (r0 == 0) goto L3e
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L36
            r4 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r3 == r4) goto L2d
            goto L3e
        L2d:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3d
            goto L3e
        L36:
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r2)
            goto L3e
        L3d:
            r1 = r2
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.m.e():java.lang.Boolean");
    }
}
