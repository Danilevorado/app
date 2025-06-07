package c6;

import a6.f;
import a6.g;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class d implements b6.b {

    /* renamed from: e, reason: collision with root package name */
    private static final a6.d f5025e = new a6.d() { // from class: c6.a
        @Override // a6.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (a6.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final f f5026f = new f() { // from class: c6.c
        @Override // a6.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).b((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final f f5027g = new f() { // from class: c6.b
        @Override // a6.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f5028h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f5029a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f5030b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private a6.d f5031c = f5025e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5032d = false;

    class a implements a6.a {
        a() {
        }

        @Override // a6.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f5029a, d.this.f5030b, d.this.f5031c, d.this.f5032d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    private static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f5034a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f5034a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // a6.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.b(f5034a.format(date));
        }
    }

    public d() {
        p(String.class, f5026f);
        p(Boolean.class, f5027g);
        p(Date.class, f5028h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, a6.e eVar) {
        throw new a6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.c(bool.booleanValue());
    }

    public a6.a i() {
        return new a();
    }

    public d j(b6.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f5032d = z10;
        return this;
    }

    @Override // b6.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, a6.d dVar) {
        this.f5029a.put(cls, dVar);
        this.f5030b.remove(cls);
        return this;
    }

    public d p(Class cls, f fVar) {
        this.f5030b.put(cls, fVar);
        this.f5029a.remove(cls);
        return this;
    }
}
