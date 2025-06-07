package v5;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import e4.p;
import i4.m;
import i4.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x5.n;
import x5.w;

/* loaded from: classes.dex */
public class d {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f27866k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Executor f27867l = new ExecutorC0198d();

    /* renamed from: m, reason: collision with root package name */
    static final Map f27868m = new q.a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f27869a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27870b;

    /* renamed from: c, reason: collision with root package name */
    private final j f27871c;

    /* renamed from: d, reason: collision with root package name */
    private final n f27872d;

    /* renamed from: g, reason: collision with root package name */
    private final w f27875g;

    /* renamed from: h, reason: collision with root package name */
    private final h6.b f27876h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f27873e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f27874f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f27877i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f27878j = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z10);
    }

    private static class c implements a.InterfaceC0094a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f27879a = new AtomicReference();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f27879a.get() == null) {
                    c cVar = new c();
                    if (f27879a.compareAndSet(null, cVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0094a
        public void a(boolean z10) {
            synchronized (d.f27866k) {
                Iterator it = new ArrayList(d.f27868m.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f27873e.get()) {
                        dVar.v(z10);
                    }
                }
            }
        }
    }

    /* renamed from: v5.d$d, reason: collision with other inner class name */
    private static class ExecutorC0198d implements Executor {

        /* renamed from: m, reason: collision with root package name */
        private static final Handler f27880m = new Handler(Looper.getMainLooper());

        private ExecutorC0198d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f27880m.post(runnable);
        }
    }

    private static class e extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f27881b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f27882a;

        public e(Context context) {
            this.f27882a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f27881b.get() == null) {
                e eVar = new e(context);
                if (f27881b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f27882a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (d.f27866k) {
                Iterator it = d.f27868m.values().iterator();
                while (it.hasNext()) {
                    ((d) it.next()).o();
                }
            }
            c();
        }
    }

    protected d(final Context context, String str, j jVar) {
        this.f27869a = (Context) p.l(context);
        this.f27870b = p.f(str);
        this.f27871c = (j) p.l(jVar);
        n nVarE = n.h(f27867l).d(x5.g.c(context, ComponentDiscoveryService.class).b()).c(new FirebaseCommonRegistrar()).b(x5.d.p(context, Context.class, new Class[0])).b(x5.d.p(this, d.class, new Class[0])).b(x5.d.p(jVar, j.class, new Class[0])).e();
        this.f27872d = nVarE;
        this.f27875g = new w(new h6.b() { // from class: v5.b
            @Override // h6.b
            public final Object get() {
                return this.f27863a.s(context);
            }
        });
        this.f27876h = nVarE.c(f6.g.class);
        g(new b() { // from class: v5.c
            @Override // v5.d.b
            public final void a(boolean z10) {
                this.f27865a.t(z10);
            }
        });
    }

    private void h() {
        p.p(!this.f27874f.get(), "FirebaseApp was deleted");
    }

    public static d k() {
        d dVar;
        synchronized (f27866k) {
            dVar = (d) f27868m.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!androidx.core.os.n.a(this.f27869a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            e.b(this.f27869a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f27872d.k(r());
        ((f6.g) this.f27876h.get()).n();
    }

    public static d p(Context context, j jVar, String str) {
        d dVar;
        c.c(context);
        String strU = u(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f27866k) {
            Map map = f27868m;
            p.p(!map.containsKey(strU), "FirebaseApp name " + strU + " already exists!");
            p.m(context, "Application context cannot be null.");
            dVar = new d(context, strU, jVar);
            map.put(strU, dVar);
        }
        dVar.o();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n6.a s(Context context) {
        return new n6.a(context, n(), (e6.c) this.f27872d.a(e6.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(boolean z10) {
        if (z10) {
            return;
        }
        ((f6.g) this.f27876h.get()).n();
    }

    private static String u(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f27877i.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f27870b.equals(((d) obj).l());
        }
        return false;
    }

    public void g(b bVar) {
        h();
        if (this.f27873e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            bVar.a(true);
        }
        this.f27877i.add(bVar);
    }

    public int hashCode() {
        return this.f27870b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.f27872d.a(cls);
    }

    public Context j() {
        h();
        return this.f27869a;
    }

    public String l() {
        h();
        return this.f27870b;
    }

    public j m() {
        h();
        return this.f27871c;
    }

    public String n() {
        return i4.c.b(l().getBytes(Charset.defaultCharset())) + "+" + i4.c.b(m().b().getBytes(Charset.defaultCharset()));
    }

    public boolean q() {
        h();
        return ((n6.a) this.f27875g.get()).b();
    }

    public boolean r() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return e4.o.c(this).a("name", this.f27870b).a("options", this.f27871c).toString();
    }
}
