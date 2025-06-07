package z4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import e4.c;
import e4.k0;
import e4.p;

/* loaded from: classes.dex */
public class a extends e4.h implements y4.e {
    public static final /* synthetic */ int M = 0;
    private final boolean I;
    private final e4.e J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z10, e4.e eVar, Bundle bundle, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.I = true;
        this.J = eVar;
        this.K = bundle;
        this.L = eVar.g();
    }

    public static Bundle p0(e4.e eVar) {
        eVar.f();
        Integer numG = eVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // e4.c
    protected final Bundle E() {
        if (!C().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // y4.e
    public final void e(e4.j jVar, boolean z10) {
        try {
            ((g) H()).w3(jVar, ((Integer) p.l(this.L)).intValue(), z10);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // e4.c
    public final int h() {
        return 12451000;
    }

    @Override // y4.e
    public final void m(f fVar) {
        p.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.J.b();
            ((g) H()).x4(new j(1, new k0(accountB, ((Integer) p.l(this.L)).intValue(), "<<default account>>".equals(accountB.name) ? y3.a.a(C()).b() : null)), fVar);
        } catch (RemoteException e5) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.N3(new l(1, new b4.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e5);
            }
        }
    }

    @Override // y4.e
    public final void n() {
        try {
            ((g) H()).p1(((Integer) p.l(this.L)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // e4.c, com.google.android.gms.common.api.a.f
    public final boolean s() {
        return this.I;
    }

    @Override // y4.e
    public final void t() {
        j(new c.d());
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }
}
