package x1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import x1.m;

/* loaded from: classes.dex */
public class r implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f28205a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f28206b;

    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f28207a;

        public a(Resources resources) {
            this.f28207a = resources;
        }

        @Override // x1.n
        public m b(q qVar) {
            return new r(this.f28207a, qVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f28208a;

        public b(Resources resources) {
            this.f28208a = resources;
        }

        @Override // x1.n
        public m b(q qVar) {
            return new r(this.f28208a, qVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f28209a;

        public c(Resources resources) {
            this.f28209a = resources;
        }

        @Override // x1.n
        public m b(q qVar) {
            return new r(this.f28209a, qVar.d(Uri.class, InputStream.class));
        }
    }

    public static class d implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f28210a;

        public d(Resources resources) {
            this.f28210a = resources;
        }

        @Override // x1.n
        public m b(q qVar) {
            return new r(this.f28210a, u.c());
        }
    }

    public r(Resources resources, m mVar) {
        this.f28206b = resources;
        this.f28205a = mVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f28206b.getResourcePackageName(num.intValue()) + '/' + this.f28206b.getResourceTypeName(num.intValue()) + '/' + this.f28206b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e5) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e5);
            return null;
        }
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Integer num, int i10, int i11, r1.h hVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f28205a.a(uriD, i10, i11, hVar);
    }

    @Override // x1.m
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
