package w9;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import b1.l;
import com.pushwoosh.internal.utils.NotificationPermissionActivity;
import com.pushwoosh.notification.RescheduleNotificationsWorker;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private i9.a f28058b;

    /* renamed from: c, reason: collision with root package name */
    private d f28059c;

    /* renamed from: d, reason: collision with root package name */
    private z7.d f28060d;

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f28061e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f28062f = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final ka.d f28057a = ka.e.f();

    class a implements a9.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o8.a f28063a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ sa.b f28064b;

        a(o8.a aVar, sa.b bVar) {
            this.f28063a = aVar;
            this.f28064b = bVar;
        }

        @Override // a9.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a9.l lVar) {
            f.this.i(this.f28063a, Build.VERSION.SDK_INT >= 33 ? lVar.a().contains("android.permission.POST_NOTIFICATIONS") : true, this.f28064b);
        }
    }

    public static class b implements a9.g {
        b() {
        }
    }

    private static class c extends AsyncTask {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            ka.e.g().f();
            return null;
        }
    }

    public f(i9.a aVar, z7.d dVar) {
        this.f28060d = dVar;
        this.f28058b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(o8.a aVar, boolean z10, sa.b bVar) {
        try {
            if (!this.f28057a.d().a()) {
                k9.h.h("NotificationManager", "Communication with Pushwoosh is disabled");
                return;
            }
            this.f28057a.l().b(true);
            g8.i.c(aVar, true);
            this.f28058b.c(this.f28057a.a().a());
            String strA = this.f28057a.t().a();
            long jA = this.f28057a.o().a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!TextUtils.isEmpty(strA) && jCurrentTimeMillis - jA <= 5184000000L) {
                a9.i.e(new y9.d(new n7.o(strA, z10)));
                return;
            }
            this.f28058b.b(bVar);
        } catch (Exception e5) {
            k9.h.o(e5);
            a9.i.e(new y9.c(e5.getMessage()));
        }
    }

    public static void m() {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        k9.j.a(NotificationPermissionActivity.class, c9.a.b(), new String[]{"android.permission.POST_NOTIFICATIONS"});
    }

    public void a(i9.a aVar) {
        if (aVar != null) {
            this.f28058b = aVar;
            k();
        }
    }

    public void b(String str) {
        b9.e eVarA;
        k9.h.s("NotificationManager", "App ID: " + str);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Application id is empty");
        }
        String strA = this.f28057a.a().a();
        boolean z10 = false;
        if (!strA.equals(str)) {
            this.f28062f.set(false);
            if (this.f28057a.u().a()) {
                k9.h.s("NotificationManager", "App id changed unregister form previous application");
                n9.e.h(this.f28057a.t().a(), this.f28057a.b().a());
            }
            n7.l.i().u();
            new c(null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            this.f28057a.w();
            this.f28057a.g().b(this.f28057a.l().a());
            a9.i.e(new a9.a(str, strA));
            z10 = true;
        }
        this.f28057a.y(str);
        if (z10 && (eVarA = b9.b.a()) != null) {
            eVarA.a(this.f28057a.b().a());
        }
        if (this.f28062f.get()) {
            return;
        }
        a9.i.e(new b());
        this.f28062f.set(true);
    }

    public void c(String str, String str2) {
        ka.e.f().t().b(str);
        n9.e.d(str, str2);
    }

    public void d(o8.a aVar) {
        q.d(aVar);
        this.f28057a.l().b(false);
        this.f28058b.d();
    }

    public void e(o8.a aVar, boolean z10, sa.b bVar) {
        a9.i.f(a9.l.class, new a(aVar, bVar));
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                if (androidx.core.content.a.a(c9.a.b(), "android.permission.POST_NOTIFICATIONS") != 0) {
                    if (ka.e.f().j().a() || !z10) {
                        i(aVar, false, bVar);
                        return;
                    } else {
                        m();
                        return;
                    }
                }
                ka.e.f().j().b(false);
            }
            i(aVar, true, bVar);
        } catch (Exception e5) {
            k9.h.o(e5);
            a9.i.e(new y9.c(e5.getMessage()));
        }
    }

    public void f(d dVar) {
        this.f28059c = dVar;
    }

    public void h(String str) {
        k9.h.s("NotificationManager", "Sender ID: " + str);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Sender id is empty");
        }
        String strA = this.f28057a.r().a();
        boolean z10 = false;
        if (!TextUtils.equals(strA, str) && !TextUtils.isEmpty(strA)) {
            k9.h.s("NotificationManager", "Sender ID changed, clearing token");
            z10 = !this.f28057a.t().a().isEmpty();
            this.f28057a.x();
        }
        this.f28057a.r().b(str);
        if (z10) {
            this.f28058b.b(null);
        }
    }

    public String j() {
        String strA = this.f28057a.t().a();
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA;
    }

    public void k() {
        this.f28058b.a();
    }

    public void l() {
        aa.a.c();
        z9.a.c();
        ba.a.c();
        String strA = TextUtils.isEmpty(this.f28060d.m()) ? this.f28057a.a().a() : this.f28060d.m();
        String strH = j9.b.d().h();
        if (!TextUtils.isEmpty(strH)) {
            h(strH);
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        b(strA);
    }

    public void n() {
        if (this.f28061e.get()) {
            k9.h.x("NotificationManager", "Local pushes already rescheduled");
        } else {
            n7.m.b((b1.l) new l.a(RescheduleNotificationsWorker.class).b(), "RescheduleNotificationsWorker", b1.d.KEEP);
            this.f28061e.set(true);
        }
    }

    public void o(String str) {
        a9.i.e(new y9.c(str));
    }

    public void p(String str) {
        a9.i.e(new y9.a(str));
    }

    public void q(String str) {
        this.f28057a.c();
        n9.e.c(str);
    }
}
