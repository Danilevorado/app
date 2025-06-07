package k3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.mt;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.xs;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final b1 f24730a;

    static {
        b1 z0Var = null;
        try {
            Object objNewInstance = r.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    z0Var = iInterfaceQueryLocalInterface instanceof b1 ? (b1) iInterfaceQueryLocalInterface : new z0(iBinder);
                }
            } else {
                ze0.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            ze0.g("Failed to instantiate ClientApi class.");
        }
        f24730a = z0Var;
    }

    s() {
    }

    private final Object e() {
        b1 b1Var = f24730a;
        if (b1Var == null) {
            ze0.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(b1Var);
        } catch (RemoteException e5) {
            ze0.h("Cannot invoke local loader using ClientApi class.", e5);
            return null;
        }
    }

    private final Object f() {
        try {
            return c();
        } catch (RemoteException e5) {
            ze0.h("Cannot invoke remote loader.", e5);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b(b1 b1Var);

    protected abstract Object c();

    public final Object d(Context context, boolean z10) {
        boolean z11;
        Object objE;
        if (!z10) {
            t.b();
            if (!se0.u(context, 12451000)) {
                ze0.b("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        ir.a(context);
        if (((Boolean) xs.f17796a.e()).booleanValue()) {
            z11 = false;
        } else if (((Boolean) xs.f17797b.e()).booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z10 | z13;
            z11 = false;
        }
        if (z12) {
            objE = e();
            if (objE == null && !z11) {
                objE = f();
            }
        } else {
            Object objF = f();
            if (objF == null) {
                if (t.e().nextInt(((Long) mt.f12244a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    t.b().p(context, t.c().f8252m, "gmob-apps", bundle, true);
                }
            }
            objE = objF == null ? e() : objF;
        }
        return objE == null ? a() : objE;
    }
}
