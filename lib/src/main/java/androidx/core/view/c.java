package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final f f2415a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0037c f2416a;

        public a(ClipData clipData, int i10) {
            this.f2416a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new d(clipData, i10);
        }

        public c a() {
            return this.f2416a.build();
        }

        public a b(Bundle bundle) {
            this.f2416a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f2416a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f2416a.a(uri);
            return this;
        }
    }

    private static final class b implements InterfaceC0037c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f2417a;

        b(ClipData clipData, int i10) {
            this.f2417a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public void a(Uri uri) {
            this.f2417a.setLinkUri(uri);
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public void b(int i10) {
            this.f2417a.setFlags(i10);
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public c build() {
            return new c(new e(this.f2417a.build()));
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public void setExtras(Bundle bundle) {
            this.f2417a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c, reason: collision with other inner class name */
    private interface InterfaceC0037c {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    private static final class d implements InterfaceC0037c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f2418a;

        /* renamed from: b, reason: collision with root package name */
        int f2419b;

        /* renamed from: c, reason: collision with root package name */
        int f2420c;

        /* renamed from: d, reason: collision with root package name */
        Uri f2421d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f2422e;

        d(ClipData clipData, int i10) {
            this.f2418a = clipData;
            this.f2419b = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public void a(Uri uri) {
            this.f2421d = uri;
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public void b(int i10) {
            this.f2420c = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public c build() {
            return new c(new g(this));
        }

        @Override // androidx.core.view.c.InterfaceC0037c
        public void setExtras(Bundle bundle) {
            this.f2422e = bundle;
        }
    }

    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f2423a;

        e(ContentInfo contentInfo) {
            this.f2423a = (ContentInfo) androidx.core.util.h.f(contentInfo);
        }

        @Override // androidx.core.view.c.f
        public ClipData a() {
            return this.f2423a.getClip();
        }

        @Override // androidx.core.view.c.f
        public int b() {
            return this.f2423a.getFlags();
        }

        @Override // androidx.core.view.c.f
        public ContentInfo c() {
            return this.f2423a;
        }

        @Override // androidx.core.view.c.f
        public int d() {
            return this.f2423a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2423a + "}";
        }
    }

    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f2424a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2425b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2426c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f2427d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f2428e;

        g(d dVar) {
            this.f2424a = (ClipData) androidx.core.util.h.f(dVar.f2418a);
            this.f2425b = androidx.core.util.h.b(dVar.f2419b, 0, 5, "source");
            this.f2426c = androidx.core.util.h.e(dVar.f2420c, 1);
            this.f2427d = dVar.f2421d;
            this.f2428e = dVar.f2422e;
        }

        @Override // androidx.core.view.c.f
        public ClipData a() {
            return this.f2424a;
        }

        @Override // androidx.core.view.c.f
        public int b() {
            return this.f2426c;
        }

        @Override // androidx.core.view.c.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.c.f
        public int d() {
            return this.f2425b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f2424a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f2425b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f2426c));
            if (this.f2427d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f2427d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f2428e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    c(f fVar) {
        this.f2415a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f2415a.a();
    }

    public int c() {
        return this.f2415a.b();
    }

    public int d() {
        return this.f2415a.d();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f2415a.c();
        Objects.requireNonNull(contentInfoC);
        return contentInfoC;
    }

    public String toString() {
        return this.f2415a.toString();
    }
}
