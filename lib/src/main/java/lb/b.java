package lb;

import rb.h;
import xb.m;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25158a;

    static {
        a aVar;
        int iA = a();
        if (iA >= 65544 || iA < 65536) {
            try {
                Object objNewInstance = nb.a.class.newInstance();
                h.d(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        if (objNewInstance == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) objNewInstance;
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (ClassCastException e5) {
                    ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (h.a(classLoader, classLoader2)) {
                        throw e5;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e5);
                }
            } catch (ClassNotFoundException unused2) {
                Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                h.d(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (objNewInstance2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) objNewInstance2;
                } catch (ClassCastException e10) {
                    ClassLoader classLoader3 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = a.class.getClassLoader();
                    if (h.a(classLoader3, classLoader4)) {
                        throw e10;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e10);
                }
            }
        } else if (iA >= 65543 || iA < 65536) {
            try {
                try {
                    Object objNewInstance3 = mb.a.class.newInstance();
                    h.d(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (objNewInstance3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) objNewInstance3;
                    } catch (ClassCastException e11) {
                        ClassLoader classLoader5 = objNewInstance3.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (h.a(classLoader5, classLoader6)) {
                            throw e11;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e11);
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                h.d(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (objNewInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) objNewInstance4;
                } catch (ClassCastException e12) {
                    ClassLoader classLoader7 = objNewInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (h.a(classLoader7, classLoader8)) {
                        throw e12;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e12);
                }
            }
        } else {
            aVar = new a();
        }
        f25158a = aVar;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int iM = m.m(property, '.', 0, false, 6, null);
        if (iM < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i10 = iM + 1;
        int iM2 = m.m(property, '.', i10, false, 4, null);
        if (iM2 < 0) {
            iM2 = property.length();
        }
        String strSubstring = property.substring(0, iM);
        h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = property.substring(i10, iM2);
        h.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
