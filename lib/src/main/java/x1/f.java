package x1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import x1.m;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: a, reason: collision with root package name */
    private final d f28147a;

    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final d f28148a;

        public a(d dVar) {
            this.f28148a = dVar;
        }

        @Override // x1.n
        public final m b(q qVar) {
            return new f(this.f28148a);
        }
    }

    public static class b extends a {

        class a implements d {
            a() {
            }

            @Override // x1.f.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // x1.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // x1.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: m, reason: collision with root package name */
        private final File f28149m;

        /* renamed from: n, reason: collision with root package name */
        private final d f28150n;

        /* renamed from: o, reason: collision with root package name */
        private Object f28151o;

        c(File file, d dVar) {
            this.f28149m = file;
            this.f28150n = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f28150n.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f28151o;
            if (obj != null) {
                try {
                    this.f28150n.b(obj);
                } catch (IOException unused) {
                }
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
                Object objC = this.f28150n.c(this.f28149m);
                this.f28151o = objC;
                aVar.d(objC);
            } catch (FileNotFoundException e5) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e5);
                }
                aVar.c(e5);
            }
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            @Override // x1.f.d
            public Class a() {
                return InputStream.class;
            }

            @Override // x1.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // x1.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d dVar) {
        this.f28147a = dVar;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(File file, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(file), new c(file, this.f28147a));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
