package x1;

import android.content.res.AssetManager;
import android.net.Uri;
import x1.m;

/* loaded from: classes.dex */
public class a implements m {

    /* renamed from: c, reason: collision with root package name */
    private static final int f28130c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f28131a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0209a f28132b;

    /* renamed from: x1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0209a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public static class b implements n, InterfaceC0209a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f28133a;

        public b(AssetManager assetManager) {
            this.f28133a = assetManager;
        }

        @Override // x1.a.InterfaceC0209a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // x1.n
        public m b(q qVar) {
            return new a(this.f28133a, this);
        }
    }

    public static class c implements n, InterfaceC0209a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f28134a;

        public c(AssetManager assetManager) {
            this.f28134a = assetManager;
        }

        @Override // x1.a.InterfaceC0209a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // x1.n
        public m b(q qVar) {
            return new a(this.f28134a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0209a interfaceC0209a) {
        this.f28131a = assetManager;
        this.f28132b = interfaceC0209a;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Uri uri, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(uri), this.f28132b.a(this.f28131a, uri.toString().substring(f28130c)));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
