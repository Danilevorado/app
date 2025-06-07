package i4;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f24305a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            e4.p.l(context);
            e4.p.l(th);
            return false;
        } catch (Exception e5) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
            return false;
        }
    }
}
