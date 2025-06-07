package za;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class a implements d9.a {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f28926a;

    public a(Context context) {
        this.f28926a = new WeakReference(context);
    }

    private Context j() {
        return (Context) this.f28926a.get();
    }

    @Override // d9.a
    public ConnectivityManager a() {
        if (j() == null) {
            return null;
        }
        return (ConnectivityManager) j().getSystemService("connectivity");
    }

    @Override // d9.a
    public PowerManager b() {
        if (j() == null) {
            return null;
        }
        return (PowerManager) j().getSystemService("power");
    }

    @Override // d9.a
    public AssetManager c() {
        if (j() == null) {
            return null;
        }
        return j().getAssets();
    }

    @Override // d9.a
    public ActivityManager d() {
        if (j() == null) {
            return null;
        }
        return (ActivityManager) j().getSystemService("activity");
    }

    @Override // d9.a
    public AlarmManager e() {
        if (j() == null) {
            return null;
        }
        return (AlarmManager) j().getSystemService("alarm");
    }

    @Override // d9.a
    public KeyguardManager f() {
        if (j() == null) {
            return null;
        }
        return (KeyguardManager) j().getSystemService("keyguard");
    }

    @Override // d9.a
    public PackageManager g() {
        if (j() == null) {
            return null;
        }
        return j().getPackageManager();
    }

    @Override // d9.a
    public AudioManager h() {
        if (j() == null) {
            return null;
        }
        return (AudioManager) j().getSystemService("audio");
    }

    @Override // d9.a
    public NotificationManager i() {
        if (j() == null) {
            return null;
        }
        return (NotificationManager) j().getSystemService("notification");
    }
}
