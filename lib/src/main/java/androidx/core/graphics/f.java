package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class f extends k {

    /* renamed from: b, reason: collision with root package name */
    private static Class f2229b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f2230c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f2231d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f2232e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f2233f = false;

    f() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        k();
        try {
            return ((Boolean) f2231d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        k();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2229b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2232e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2233f) {
            return;
        }
        f2233f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi21Impl", e5.getClass().getName(), e5);
            method = null;
            cls = null;
            method2 = null;
        }
        f2230c = constructor;
        f2229b = cls;
        f2231d = method2;
        f2232e = method;
    }

    private static Object l() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        k();
        try {
            return f2230c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // androidx.core.graphics.k
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objL = l();
        for (e.d dVar : cVar.a()) {
            File fileE = l.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!l.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!h(objL, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return i(objL);
    }

    @Override // androidx.core.graphics.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) throws IOException {
        if (bVarArr.length < 1) {
            return null;
        }
        g.b bVarG = g(bVarArr, i10);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ != null && fileJ.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileJ);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceC = super.c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
