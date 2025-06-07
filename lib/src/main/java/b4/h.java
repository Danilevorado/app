package b4;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class h extends i {

    /* renamed from: f, reason: collision with root package name */
    public static final int f4425f = i.f4427a;

    public static Resources e(Context context) {
        return i.e(context);
    }

    public static int g(Context context) {
        return i.g(context);
    }

    public static boolean k(int i10) {
        return i.k(i10);
    }

    public static Dialog n(int i10, Activity activity, int i11) {
        return o(i10, activity, i11, null);
    }

    public static Dialog o(int i10, Activity activity, int i11, DialogInterface.OnCancelListener onCancelListener) {
        if (true == i.i(activity, i10)) {
            i10 = 18;
        }
        return e.p().n(activity, i10, i11, onCancelListener);
    }
}
