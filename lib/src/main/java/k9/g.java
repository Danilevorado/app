package k9;

import android.os.AsyncTask;
import android.os.Bundle;
import androidx.work.b;
import b1.l;
import com.pushwoosh.HandleMessageWorker;
import java.util.concurrent.TimeUnit;
import n7.m;

/* loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a();
    }

    private static class b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f24868a;

        /* renamed from: b, reason: collision with root package name */
        final a f24869b;

        public b(Bundle bundle, a aVar) {
            this.f24868a = bundle;
            this.f24869b = aVar;
        }

        private void b(long j10) throws Throwable {
            m.b((l) ((l.a) ((l.a) ((l.a) new l.a(HandleMessageWorker.class).m(new b.a().g("data_push_bundle_id", j10).a())).j(m.c())).i(b1.a.LINEAR, 5L, TimeUnit.SECONDS)).b(), "HandleMessageWorker", b1.d.APPEND);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) throws Throwable {
            n9.j jVarE = ka.e.e();
            if (jVarE != null) {
                try {
                    b(jVarE.s(this.f24868a));
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            a aVar;
            super.onPostExecute(bool);
            if (bool.booleanValue() || (aVar = this.f24869b) == null) {
                return;
            }
            aVar.a();
        }
    }

    private static void b(final Bundle bundle) {
        new b(bundle, new a() { // from class: k9.f
            @Override // k9.g.a
            public final void a() {
                g.e(bundle);
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static void d(Bundle bundle) {
        if (ka.e.d() != null && ka.e.d().d().a()) {
            b(bundle);
        } else {
            e(bundle);
        }
    }

    public static void e(Bundle bundle) {
        try {
            n7.l.i().n().b(bundle);
        } catch (Exception e5) {
            h.o(e5);
        }
    }

    public static boolean f() {
        return ka.e.f().l().a();
    }

    public static void g(String str) {
        n7.l.i().q().o(str);
    }

    public static void h(String str) {
        n7.l.i().q().p(str);
    }

    public static void i(String str, String str2) {
        if (f()) {
            n7.l.i().q().c(str, str2);
        }
    }

    public static void j(String str) {
        n7.l.i().q().q(str);
    }
}
