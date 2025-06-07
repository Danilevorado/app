package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.j0;
import org.json.JSONException;

/* loaded from: classes.dex */
public class FCMIntentJobService extends JobIntentService {

    class a implements j0.e {
        a() {
        }

        @Override // com.onesignal.j0.e
        public void a(j0.f fVar) {
        }
    }

    public static void j(Context context, Intent intent) {
        JobIntentService.d(context, FCMIntentJobService.class, 123890, intent, false);
    }

    @Override // com.onesignal.JobIntentService
    protected void g(Intent intent) throws JSONException {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        e3.Q0(this);
        j0.h(this, extras, new a());
    }

    @Override // com.onesignal.JobIntentService
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
