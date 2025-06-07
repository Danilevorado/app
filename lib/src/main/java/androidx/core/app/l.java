package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f2052a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f2053b;

        /* renamed from: c, reason: collision with root package name */
        private final q[] f2054c;

        /* renamed from: d, reason: collision with root package name */
        private final q[] f2055d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2056e;

        /* renamed from: f, reason: collision with root package name */
        boolean f2057f;

        /* renamed from: g, reason: collision with root package name */
        private final int f2058g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f2059h;

        /* renamed from: i, reason: collision with root package name */
        public int f2060i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f2061j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f2062k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f2063l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.c(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q[] qVarArr, q[] qVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f2057f = true;
            this.f2053b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f2060i = iconCompat.e();
            }
            this.f2061j = e.f(charSequence);
            this.f2062k = pendingIntent;
            this.f2052a = bundle == null ? new Bundle() : bundle;
            this.f2054c = qVarArr;
            this.f2055d = qVarArr2;
            this.f2056e = z10;
            this.f2058g = i10;
            this.f2057f = z11;
            this.f2059h = z12;
            this.f2063l = z13;
        }

        public PendingIntent a() {
            return this.f2062k;
        }

        public boolean b() {
            return this.f2056e;
        }

        public Bundle c() {
            return this.f2052a;
        }

        public IconCompat d() {
            int i10;
            if (this.f2053b == null && (i10 = this.f2060i) != 0) {
                this.f2053b = IconCompat.c(null, "", i10);
            }
            return this.f2053b;
        }

        public q[] e() {
            return this.f2054c;
        }

        public int f() {
            return this.f2058g;
        }

        public boolean g() {
            return this.f2057f;
        }

        public CharSequence h() {
            return this.f2061j;
        }

        public boolean i() {
            return this.f2063l;
        }

        public boolean j() {
            return this.f2059h;
        }
    }

    public static class b extends h {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f2064e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f2065f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2066g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f2067h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f2068i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.l$b$b, reason: collision with other inner class name */
        private static class C0020b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.l.h
        public void b(k kVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kVar.a()).setBigContentTitle(this.f2098b);
            IconCompat iconCompat = this.f2064e;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.a(bigContentTitle, this.f2064e.m(kVar instanceof m ? ((m) kVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f2064e.d());
                }
            }
            if (this.f2066g) {
                if (this.f2065f == null) {
                    a.a(bigContentTitle, null);
                } else {
                    C0020b.a(bigContentTitle, this.f2065f.m(kVar instanceof m ? ((m) kVar).f() : null));
                }
            }
            if (this.f2100d) {
                a.b(bigContentTitle, this.f2099c);
            }
            if (i10 >= 31) {
                c.c(bigContentTitle, this.f2068i);
                c.b(bigContentTitle, this.f2067h);
            }
        }

        @Override // androidx.core.app.l.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f2065f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f2066g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f2064e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f2099c = e.f(charSequence);
            this.f2100d = true;
            return this;
        }
    }

    public static class c extends h {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f2069e;

        @Override // androidx.core.app.l.h
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.l.h
        public void b(k kVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.f2098b).bigText(this.f2069e);
            if (this.f2100d) {
                bigTextStyleBigText.setSummaryText(this.f2099c);
            }
        }

        @Override // androidx.core.app.l.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f2069e = e.f(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Icon T;
        public ArrayList U;

        /* renamed from: a, reason: collision with root package name */
        public Context f2070a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f2071b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f2072c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f2073d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f2074e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f2075f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f2076g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f2077h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f2078i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f2079j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f2080k;

        /* renamed from: l, reason: collision with root package name */
        int f2081l;

        /* renamed from: m, reason: collision with root package name */
        int f2082m;

        /* renamed from: n, reason: collision with root package name */
        boolean f2083n;

        /* renamed from: o, reason: collision with root package name */
        boolean f2084o;

        /* renamed from: p, reason: collision with root package name */
        h f2085p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f2086q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f2087r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f2088s;

        /* renamed from: t, reason: collision with root package name */
        int f2089t;

        /* renamed from: u, reason: collision with root package name */
        int f2090u;

        /* renamed from: v, reason: collision with root package name */
        boolean f2091v;

        /* renamed from: w, reason: collision with root package name */
        String f2092w;

        /* renamed from: x, reason: collision with root package name */
        boolean f2093x;

        /* renamed from: y, reason: collision with root package name */
        String f2094y;

        /* renamed from: z, reason: collision with root package name */
        boolean f2095z;

        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f2071b = new ArrayList();
            this.f2072c = new ArrayList();
            this.f2073d = new ArrayList();
            this.f2083n = true;
            this.f2095z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f2070a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f2082m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        protected static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap g(Bitmap bitmap) throws Resources.NotFoundException {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2070a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(y.b.f28379b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(y.b.f28378a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
        }

        private void t(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.R;
                i11 = i10 | notification.flags;
            } else {
                notification = this.R;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        public e A(int i10) {
            this.f2081l = i10;
            return this;
        }

        public e B(boolean z10) {
            t(2, z10);
            return this;
        }

        public e C(boolean z10) {
            t(8, z10);
            return this;
        }

        public e D(int i10) {
            this.f2082m = i10;
            return this;
        }

        public e E(boolean z10) {
            this.f2083n = z10;
            return this;
        }

        public e F(int i10) {
            this.R.icon = i10;
            return this;
        }

        public e G(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        public e H(h hVar) {
            if (this.f2085p != hVar) {
                this.f2085p = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e I(CharSequence charSequence) {
            this.R.tickerText = f(charSequence);
            return this;
        }

        public e J(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e K(int i10) {
            this.F = i10;
            return this;
        }

        public e L(long j10) {
            this.R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2071b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f2071b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new m(this).c();
        }

        public e d(f fVar) {
            fVar.a(this);
            return this;
        }

        public Bundle e() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e h(boolean z10) {
            t(16, z10);
            return this;
        }

        public e i(String str) {
            this.C = str;
            return this;
        }

        public e j(String str) {
            this.K = str;
            return this;
        }

        public e k(int i10) {
            this.E = i10;
            return this;
        }

        public e l(boolean z10) {
            this.A = z10;
            this.B = true;
            return this;
        }

        public e m(RemoteViews remoteViews) {
            this.R.contentView = remoteViews;
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f2076g = pendingIntent;
            return this;
        }

        public e o(CharSequence charSequence) {
            this.f2075f = f(charSequence);
            return this;
        }

        public e p(CharSequence charSequence) {
            this.f2074e = f(charSequence);
            return this;
        }

        public e q(int i10) {
            Notification notification = this.R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e r(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e s(Bundle bundle) {
            this.D = bundle;
            return this;
        }

        public e u(String str) {
            this.f2092w = str;
            return this;
        }

        public e v(int i10) {
            this.O = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f2093x = z10;
            return this;
        }

        public e x(Bitmap bitmap) {
            this.f2079j = g(bitmap);
            return this;
        }

        public e y(int i10, int i11, int i12) {
            Notification notification = this.R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e z(boolean z10) {
            this.f2095z = z10;
            return this;
        }
    }

    public interface f {
        e a(e eVar);
    }

    public static class g extends h {

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f2096e = new ArrayList();

        @Override // androidx.core.app.l.h
        public void b(k kVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(kVar.a()).setBigContentTitle(this.f2098b);
            if (this.f2100d) {
                bigContentTitle.setSummaryText(this.f2099c);
            }
            Iterator it = this.f2096e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.l.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public g h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f2096e.add(e.f(charSequence));
            }
            return this;
        }

        public g i(CharSequence charSequence) {
            this.f2098b = e.f(charSequence);
            return this;
        }

        public g j(CharSequence charSequence) {
            this.f2099c = e.f(charSequence);
            this.f2100d = true;
            return this;
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        protected e f2097a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f2098b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f2099c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2100d = false;

        public void a(Bundle bundle) {
            if (this.f2100d) {
                bundle.putCharSequence("android.summaryText", this.f2099c);
            }
            CharSequence charSequence = this.f2098b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(k kVar);

        protected abstract String c();

        public RemoteViews d(k kVar) {
            return null;
        }

        public RemoteViews e(k kVar) {
            return null;
        }

        public RemoteViews f(k kVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f2097a != eVar) {
                this.f2097a = eVar;
                if (eVar != null) {
                    eVar.H(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static boolean b(Notification notification) {
        return (notification.flags & 512) != 0;
    }
}
