package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f1466a;

    /* renamed from: b, reason: collision with root package name */
    private final BiometricManager f1467b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.core.hardware.fingerprint.a f1468c;

    private static class a {
        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    private static class b {
        static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    private static class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f1469a;

        c(Context context) {
            this.f1469a = context.getApplicationContext();
        }

        @Override // androidx.biometric.e.d
        public boolean a() {
            return m.a(this.f1469a);
        }

        @Override // androidx.biometric.e.d
        public BiometricManager b() {
            return a.b(this.f1469a);
        }

        @Override // androidx.biometric.e.d
        public boolean c() {
            return l.b(this.f1469a);
        }

        @Override // androidx.biometric.e.d
        public boolean d() {
            return i.a(this.f1469a, Build.MODEL);
        }

        @Override // androidx.biometric.e.d
        public boolean e() {
            return l.a(this.f1469a) != null;
        }

        @Override // androidx.biometric.e.d
        public androidx.core.hardware.fingerprint.a f() {
            return androidx.core.hardware.fingerprint.a.b(this.f1469a);
        }
    }

    interface d {
        boolean a();

        BiometricManager b();

        boolean c();

        boolean d();

        boolean e();

        androidx.core.hardware.fingerprint.a f();
    }

    e(d dVar) {
        this.f1466a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f1467b = i10 >= 29 ? dVar.b() : null;
        this.f1468c = i10 <= 29 ? dVar.f() : null;
    }

    private int b(int i10) {
        if (!androidx.biometric.b.e(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f1466a.e()) {
            return 12;
        }
        if (androidx.biometric.b.c(i10)) {
            return this.f1466a.c() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return androidx.biometric.b.f(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f1466a.a()) {
            return d();
        }
        return 12;
    }

    private int c() {
        androidx.core.hardware.fingerprint.a aVar = this.f1468c;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (aVar.e()) {
            return !this.f1468c.d() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        return !this.f1466a.c() ? c() : c() == 0 ? 0 : -1;
    }

    private int e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        BiometricPrompt.CryptoObject cryptoObjectD;
        Method methodC = a.c();
        if (methodC != null && (cryptoObjectD = h.d(h.a())) != null) {
            try {
                Object objInvoke = methodC.invoke(this.f1467b, cryptoObjectD);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e5);
            }
        }
        int iF = f();
        return (this.f1466a.d() || iF != 0) ? iF : d();
    }

    private int f() {
        BiometricManager biometricManager = this.f1467b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static e g(Context context) {
        return new e(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f1467b;
        if (biometricManager != null) {
            return b.a(biometricManager, i10);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
