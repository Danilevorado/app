package k9;

import android.app.KeyguardManager;
import android.os.PowerManager;

/* loaded from: classes2.dex */
public abstract class e {
    public static boolean a() {
        KeyguardManager keyguardManagerF = c9.a.e().f();
        boolean z10 = keyguardManagerF != null && keyguardManagerF.inKeyguardRestrictedInputMode();
        PowerManager powerManagerB = c9.a.e().b();
        return z10 || !(powerManagerB == null || powerManagerB.isInteractive());
    }
}
