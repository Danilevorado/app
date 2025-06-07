package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class n0 extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        m0.g(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) throws JSONException {
        rb.h.e(intent, "intent");
        super.onNewIntent(intent);
        m0.g(this, getIntent());
        finish();
    }
}
