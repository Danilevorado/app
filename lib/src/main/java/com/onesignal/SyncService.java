package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.r2;

/* loaded from: classes.dex */
public class SyncService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) throws InterruptedException {
        r2.q().b(this, new r2.a(this));
        return 1;
    }
}
