package x1;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import x1.m;

/* loaded from: classes.dex */
public class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0211b f28135a;

    public static class a implements n {

        /* renamed from: x1.b$a$a, reason: collision with other inner class name */
        class C0210a implements InterfaceC0211b {
            C0210a() {
            }

            @Override // x1.b.InterfaceC0211b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // x1.b.InterfaceC0211b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // x1.n
        public m b(q qVar) {
            return new b(new C0210a());
        }
    }

    /* renamed from: x1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0211b {
        Class a();

        Object b(byte[] bArr);
    }

    private static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: m, reason: collision with root package name */
        private final byte[] f28137m;

        /* renamed from: n, reason: collision with root package name */
        private final InterfaceC0211b f28138n;

        c(byte[] bArr, InterfaceC0211b interfaceC0211b) {
            this.f28137m = bArr;
            this.f28138n = interfaceC0211b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f28138n.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
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
            aVar.d(this.f28138n.b(this.f28137m));
        }
    }

    public static class d implements n {

        class a implements InterfaceC0211b {
            a() {
            }

            @Override // x1.b.InterfaceC0211b
            public Class a() {
                return InputStream.class;
            }

            @Override // x1.b.InterfaceC0211b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // x1.n
        public m b(q qVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0211b interfaceC0211b) {
        this.f28135a = interfaceC0211b;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(byte[] bArr, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(bArr), new c(bArr, this.f28135a));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }
}
