package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public class NotificationOpenedActivityHMS extends Activity {
    private void a() {
        b(getIntent());
        finish();
    }

    private void b(Intent intent) {
        o0.b(this, intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a();
    }
}
