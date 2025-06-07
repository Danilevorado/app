package h1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class w implements b1.f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f24038d = b1.j.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final i1.c f24039a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f24040b;

    /* renamed from: c, reason: collision with root package name */
    final g1.w f24041c;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f24042m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ UUID f24043n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ b1.e f24044o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f24045p;

        a(androidx.work.impl.utils.futures.d dVar, UUID uuid, b1.e eVar, Context context) {
            this.f24042m = dVar;
            this.f24043n = uuid;
            this.f24044o = eVar;
            this.f24045p = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f24042m.isCancelled()) {
                    String string = this.f24043n.toString();
                    g1.v vVarL = w.this.f24041c.l(string);
                    if (vVarL == null || vVarL.f23740b.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    w.this.f24040b.b(string, this.f24044o);
                    this.f24045p.startService(androidx.work.impl.foreground.b.b(this.f24045p, g1.y.a(vVarL), this.f24044o));
                }
                this.f24042m.q(null);
            } catch (Throwable th) {
                this.f24042m.r(th);
            }
        }
    }

    public w(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, i1.c cVar) {
        this.f24040b = aVar;
        this.f24039a = cVar;
        this.f24041c = workDatabase.J();
    }

    @Override // b1.f
    public u5.a a(Context context, UUID uuid, b1.e eVar) {
        androidx.work.impl.utils.futures.d dVarU = androidx.work.impl.utils.futures.d.u();
        this.f24039a.c(new a(dVarU, uuid, eVar, context));
        return dVarU;
    }
}
