package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class v0 {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f21583a;

    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f21584d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f21585a;

        /* renamed from: b, reason: collision with root package name */
        final String f21586b;

        /* renamed from: c, reason: collision with root package name */
        final long f21587c;

        private a(String str, String str2, long j10) {
            this.f21585a = str;
            this.f21586b = str2;
            this.f21587c = j10;
        }

        static String a(String str, String str2, long j10) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e5) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e5);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e5) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e5);
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f21587c + f21584d || !str.equals(this.f21586b);
        }
    }

    public v0(Context context) {
        this.f21583a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.a.i(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e5) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e5.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f21583a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String strB = b(str, str2);
        SharedPreferences.Editor editorEdit = this.f21583a.edit();
        editorEdit.remove(strB);
        editorEdit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f21583a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f21583a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f21583a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }
}
