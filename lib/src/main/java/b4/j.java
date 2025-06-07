package b4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private static j f4432c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4433a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f4434b;

    public j(Context context) {
        this.f4433a = context.getApplicationContext();
    }

    public static j a(Context context) {
        e4.p.l(context);
        synchronized (j.class) {
            if (f4432c == null) {
                z.d(context);
                f4432c = new j(context);
            }
        }
        return f4432c;
    }

    static final v d(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            w wVar = new w(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < vVarArr.length; i10++) {
                if (vVarArr[i10].equals(wVar)) {
                    return vVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? d(packageInfo2, y.f4450a) : d(packageInfo2, y.f4450a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final j0 f(String str, boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        j0 j0VarC;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return j0.c("null pkg");
        }
        if (str.equals(this.f4434b)) {
            return j0.b();
        }
        if (z.e()) {
            j0VarC = z.b(str, i.f(this.f4433a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f4433a.getPackageManager().getPackageInfo(str, 64);
                boolean zF = i.f(this.f4433a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        w wVar = new w(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        j0 j0VarA = z.a(str3, wVar, zF, false);
                        if (!j0VarA.f4436a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !z.a(str3, wVar, false, true).f4436a) {
                            j0VarC = j0VarA;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                    j0VarC = j0.c(str2);
                } else {
                    j0VarC = j0.c(str2);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                return j0.d("no pkg ".concat(str), e5);
            }
        }
        if (j0VarC.f4436a) {
            this.f4434b = str;
        }
        return j0VarC;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (i.f(this.f4433a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) throws PackageManager.NameNotFoundException {
        j0 j0VarC;
        int length;
        String[] packagesForUid = this.f4433a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            j0VarC = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    e4.p.l(j0VarC);
                    break;
                }
                j0VarC = f(packagesForUid[i11], false, false);
                if (j0VarC.f4436a) {
                    break;
                }
                i11++;
            }
        } else {
            j0VarC = j0.c("no pkgs");
        }
        j0VarC.e();
        return j0VarC.f4436a;
    }
}
