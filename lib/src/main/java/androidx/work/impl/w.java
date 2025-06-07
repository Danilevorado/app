package androidx.work.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class w extends b1.s {

    /* renamed from: j, reason: collision with root package name */
    private static final String f4281j = b1.j.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final e0 f4282a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4283b;

    /* renamed from: c, reason: collision with root package name */
    private final b1.d f4284c;

    /* renamed from: d, reason: collision with root package name */
    private final List f4285d;

    /* renamed from: e, reason: collision with root package name */
    private final List f4286e;

    /* renamed from: f, reason: collision with root package name */
    private final List f4287f;

    /* renamed from: g, reason: collision with root package name */
    private final List f4288g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4289h;

    /* renamed from: i, reason: collision with root package name */
    private b1.m f4290i;

    public w(e0 e0Var, String str, b1.d dVar, List list) {
        this(e0Var, str, dVar, list, null);
    }

    public w(e0 e0Var, String str, b1.d dVar, List list, List list2) {
        this.f4282a = e0Var;
        this.f4283b = str;
        this.f4284c = dVar;
        this.f4285d = list;
        this.f4288g = list2;
        this.f4286e = new ArrayList(list.size());
        this.f4287f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f4287f.addAll(((w) it.next()).f4287f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strB = ((b1.v) list.get(i10)).b();
            this.f4286e.add(strB);
            this.f4287f.add(strB);
        }
    }

    public w(e0 e0Var, List list) {
        this(e0Var, null, b1.d.KEEP, list, null);
    }

    private static boolean i(w wVar, Set set) {
        set.addAll(wVar.c());
        Set setL = l(wVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = wVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((w) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(wVar.c());
        return false;
    }

    public static Set l(w wVar) {
        HashSet hashSet = new HashSet();
        List listE = wVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((w) it.next()).c());
            }
        }
        return hashSet;
    }

    public b1.m a() {
        if (this.f4289h) {
            b1.j.e().k(f4281j, "Already enqueued work ids (" + TextUtils.join(", ", this.f4286e) + ")");
        } else {
            h1.c cVar = new h1.c(this);
            this.f4282a.t().c(cVar);
            this.f4290i = cVar.d();
        }
        return this.f4290i;
    }

    public b1.d b() {
        return this.f4284c;
    }

    public List c() {
        return this.f4286e;
    }

    public String d() {
        return this.f4283b;
    }

    public List e() {
        return this.f4288g;
    }

    public List f() {
        return this.f4285d;
    }

    public e0 g() {
        return this.f4282a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f4289h;
    }

    public void k() {
        this.f4289h = true;
    }
}
