package androidx.coordinatorlayout.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import q.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final e f2015a = new f(10);

    /* renamed from: b, reason: collision with root package name */
    private final g f2016b = new g();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f2017c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f2018d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f2016b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f2015a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void k(ArrayList arrayList) {
        arrayList.clear();
        this.f2015a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f2016b.containsKey(obj) || !this.f2016b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f2016b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f2016b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f2016b.containsKey(obj)) {
            return;
        }
        this.f2016b.put(obj, null);
    }

    public void c() {
        int size = this.f2016b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f2016b.m(i10);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f2016b.clear();
    }

    public boolean d(Object obj) {
        return this.f2016b.containsKey(obj);
    }

    public List g(Object obj) {
        return (List) this.f2016b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f2016b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f2016b.m(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2016b.i(i10));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f2017c.clear();
        this.f2018d.clear();
        int size = this.f2016b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f2016b.i(i10), this.f2017c, this.f2018d);
        }
        return this.f2017c;
    }

    public boolean j(Object obj) {
        int size = this.f2016b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f2016b.m(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
