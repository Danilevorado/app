package ka;

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import n9.j;
import n9.t;
import n9.u;
import n9.v;
import n9.w;
import z7.i;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static h f24911a;

    /* renamed from: b, reason: collision with root package name */
    private static d f24912b;

    /* renamed from: c, reason: collision with root package name */
    private static g f24913c;

    /* renamed from: d, reason: collision with root package name */
    private static va.b f24914d;

    /* renamed from: e, reason: collision with root package name */
    private static n9.h f24915e;

    /* renamed from: f, reason: collision with root package name */
    private static j f24916f;

    /* renamed from: g, reason: collision with root package name */
    private static n9.g f24917g;

    /* renamed from: h, reason: collision with root package name */
    private static t f24918h;

    /* renamed from: i, reason: collision with root package name */
    private static v f24919i;

    private static class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        v f24920a;

        public a(v vVar) {
            this.f24920a = vVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            this.f24920a.f(r9.b.b());
            return null;
        }
    }

    private static void a() {
        Context contextB = c9.a.b();
        if (contextB == null) {
            k9.h.k("Incorrect state of app. Context is null");
        } else {
            f24913c = new g(new f(contextB));
        }
    }

    public static g b() {
        return f24913c;
    }

    public static n9.h c() {
        return f24915e;
    }

    public static h d() {
        return f24911a;
    }

    public static j e() {
        return f24916f;
    }

    public static d f() {
        return f24912b;
    }

    public static va.b g() {
        return f24914d;
    }

    public static t h() {
        return f24918h;
    }

    public static v i() {
        return f24919i;
    }

    public static void j(z7.d dVar, i iVar, n9.e eVar) {
        k(dVar);
        if (f24911a == null) {
            f24911a = new h(dVar);
        }
        if (f24912b == null) {
            f24912b = new d(dVar, eVar);
        }
        if (f24913c == null) {
            a();
        }
        if (f24914d == null) {
            f24914d = new va.b(c9.a.b(), iVar);
        }
        if (f24915e == null) {
            f24915e = new b(c9.a.b());
        }
        if (f24916f == null) {
            f24916f = new c(c9.a.b());
        }
        if (f24917g == null) {
            f24917g = new ka.a(c9.a.b());
        }
        if (f24918h == null) {
            f24918h = new u(c9.a.b());
        }
        if (f24919i == null) {
            f24919i = new w(c9.a.b());
            new a(f24919i).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private static void k(z7.d dVar) {
        e9.a aVarD;
        k9.h.u("Migrate prefs if needed");
        db.a aVarG = c9.a.g();
        if (aVarG == null || (aVarD = bb.d.d()) == null) {
            return;
        }
        k9.h.u("Start migration with prevPrefsProvider: " + aVarD.getClass().getName());
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.s(aVarD));
        arrayList.add(h.a(aVarD));
        Iterator it = dVar.q().iterator();
        while (it.hasNext()) {
            Collection collectionB = ((w8.a) it.next()).b(aVarD);
            if (collectionB != null) {
                arrayList.addAll(collectionB);
            }
        }
        aVarG.a(arrayList);
    }
}
