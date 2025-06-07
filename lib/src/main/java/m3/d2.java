package m3;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.se0;

/* loaded from: classes.dex */
public class d2 extends c2 {
    static final boolean m(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // m3.b
    public final boolean e(Activity activity, Configuration configuration) {
        if (!((Boolean) k3.w.c().b(ir.f10125w4)).booleanValue()) {
            return false;
        }
        if (((Boolean) k3.w.c().b(ir.f10147y4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        k3.t.b();
        int iZ = se0.z(activity, configuration.screenHeightDp);
        int iZ2 = se0.z(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        j3.t.r();
        DisplayMetrics displayMetricsM = b2.M(windowManager);
        int i10 = displayMetricsM.heightPixels;
        int i11 = displayMetricsM.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) k3.w.c().b(ir.f10103u4)).intValue();
        return (m(i10, iZ + dimensionPixelSize, iRound) && m(i11, iZ2, iRound)) ? false : true;
    }
}
