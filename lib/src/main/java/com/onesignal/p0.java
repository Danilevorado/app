package com.onesignal;

import android.app.Activity;
import android.os.Build;
import com.onesignal.PermissionsActivity;
import com.onesignal.e;
import com.onesignal.e3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class p0 implements PermissionsActivity.c {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f22201a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set f22202b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f22203c;

    /* renamed from: d, reason: collision with root package name */
    private static final hb.f f22204d;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f22205a;

        a(Activity activity) {
            this.f22205a = activity;
        }

        @Override // com.onesignal.e.a
        public void a() {
            i0.f22062a.a(this.f22205a);
            p0 p0Var = p0.f22201a;
            p0.f22203c = true;
        }

        @Override // com.onesignal.e.a
        public void b() {
            p0.f22201a.e(false);
        }
    }

    static final class b extends rb.i implements qb.a {

        /* renamed from: n, reason: collision with root package name */
        public static final b f22206n = new b();

        b() {
            super(0);
        }

        @Override // qb.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(Build.VERSION.SDK_INT > 32 && OSUtils.o(e3.f21882e) > 32);
        }
    }

    static {
        p0 p0Var = new p0();
        f22201a = p0Var;
        f22202b = new HashSet();
        PermissionsActivity.e("NOTIFICATION", p0Var);
        f22204d = hb.h.a(b.f22206n);
    }

    private p0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean z10) {
        Iterator it = f22202b.iterator();
        while (it.hasNext()) {
            ((e3.l0) it.next()).a(z10);
        }
        f22202b.clear();
    }

    private final boolean f() {
        return ((Boolean) f22204d.getValue()).booleanValue();
    }

    private final boolean g() {
        return OSUtils.a(e3.f21882e);
    }

    private final boolean j() {
        Activity activityT = e3.T();
        if (activityT == null) {
            return false;
        }
        e eVar = e.f21866a;
        String string = activityT.getString(c4.f21795e);
        rb.h.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activityT.getString(c4.f21796f);
        rb.h.d(string2, "activity.getString(R.str…mission_settings_message)");
        eVar.c(activityT, string, string2, new a(activityT));
        return true;
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void a() {
        e3.o1();
        e(true);
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void b(boolean z10) {
        if (z10 ? j() : false) {
            return;
        }
        e(false);
    }

    public final void h() {
        if (f22203c) {
            f22203c = false;
            e(g());
        }
    }

    public final void i(boolean z10, e3.l0 l0Var) {
        if (l0Var != null) {
            f22202b.add(l0Var);
        }
        if (g()) {
            e(true);
            return;
        }
        if (f()) {
            PermissionsActivity.i(z10, "NOTIFICATION", "android.permission.POST_NOTIFICATIONS", p0.class);
        } else if (z10) {
            j();
        } else {
            e(false);
        }
    }
}
