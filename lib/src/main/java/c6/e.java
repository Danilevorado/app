package c6;

import a6.f;
import a6.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class e implements a6.e, g {

    /* renamed from: a, reason: collision with root package name */
    private e f5035a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5036b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f5037c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5038d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5039e;

    /* renamed from: f, reason: collision with root package name */
    private final a6.d f5040f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5041g;

    e(Writer writer, Map map, Map map2, a6.d dVar, boolean z10) {
        this.f5037c = new JsonWriter(writer);
        this.f5038d = map;
        this.f5039e = map2;
        this.f5040f = dVar;
        this.f5041g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) throws IOException {
        t();
        this.f5037c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f5037c.nullValue();
        return this;
    }

    private e s(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        t();
        this.f5037c.name(str);
        return h(obj, false);
    }

    private void t() throws IOException {
        if (!this.f5036b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f5035a;
        if (eVar != null) {
            eVar.t();
            this.f5035a.f5036b = false;
            this.f5035a = null;
            this.f5037c.endObject();
        }
    }

    @Override // a6.e
    public a6.e a(a6.c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    @Override // a6.e
    public a6.e d(a6.c cVar, int i10) {
        return j(cVar.b(), i10);
    }

    @Override // a6.e
    public a6.e e(a6.c cVar, long j10) {
        return k(cVar.b(), j10);
    }

    public e f(int i10) throws IOException {
        t();
        this.f5037c.value(i10);
        return this;
    }

    public e g(long j10) throws IOException {
        t();
        this.f5037c.value(j10);
        return this;
    }

    e h(Object obj, boolean z10) {
        int i10 = 0;
        if (z10 && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new a6.b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f5037c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f5037c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f5037c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next(), false);
                }
                this.f5037c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f5037c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e5) {
                        throw new a6.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e5);
                    }
                }
                this.f5037c.endObject();
                return this;
            }
            a6.d dVar = (a6.d) this.f5038d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f fVar = (f) this.f5039e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return q(this.f5040f, obj, z10);
            }
            b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return n((byte[]) obj);
        }
        this.f5037c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f5037c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                g(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f5037c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f5037c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                h(obj2, false);
            }
        }
        this.f5037c.endArray();
        return this;
    }

    @Override // a6.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e b(String str) throws IOException {
        t();
        this.f5037c.value(str);
        return this;
    }

    public e j(String str, int i10) throws IOException {
        t();
        this.f5037c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) throws IOException {
        t();
        this.f5037c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) {
        return this.f5041g ? s(str, obj) : r(str, obj);
    }

    @Override // a6.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e c(boolean z10) throws IOException {
        t();
        this.f5037c.value(z10);
        return this;
    }

    public e n(byte[] bArr) throws IOException {
        t();
        if (bArr == null) {
            this.f5037c.nullValue();
        } else {
            this.f5037c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void p() {
        t();
        this.f5037c.flush();
    }

    e q(a6.d dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f5037c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f5037c.endObject();
        }
        return this;
    }
}
