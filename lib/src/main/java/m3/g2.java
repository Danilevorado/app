package m3;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.ir;
import java.util.Locale;

/* loaded from: classes.dex */
public class g2 extends e2 {
    static final /* synthetic */ WindowInsets n(Activity activity, View view, WindowInsets windowInsets) {
        if (j3.t.q().h().n() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                p1 p1VarH = j3.t.q().h();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(String.valueOf(str));
                }
                p1VarH.C(strConcat);
            } else {
                j3.t.q().h().C("");
            }
        }
        o(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void o(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = true != z10 ? 2 : 1;
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    @Override // m3.b
    public final int i(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // m3.b
    public final void j(final Activity activity) {
        if (((Boolean) k3.w.c().b(ir.f9894b1)).booleanValue() && j3.t.q().h().n() == null && !activity.isInMultiWindowMode()) {
            o(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: m3.f2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return g2.n(activity, view, windowInsets);
                }
            });
        }
    }
}
