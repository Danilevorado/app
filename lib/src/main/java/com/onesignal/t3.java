package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.DeadSystemException;

/* loaded from: classes.dex */
public abstract class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22451a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        public final x a(Context context, String str, int i10) {
            rb.h.e(context, "appContext");
            rb.h.e(str, "packageName");
            try {
                return new x(true, context.getPackageManager().getPackageInfo(str, i10));
            } catch (PackageManager.NameNotFoundException unused) {
                return new x(true, null);
            } catch (RuntimeException e5) {
                if (e5.getCause() instanceof DeadSystemException) {
                    return new x(false, null);
                }
                throw e5;
            }
        }
    }
}
