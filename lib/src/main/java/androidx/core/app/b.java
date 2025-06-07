package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b extends androidx.core.content.a {

    /* renamed from: c, reason: collision with root package name */
    private static c f2028c;

    static class a {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C0018b {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface c {
        boolean a(Activity activity, String[] strArr, int i10);
    }

    public interface d {
        void a(int i10);
    }

    public static void o(Activity activity) {
        a.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void q(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.p(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(Activity activity, String[] strArr, int i10) {
        c cVar = f2028c;
        if (cVar == null || !cVar.a(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (TextUtils.isEmpty(strArr[i11])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!androidx.core.os.a.c() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (activity instanceof d) {
                ((d) activity).a(i10);
            }
            C0018b.b(activity, strArr, i10);
        }
    }

    public static boolean s(Activity activity, String str) {
        if (androidx.core.os.a.c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return C0018b.c(activity, str);
        }
        return false;
    }

    public static void t(Activity activity, Intent intent, int i10, Bundle bundle) {
        a.b(activity, intent, i10, bundle);
    }

    public static void u(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        a.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
