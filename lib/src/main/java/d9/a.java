package d9;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;

/* loaded from: classes2.dex */
public interface a {
    ConnectivityManager a();

    PowerManager b();

    AssetManager c();

    ActivityManager d();

    AlarmManager e();

    KeyguardManager f();

    PackageManager g();

    AudioManager h();

    NotificationManager i();
}
