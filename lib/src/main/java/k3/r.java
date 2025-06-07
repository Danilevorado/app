package k3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.a70;
import com.google.android.gms.internal.ads.d70;
import com.google.android.gms.internal.ads.d80;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.rd0;
import com.google.android.gms.internal.ads.ua0;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.w60;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final b4 f24722a;

    /* renamed from: b, reason: collision with root package name */
    private final z3 f24723b;

    /* renamed from: c, reason: collision with root package name */
    private final e3 f24724c;

    /* renamed from: d, reason: collision with root package name */
    private final ow f24725d;

    /* renamed from: e, reason: collision with root package name */
    private final gb0 f24726e;

    /* renamed from: f, reason: collision with root package name */
    private final a70 f24727f;

    /* renamed from: g, reason: collision with root package name */
    private final pw f24728g;

    /* renamed from: h, reason: collision with root package name */
    private d80 f24729h;

    public r(b4 b4Var, z3 z3Var, e3 e3Var, ow owVar, gb0 gb0Var, a70 a70Var, pw pwVar) {
        this.f24722a = b4Var;
        this.f24723b = z3Var;
        this.f24724c = e3Var;
        this.f24725d = owVar;
        this.f24726e = gb0Var;
        this.f24727f = a70Var;
        this.f24728g = pwVar;
    }

    static /* bridge */ /* synthetic */ void p(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        t.b().p(context, t.c().f8252m, "gmob-apps", bundle, true);
    }

    public final m0 c(Context context, String str, o30 o30Var) {
        return (m0) new n(this, context, str, o30Var).d(context, false);
    }

    public final q0 d(Context context, h4 h4Var, String str, o30 o30Var) {
        return (q0) new j(this, context, h4Var, str, o30Var).d(context, false);
    }

    public final q0 e(Context context, h4 h4Var, String str, o30 o30Var) {
        return (q0) new l(this, context, h4Var, str, o30Var).d(context, false);
    }

    public final f2 f(Context context, o30 o30Var) {
        return (f2) new d(this, context, o30Var).d(context, false);
    }

    public final uu g(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (uu) new p(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final w60 i(Context context, o30 o30Var) {
        return (w60) new h(this, context, o30Var).d(context, false);
    }

    public final d70 k(Activity activity) {
        b bVar = new b(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            ze0.d("useClientJar flag not found in activity intent extras.");
        }
        return (d70) bVar.d(activity, booleanExtra);
    }

    public final ua0 m(Context context, String str, o30 o30Var) {
        return (ua0) new q(this, context, str, o30Var).d(context, false);
    }

    public final rd0 n(Context context, o30 o30Var) {
        return (rd0) new f(this, context, o30Var).d(context, false);
    }
}
