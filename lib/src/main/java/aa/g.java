package aa;

import a9.j;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import c9.b;
import ga.b;
import n7.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class g extends d {

    private static class b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final ga.b f262a;

        b(ga.b bVar) {
            this.f262a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            g.i(this.f262a);
            return null;
        }
    }

    private static class c extends AsyncTask {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            ga.b bVarA = ka.e.h().a();
            if (bVarA == null) {
                return null;
            }
            g.i(bVarA);
            return null;
        }
    }

    g() {
        a9.i.f(b.c.class, new j() { // from class: aa.f
            @Override // a9.j
            public final void a(a9.g gVar) {
                g.d((b.c) gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(b.c cVar) {
        new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void f(String str) {
        if (y7.b.c() != null) {
            y7.b.c().g(str);
            l.i().t().y();
        }
    }

    private void g(String str, String str2, boolean z10) {
        ga.b bVarF = new b.C0137b().c(str).g(str2).e(z10).f();
        if (bVarF == null) {
            return;
        }
        new b(bVarF).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private boolean h(w9.d dVar) {
        if (dVar != null && !TextUtils.isEmpty(dVar.c()) && dVar.u()) {
            try {
                return new JSONObject(dVar.c()).getBoolean("pw_force_show_rm");
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(ga.b bVar) {
        ma.g gVarK = l.i().k();
        if (gVarK != null) {
            gVarK.k(bVar);
        }
    }

    @Override // aa.d, aa.b
    public void a(w9.d dVar) {
        Bundle bundleV = dVar.v();
        String strE = g8.e.E(bundleV);
        ka.h hVarD = ka.e.d();
        if (strE != null) {
            f(strE);
            if (g8.e.d(bundleV)) {
                hVarD.m().b(g8.e.C(bundleV));
            }
        }
        super.a(dVar);
    }

    @Override // aa.d
    protected void b(w9.d dVar) {
        boolean z10;
        String strE = g8.e.E(dVar.v());
        String strO = dVar.o();
        if (dVar.t()) {
            if (!k9.e.a()) {
                ka.e.c().g(dVar);
                return;
            }
            z10 = true;
        } else {
            if (!h(dVar)) {
                return;
            }
            if (!c9.a.p()) {
                ka.e.h().g(dVar);
                return;
            }
            z10 = false;
        }
        g(strE, strO, z10);
    }
}
