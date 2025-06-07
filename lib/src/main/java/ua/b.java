package ua;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final pa.a f27666a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f27667b;

    /* renamed from: c, reason: collision with root package name */
    private final fa.a f27668c;

    /* renamed from: d, reason: collision with root package name */
    private final fa.b f27669d;

    public b(pa.a aVar, ya.a aVar2, fa.a aVar3, fa.b bVar) {
        this.f27666a = aVar;
        this.f27667b = aVar2.c();
        this.f27669d = bVar;
        this.f27668c = aVar3;
    }

    private c b(String str) {
        return c.c(str, this.f27669d.b(this.f27666a.c(this.f27668c.c(str))));
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int iA = cVar.a();
            String strC = this.f27668c.c(cVar.f());
            if (iA == 2) {
                this.f27666a.b(strC, this.f27669d.a(cVar.e()));
            }
            if (iA == 3) {
                this.f27666a.remove(strC);
            }
        }
    }

    private List g() {
        String[] strArrA = this.f27666a.a();
        ArrayList arrayList = new ArrayList(strArrA.length);
        for (String str : strArrA) {
            arrayList.add(b(str));
        }
        return arrayList;
    }

    private Set h() {
        String[] strArrA = this.f27666a.a();
        HashSet hashSet = new HashSet();
        for (String str : strArrA) {
            hashSet.add(this.f27668c.b(str));
        }
        return hashSet;
    }

    @Override // ua.a
    public List a() {
        return g();
    }

    @Override // ua.a
    public c c(String str) {
        return b(str);
    }

    @Override // ua.a
    public Set e() {
        return h();
    }

    @Override // ua.a
    public void f(List list) {
        d(list);
    }

    @Override // ua.a
    public void lock() {
        this.f27667b.lock();
    }

    @Override // ua.a
    public void unlock() {
        this.f27667b.unlock();
    }
}
