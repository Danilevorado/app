package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends i {

    /* renamed from: r, reason: collision with root package name */
    private static final Queue f21412r = new ArrayDeque(10);

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f21412r;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (i0.t(extras)) {
            i0 i0Var = new i0(extras);
            ExecutorService executorServiceE = n.e();
            try {
                if (new e(this, i0Var, executorServiceE).a()) {
                    return;
                }
                if (g0.A(intent)) {
                    g0.t(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        q(new n0(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void o(Intent intent) {
        if (l(intent.getStringExtra("google.message_id"))) {
            return;
        }
        u(intent);
    }

    private void u(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                p();
                break;
            case "gcm":
                g0.v(intent);
                m(intent);
                break;
            case "send_error":
                t(n(intent), new r0(intent.getStringExtra("error")));
                break;
            case "send_event":
                r(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.i
    protected Intent e(Intent intent) {
        return s0.b().c();
    }

    @Override // com.google.firebase.messaging.i
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            o(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            s(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void p() {
    }

    public void q(n0 n0Var) {
    }

    public void r(String str) {
    }

    public void s(String str) {
    }

    public void t(String str, Exception exc) {
    }
}
