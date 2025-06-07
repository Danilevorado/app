package x1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import x1.m;

/* loaded from: classes.dex */
public class t implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f28212a;

    public static final class a implements n {
        @Override // x1.n
        public m b(q qVar) {
            return new t(qVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements n {
        @Override // x1.n
        public m b(q qVar) {
            return new t(qVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements n {
        @Override // x1.n
        public m b(q qVar) {
            return new t(qVar.d(Uri.class, InputStream.class));
        }
    }

    public t(m mVar) {
        this.f28212a = mVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() != null) {
                return uri;
            }
        }
        return f(str);
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(String str, int i10, int i11, r1.h hVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f28212a.b(uriE)) {
            return null;
        }
        return this.f28212a.a(uriE, i10, i11, hVar);
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return true;
    }
}
