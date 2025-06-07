package xa;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.lang.ref.WeakReference;
import k9.h;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f28374a;

    public b(Context context) {
        this.f28374a = new WeakReference(context);
    }

    private Context a() {
        return (Context) this.f28374a.get();
    }

    @Override // xa.a
    public int b() {
        try {
            if (a() == null) {
                return 0;
            }
            return a().getPackageManager().getPackageInfo(d(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            h.o(e5);
            return 0;
        }
    }

    @Override // xa.a
    public File c() {
        if (a() == null) {
            return null;
        }
        return a().getExternalCacheDir();
    }

    @Override // xa.a
    public String d() {
        return a() == null ? "" : a().getPackageName();
    }

    @Override // xa.a
    public ApplicationInfo e() {
        try {
            if (a() == null) {
                return null;
            }
            return a().getPackageManager().getApplicationInfo(a().getPackageName(), 128);
        } catch (Exception e5) {
            h.o(e5);
            return null;
        }
    }

    @Override // xa.a
    public String f() {
        try {
            if (a() == null) {
                return null;
            }
            return a().getPackageManager().getPackageInfo(d(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            h.o(e5);
            return null;
        }
    }

    @Override // xa.a
    public CharSequence g() {
        if (a() == null) {
            return null;
        }
        return a().getPackageManager().getApplicationLabel(a().getApplicationInfo());
    }
}
