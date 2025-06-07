package o1;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class b {
    public static int a(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int b(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
