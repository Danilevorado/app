package com.onesignal;

import android.app.Activity;
import com.onesignal.PermissionsActivity;
import com.onesignal.e;
import com.onesignal.e3;

/* loaded from: classes.dex */
public final class g0 implements PermissionsActivity.c {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f22029a;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f22030a;

        a(Activity activity) {
            this.f22030a = activity;
        }

        @Override // com.onesignal.e.a
        public void a() {
            h0.f22048a.a(this.f22030a);
            f0.n(true, e3.k0.PERMISSION_DENIED);
        }

        @Override // com.onesignal.e.a
        public void b() {
            f0.n(true, e3.k0.PERMISSION_DENIED);
        }
    }

    static {
        g0 g0Var = new g0();
        f22029a = g0Var;
        PermissionsActivity.e("LOCATION", g0Var);
    }

    private g0() {
    }

    private final void c(e3.k0 k0Var) {
        f0.n(true, k0Var);
    }

    private final void e() {
        Activity activityT = e3.T();
        if (activityT == null) {
            return;
        }
        e eVar = e.f21866a;
        String string = activityT.getString(c4.f21793c);
        rb.h.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activityT.getString(c4.f21794d);
        rb.h.d(string2, "activity.getString(R.str…mission_settings_message)");
        eVar.c(activityT, string, string2, new a(activityT));
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void a() {
        c(e3.k0.PERMISSION_GRANTED);
        f0.p();
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void b(boolean z10) {
        c(e3.k0.PERMISSION_DENIED);
        if (z10) {
            e();
        }
        f0.e();
    }

    public final void d(boolean z10, String str) {
        rb.h.e(str, "androidPermissionString");
        PermissionsActivity.i(z10, "LOCATION", str, g0.class);
    }
}
