package com.pushwoosh.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import g8.c;

/* loaded from: classes2.dex */
public class NotificationOpenActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.d(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        c.d(this, intent);
        finish();
    }
}
