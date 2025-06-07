package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import com.facebook.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d extends Fragment {

    /* renamed from: n0, reason: collision with root package name */
    Handler f1444n0 = new Handler(Looper.getMainLooper());

    /* renamed from: o0, reason: collision with root package name */
    androidx.biometric.f f1445o0;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f1446m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ CharSequence f1447n;

        a(int i10, CharSequence charSequence) {
            this.f1446m = i10;
            this.f1447n = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f1445o0.m().a(this.f1446m, this.f1447n);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f1445o0.m().b();
        }
    }

    class c implements androidx.lifecycle.t {
        c() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(BiometricPrompt.b bVar) {
            if (bVar != null) {
                d.this.f2(bVar);
                d.this.f1445o0.M(null);
            }
        }
    }

    /* renamed from: androidx.biometric.d$d, reason: collision with other inner class name */
    class C0014d implements androidx.lifecycle.t {
        C0014d() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.biometric.c cVar) {
            if (cVar != null) {
                d.this.c2(cVar.b(), cVar.c());
                d.this.f1445o0.J(null);
            }
        }
    }

    class e implements androidx.lifecycle.t {
        e() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CharSequence charSequence) {
            if (charSequence != null) {
                d.this.e2(charSequence);
                d.this.f1445o0.J(null);
            }
        }
    }

    class f implements androidx.lifecycle.t {
        f() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                d.this.d2();
                d.this.f1445o0.K(false);
            }
        }
    }

    class g implements androidx.lifecycle.t {
        g() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                if (d.this.Y1()) {
                    d.this.h2();
                } else {
                    d.this.g2();
                }
                d.this.f1445o0.a0(false);
            }
        }
    }

    class h implements androidx.lifecycle.t {
        h() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                d.this.O1(1);
                d.this.R1();
                d.this.f1445o0.U(false);
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f1445o0.V(false);
        }
    }

    class j implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f1457m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ CharSequence f1458n;

        j(int i10, CharSequence charSequence) {
            this.f1457m = i10;
            this.f1458n = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.i2(this.f1457m, this.f1458n);
        }
    }

    class k implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ BiometricPrompt.b f1460m;

        k(BiometricPrompt.b bVar) {
            this.f1460m = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f1445o0.m().c(this.f1460m);
        }
    }

    private static class l {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    private static class m {
        static void a(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }

        static void b(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        static android.hardware.biometrics.BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class n {
        static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    private static class o {
        static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    private static class p implements Executor {

        /* renamed from: m, reason: collision with root package name */
        private final Handler f1462m = new Handler(Looper.getMainLooper());

        p() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1462m.post(runnable);
        }
    }

    private static class q implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final WeakReference f1463m;

        q(d dVar) {
            this.f1463m = new WeakReference(dVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1463m.get() != null) {
                ((d) this.f1463m.get()).q2();
            }
        }
    }

    private static class r implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final WeakReference f1464m;

        r(androidx.biometric.f fVar) {
            this.f1464m = new WeakReference(fVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1464m.get() != null) {
                ((androidx.biometric.f) this.f1464m.get()).T(false);
            }
        }
    }

    private static class s implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final WeakReference f1465m;

        s(androidx.biometric.f fVar) {
            this.f1465m = new WeakReference(fVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1465m.get() != null) {
                ((androidx.biometric.f) this.f1465m.get()).Z(false);
            }
        }
    }

    private static int P1(androidx.core.hardware.fingerprint.a aVar) {
        if (aVar.e()) {
            return !aVar.d() ? 11 : 0;
        }
        return 12;
    }

    private void Q1() {
        if (k() == null) {
            return;
        }
        androidx.biometric.f fVar = (androidx.biometric.f) new g0(k()).a(androidx.biometric.f.class);
        this.f1445o0 = fVar;
        fVar.j().e(this, new c());
        this.f1445o0.h().e(this, new C0014d());
        this.f1445o0.i().e(this, new e());
        this.f1445o0.y().e(this, new f());
        this.f1445o0.G().e(this, new g());
        this.f1445o0.D().e(this, new h());
    }

    private void S1() {
        this.f1445o0.d0(false);
        if (c0()) {
            androidx.fragment.app.m mVarJ = J();
            androidx.biometric.k kVar = (androidx.biometric.k) mVarJ.i0("androidx.biometric.FingerprintDialogFragment");
            if (kVar != null) {
                if (kVar.c0()) {
                    kVar.P1();
                } else {
                    mVarJ.l().l(kVar).g();
                }
            }
        }
    }

    private int T1() {
        Context contextV = v();
        if (contextV == null || !androidx.biometric.i.f(contextV, Build.MODEL)) {
            return AdError.SERVER_ERROR_CODE;
        }
        return 0;
    }

    private void U1(int i10) {
        if (i10 == -1) {
            l2(new BiometricPrompt.b(null, 1));
        } else {
            i2(10, V(t.f1530l));
        }
    }

    private boolean V1() {
        androidx.fragment.app.e eVarK = k();
        return eVarK != null && eVarK.isChangingConfigurations();
    }

    private boolean W1() {
        androidx.fragment.app.e eVarK = k();
        return (eVarK == null || this.f1445o0.o() == null || !androidx.biometric.i.g(eVarK, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean X1() {
        return Build.VERSION.SDK_INT == 28 && !androidx.biometric.m.a(v());
    }

    private boolean Z1() {
        return Build.VERSION.SDK_INT < 28 || W1() || X1();
    }

    private void a2() {
        androidx.fragment.app.e eVarK = k();
        if (eVarK == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = androidx.biometric.l.a(eVarK);
        if (keyguardManagerA == null) {
            i2(12, V(t.f1529k));
            return;
        }
        CharSequence charSequenceX = this.f1445o0.x();
        CharSequence charSequenceW = this.f1445o0.w();
        CharSequence charSequenceP = this.f1445o0.p();
        if (charSequenceW == null) {
            charSequenceW = charSequenceP;
        }
        Intent intentA = l.a(keyguardManagerA, charSequenceX, charSequenceW);
        if (intentA == null) {
            i2(14, V(t.f1528j));
            return;
        }
        this.f1445o0.R(true);
        if (Z1()) {
            S1();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    static d b2() {
        return new d();
    }

    private void j2(int i10, CharSequence charSequence) {
        if (this.f1445o0.B()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f1445o0.z()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f1445o0.N(false);
            this.f1445o0.n().execute(new a(i10, charSequence));
        }
    }

    private void k2() {
        if (this.f1445o0.z()) {
            this.f1445o0.n().execute(new b());
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void l2(BiometricPrompt.b bVar) {
        m2(bVar);
        R1();
    }

    private void m2(BiometricPrompt.b bVar) {
        if (!this.f1445o0.z()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f1445o0.N(false);
            this.f1445o0.n().execute(new k(bVar));
        }
    }

    private void n2() {
        BiometricPrompt.Builder builderD = m.d(t1().getApplicationContext());
        CharSequence charSequenceX = this.f1445o0.x();
        CharSequence charSequenceW = this.f1445o0.w();
        CharSequence charSequenceP = this.f1445o0.p();
        if (charSequenceX != null) {
            m.h(builderD, charSequenceX);
        }
        if (charSequenceW != null) {
            m.g(builderD, charSequenceW);
        }
        if (charSequenceP != null) {
            m.e(builderD, charSequenceP);
        }
        CharSequence charSequenceV = this.f1445o0.v();
        if (!TextUtils.isEmpty(charSequenceV)) {
            m.f(builderD, charSequenceV, this.f1445o0.n(), this.f1445o0.u());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            n.a(builderD, this.f1445o0.A());
        }
        int iF = this.f1445o0.f();
        if (i10 >= 30) {
            o.a(builderD, iF);
        } else if (i10 >= 29) {
            n.b(builderD, androidx.biometric.b.c(iF));
        }
        M1(m.c(builderD), v());
    }

    private void o2() {
        Context applicationContext = t1().getApplicationContext();
        androidx.core.hardware.fingerprint.a aVarB = androidx.core.hardware.fingerprint.a.b(applicationContext);
        int iP1 = P1(aVarB);
        if (iP1 != 0) {
            i2(iP1, androidx.biometric.j.a(applicationContext, iP1));
            return;
        }
        if (c0()) {
            this.f1445o0.V(true);
            if (!androidx.biometric.i.f(applicationContext, Build.MODEL)) {
                this.f1444n0.postDelayed(new i(), 500L);
                androidx.biometric.k.e2().a2(J(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f1445o0.O(0);
            N1(aVarB, applicationContext);
        }
    }

    private void p2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = V(t.f1520b);
        }
        this.f1445o0.Y(2);
        this.f1445o0.W(charSequence);
    }

    void L1(BiometricPrompt.d dVar, BiometricPrompt.c cVar) {
        androidx.biometric.f fVar;
        androidx.biometric.f fVar2;
        String strV;
        androidx.fragment.app.e eVarK = k();
        if (eVarK == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f1445o0.c0(dVar);
        int iB = androidx.biometric.b.b(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iB == 15 && cVar == null) {
            fVar = this.f1445o0;
            cVar = androidx.biometric.h.a();
        } else {
            fVar = this.f1445o0;
        }
        fVar.S(cVar);
        if (Y1()) {
            fVar2 = this.f1445o0;
            strV = V(t.f1519a);
        } else {
            fVar2 = this.f1445o0;
            strV = null;
        }
        fVar2.b0(strV);
        if (Y1() && androidx.biometric.e.g(eVarK).a(255) != 0) {
            this.f1445o0.N(true);
            a2();
        } else if (this.f1445o0.C()) {
            this.f1444n0.postDelayed(new q(this), 600L);
        } else {
            q2();
        }
    }

    void M1(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectD = androidx.biometric.h.d(this.f1445o0.o());
        CancellationSignal cancellationSignalB = this.f1445o0.l().b();
        p pVar = new p();
        BiometricPrompt.AuthenticationCallback authenticationCallbackA = this.f1445o0.g().a();
        try {
            if (cryptoObjectD == null) {
                m.b(biometricPrompt, cancellationSignalB, pVar, authenticationCallbackA);
            } else {
                m.a(biometricPrompt, cryptoObjectD, cancellationSignalB, pVar, authenticationCallbackA);
            }
        } catch (NullPointerException e5) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e5);
            i2(1, context != null ? context.getString(t.f1520b) : "");
        }
    }

    void N1(androidx.core.hardware.fingerprint.a aVar, Context context) {
        try {
            aVar.a(androidx.biometric.h.e(this.f1445o0.o()), 0, this.f1445o0.l().c(), this.f1445o0.g().b(), null);
        } catch (NullPointerException e5) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e5);
            i2(1, androidx.biometric.j.a(context, 1));
        }
    }

    void O1(int i10) {
        if (i10 == 3 || !this.f1445o0.F()) {
            if (Z1()) {
                this.f1445o0.O(i10);
                if (i10 == 1) {
                    j2(10, androidx.biometric.j.a(v(), 10));
                }
            }
            this.f1445o0.l().a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q0() {
        super.Q0();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.b.c(this.f1445o0.f())) {
            this.f1445o0.Z(true);
            this.f1444n0.postDelayed(new s(this.f1445o0), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void R0() {
        super.R0();
        if (Build.VERSION.SDK_INT >= 29 || this.f1445o0.B() || V1()) {
            return;
        }
        O1(0);
    }

    void R1() {
        this.f1445o0.d0(false);
        S1();
        if (!this.f1445o0.B() && c0()) {
            J().l().l(this).g();
        }
        Context contextV = v();
        if (contextV == null || !androidx.biometric.i.e(contextV, Build.MODEL)) {
            return;
        }
        this.f1445o0.T(true);
        this.f1444n0.postDelayed(new r(this.f1445o0), 600L);
    }

    boolean Y1() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.b.c(this.f1445o0.f());
    }

    void c2(int i10, CharSequence charSequence) {
        if (!androidx.biometric.j.b(i10)) {
            i10 = 8;
        }
        Context contextV = v();
        if (Build.VERSION.SDK_INT < 29 && androidx.biometric.j.c(i10) && contextV != null && androidx.biometric.l.b(contextV) && androidx.biometric.b.c(this.f1445o0.f())) {
            a2();
            return;
        }
        if (!Z1()) {
            if (charSequence == null) {
                charSequence = V(t.f1520b) + " " + i10;
            }
            i2(i10, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = androidx.biometric.j.a(v(), i10);
        }
        if (i10 == 5) {
            int iK = this.f1445o0.k();
            if (iK == 0 || iK == 3) {
                j2(i10, charSequence);
            }
            R1();
            return;
        }
        if (this.f1445o0.E()) {
            i2(i10, charSequence);
        } else {
            p2(charSequence);
            this.f1444n0.postDelayed(new j(i10, charSequence), T1());
        }
        this.f1445o0.V(true);
    }

    void d2() {
        if (Z1()) {
            p2(V(t.f1527i));
        }
        k2();
    }

    void e2(CharSequence charSequence) {
        if (Z1()) {
            p2(charSequence);
        }
    }

    void f2(BiometricPrompt.b bVar) {
        l2(bVar);
    }

    void g2() {
        CharSequence charSequenceV = this.f1445o0.v();
        if (charSequenceV == null) {
            charSequenceV = V(t.f1520b);
        }
        i2(13, charSequenceV);
        O1(2);
    }

    void h2() {
        a2();
    }

    void i2(int i10, CharSequence charSequence) {
        j2(i10, charSequence);
        R1();
    }

    @Override // androidx.fragment.app.Fragment
    public void o0(int i10, int i11, Intent intent) {
        super.o0(i10, i11, intent);
        if (i10 == 1) {
            this.f1445o0.R(false);
            U1(i11);
        }
    }

    void q2() {
        if (this.f1445o0.H()) {
            return;
        }
        if (v() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f1445o0.d0(true);
        this.f1445o0.N(true);
        if (Z1()) {
            o2();
        } else {
            n2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void t0(Bundle bundle) {
        super.t0(bundle);
        Q1();
    }
}
