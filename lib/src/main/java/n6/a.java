package n6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import e6.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25519a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f25520b;

    /* renamed from: c, reason: collision with root package name */
    private final c f25521c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25522d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f25519a = contextA;
        this.f25520b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f25521c = cVar;
        this.f25522d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f25520b.contains("firebase_data_collection_default_enabled") ? this.f25520b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f25519a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f25519a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f25522d;
    }
}
