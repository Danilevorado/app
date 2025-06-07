package t9;

import android.content.Context;
import android.os.Looper;
import java.io.File;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final d f27359a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f27360b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f27361c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f27362d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f27363e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f27364f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f27365g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f27366h;

    /* renamed from: i, reason: collision with root package name */
    private final q7.b f27367i;

    /* renamed from: j, reason: collision with root package name */
    private final ab.a f27368j;

    /* renamed from: k, reason: collision with root package name */
    private File f27369k;

    /* renamed from: l, reason: collision with root package name */
    private String f27370l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27371m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27372n;

    /* renamed from: o, reason: collision with root package name */
    private fa.a f27373o;

    /* renamed from: p, reason: collision with root package name */
    private fa.b f27374p;

    /* renamed from: q, reason: collision with root package name */
    private ha.c f27375q;

    public b(Context context) {
        d dVar = new d();
        this.f27359a = dVar;
        this.f27360b = dVar.e();
        this.f27361c = dVar.f();
        this.f27362d = dVar.d();
        this.f27363e = dVar.c();
        this.f27364f = dVar.b();
        this.f27365g = dVar.a();
        this.f27367i = new q7.b();
        this.f27368j = new ab.a();
        this.f27370l = "default";
        this.f27371m = false;
        this.f27372n = true;
        this.f27373o = fa.a.f23680a;
        this.f27374p = fa.b.f23681a;
        this.f27375q = ha.c.f24155b;
        this.f27366h = context;
        this.f27369k = context.getFilesDir();
    }

    private a e() {
        cb.a aVar;
        ha.b dVar;
        ra.a aVar2 = new ra.a(this.f27370l, this.f27369k);
        pa.b bVar = new pa.b(aVar2);
        ya.c cVar = new ya.c(this.f27370l, aVar2, this.f27360b, this.f27361c);
        ua.b bVar2 = new ua.b(bVar, cVar, this.f27373o, this.f27374p);
        v9.b bVar3 = new v9.b(this.f27370l, this.f27364f);
        da.b bVar4 = new da.b(this.f27370l, this.f27363e);
        d8.b bVar5 = new d8.b(this.f27370l, this.f27375q, this.f27362d);
        cb.a aVar3 = new cb.a(this.f27367i);
        if (this.f27371m) {
            aVar = aVar3;
            dVar = new ha.a(this.f27366h, this.f27370l, bVar3, bVar4, aVar3, bVar5, this.f27374p, aVar2, this.f27365g);
        } else {
            aVar = aVar3;
            dVar = new ha.d(this.f27370l, this.f27365g);
        }
        return new a(bVar2, dVar, bVar3, bVar4, bVar5, aVar, cVar, this.f27372n ? new wa.c(cVar, bVar5, bVar3, bVar4, bVar2, aVar) : new wa.a(cVar, bVar5, bVar3, bVar4, bVar2, aVar));
    }

    public b a(ha.c cVar) {
        this.f27375q = cVar;
        return this;
    }

    public b b(String str) {
        this.f27370l = str;
        return this;
    }

    public b c(boolean z10) {
        this.f27371m = z10;
        return this;
    }

    public e d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new ja.c("Preferences should be instantiated in the main thread.");
        }
        if (this.f27372n && this.f27371m) {
            throw new UnsupportedOperationException("IPC mode can't be used with lazy in-memory cache strategy!");
        }
        a aVarE = e();
        this.f27368j.c(aVarE);
        return aVarE;
    }
}
