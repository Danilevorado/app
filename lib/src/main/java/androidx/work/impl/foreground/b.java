package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import b1.j;
import d1.c;
import d1.d;
import g1.m;
import g1.v;
import g1.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class b implements c, e {

    /* renamed from: w, reason: collision with root package name */
    static final String f4166w = j.i("SystemFgDispatcher");

    /* renamed from: m, reason: collision with root package name */
    private Context f4167m;

    /* renamed from: n, reason: collision with root package name */
    private e0 f4168n;

    /* renamed from: o, reason: collision with root package name */
    private final i1.c f4169o;

    /* renamed from: p, reason: collision with root package name */
    final Object f4170p = new Object();

    /* renamed from: q, reason: collision with root package name */
    m f4171q;

    /* renamed from: r, reason: collision with root package name */
    final Map f4172r;

    /* renamed from: s, reason: collision with root package name */
    final Map f4173s;

    /* renamed from: t, reason: collision with root package name */
    final Set f4174t;

    /* renamed from: u, reason: collision with root package name */
    final d f4175u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC0069b f4176v;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f4177m;

        a(String str) {
            this.f4177m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVarH = b.this.f4168n.p().h(this.f4177m);
            if (vVarH == null || !vVarH.h()) {
                return;
            }
            synchronized (b.this.f4170p) {
                b.this.f4173s.put(y.a(vVarH), vVarH);
                b.this.f4174t.add(vVarH);
                b bVar = b.this;
                bVar.f4175u.a(bVar.f4174t);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    interface InterfaceC0069b {
        void d(int i10);

        void e(int i10, int i11, Notification notification);

        void f(int i10, Notification notification);

        void stop();
    }

    b(Context context) {
        this.f4167m = context;
        e0 e0VarN = e0.n(context);
        this.f4168n = e0VarN;
        this.f4169o = e0VarN.t();
        this.f4171q = null;
        this.f4172r = new LinkedHashMap();
        this.f4174t = new HashSet();
        this.f4173s = new HashMap();
        this.f4175u = new d1.e(this.f4168n.r(), this);
        this.f4168n.p().g(this);
    }

    public static Intent b(Context context, m mVar, b1.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent f(Context context, m mVar, b1.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        j.e().f(f4166w, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f4168n.i(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.e().a(f4166w, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f4176v == null) {
            return;
        }
        this.f4172r.put(mVar, new b1.e(intExtra, notification, intExtra2));
        if (this.f4171q == null) {
            this.f4171q = mVar;
            this.f4176v.e(intExtra, intExtra2, notification);
            return;
        }
        this.f4176v.f(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f4172r.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((b1.e) ((Map.Entry) it.next()).getValue()).a();
        }
        b1.e eVar = (b1.e) this.f4172r.get(this.f4171q);
        if (eVar != null) {
            this.f4176v.e(eVar.c(), iA, eVar.b());
        }
    }

    private void j(Intent intent) {
        j.e().f(f4166w, "Started foreground service " + intent);
        this.f4169o.c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // d1.c
    public void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            String str = vVar.f23739a;
            j.e().a(f4166w, "Constraints unmet for WorkSpec " + str);
            this.f4168n.A(y.a(vVar));
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f4170p) {
            v vVar = (v) this.f4173s.remove(mVar);
            if (vVar != null ? this.f4174t.remove(vVar) : false) {
                this.f4175u.a(this.f4174t);
            }
        }
        b1.e eVar = (b1.e) this.f4172r.remove(mVar);
        if (mVar.equals(this.f4171q) && this.f4172r.size() > 0) {
            Iterator it = this.f4172r.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f4171q = (m) entry.getKey();
            if (this.f4176v != null) {
                b1.e eVar2 = (b1.e) entry.getValue();
                this.f4176v.e(eVar2.c(), eVar2.a(), eVar2.b());
                this.f4176v.d(eVar2.c());
            }
        }
        InterfaceC0069b interfaceC0069b = this.f4176v;
        if (eVar == null || interfaceC0069b == null) {
            return;
        }
        j.e().a(f4166w, "Removing Notification (id: " + eVar.c() + ", workSpecId: " + mVar + ", notificationType: " + eVar.a());
        interfaceC0069b.d(eVar.c());
    }

    @Override // d1.c
    public void e(List list) {
    }

    void k(Intent intent) {
        j.e().f(f4166w, "Stopping foreground service");
        InterfaceC0069b interfaceC0069b = this.f4176v;
        if (interfaceC0069b != null) {
            interfaceC0069b.stop();
        }
    }

    void l() {
        this.f4176v = null;
        synchronized (this.f4170p) {
            this.f4175u.d();
        }
        this.f4168n.p().n(this);
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                h(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    k(intent);
                    return;
                }
                return;
            }
        }
        i(intent);
    }

    void n(InterfaceC0069b interfaceC0069b) {
        if (this.f4176v != null) {
            j.e().c(f4166w, "A callback already exists.");
        } else {
            this.f4176v = interfaceC0069b;
        }
    }
}
