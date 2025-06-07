package x5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28305a;

    /* renamed from: b, reason: collision with root package name */
    private final c f28306b;

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f28307a;

        private b(Class cls) {
            this.f28307a = cls;
        }

        private Bundle b(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f28307a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f28307a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // x5.g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c {
        List a(Object obj);
    }

    g(Object obj, c cVar) {
        this.f28305a = obj;
        this.f28306b = cVar;
    }

    public static g c(Context context, Class cls) {
        return new g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i d(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (i.class.isAssignableFrom(cls)) {
                return (i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e5) {
            throw new v(String.format("Could not instantiate %s.", str), e5);
        } catch (InstantiationException e10) {
            throw new v(String.format("Could not instantiate %s.", str), e10);
        } catch (NoSuchMethodException e11) {
            throw new v(String.format("Could not instantiate %s", str), e11);
        } catch (InvocationTargetException e12) {
            throw new v(String.format("Could not instantiate %s", str), e12);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f28306b.a(this.f28305a)) {
            arrayList.add(new h6.b() { // from class: x5.f
                @Override // h6.b
                public final Object get() {
                    return g.d(str);
                }
            });
        }
        return arrayList;
    }
}
