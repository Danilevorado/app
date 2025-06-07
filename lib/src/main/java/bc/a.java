package bc;

import ib.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4601a = new a();

    private a() {
    }

    private final Object a(String str, ClassLoader classLoader, Class cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final List b(Class cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return r.n(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List e(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!xb.l.g(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List listF = f4601a.f(bufferedReader);
                ob.a.a(bufferedReader, null);
                return listF;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strZ = xb.m.z(xb.m.u(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strU = xb.m.u(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strZ, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strU)), "UTF-8"));
            try {
                List listF2 = f4601a.f(bufferedReader);
                ob.a.a(bufferedReader, null);
                jarFile.close();
                return listF2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    hb.b.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List f(BufferedReader bufferedReader) throws IOException {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return r.n(linkedHashSet);
            }
            String string = xb.m.B(xb.m.A(line, "#", null, 2, null)).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= string.length()) {
                    z10 = true;
                    break;
                }
                char cCharAt = string.charAt(i10);
                i10++;
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                throw new IllegalArgumentException(rb.h.j("Illegal service provider class name: ", string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    public final List c() {
        g gVar;
        if (!b.a()) {
            return b(g.class, g.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            g gVar2 = null;
            try {
                gVar = (g) g.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, g.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                gVar = null;
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
            try {
                gVar2 = (g) g.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, g.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (gVar2 == null) {
                return arrayList;
            }
            arrayList.add(gVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(g.class, g.class.getClassLoader());
        }
    }

    public final List d(Class cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(rb.h.j("META-INF/services/", cls.getName())));
        rb.h.d(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ib.o.i(arrayList, f4601a.e((URL) it.next()));
        }
        Set setQ = r.q(arrayList);
        if (!(!setQ.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(ib.k.h(setQ, 10));
        Iterator it2 = setQ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f4601a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
