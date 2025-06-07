package c0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final c f4638a;

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f4639a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4639a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f4639a = (InputContentInfo) obj;
        }

        @Override // c0.d.c
        public ClipDescription a() {
            return this.f4639a.getDescription();
        }

        @Override // c0.d.c
        public Object b() {
            return this.f4639a;
        }

        @Override // c0.d.c
        public Uri c() {
            return this.f4639a.getContentUri();
        }

        @Override // c0.d.c
        public void d() {
            this.f4639a.requestPermission();
        }

        @Override // c0.d.c
        public Uri e() {
            return this.f4639a.getLinkUri();
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f4640a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f4641b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f4642c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4640a = uri;
            this.f4641b = clipDescription;
            this.f4642c = uri2;
        }

        @Override // c0.d.c
        public ClipDescription a() {
            return this.f4641b;
        }

        @Override // c0.d.c
        public Object b() {
            return null;
        }

        @Override // c0.d.c
        public Uri c() {
            return this.f4640a;
        }

        @Override // c0.d.c
        public void d() {
        }

        @Override // c0.d.c
        public Uri e() {
            return this.f4642c;
        }
    }

    private interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f4638a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private d(c cVar) {
        this.f4638a = cVar;
    }

    public static d f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new d(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f4638a.c();
    }

    public ClipDescription b() {
        return this.f4638a.a();
    }

    public Uri c() {
        return this.f4638a.e();
    }

    public void d() {
        this.f4638a.d();
    }

    public Object e() {
        return this.f4638a.b();
    }
}
