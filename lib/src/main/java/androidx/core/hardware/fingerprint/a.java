package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2247a;

    /* renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    class C0025a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f2248a;

        C0025a(c cVar) {
            this.f2248a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f2248a.a(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f2248a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f2248a.c(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f2248a.d(new d(a.f(b.b(authenticationResult))));
        }
    }

    static class b {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 != 23 && (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    public static abstract class c {
        public abstract void a(int i10, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i10, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final e f2249a;

        public d(e eVar) {
            this.f2249a = eVar;
        }

        public e a() {
            return this.f2249a;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f2250a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f2251b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f2252c;

        public e(Signature signature) {
            this.f2250a = signature;
            this.f2251b = null;
            this.f2252c = null;
        }

        public e(Cipher cipher) {
            this.f2251b = cipher;
            this.f2250a = null;
            this.f2252c = null;
        }

        public e(Mac mac) {
            this.f2252c = mac;
            this.f2251b = null;
            this.f2250a = null;
        }

        public Cipher a() {
            return this.f2251b;
        }

        public Mac b() {
            return this.f2252c;
        }

        public Signature c() {
            return this.f2250a;
        }
    }

    private a(Context context) {
        this.f2247a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    private static FingerprintManager c(Context context) {
        return b.c(context);
    }

    static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new C0025a(cVar);
    }

    private static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i10, androidx.core.os.e eVar2, c cVar, Handler handler) {
        FingerprintManager fingerprintManagerC = c(this.f2247a);
        if (fingerprintManagerC != null) {
            b.a(fingerprintManagerC, h(eVar), eVar2 != null ? (CancellationSignal) eVar2.b() : null, i10, g(cVar), handler);
        }
    }

    public boolean d() {
        FingerprintManager fingerprintManagerC = c(this.f2247a);
        return fingerprintManagerC != null && b.d(fingerprintManagerC);
    }

    public boolean e() {
        FingerprintManager fingerprintManagerC = c(this.f2247a);
        return fingerprintManagerC != null && b.e(fingerprintManagerC);
    }
}
