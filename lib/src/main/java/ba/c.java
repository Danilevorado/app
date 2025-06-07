package ba;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import k9.h;

/* loaded from: classes2.dex */
class c implements b {
    c() {
    }

    @Override // ba.b
    public void a(Bundle bundle) {
        Context contextB = c9.a.b();
        if (contextB == null) {
            h.k("Incorrect state of app. Context is null");
            return;
        }
        String str = (String) bundle.get("launch");
        if (str != null) {
            Intent launchIntentForPackage = null;
            try {
                PackageManager packageManagerG = c9.a.e().g();
                if (packageManagerG != null) {
                    launchIntentForPackage = packageManagerG.getLaunchIntentForPackage(str);
                }
            } catch (Exception e5) {
                h.n("Application not found", e5);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                contextB.startActivity(launchIntentForPackage);
            }
        }
    }
}
