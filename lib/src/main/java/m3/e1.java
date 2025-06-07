package m3;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.ze0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class e1 {
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            ze0.e("Unexpected exception.", th);
            b80.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
