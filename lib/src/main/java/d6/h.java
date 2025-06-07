package d6;

import d6.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f22968a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f22969b;

    /* renamed from: c, reason: collision with root package name */
    private final a6.d f22970c;

    public static final class a implements b6.b {

        /* renamed from: d, reason: collision with root package name */
        private static final a6.d f22971d = new a6.d() { // from class: d6.g
            @Override // a6.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (a6.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f22972a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f22973b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private a6.d f22974c = f22971d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, a6.e eVar) {
            throw new a6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f22972a), new HashMap(this.f22973b), this.f22974c);
        }

        public a d(b6.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // b6.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, a6.d dVar) {
            this.f22972a.put(cls, dVar);
            this.f22973b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, a6.d dVar) {
        this.f22968a = map;
        this.f22969b = map2;
        this.f22970c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f22968a, this.f22969b, this.f22970c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
