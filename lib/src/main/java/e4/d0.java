package e4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d0 implements DialogInterface.OnClickListener {
    public static d0 b(Activity activity, Intent intent, int i10) {
        return new b0(intent, activity, i10);
    }

    public static d0 c(d4.f fVar, Intent intent, int i10) {
        return new c0(intent, fVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e5) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e5);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
