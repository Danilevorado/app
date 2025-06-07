package n;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import n.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f25427a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f25428b;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f25431c;

        /* renamed from: d, reason: collision with root package name */
        private Bundle f25432d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f25433e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray f25434f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f25435g;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f25429a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0163a f25430b = new a.C0163a();

        /* renamed from: h, reason: collision with root package name */
        private int f25436h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f25437i = true;

        public a() {
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.f.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f25429a.putExtras(bundle);
        }

        public d a() {
            if (!this.f25429a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f25431c;
            if (arrayList != null) {
                this.f25429a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f25433e;
            if (arrayList2 != null) {
                this.f25429a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f25429a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f25437i);
            this.f25429a.putExtras(this.f25430b.a().a());
            Bundle bundle = this.f25435g;
            if (bundle != null) {
                this.f25429a.putExtras(bundle);
            }
            if (this.f25434f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f25434f);
                this.f25429a.putExtras(bundle2);
            }
            this.f25429a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f25436h);
            return new d(this.f25429a, this.f25432d);
        }

        public a b(f fVar) {
            this.f25429a.setPackage(fVar.d().getPackageName());
            c(fVar.c(), fVar.e());
            return this;
        }

        public a d(int i10) {
            this.f25430b.b(i10);
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f25427a = intent;
        this.f25428b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f25427a.setData(uri);
        androidx.core.content.a.l(context, this.f25427a, this.f25428b);
    }
}
