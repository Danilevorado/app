package h1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class x implements b1.o {

    /* renamed from: c, reason: collision with root package name */
    static final String f24047c = b1.j.i("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f24048a;

    /* renamed from: b, reason: collision with root package name */
    final i1.c f24049b;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ UUID f24050m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f24051n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f24052o;

        a(UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.d dVar) {
            this.f24050m = uuid;
            this.f24051n = bVar;
            this.f24052o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.v vVarL;
            String string = this.f24050m.toString();
            b1.j jVarE = b1.j.e();
            String str = x.f24047c;
            jVarE.a(str, "Updating progress for " + this.f24050m + " (" + this.f24051n + ")");
            x.this.f24048a.e();
            try {
                vVarL = x.this.f24048a.J().l(string);
            } finally {
                try {
                } finally {
                }
            }
            if (vVarL == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (vVarL.f23740b == b1.t.RUNNING) {
                x.this.f24048a.I().b(new g1.q(string, this.f24051n));
            } else {
                b1.j.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            this.f24052o.q(null);
            x.this.f24048a.B();
        }
    }

    public x(WorkDatabase workDatabase, i1.c cVar) {
        this.f24048a = workDatabase;
        this.f24049b = cVar;
    }

    @Override // b1.o
    public u5.a a(Context context, UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.d dVarU = androidx.work.impl.utils.futures.d.u();
        this.f24049b.c(new a(uuid, bVar, dVarU));
        return dVarU;
    }
}
