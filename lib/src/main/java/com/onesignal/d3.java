package com.onesignal;

import android.content.Context;
import androidx.work.a;
import com.onesignal.e3;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d3 f21865a = new d3();

    private d3() {
    }

    public static final synchronized b1.u a(Context context) {
        b1.u uVarG;
        rb.h.e(context, "context");
        try {
            uVarG = b1.u.g(context);
            rb.h.d(uVarG, "{\n            WorkManage…stance(context)\n        }");
        } catch (IllegalStateException e5) {
            e3.b(e3.z.ERROR, "OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e5);
            f21865a.b(context);
            uVarG = b1.u.g(context);
            rb.h.d(uVarG, "{\n            /*\n       …stance(context)\n        }");
        }
        return uVarG;
    }

    private final void b(Context context) {
        try {
            context.getApplicationContext();
            androidx.work.a aVarA = new a.b().a();
            rb.h.d(aVarA, "(context.applicationCont…uration.Builder().build()");
            b1.u.h(context, aVarA);
        } catch (IllegalStateException e5) {
            e3.b(e3.z.ERROR, "OSWorkManagerHelper initializing WorkManager failed: ", e5);
        }
    }
}
