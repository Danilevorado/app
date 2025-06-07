package s2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final a f26756a;

    /* renamed from: b, reason: collision with root package name */
    private final i f26757b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f26758c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26759a;

        /* renamed from: b, reason: collision with root package name */
        private Map f26760b = null;

        a(Context context) {
            this.f26759a = context;
        }

        private Map a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map c() {
            if (this.f26760b == null) {
                this.f26760b = a(this.f26759a);
            }
            return this.f26760b;
        }

        private static Bundle d(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2;
            String str3;
            String str4 = (String) c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e5) {
                e = e5;
                str3 = String.format("Class %s is not found.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (IllegalAccessException e10) {
                e = e10;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InstantiationException e11) {
                e = e11;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InvocationTargetException e13) {
                e = e13;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    k(a aVar, i iVar) {
        this.f26758c = new HashMap();
        this.f26756a = aVar;
        this.f26757b = iVar;
    }

    @Override // s2.e
    public synchronized m a(String str) {
        if (this.f26758c.containsKey(str)) {
            return (m) this.f26758c.get(str);
        }
        d dVarB = this.f26756a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f26757b.a(str));
        this.f26758c.put(str, mVarCreate);
        return mVarCreate;
    }
}
