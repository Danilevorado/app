package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f2238g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f2239h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f2240i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f2241j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f2242k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f2243l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f2244m;

    public h() throws NoSuchMethodException, SecurityException {
        Method methodU;
        Constructor constructorW;
        Method methodS;
        Method methodT;
        Method methodX;
        Method methodR;
        Class cls = null;
        try {
            Class clsV = v();
            constructorW = w(clsV);
            methodS = s(clsV);
            methodT = t(clsV);
            methodX = x(clsV);
            methodR = r(clsV);
            methodU = u(clsV);
            cls = clsV;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e5.getClass().getName(), e5);
            methodU = null;
            constructorW = null;
            methodS = null;
            methodT = null;
            methodX = null;
            methodR = null;
        }
        this.f2238g = cls;
        this.f2239h = constructorW;
        this.f2240i = methodS;
        this.f2241j = methodT;
        this.f2242k = methodX;
        this.f2243l = methodR;
        this.f2244m = methodU;
    }

    private Object l() {
        try {
            return this.f2239h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2243l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2240i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f2241j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f2242k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f2240i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2240i != null;
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!q()) {
            return super.a(context, cVar, resources, i10);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!n(context, objL, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(objL);
                return null;
            }
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceI;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
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
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapH = l.h(context, bVarArr, cancellationSignal);
        Object objL = l();
        if (objL == null) {
            return null;
        }
        boolean z10 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapH.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(objL, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(objL);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m(objL);
            return null;
        }
        if (p(objL) && (typefaceI = i(objL)) != null) {
            return Typeface.create(typefaceI, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.k
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!q()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (!n(context, objL, str, 0, -1, -1, null)) {
            m(objL);
            return null;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    protected Typeface i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2238g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2244m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor w(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method x(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
