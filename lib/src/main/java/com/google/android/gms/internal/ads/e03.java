package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
final class e03 {

    /* renamed from: c, reason: collision with root package name */
    private static e03 f7584c;

    /* renamed from: a, reason: collision with root package name */
    private final String f7585a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7586b;

    private e03(Context context) {
        this.f7585a = context.getPackageName();
        this.f7586b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static e03 b(Context context) {
        if (f7584c == null) {
            f7584c = new e03(context);
        }
        return f7584c;
    }

    final long a(String str, long j10) {
        return this.f7586b.getLong(str, -1L);
    }

    final String c(String str, String str2) {
        return this.f7586b.getString(str, null);
    }

    final void d(String str, Object obj) throws IOException {
        SharedPreferences.Editor editorPutBoolean;
        if (obj instanceof String) {
            editorPutBoolean = this.f7586b.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            editorPutBoolean = this.f7586b.edit().putLong(str, ((Long) obj).longValue());
        } else {
            if (!(obj instanceof Boolean)) {
                String str2 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.f7585a;
                Log.e("PaidLifecycleSPHandler", str2);
                throw new IllegalArgumentException(str2);
            }
            editorPutBoolean = this.f7586b.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (editorPutBoolean.commit()) {
            return;
        }
        String str3 = "Failed to store " + str + " for app " + this.f7585a;
        Log.e("PaidLifecycleSPHandler", str3);
        throw new IOException(str3);
    }

    final void e(String str) throws IOException {
        if (this.f7586b.edit().remove(str).commit()) {
            return;
        }
        String str2 = "Failed to remove " + str + " for app " + this.f7585a;
        Log.e("PaidLifecycleSPHandler", str2);
        throw new IOException(str2);
    }

    final boolean f(String str, boolean z10) {
        return this.f7586b.getBoolean(str, true);
    }

    final boolean g(String str) {
        return this.f7586b.contains(str);
    }
}
