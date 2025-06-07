package n8;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.b;
import b1.l;
import com.pushwoosh.firebase.internal.registrar.FcmRegistrarWorker;
import k9.h;
import ka.d;
import ka.e;
import n7.m;

/* loaded from: classes2.dex */
public class a implements i9.a {

    /* renamed from: a, reason: collision with root package name */
    private b f25616a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f25617a;

        /* renamed from: b, reason: collision with root package name */
        private final d f25618b;

        private b() {
            this.f25617a = c9.a.b();
            this.f25618b = e.f();
        }

        static void b(Context context) throws PackageManager.NameNotFoundException {
            try {
                context.getPackageManager().getPermissionInfo("com.google.android.c2dm.permission.RECEIVE", 4096);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new IllegalStateException("Application does not define permission com.google.android.c2dm.permission.RECEIVE");
            }
        }

        void a() throws Throwable {
            m.b((l) ((l.a) ((l.a) new l.a(FcmRegistrarWorker.class).m(new b.a().e("DATA_UNREGISTER", true).a())).j(m.c())).b(), "FcmRegistrarWorker", b1.d.REPLACE);
        }

        void c(String str) throws PackageManager.NameNotFoundException {
            String strA = this.f25618b.r().a();
            g9.a.c(str, "mAppId");
            g9.a.c(strA, "mSenderId");
            Context context = this.f25617a;
            if (context == null) {
                h.k("Incorrect state of app. Context is null");
            } else {
                b(context);
            }
        }

        void d(sa.b bVar) {
            m.b((l) ((l.a) ((l.a) new l.a(FcmRegistrarWorker.class).m(new b.a().e("DATA_REGISTER", true).h("DATA_TAGS", bVar != null ? bVar.b().toString() : null).a())).j(m.c())).b(), "FcmRegistrarWorker", b1.d.REPLACE);
        }
    }

    @Override // i9.a
    public void a() {
        new m8.a().a();
        this.f25616a = new b();
    }

    @Override // i9.a
    public void b(sa.b bVar) {
        this.f25616a.d(bVar);
    }

    @Override // i9.a
    public void c(String str) throws PackageManager.NameNotFoundException {
        this.f25616a.c(str);
    }

    @Override // i9.a
    public void d() throws Throwable {
        this.f25616a.a();
    }
}
