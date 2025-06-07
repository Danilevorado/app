package m3;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.ye0;
import com.google.android.gms.internal.ads.ys;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
public abstract class m1 {
    public static void a(Context context) {
        int i10 = ye0.f17999g;
        if (((Boolean) ys.f18258a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || ye0.l()) {
                    return;
                }
                ab3 ab3VarB = new c1(context).b();
                ze0.f("Updating ad debug logging enablement.");
                rf0.a(ab3VarB, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e5) {
                ze0.h("Fail to determine debug setting.", e5);
            }
        }
    }
}
