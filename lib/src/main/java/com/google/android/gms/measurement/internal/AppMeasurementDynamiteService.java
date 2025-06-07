package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.e1 {

    /* renamed from: m, reason: collision with root package name */
    w4 f19734m = null;

    /* renamed from: n, reason: collision with root package name */
    private final Map f19735n = new q.a();

    private final void b() {
        if (this.f19734m == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void w0(com.google.android.gms.internal.measurement.i1 i1Var, String str) {
        b();
        this.f19734m.N().J(i1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void beginAdUnitExposure(String str, long j10) {
        b();
        this.f19734m.w().j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        b();
        this.f19734m.I().m(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void clearMeasurementEnabled(long j10) {
        b();
        this.f19734m.I().I(null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void endAdUnitExposure(String str, long j10) {
        b();
        this.f19734m.w().k(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void generateEventId(com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        long jR0 = this.f19734m.N().r0();
        b();
        this.f19734m.N().I(i1Var, jR0);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getAppInstanceId(com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        this.f19734m.B().y(new m6(this, i1Var));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        w0(i1Var, this.f19734m.I().V());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        this.f19734m.B().y(new v9(this, i1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        w0(i1Var, this.f19734m.I().W());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        w0(i1Var, this.f19734m.I().X());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getGmpAppId(com.google.android.gms.internal.measurement.i1 i1Var) {
        String strB;
        b();
        v6 v6VarI = this.f19734m.I();
        if (v6VarI.f20269a.O() != null) {
            strB = v6VarI.f20269a.O();
        } else {
            try {
                strB = x4.x.b(v6VarI.f20269a.a(), "google_app_id", v6VarI.f20269a.R());
            } catch (IllegalStateException e5) {
                v6VarI.f20269a.b().p().b("getGoogleAppId failed with exception", e5);
                strB = null;
            }
        }
        w0(i1Var, strB);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        this.f19734m.I().Q(str);
        b();
        this.f19734m.N().H(i1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getTestFlag(com.google.android.gms.internal.measurement.i1 i1Var, int i10) {
        b();
        if (i10 == 0) {
            this.f19734m.N().J(i1Var, this.f19734m.I().Y());
            return;
        }
        if (i10 == 1) {
            this.f19734m.N().I(i1Var, this.f19734m.I().U().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f19734m.N().H(i1Var, this.f19734m.I().T().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f19734m.N().D(i1Var, this.f19734m.I().R().booleanValue());
                return;
            }
        }
        u9 u9VarN = this.f19734m.N();
        double dDoubleValue = this.f19734m.I().S().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            u9VarN.f20269a.b().u().b("Error returning double value to wrapper", e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        this.f19734m.B().y(new j8(this, i1Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void initForTests(Map map) {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void initialize(l4.a aVar, com.google.android.gms.internal.measurement.n1 n1Var, long j10) {
        w4 w4Var = this.f19734m;
        if (w4Var == null) {
            this.f19734m = w4.H((Context) e4.p.l((Context) l4.b.L0(aVar)), n1Var, Long.valueOf(j10));
        } else {
            w4Var.b().u().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.i1 i1Var) {
        b();
        this.f19734m.B().y(new w9(this, i1Var));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        b();
        this.f19734m.I().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        b();
        e4.p.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f19734m.B().y(new j7(this, i1Var, new v(str2, new t(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logHealthData(int i10, String str, l4.a aVar, l4.a aVar2, l4.a aVar3) {
        b();
        this.f19734m.b().F(i10, true, false, str, aVar == null ? null : l4.b.L0(aVar), aVar2 == null ? null : l4.b.L0(aVar2), aVar3 != null ? l4.b.L0(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityCreated(l4.a aVar, Bundle bundle, long j10) {
        b();
        u6 u6Var = this.f19734m.I().f20478c;
        if (u6Var != null) {
            this.f19734m.I().n();
            u6Var.onActivityCreated((Activity) l4.b.L0(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityDestroyed(l4.a aVar, long j10) {
        b();
        u6 u6Var = this.f19734m.I().f20478c;
        if (u6Var != null) {
            this.f19734m.I().n();
            u6Var.onActivityDestroyed((Activity) l4.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityPaused(l4.a aVar, long j10) {
        b();
        u6 u6Var = this.f19734m.I().f20478c;
        if (u6Var != null) {
            this.f19734m.I().n();
            u6Var.onActivityPaused((Activity) l4.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityResumed(l4.a aVar, long j10) {
        b();
        u6 u6Var = this.f19734m.I().f20478c;
        if (u6Var != null) {
            this.f19734m.I().n();
            u6Var.onActivityResumed((Activity) l4.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivitySaveInstanceState(l4.a aVar, com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        b();
        u6 u6Var = this.f19734m.I().f20478c;
        Bundle bundle = new Bundle();
        if (u6Var != null) {
            this.f19734m.I().n();
            u6Var.onActivitySaveInstanceState((Activity) l4.b.L0(aVar), bundle);
        }
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f19734m.b().u().b("Error returning bundle value to wrapper", e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityStarted(l4.a aVar, long j10) {
        b();
        if (this.f19734m.I().f20478c != null) {
            this.f19734m.I().n();
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityStopped(l4.a aVar, long j10) {
        b();
        if (this.f19734m.I().f20478c != null) {
            this.f19734m.I().n();
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        b();
        i1Var.h0(null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.k1 k1Var) {
        x4.u y9Var;
        b();
        synchronized (this.f19735n) {
            y9Var = (x4.u) this.f19735n.get(Integer.valueOf(k1Var.f()));
            if (y9Var == null) {
                y9Var = new y9(this, k1Var);
                this.f19735n.put(Integer.valueOf(k1Var.f()), y9Var);
            }
        }
        this.f19734m.I().v(y9Var);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void resetAnalyticsData(long j10) {
        b();
        this.f19734m.I().w(j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        b();
        if (bundle == null) {
            this.f19734m.b().p().a("Conditional user property must not be null");
        } else {
            this.f19734m.I().E(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConsent(final Bundle bundle, final long j10) {
        b();
        final v6 v6VarI = this.f19734m.I();
        v6VarI.f20269a.B().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final void run() {
                v6 v6Var = v6VarI;
                Bundle bundle2 = bundle;
                long j11 = j10;
                if (TextUtils.isEmpty(v6Var.f20269a.A().r())) {
                    v6Var.F(bundle2, 0, j11);
                } else {
                    v6Var.f20269a.b().v().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConsentThirdParty(Bundle bundle, long j10) {
        b();
        this.f19734m.I().F(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setCurrentScreen(l4.a aVar, String str, String str2, long j10) {
        b();
        this.f19734m.K().E((Activity) l4.b.L0(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setDataCollectionEnabled(boolean z10) {
        b();
        v6 v6VarI = this.f19734m.I();
        v6VarI.g();
        v6VarI.f20269a.B().y(new s6(v6VarI, z10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setDefaultEventParameters(Bundle bundle) {
        b();
        final v6 v6VarI = this.f19734m.I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        v6VarI.f20269a.B().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.w5
            @Override // java.lang.Runnable
            public final void run() {
                v6VarI.o(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setEventInterceptor(com.google.android.gms.internal.measurement.k1 k1Var) {
        b();
        x9 x9Var = new x9(this, k1Var);
        if (this.f19734m.B().C()) {
            this.f19734m.I().H(x9Var);
        } else {
            this.f19734m.B().y(new j9(this, x9Var));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.m1 m1Var) {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setMeasurementEnabled(boolean z10, long j10) {
        b();
        this.f19734m.I().I(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setMinimumSessionDuration(long j10) {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setSessionTimeoutDuration(long j10) {
        b();
        v6 v6VarI = this.f19734m.I();
        v6VarI.f20269a.B().y(new a6(v6VarI, j10));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setUserId(final String str, long j10) {
        b();
        final v6 v6VarI = this.f19734m.I();
        if (str != null && TextUtils.isEmpty(str)) {
            v6VarI.f20269a.b().u().a("User ID must be non-empty or null");
        } else {
            v6VarI.f20269a.B().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.x5
                @Override // java.lang.Runnable
                public final void run() {
                    v6 v6Var = v6VarI;
                    if (v6Var.f20269a.A().u(str)) {
                        v6Var.f20269a.A().t();
                    }
                }
            });
            v6VarI.L(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setUserProperty(String str, String str2, l4.a aVar, boolean z10, long j10) {
        b();
        this.f19734m.I().L(str, str2, l4.b.L0(aVar), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.k1 k1Var) {
        x4.u y9Var;
        b();
        synchronized (this.f19735n) {
            y9Var = (x4.u) this.f19735n.remove(Integer.valueOf(k1Var.f()));
        }
        if (y9Var == null) {
            y9Var = new y9(this, k1Var);
        }
        this.f19734m.I().N(y9Var);
    }
}
