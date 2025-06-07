package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t1.t;
import t1.v;
import x1.n;
import x1.o;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final o f5381a;

    /* renamed from: b, reason: collision with root package name */
    private final i2.a f5382b;

    /* renamed from: c, reason: collision with root package name */
    private final i2.e f5383c;

    /* renamed from: d, reason: collision with root package name */
    private final i2.f f5384d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f5385e;

    /* renamed from: f, reason: collision with root package name */
    private final f2.f f5386f;

    /* renamed from: g, reason: collision with root package name */
    private final i2.b f5387g;

    /* renamed from: h, reason: collision with root package name */
    private final i2.d f5388h = new i2.d();

    /* renamed from: i, reason: collision with root package name */
    private final i2.c f5389i = new i2.c();

    /* renamed from: j, reason: collision with root package name */
    private final androidx.core.util.e f5390j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        androidx.core.util.e eVarE = o2.a.e();
        this.f5390j = eVarE;
        this.f5381a = new o(eVarE);
        this.f5382b = new i2.a();
        this.f5383c = new i2.e();
        this.f5384d = new i2.f();
        this.f5385e = new com.bumptech.glide.load.data.f();
        this.f5386f = new f2.f();
        this.f5387g = new i2.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f5383c.d(cls, cls2)) {
            for (Class cls5 : this.f5386f.b(cls4, cls3)) {
                arrayList.add(new t1.i(cls, cls4, cls5, this.f5383c.b(cls, cls4), this.f5386f.a(cls4, cls5), this.f5390j));
            }
        }
        return arrayList;
    }

    public i a(Class cls, Class cls2, r1.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public i b(Class cls, Class cls2, n nVar) {
        this.f5381a.a(cls, cls2, nVar);
        return this;
    }

    public i c(Class cls, r1.d dVar) {
        this.f5382b.a(cls, dVar);
        return this;
    }

    public i d(Class cls, r1.k kVar) {
        this.f5384d.a(cls, kVar);
        return this;
    }

    public i e(String str, Class cls, Class cls2, r1.j jVar) {
        this.f5383c.a(str, jVar, cls, cls2);
        return this;
    }

    public List g() {
        List listB = this.f5387g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        t tVarA = this.f5389i.a(cls, cls2, cls3);
        if (this.f5389i.c(tVarA)) {
            return null;
        }
        if (tVarA == null) {
            List listF = f(cls, cls2, cls3);
            tVarA = listF.isEmpty() ? null : new t(cls, cls2, cls3, listF, this.f5390j);
            this.f5389i.d(cls, cls2, cls3, tVarA);
        }
        return tVarA;
    }

    public List i(Object obj) {
        return this.f5381a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List listA = this.f5388h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList();
            Iterator it = this.f5381a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f5383c.d((Class) it.next(), cls2)) {
                    if (!this.f5386f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f5388h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public r1.k k(v vVar) {
        r1.k kVarB = this.f5384d.b(vVar.b());
        if (kVarB != null) {
            return kVarB;
        }
        throw new d(vVar.b());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f5385e.a(obj);
    }

    public r1.d m(Object obj) {
        r1.d dVarB = this.f5382b.b(obj.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f5384d.b(vVar.b()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.f5387g.a(imageHeaderParser);
        return this;
    }

    public i p(e.a aVar) {
        this.f5385e.b(aVar);
        return this;
    }

    public i q(Class cls, Class cls2, f2.e eVar) {
        this.f5386f.c(cls, cls2, eVar);
        return this;
    }

    public final i r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f5383c.e(arrayList);
        return this;
    }
}
