package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.j0;
import org.json.JSONException;

/* loaded from: classes.dex */
public class FCMIntentService extends IntentService {

    class a implements j0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f21626a;

        a(Intent intent) {
            this.f21626a = intent;
        }

        @Override // com.onesignal.j0.e
        public void a(j0.f fVar) {
            l0.a.b(this.f21626a);
        }
    }

    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) throws JSONException {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        e3.Q0(this);
        j0.h(this, extras, new a(intent));
    }
}
