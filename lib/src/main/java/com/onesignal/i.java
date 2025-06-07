package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.DeadSystemException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22060a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static ApplicationInfo f22061b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        public final ApplicationInfo a(Context context) {
            rb.h.e(context, "context");
            if (i.f22061b != null) {
                return i.f22061b;
            }
            try {
                i.f22061b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                return i.f22061b;
            } catch (RuntimeException e5) {
                if (e5.getCause() instanceof DeadSystemException) {
                    return null;
                }
                throw e5;
            }
        }
    }
}
