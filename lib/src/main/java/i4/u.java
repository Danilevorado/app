package i4;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class u {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
