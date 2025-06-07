package com.google.firebase.iid;

import a4.a;
import a4.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b5.l;
import com.google.firebase.messaging.g0;
import com.google.firebase.messaging.m;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends b {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // a4.b
    protected int b(Context context, a aVar) {
        try {
            return ((Integer) l.a(new m(context).i(aVar.f()))).intValue();
        } catch (InterruptedException | ExecutionException e5) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e5);
            return 500;
        }
    }

    @Override // a4.b
    protected void c(Context context, Bundle bundle) {
        Intent intentG = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (g0.A(intentG)) {
            g0.s(intentG);
        }
    }
}
