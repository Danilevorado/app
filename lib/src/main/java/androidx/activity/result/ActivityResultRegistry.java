package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    private Random f376a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final Map f377b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f378c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f379d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    ArrayList f380e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    final transient Map f381f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Map f382g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Bundle f383h = new Bundle();

    class a extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.a f389b;

        a(String str, e.a aVar) {
            this.f388a = str;
            this.f389b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f378c.get(this.f388a);
            if (num != null) {
                ActivityResultRegistry.this.f380e.add(this.f388a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f389b, obj, cVar);
                    return;
                } catch (Exception e5) {
                    ActivityResultRegistry.this.f380e.remove(this.f388a);
                    throw e5;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f389b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f388a);
        }
    }

    class b extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.a f392b;

        b(String str, e.a aVar) {
            this.f391a = str;
            this.f392b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f378c.get(this.f391a);
            if (num != null) {
                ActivityResultRegistry.this.f380e.add(this.f391a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f392b, obj, cVar);
                    return;
                } catch (Exception e5) {
                    ActivityResultRegistry.this.f380e.remove(this.f391a);
                    throw e5;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f392b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f391a);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b f394a;

        /* renamed from: b, reason: collision with root package name */
        final e.a f395b;

        c(androidx.activity.result.b bVar, e.a aVar) {
            this.f394a = bVar;
            this.f395b = aVar;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final j f396a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f397b = new ArrayList();

        d(j jVar) {
            this.f396a = jVar;
        }

        void a(l lVar) {
            this.f396a.a(lVar);
            this.f397b.add(lVar);
        }

        void b() {
            Iterator it = this.f397b.iterator();
            while (it.hasNext()) {
                this.f396a.c((l) it.next());
            }
            this.f397b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f377b.put(Integer.valueOf(i10), str);
        this.f378c.put(str, Integer.valueOf(i10));
    }

    private void d(String str, int i10, Intent intent, c cVar) {
        if (cVar == null || cVar.f394a == null || !this.f380e.contains(str)) {
            this.f382g.remove(str);
            this.f383h.putParcelable(str, new androidx.activity.result.a(i10, intent));
        } else {
            cVar.f394a.a(cVar.f395b.c(i10, intent));
            this.f380e.remove(str);
        }
    }

    private int e() {
        int iNextInt = this.f376a.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            if (!this.f377b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            iNextInt = this.f376a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (((Integer) this.f378c.get(str)) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = (String) this.f377b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, (c) this.f381f.get(str));
        return true;
    }

    public final boolean c(int i10, Object obj) {
        androidx.activity.result.b bVar;
        String str = (String) this.f377b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f381f.get(str);
        if (cVar == null || (bVar = cVar.f394a) == null) {
            this.f383h.remove(str);
            this.f382g.put(str, obj);
            return true;
        }
        if (!this.f380e.remove(str)) {
            return true;
        }
        bVar.a(obj);
        return true;
    }

    public abstract void f(int i10, e.a aVar, Object obj, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f380e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f376a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f383h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f378c.containsKey(str)) {
                Integer num = (Integer) this.f378c.remove(str);
                if (!this.f383h.containsKey(str)) {
                    this.f377b.remove(num);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f378c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f378c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f380e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f383h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f376a);
    }

    public final androidx.activity.result.c i(final String str, n nVar, final e.a aVar, final androidx.activity.result.b bVar) {
        j jVarS = nVar.s();
        if (jVarS.b().b(j.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + nVar + " is attempting to register while current state is " + jVarS.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = (d) this.f379d.get(str);
        if (dVar == null) {
            dVar = new d(jVarS);
        }
        dVar.a(new l() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.l
            public void d(n nVar2, j.b bVar2) {
                if (!j.b.ON_START.equals(bVar2)) {
                    if (j.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f381f.remove(str);
                        return;
                    } else {
                        if (j.b.ON_DESTROY.equals(bVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f381f.put(str, new c(bVar, aVar));
                if (ActivityResultRegistry.this.f382g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f382g.get(str);
                    ActivityResultRegistry.this.f382g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) ActivityResultRegistry.this.f383h.getParcelable(str);
                if (aVar2 != null) {
                    ActivityResultRegistry.this.f383h.remove(str);
                    bVar.a(aVar.c(aVar2.b(), aVar2.a()));
                }
            }
        });
        this.f379d.put(str, dVar);
        return new a(str, aVar);
    }

    public final androidx.activity.result.c j(String str, e.a aVar, androidx.activity.result.b bVar) {
        k(str);
        this.f381f.put(str, new c(bVar, aVar));
        if (this.f382g.containsKey(str)) {
            Object obj = this.f382g.get(str);
            this.f382g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f383h.getParcelable(str);
        if (aVar2 != null) {
            this.f383h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer num;
        if (!this.f380e.contains(str) && (num = (Integer) this.f378c.remove(str)) != null) {
            this.f377b.remove(num);
        }
        this.f381f.remove(str);
        if (this.f382g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f382g.get(str));
            this.f382g.remove(str);
        }
        if (this.f383h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f383h.getParcelable(str));
            this.f383h.remove(str);
        }
        d dVar = (d) this.f379d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f379d.remove(str);
        }
    }
}
