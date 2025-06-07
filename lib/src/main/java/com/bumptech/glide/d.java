package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final l f5357k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final u1.b f5358a;

    /* renamed from: b, reason: collision with root package name */
    private final i f5359b;

    /* renamed from: c, reason: collision with root package name */
    private final k2.f f5360c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f5361d;

    /* renamed from: e, reason: collision with root package name */
    private final List f5362e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f5363f;

    /* renamed from: g, reason: collision with root package name */
    private final t1.k f5364g;

    /* renamed from: h, reason: collision with root package name */
    private final e f5365h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5366i;

    /* renamed from: j, reason: collision with root package name */
    private j2.f f5367j;

    public d(Context context, u1.b bVar, i iVar, k2.f fVar, b.a aVar, Map map, List list, t1.k kVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f5358a = bVar;
        this.f5359b = iVar;
        this.f5360c = fVar;
        this.f5361d = aVar;
        this.f5362e = list;
        this.f5363f = map;
        this.f5364g = kVar;
        this.f5365h = eVar;
        this.f5366i = i10;
    }

    public k2.i a(ImageView imageView, Class cls) {
        return this.f5360c.a(imageView, cls);
    }

    public u1.b b() {
        return this.f5358a;
    }

    public List c() {
        return this.f5362e;
    }

    public synchronized j2.f d() {
        if (this.f5367j == null) {
            this.f5367j = (j2.f) this.f5361d.build().Q();
        }
        return this.f5367j;
    }

    public l e(Class cls) {
        l lVar = (l) this.f5363f.get(cls);
        if (lVar == null) {
            for (Map.Entry entry : this.f5363f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? f5357k : lVar;
    }

    public t1.k f() {
        return this.f5364g;
    }

    public e g() {
        return this.f5365h;
    }

    public int h() {
        return this.f5366i;
    }

    public i i() {
        return this.f5359b;
    }
}
