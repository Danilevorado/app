package g2;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.v;
import com.bumptech.glide.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p implements Handler.Callback {

    /* renamed from: v, reason: collision with root package name */
    private static final b f23802v = new a();

    /* renamed from: m, reason: collision with root package name */
    private volatile com.bumptech.glide.k f23803m;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f23806p;

    /* renamed from: q, reason: collision with root package name */
    private final b f23807q;

    /* renamed from: u, reason: collision with root package name */
    private final k f23811u;

    /* renamed from: n, reason: collision with root package name */
    final Map f23804n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    final Map f23805o = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    private final q.a f23808r = new q.a();

    /* renamed from: s, reason: collision with root package name */
    private final q.a f23809s = new q.a();

    /* renamed from: t, reason: collision with root package name */
    private final Bundle f23810t = new Bundle();

    class a implements b {
        a() {
        }

        @Override // g2.p.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, q qVar, Context context) {
            return new com.bumptech.glide.k(bVar, lVar, qVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, q qVar, Context context);
    }

    public p(b bVar, com.bumptech.glide.e eVar) {
        this.f23807q = bVar == null ? f23802v : bVar;
        this.f23806p = new Handler(Looper.getMainLooper(), this);
        this.f23811u = b(eVar);
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static k b(com.bumptech.glide.e eVar) {
        return (a2.r.f63h && a2.r.f62g) ? eVar.a(c.e.class) ? new i() : new j() : new g();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.k d(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z10) {
        o oVarJ = j(fragmentManager, fragment);
        com.bumptech.glide.k kVarE = oVarJ.e();
        if (kVarE == null) {
            kVarE = this.f23807q.a(com.bumptech.glide.b.c(context), oVarJ.c(), oVarJ.f(), context);
            if (z10) {
                kVarE.onStart();
            }
            oVarJ.k(kVarE);
        }
        return kVarE;
    }

    private com.bumptech.glide.k h(Context context) {
        if (this.f23803m == null) {
            synchronized (this) {
                if (this.f23803m == null) {
                    this.f23803m = this.f23807q.a(com.bumptech.glide.b.c(context.getApplicationContext()), new g2.b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f23803m;
    }

    private o j(FragmentManager fragmentManager, Fragment fragment) {
        o oVar = (o) this.f23804n.get(fragmentManager);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar2 == null) {
            oVar2 = new o();
            oVar2.j(fragment);
            this.f23804n.put(fragmentManager, oVar2);
            fragmentManager.beginTransaction().add(oVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f23806p.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return oVar2;
    }

    private t l(androidx.fragment.app.m mVar, androidx.fragment.app.Fragment fragment) {
        t tVar = (t) this.f23805o.get(mVar);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = (t) mVar.i0("com.bumptech.glide.manager");
        if (tVar2 == null) {
            tVar2 = new t();
            tVar2.V1(fragment);
            this.f23805o.put(mVar, tVar2);
            mVar.l().d(tVar2, "com.bumptech.glide.manager").g();
            this.f23806p.obtainMessage(2, mVar).sendToTarget();
        }
        return tVar2;
    }

    private static boolean m(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    private com.bumptech.glide.k n(Context context, androidx.fragment.app.m mVar, androidx.fragment.app.Fragment fragment, boolean z10) {
        t tVarL = l(mVar, fragment);
        com.bumptech.glide.k kVarP1 = tVarL.P1();
        if (kVarP1 == null) {
            kVarP1 = this.f23807q.a(com.bumptech.glide.b.c(context), tVarL.N1(), tVarL.Q1(), context);
            if (z10) {
                kVarP1.onStart();
            }
            tVarL.W1(kVarP1);
        }
        return kVarP1;
    }

    private boolean o(FragmentManager fragmentManager, boolean z10) {
        o oVar = (o) this.f23804n.get(fragmentManager);
        o oVar2 = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar2 == oVar) {
            return true;
        }
        if (oVar2 != null && oVar2.e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + oVar2 + " New: " + oVar);
        }
        if (z10 || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", fragmentManager.isDestroyed() ? "Parent was destroyed before our Fragment could be added" : "Tried adding Fragment twice and failed twice, giving up!");
            }
            oVar.c().c();
            return true;
        }
        FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(oVar, "com.bumptech.glide.manager");
        if (oVar2 != null) {
            fragmentTransactionAdd.remove(oVar2);
        }
        fragmentTransactionAdd.commitAllowingStateLoss();
        this.f23806p.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
        if (Log.isLoggable("RMRetriever", 3)) {
            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    private boolean p(androidx.fragment.app.m mVar, boolean z10) {
        t tVar = (t) this.f23805o.get(mVar);
        t tVar2 = (t) mVar.i0("com.bumptech.glide.manager");
        if (tVar2 == tVar) {
            return true;
        }
        if (tVar2 != null && tVar2.P1() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + tVar2 + " New: " + tVar);
        }
        if (z10 || mVar.E0()) {
            if (mVar.E0()) {
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            tVar.N1().c();
            return true;
        }
        v vVarD = mVar.l().d(tVar, "com.bumptech.glide.manager");
        if (tVar2 != null) {
            vVarD.l(tVar2);
        }
        vVarD.i();
        this.f23806p.obtainMessage(2, 1, 0, mVar).sendToTarget();
        if (Log.isLoggable("RMRetriever", 3)) {
            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    public com.bumptech.glide.k e(Activity activity) {
        if (n2.l.p()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.e) {
            return g((androidx.fragment.app.e) activity);
        }
        a(activity);
        this.f23811u.a(activity);
        return d(activity, activity.getFragmentManager(), null, m(activity));
    }

    public com.bumptech.glide.k f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (n2.l.q() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.e) {
                return g((androidx.fragment.app.e) context);
            }
            if (context instanceof Activity) {
                return e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        return h(context);
    }

    public com.bumptech.glide.k g(androidx.fragment.app.e eVar) {
        if (n2.l.p()) {
            return f(eVar.getApplicationContext());
        }
        a(eVar);
        this.f23811u.a(eVar);
        return n(eVar, eVar.H(), null, m(eVar));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        FragmentManager fragmentManager;
        Map map;
        FragmentManager fragmentManager2;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = message.arg1 == 1;
        int i10 = message.what;
        Object objRemove = null;
        if (i10 != 1) {
            if (i10 != 2) {
                z11 = false;
            } else {
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) message.obj;
                if (p(mVar, z12)) {
                    map = this.f23805o;
                    fragmentManager = mVar;
                    objRemove = map.remove(fragmentManager);
                    z10 = true;
                    fragmentManager2 = fragmentManager;
                }
            }
            fragmentManager2 = null;
        } else {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            if (o(fragmentManager3, z12)) {
                map = this.f23804n;
                fragmentManager = fragmentManager3;
                objRemove = map.remove(fragmentManager);
                z10 = true;
                fragmentManager2 = fragmentManager;
            }
            fragmentManager2 = null;
        }
        if (Log.isLoggable("RMRetriever", 5) && z10 && objRemove == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + fragmentManager2);
        }
        return z11;
    }

    o i(Activity activity) {
        return j(activity.getFragmentManager(), null);
    }

    t k(androidx.fragment.app.m mVar) {
        return l(mVar, null);
    }
}
