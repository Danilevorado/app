package k4;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.d;
import i4.m;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f24824a;

    public b(Context context) {
        this.f24824a = context;
    }

    public int a(String str) {
        return this.f24824a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f24824a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) {
        return this.f24824a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) {
        Context context = this.f24824a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public d e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f24824a.getPackageManager().getApplicationInfo(str, 0);
        return d.a(this.f24824a.getPackageManager().getApplicationLabel(applicationInfo), this.f24824a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i10) {
        return this.f24824a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f24824a);
        }
        if (!m.i() || (nameForUid = this.f24824a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f24824a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean h(int i10, String str) {
        if (m.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f24824a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i10, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f24824a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
