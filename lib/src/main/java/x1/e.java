package x1;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import x1.m;

/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    private final a f28141a;

    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    private static final class b implements com.bumptech.glide.load.data.d {

        /* renamed from: m, reason: collision with root package name */
        private final String f28142m;

        /* renamed from: n, reason: collision with root package name */
        private final a f28143n;

        /* renamed from: o, reason: collision with root package name */
        private Object f28144o;

        b(String str, a aVar) {
            this.f28142m = str;
            this.f28143n = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f28143n.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f28143n.b(this.f28144o);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public r1.a e() {
            return r1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object objC = this.f28143n.c(this.f28142m);
                this.f28144o = objC;
                aVar.d(objC);
            } catch (IllegalArgumentException e5) {
                aVar.c(e5);
            }
        }
    }

    public static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        private final a f28145a = new a();

        class a implements a {
            a() {
            }

            @Override // x1.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // x1.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // x1.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // x1.n
        public m b(q qVar) {
            return new e(this.f28145a);
        }
    }

    public e(a aVar) {
        this.f28141a = aVar;
    }

    @Override // x1.m
    public m.a a(Object obj, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(obj), new b(obj.toString(), this.f28141a));
    }

    @Override // x1.m
    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
