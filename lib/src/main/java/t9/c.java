package t9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27376a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f27377b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final ua.a f27378c;

    /* renamed from: d, reason: collision with root package name */
    private final ha.b f27379d;

    /* renamed from: e, reason: collision with root package name */
    private final d8.c f27380e;

    /* renamed from: f, reason: collision with root package name */
    private final cb.a f27381f;

    /* renamed from: g, reason: collision with root package name */
    private final da.a f27382g;

    /* renamed from: h, reason: collision with root package name */
    private final v9.a f27383h;

    /* renamed from: i, reason: collision with root package name */
    private final Lock f27384i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27385j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.e();
        }
    }

    c(ua.a aVar, ha.b bVar, d8.c cVar, cb.a aVar2, da.a aVar3, v9.a aVar4, Lock lock) {
        this.f27378c = aVar;
        this.f27379d = bVar;
        this.f27380e = cVar;
        this.f27381f = aVar2;
        this.f27382g = aVar3;
        this.f27383h = aVar4;
        this.f27384i = lock;
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ua.c cVar = (ua.c) it.next();
            String strF = cVar.f();
            byte[] bArrE = cVar.e();
            if (cVar.a() == 3) {
                this.f27379d.c(strF);
            }
            if (cVar.a() == 2) {
                this.f27379d.b(strF, bArrE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        List listF = f();
        this.f27378c.f(listF);
        c(listF);
    }

    private List f() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(j());
        linkedList.addAll(l());
        return linkedList;
    }

    private void g() {
        if (this.f27385j) {
            throw new ja.e("Transaction should be applied or committed only once!");
        }
        this.f27385j = true;
    }

    private d8.a h() {
        i();
        k();
        g();
        return this.f27380e.submit(new a());
    }

    private void i() {
        for (String str : this.f27377b) {
            this.f27383h.remove(str);
            this.f27382g.remove(str);
        }
    }

    private List j() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f27377b.iterator();
        while (it.hasNext()) {
            linkedList.add(ua.c.b((String) it.next()));
        }
        return linkedList;
    }

    private void k() {
        for (String str : this.f27376a.keySet()) {
            Object value = ((x7.a) this.f27376a.get(str)).getValue();
            this.f27383h.c(str);
            this.f27382g.b(str, value);
        }
    }

    private List l() {
        Set<String> setKeySet = this.f27376a.keySet();
        LinkedList linkedList = new LinkedList();
        for (String str : setKeySet) {
            linkedList.add(ua.c.d(str, ((x7.a) this.f27376a.get(str)).a()));
        }
        return linkedList;
    }

    @Override // android.content.SharedPreferences.Editor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f clear() {
        this.f27384i.lock();
        try {
            this.f27377b.addAll(this.f27383h.a());
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        this.f27384i.lock();
        try {
            h();
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f remove(String str) {
        this.f27384i.lock();
        try {
            this.f27377b.add(str);
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        this.f27384i.lock();
        try {
            return h().d();
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public f putBoolean(String str, boolean z10) {
        this.f27384i.lock();
        try {
            this.f27376a.put(str, new a8.a(z10, this.f27381f));
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public f putFloat(String str, float f5) {
        this.f27384i.lock();
        try {
            this.f27376a.put(str, new a8.b(f5, this.f27381f));
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public f putInt(String str, int i10) {
        this.f27384i.lock();
        try {
            this.f27376a.put(str, new a8.c(i10, this.f27381f));
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public f putLong(String str, long j10) {
        this.f27384i.lock();
        try {
            this.f27376a.put(str, new a8.d(j10, this.f27381f));
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public f putString(String str, String str2) {
        if (str2 == null) {
            return remove(str);
        }
        this.f27384i.lock();
        try {
            this.f27376a.put(str, new a8.e(str2, this.f27381f));
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public f putStringSet(String str, Set set) {
        if (set == null) {
            return remove(str);
        }
        this.f27384i.lock();
        try {
            this.f27376a.put(str, new a8.f(set, this.f27381f));
            return this;
        } finally {
            this.f27384i.unlock();
        }
    }
}
