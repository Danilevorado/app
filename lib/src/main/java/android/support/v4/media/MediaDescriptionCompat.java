package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    private final String f270m;

    /* renamed from: n, reason: collision with root package name */
    private final CharSequence f271n;

    /* renamed from: o, reason: collision with root package name */
    private final CharSequence f272o;

    /* renamed from: p, reason: collision with root package name */
    private final CharSequence f273p;

    /* renamed from: q, reason: collision with root package name */
    private final Bitmap f274q;

    /* renamed from: r, reason: collision with root package name */
    private final Uri f275r;

    /* renamed from: s, reason: collision with root package name */
    private final Bundle f276s;

    /* renamed from: t, reason: collision with root package name */
    private final Uri f277t;

    /* renamed from: u, reason: collision with root package name */
    private Object f278u;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f279a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f280b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f281c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f282d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f283e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f284f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f285g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f286h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f279a, this.f280b, this.f281c, this.f282d, this.f283e, this.f284f, this.f285g, this.f286h);
        }

        public b b(CharSequence charSequence) {
            this.f282d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f285g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f283e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f284f = uri;
            return this;
        }

        public b f(String str) {
            this.f279a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f286h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f281c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f280b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f270m = str;
        this.f271n = charSequence;
        this.f272o = charSequence2;
        this.f273p = charSequence3;
        this.f274q = bitmap;
        this.f275r = uri;
        this.f276s = bundle;
        this.f277t = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle bundleC = android.support.v4.media.a.c(obj);
        if (bundleC != null) {
            MediaSessionCompat.a(bundleC);
            uri = (Uri) bundleC.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleC;
        } else if (!bundleC.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleC.size() != 2) {
            bundleC.remove("android.support.v4.media.description.MEDIA_URI");
            bundleC.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleC;
        }
        bVar.c(bundle);
        if (uri != null) {
            bVar.g(uri);
        } else {
            bVar.g(android.support.v4.media.b.a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = bVar.a();
        mediaDescriptionCompatA.f278u = obj;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        Object obj = this.f278u;
        if (obj != null) {
            return obj;
        }
        Object objB = a.C0003a.b();
        a.C0003a.g(objB, this.f270m);
        a.C0003a.i(objB, this.f271n);
        a.C0003a.h(objB, this.f272o);
        a.C0003a.c(objB, this.f273p);
        a.C0003a.e(objB, this.f274q);
        a.C0003a.f(objB, this.f275r);
        a.C0003a.d(objB, this.f276s);
        b.a.a(objB, this.f277t);
        Object objA = a.C0003a.a(objB);
        this.f278u = objA;
        return objA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f271n) + ", " + ((Object) this.f272o) + ", " + ((Object) this.f273p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(b(), parcel, i10);
    }
}
