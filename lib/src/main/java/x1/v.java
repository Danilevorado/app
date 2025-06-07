package x1;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x1.m;

/* loaded from: classes.dex */
public class v implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f28216b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    private final c f28217a;

    public static final class a implements n, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f28218a;

        public a(ContentResolver contentResolver) {
            this.f28218a = contentResolver;
        }

        @Override // x1.v.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f28218a, uri);
        }

        @Override // x1.n
        public m b(q qVar) {
            return new v(this);
        }
    }

    public static class b implements n, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f28219a;

        public b(ContentResolver contentResolver) {
            this.f28219a = contentResolver;
        }

        @Override // x1.v.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f28219a, uri);
        }

        @Override // x1.n
        public m b(q qVar) {
            return new v(this);
        }
    }

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public static class d implements n, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f28220a;

        public d(ContentResolver contentResolver) {
            this.f28220a = contentResolver;
        }

        @Override // x1.v.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f28220a, uri);
        }

        @Override // x1.n
        public m b(q qVar) {
            return new v(this);
        }
    }

    public v(c cVar) {
        this.f28217a = cVar;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Uri uri, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(uri), this.f28217a.a(uri));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f28216b.contains(uri.getScheme());
    }
}
