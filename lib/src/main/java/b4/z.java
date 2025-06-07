package b4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import e4.t0;
import e4.u0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
abstract class z {

    /* renamed from: e, reason: collision with root package name */
    private static volatile u0 f4455e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f4457g;

    /* renamed from: a, reason: collision with root package name */
    static final x f4451a = new r(v.L0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final x f4452b = new s(v.L0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final x f4453c = new t(v.L0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final x f4454d = new u(v.L0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f4456f = new Object();

    static j0 a(String str, v vVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, vVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static j0 b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, v vVar) throws NoSuchAlgorithmException {
        String str2 = true != (!z10 && f(str, vVar, true, false).f4436a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = i4.a.b("SHA-256");
        e4.p.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, i4.j.a(messageDigestB.digest(vVar.p1())), Boolean.valueOf(z10), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f4457g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f4457g = context.getApplicationContext();
        }
    }

    static boolean e() {
        boolean zI;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zI = f4455e.i();
            } catch (RemoteException | DynamiteModule.a e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                zI = false;
            }
            return zI;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static j0 f(final String str, final v vVar, final boolean z10, boolean z11) {
        try {
            h();
            e4.p.l(f4457g);
            try {
                return f4455e.n5(new e0(str, vVar, z10, z11), l4.b.p1(f4457g.getPackageManager())) ? j0.b() : new h0(new Callable() { // from class: b4.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return z.c(z10, str, vVar);
                    }
                }, null);
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                return j0.d("module call", e5);
            }
        } catch (DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return j0.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, l4.a] */
    private static j0 g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        String strConcat;
        j0 j0VarD;
        a0 a0Var;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            e4.p.l(f4457g);
            try {
                h();
                a0Var = new a0(str, z10, false, l4.b.p1(f4457g), false, true);
            } catch (DynamiteModule.a e5) {
                e = e5;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                strConcat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            try {
                c0 c0VarF4 = z13 ? f4455e.f4(a0Var) : f4455e.E5(a0Var);
                if (c0VarF4.h()) {
                    j0VarD = j0.f(c0VarF4.v());
                } else {
                    String strF = c0VarF4.f();
                    PackageManager.NameNotFoundException nameNotFoundException = c0VarF4.x() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (strF == null) {
                        strF = "error checking package certificate";
                    }
                    j0VarD = j0.g(c0VarF4.v(), c0VarF4.x(), strF, nameNotFoundException);
                }
            } catch (RemoteException e10) {
                e = e10;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                strConcat = "module call";
                j0VarD = j0.d(strConcat, e);
                return j0VarD;
            }
            return j0VarD;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static void h() {
        if (f4455e != null) {
            return;
        }
        e4.p.l(f4457g);
        synchronized (f4456f) {
            if (f4455e == null) {
                f4455e = t0.w0(DynamiteModule.e(f4457g, DynamiteModule.f5855f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
