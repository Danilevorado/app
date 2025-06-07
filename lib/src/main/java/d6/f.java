package d6;

import d6.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class f implements a6.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f22957f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final a6.c f22958g = a6.c.a("key").b(d6.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final a6.c f22959h = a6.c.a("value").b(d6.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final a6.d f22960i = new a6.d() { // from class: d6.e
        @Override // a6.d
        public final void a(Object obj, Object obj2) {
            f.t((Map.Entry) obj, (a6.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f22961a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f22962b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f22963c;

    /* renamed from: d, reason: collision with root package name */
    private final a6.d f22964d;

    /* renamed from: e, reason: collision with root package name */
    private final i f22965e = new i(this);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22966a;

        static {
            int[] iArr = new int[d.a.values().length];
            f22966a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22966a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22966a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, a6.d dVar) {
        this.f22961a = outputStream;
        this.f22962b = map;
        this.f22963c = map2;
        this.f22964d = dVar;
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long n(a6.d dVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f22961a;
            this.f22961a = bVar;
            try {
                dVar.a(obj, this);
                this.f22961a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th) {
                this.f22961a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f o(a6.d dVar, a6.c cVar, Object obj, boolean z10) throws IOException {
        long jN = n(dVar, obj);
        if (z10 && jN == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        v(jN);
        dVar.a(obj, this);
        return this;
    }

    private f p(a6.f fVar, a6.c cVar, Object obj, boolean z10) {
        this.f22965e.d(cVar, z10);
        fVar.a(obj, this.f22965e);
        return this;
    }

    private static d r(a6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new a6.b("Field has no @Protobuf config");
    }

    private static int s(a6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new a6.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Map.Entry entry, a6.e eVar) {
        eVar.a(f22958g, entry.getKey());
        eVar.a(f22959h, entry.getValue());
    }

    private void u(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f22961a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f22961a.write(i10 & 127);
    }

    private void v(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f22961a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f22961a.write(((int) j10) & 127);
    }

    @Override // a6.e
    public a6.e a(a6.c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    a6.e c(a6.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        u((s(cVar) << 3) | 1);
        this.f22961a.write(m(8).putDouble(d10).array());
        return this;
    }

    a6.e f(a6.c cVar, float f5, boolean z10) throws IOException {
        if (z10 && f5 == 0.0f) {
            return this;
        }
        u((s(cVar) << 3) | 5);
        this.f22961a.write(m(4).putFloat(f5).array());
        return this;
    }

    a6.e g(a6.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            u((s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f22957f);
            u(bytes.length);
            this.f22961a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                o(f22960i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return c(cVar, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return f(cVar, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return k(cVar, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return l(cVar, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            a6.d dVar = (a6.d) this.f22962b.get(obj.getClass());
            if (dVar != null) {
                return o(dVar, cVar, obj, z10);
            }
            a6.f fVar = (a6.f) this.f22963c.get(obj.getClass());
            return fVar != null ? p(fVar, cVar, obj, z10) : obj instanceof c ? d(cVar, ((c) obj).b()) : obj instanceof Enum ? d(cVar, ((Enum) obj).ordinal()) : o(this.f22964d, cVar, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        u(bArr.length);
        this.f22961a.write(bArr);
        return this;
    }

    @Override // a6.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f d(a6.c cVar, int i10) {
        return i(cVar, i10, true);
    }

    f i(a6.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d dVarR = r(cVar);
        int i11 = a.f22966a[dVarR.intEncoding().ordinal()];
        if (i11 == 1) {
            u(dVarR.tag() << 3);
            u(i10);
        } else if (i11 == 2) {
            u(dVarR.tag() << 3);
            u((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            u((dVarR.tag() << 3) | 5);
            this.f22961a.write(m(4).putInt(i10).array());
        }
        return this;
    }

    @Override // a6.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f e(a6.c cVar, long j10) {
        return k(cVar, j10, true);
    }

    f k(a6.c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d dVarR = r(cVar);
        int i10 = a.f22966a[dVarR.intEncoding().ordinal()];
        if (i10 == 1) {
            u(dVarR.tag() << 3);
            v(j10);
        } else if (i10 == 2) {
            u(dVarR.tag() << 3);
            v((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            u((dVarR.tag() << 3) | 1);
            this.f22961a.write(m(8).putLong(j10).array());
        }
        return this;
    }

    f l(a6.c cVar, boolean z10, boolean z11) {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    f q(Object obj) {
        if (obj == null) {
            return this;
        }
        a6.d dVar = (a6.d) this.f22962b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new a6.b("No encoder for " + obj.getClass());
    }
}
