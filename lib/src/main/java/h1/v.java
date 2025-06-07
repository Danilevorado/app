package h1;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class v implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    static final String f24029s = b1.j.i("WorkForegroundRunnable");

    /* renamed from: m, reason: collision with root package name */
    final androidx.work.impl.utils.futures.d f24030m = androidx.work.impl.utils.futures.d.u();

    /* renamed from: n, reason: collision with root package name */
    final Context f24031n;

    /* renamed from: o, reason: collision with root package name */
    final g1.v f24032o;

    /* renamed from: p, reason: collision with root package name */
    final androidx.work.c f24033p;

    /* renamed from: q, reason: collision with root package name */
    final b1.f f24034q;

    /* renamed from: r, reason: collision with root package name */
    final i1.c f24035r;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f24036m;

        a(androidx.work.impl.utils.futures.d dVar) {
            this.f24036m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.this.f24030m.isCancelled()) {
                return;
            }
            try {
                b1.e eVar = (b1.e) this.f24036m.get();
                if (eVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + v.this.f24032o.f23741c + ") but did not provide ForegroundInfo");
                }
                b1.j.e().a(v.f24029s, "Updating notification for " + v.this.f24032o.f23741c);
                v vVar = v.this;
                vVar.f24030m.s(vVar.f24034q.a(vVar.f24031n, vVar.f24033p.getId(), eVar));
            } catch (Throwable th) {
                v.this.f24030m.r(th);
            }
        }
    }

    public v(Context context, g1.v vVar, androidx.work.c cVar, b1.f fVar, i1.c cVar2) {
        this.f24031n = context;
        this.f24032o = vVar;
        this.f24033p = cVar;
        this.f24034q = fVar;
        this.f24035r = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(androidx.work.impl.utils.futures.d dVar) {
        if (this.f24030m.isCancelled()) {
            dVar.cancel(true);
        } else {
            dVar.s(this.f24033p.getForegroundInfoAsync());
        }
    }

    public u5.a b() {
        return this.f24030m;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f24032o.f23755q || Build.VERSION.SDK_INT >= 31) {
            this.f24030m.q(null);
            return;
        }
        final androidx.work.impl.utils.futures.d dVarU = androidx.work.impl.utils.futures.d.u();
        this.f24035r.a().execute(new Runnable() { // from class: h1.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f24027m.c(dVarU);
            }
        });
        dVarU.d(new a(dVarU), this.f24035r.a());
    }
}
