package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class wx3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f17290a = Logger.getLogger(mx3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final String f17291b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    static qx3 a(Class cls) {
        String str;
        ClassLoader classLoader = wx3.class.getClassLoader();
        if (cls.equals(qx3.class)) {
            str = f17291b;
        } else {
            if (!cls.getPackage().equals(wx3.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        a5.a.a(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (IllegalAccessException e5) {
                        throw new IllegalStateException(e5);
                    } catch (NoSuchMethodException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(wx3.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    a5.a.a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e13) {
                    f17290a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e13);
                }
            }
            if (arrayList.size() == 1) {
                return (qx3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (qx3) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(e16);
            }
        }
    }
}
