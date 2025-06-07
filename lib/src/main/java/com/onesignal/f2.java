package com.onesignal;

import com.onesignal.e3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
class f2 {

    /* renamed from: a, reason: collision with root package name */
    private Set f22006a;

    /* renamed from: b, reason: collision with root package name */
    private final j7.c f22007b;

    /* renamed from: c, reason: collision with root package name */
    private final m2 f22008c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            f2.this.f22007b.b().a("notification", "notification_id");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            Iterator it = f2.this.f22007b.b().f().iterator();
            while (it.hasNext()) {
                f2.this.p((k7.b) it.next());
            }
        }
    }

    class c implements h3 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k7.b f22011a;

        c(k7.b bVar) {
            this.f22011a = bVar;
        }

        @Override // com.onesignal.h3
        public void a(String str) {
            f2.this.f22007b.b().d(this.f22011a);
        }

        @Override // com.onesignal.h3
        public void b(int i10, String str, Throwable th) {
        }
    }

    class d implements h3 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k7.b f22013a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e3.j0 f22014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f22015c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f22016d;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Thread.currentThread().setPriority(10);
                d dVar = d.this;
                dVar.f22013a.f(dVar.f22015c);
                f2.this.f22007b.b().b(d.this.f22013a);
            }
        }

        d(k7.b bVar, e3.j0 j0Var, long j10, String str) {
            this.f22013a = bVar;
            this.f22014b = j0Var;
            this.f22015c = j10;
            this.f22016d = str;
        }

        @Override // com.onesignal.h3
        public void a(String str) {
            f2.this.k(this.f22013a);
            e3.j0 j0Var = this.f22014b;
            if (j0Var != null) {
                j0Var.a(e2.a(this.f22013a));
            }
        }

        @Override // com.onesignal.h3
        public void b(int i10, String str, Throwable th) {
            new Thread(new a(), "OS_SAVE_OUTCOMES").start();
            e3.i1(e3.z.WARN, "Sending outcome with name: " + this.f22016d + " failed with status code: " + i10 + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start");
            e3.j0 j0Var = this.f22014b;
            if (j0Var != null) {
                j0Var.a(null);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ k7.b f22019m;

        e(k7.b bVar) {
            this.f22019m = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            f2.this.f22007b.b().h(this.f22019m);
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22021a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22022b;

        static {
            int[] iArr = new int[h7.b.values().length];
            f22022b = iArr;
            try {
                iArr[h7.b.IAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22022b[h7.b.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h7.c.values().length];
            f22021a = iArr2;
            try {
                iArr2[h7.c.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22021a[h7.c.INDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22021a[h7.c.UNATTRIBUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22021a[h7.c.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public f2(m2 m2Var, j7.c cVar) {
        this.f22008c = m2Var;
        this.f22007b = cVar;
        g();
    }

    private List f(String str, List list) {
        List listC = this.f22007b.b().c(str, list);
        if (listC.size() > 0) {
            return listC;
        }
        return null;
    }

    private void g() {
        this.f22006a = OSUtils.K();
        Set setE = this.f22007b.b().e();
        if (setE != null) {
            this.f22006a = setE;
        }
    }

    private List h(List list) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h7.a aVar = (h7.a) it.next();
            if (aVar.d().k()) {
                e3.i1(e3.z.DEBUG, "Outcomes disabled for channel: " + aVar.c().toString());
                arrayList.remove(aVar);
            }
        }
        return arrayList;
    }

    private void i(k7.b bVar) {
        new Thread(new e(bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    private void j() {
        this.f22007b.b().g(this.f22006a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(k7.b bVar) {
        if (bVar.e()) {
            j();
        } else {
            i(bVar);
        }
    }

    private void l(String str, float f5, List list, e3.j0 j0Var) {
        long jB = e3.B0().b() / 1000;
        int iE = new OSUtils().e();
        String str2 = e3.f21886g;
        Iterator it = list.iterator();
        boolean z10 = false;
        k7.e eVarT = null;
        k7.e eVarT2 = null;
        while (it.hasNext()) {
            h7.a aVar = (h7.a) it.next();
            int i10 = f.f22021a[aVar.d().ordinal()];
            if (i10 == 1) {
                if (eVarT == null) {
                    eVarT = new k7.e();
                }
                eVarT = t(aVar, eVarT);
            } else if (i10 == 2) {
                if (eVarT2 == null) {
                    eVarT2 = new k7.e();
                }
                eVarT2 = t(aVar, eVarT2);
            } else if (i10 == 3) {
                z10 = true;
            } else if (i10 == 4) {
                e3.a(e3.z.VERBOSE, "Outcomes disabled for channel: " + aVar.c());
                if (j0Var != null) {
                    j0Var.a(null);
                    return;
                }
                return;
            }
        }
        if (eVarT != null || eVarT2 != null || z10) {
            k7.b bVar = new k7.b(str, new k7.d(eVarT, eVarT2), f5, 0L);
            this.f22007b.b().i(str2, iE, bVar, new d(bVar, j0Var, jB, str));
        } else {
            e3.a(e3.z.VERBOSE, "Outcomes disabled for all channels");
            if (j0Var != null) {
                j0Var.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(k7.b bVar) {
        int iE = new OSUtils().e();
        this.f22007b.b().i(e3.f21886g, iE, bVar, new c(bVar));
    }

    private void s(String str, List list, e3.j0 j0Var) {
        List listH = h(list);
        if (listH.isEmpty()) {
            e3.a(e3.z.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        boolean z10 = false;
        Iterator it = listH.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((h7.a) it.next()).d().d()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            List listF = f(str, listH);
            if (listF != null) {
                l(str, 0.0f, listF, j0Var);
                return;
            }
            e3.a(e3.z.DEBUG, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + listH.toString() + "\nOutcome name: " + str);
            if (j0Var != null) {
                j0Var.a(null);
                return;
            }
            return;
        }
        if (!this.f22006a.contains(str)) {
            this.f22006a.add(str);
            l(str, 0.0f, listH, j0Var);
            return;
        }
        e3.a(e3.z.DEBUG, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + h7.c.UNATTRIBUTED + "\nOutcome name: " + str);
        if (j0Var != null) {
            j0Var.a(null);
        }
    }

    private k7.e t(h7.a aVar, k7.e eVar) {
        int i10 = f.f22022b[aVar.c().ordinal()];
        if (i10 == 1) {
            eVar.c(aVar.b());
        } else if (i10 == 2) {
            eVar.d(aVar.b());
        }
        return eVar;
    }

    void d() {
        new Thread(new a(), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    void e() {
        e3.a(e3.z.DEBUG, "OneSignal cleanOutcomes for session");
        this.f22006a = OSUtils.K();
        j();
    }

    void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            String strA = h1Var.a();
            if (h1Var.c()) {
                r(strA, null);
            } else if (h1Var.b() > 0.0f) {
                o(strA, h1Var.b(), null);
            } else {
                n(strA, null);
            }
        }
    }

    void n(String str, e3.j0 j0Var) {
        l(str, 0.0f, this.f22008c.e(), j0Var);
    }

    void o(String str, float f5, e3.j0 j0Var) {
        l(str, f5, this.f22008c.e(), j0Var);
    }

    void q() {
        new Thread(new b(), "OS_SEND_SAVED_OUTCOMES").start();
    }

    void r(String str, e3.j0 j0Var) {
        s(str, this.f22008c.e(), j0Var);
    }
}
