package r7;

import a9.i;
import a9.j;
import android.app.Application;
import c9.b;
import java.util.Iterator;
import java.util.List;
import n7.l;
import r7.b;
import sa.b;

/* loaded from: classes.dex */
public class g {

    /* renamed from: e, reason: collision with root package name */
    private static volatile Application.ActivityLifecycleCallbacks f26662e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f26663f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f26664a = false;

    /* renamed from: b, reason: collision with root package name */
    private j f26665b = new j() { // from class: r7.d
        @Override // a9.j
        public final void a(a9.g gVar) {
            this.f26657a.h((b.d) gVar);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private j f26666c = new j() { // from class: r7.c
        @Override // a9.j
        public final void a(a9.g gVar) {
            this.f26656a.g((a9.b) gVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private j f26667d;

    static sa.b e(String str, String str2) {
        b.a aVar = new b.a();
        aVar.f("device_type", j9.b.d().c());
        aVar.g("application_version", c9.a.a().f());
        if (str.equals("PW_ScreenOpen")) {
            aVar.g("screen_name", str2);
        }
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(a9.b bVar) {
        i.g(a9.b.class, this.f26666c);
        this.f26664a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(b.d dVar) {
        i.g(b.d.class, this.f26665b);
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, sa.b bVar, a9.b bVar2) {
        i.g(a9.b.class, this.f26667d);
        m(str, bVar);
    }

    private void k() {
        synchronized (f26663f) {
            if (f26662e == null) {
                Application application = (Application) c9.a.b();
                if (application == null) {
                    i.f(b.d.class, this.f26665b);
                } else {
                    f26662e = new b(new b.c() { // from class: r7.f
                        @Override // r7.b.c
                        public final void b(String str, String str2) {
                            this.f26661a.l(str, str2);
                        }
                    });
                    application.registerActivityLifecycleCallbacks(f26662e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(String str, String str2) {
        String str3;
        str.hashCode();
        switch (str) {
            case "ScreenOpened":
                str3 = "PW_ScreenOpen";
                break;
            case "ApplicationClosed":
                str3 = "PW_ApplicationMinimized";
                break;
            case "ApplicationOpened":
                str3 = "PW_ApplicationOpen";
                break;
            default:
                return;
        }
        i(str3, e(str3, str2));
    }

    private void m(String str, sa.b bVar) {
        List listS = l.i().t().s();
        if (listS != null) {
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                if (((p9.c) it.next()).a().equals(str)) {
                    v8.a.a().b(str, bVar);
                    return;
                }
            }
        }
    }

    public void f() {
        i.f(a9.b.class, this.f26666c);
        k();
    }

    void i(final String str, final sa.b bVar) {
        if (this.f26664a) {
            m(str, bVar);
            return;
        }
        j jVar = new j() { // from class: r7.e
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f26658a.j(str, bVar, (a9.b) gVar);
            }
        };
        this.f26667d = jVar;
        i.f(a9.b.class, jVar);
    }
}
