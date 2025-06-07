package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.ze0;
import k3.t;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            t.a().i(this, new l30()).M0(intent);
        } catch (RemoteException e5) {
            ze0.d("RemoteException calling handleNotificationIntent: ".concat(e5.toString()));
        }
    }
}
