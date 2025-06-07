package d4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class c0 extends z4.d implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: t, reason: collision with root package name */
    private static final a.AbstractC0091a f22895t = y4.d.f28548c;

    /* renamed from: m, reason: collision with root package name */
    private final Context f22896m;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f22897n;

    /* renamed from: o, reason: collision with root package name */
    private final a.AbstractC0091a f22898o;

    /* renamed from: p, reason: collision with root package name */
    private final Set f22899p;

    /* renamed from: q, reason: collision with root package name */
    private final e4.e f22900q;

    /* renamed from: r, reason: collision with root package name */
    private y4.e f22901r;

    /* renamed from: s, reason: collision with root package name */
    private b0 f22902s;

    public c0(Context context, Handler handler, e4.e eVar) {
        a.AbstractC0091a abstractC0091a = f22895t;
        this.f22896m = context;
        this.f22897n = handler;
        this.f22900q = (e4.e) e4.p.m(eVar, "ClientSettings must not be null");
        this.f22899p = eVar.e();
        this.f22898o = abstractC0091a;
    }

    static /* bridge */ /* synthetic */ void K5(c0 c0Var, z4.l lVar) {
        b4.b bVarF = lVar.f();
        if (bVarF.y()) {
            e4.m0 m0Var = (e4.m0) e4.p.l(lVar.h());
            bVarF = m0Var.f();
            if (bVarF.y()) {
                c0Var.f22902s.c(m0Var.h(), c0Var.f22899p);
            } else {
                String strValueOf = String.valueOf(bVarF);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                c0Var.f22902s.b(bVarF);
            }
        } else {
            c0Var.f22902s.b(bVarF);
        }
        c0Var.f22901r.q();
    }

    @Override // d4.d
    public final void C(int i10) {
        this.f22902s.d(i10);
    }

    @Override // d4.d
    public final void L0(Bundle bundle) {
        this.f22901r.m(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, y4.e] */
    public final void L5(b0 b0Var) {
        y4.e eVar = this.f22901r;
        if (eVar != null) {
            eVar.q();
        }
        this.f22900q.j(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0091a abstractC0091a = this.f22898o;
        Context context = this.f22896m;
        Handler handler = this.f22897n;
        e4.e eVar2 = this.f22900q;
        this.f22901r = abstractC0091a.c(context, handler.getLooper(), eVar2, eVar2.f(), this, this);
        this.f22902s = b0Var;
        Set set = this.f22899p;
        if (set == null || set.isEmpty()) {
            this.f22897n.post(new z(this));
        } else {
            this.f22901r.t();
        }
    }

    public final void M5() {
        y4.e eVar = this.f22901r;
        if (eVar != null) {
            eVar.q();
        }
    }

    @Override // z4.f
    public final void N3(z4.l lVar) {
        this.f22897n.post(new a0(this, lVar));
    }

    @Override // d4.g
    public final void w0(b4.b bVar) {
        this.f22902s.b(bVar);
    }
}
