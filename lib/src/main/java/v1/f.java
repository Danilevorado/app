package v1;

import android.content.Context;
import java.io.File;
import v1.d;

/* loaded from: classes.dex */
public final class f extends d {

    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27826b;

        a(Context context, String str) {
            this.f27825a = context;
            this.f27826b = str;
        }

        @Override // v1.d.a
        public File a() {
            File cacheDir = this.f27825a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f27826b != null ? new File(cacheDir, this.f27826b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
