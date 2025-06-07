package x1;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import x1.m;

/* loaded from: classes.dex */
public class d implements m {

    private static final class a implements com.bumptech.glide.load.data.d {

        /* renamed from: m, reason: collision with root package name */
        private final File f28140m;

        a(File file) {
            this.f28140m = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ByteBuffer.class;
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
            try {
                aVar.d(n2.a.a(this.f28140m));
            } catch (IOException e5) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e5);
                }
                aVar.c(e5);
            }
        }
    }

    public static class b implements n {
        @Override // x1.n
        public m b(q qVar) {
            return new d();
        }
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(File file, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(file), new a(file));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
