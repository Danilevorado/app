package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
abstract class m0 {
    private static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean b(Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }

    static void c(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z10);
        editorEdit.apply();
    }
}
