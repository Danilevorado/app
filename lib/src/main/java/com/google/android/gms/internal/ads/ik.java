package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class ik {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9772a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private gk f9773b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9774c = false;

    public final Activity a() {
        synchronized (this.f9772a) {
            gk gkVar = this.f9773b;
            if (gkVar == null) {
                return null;
            }
            return gkVar.a();
        }
    }

    public final Context b() {
        synchronized (this.f9772a) {
            gk gkVar = this.f9773b;
            if (gkVar == null) {
                return null;
            }
            return gkVar.b();
        }
    }

    public final void c(hk hkVar) {
        synchronized (this.f9772a) {
            if (this.f9773b == null) {
                this.f9773b = new gk();
            }
            this.f9773b.f(hkVar);
        }
    }

    public final void d(Context context) {
        synchronized (this.f9772a) {
            if (!this.f9774c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    ze0.g("Can not cast Context to Application");
                    return;
                }
                if (this.f9773b == null) {
                    this.f9773b = new gk();
                }
                this.f9773b.g(application, context);
                this.f9774c = true;
            }
        }
    }

    public final void e(hk hkVar) {
        synchronized (this.f9772a) {
            gk gkVar = this.f9773b;
            if (gkVar == null) {
                return;
            }
            gkVar.h(hkVar);
        }
    }
}
